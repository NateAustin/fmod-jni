package org.fmod;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Internal utility class for removing the executable stack flag (PF_X) from the PT_GNU_STACK
 * program header of 64-bit ELF binaries.
 * <p>
 * Some Linux distributions treat an executable stack as a security risk and prevent
 * native libraries with this flag from being loaded. This class modifies the ELF header
 * in-place to clear the PF_X flag from the PT_GNU_STACK segment, if present.
 * <p>
 * This is particularly useful when dealing with native libraries (e.g., FMOD) that were
 * compiled with stack execution enabled by default, but do not actually require it.
 * <p>
 * Only 64-bit, little-endian ELF binaries are supported. The input buffer must be backed
 * by an array and will be modified directly.
 */
class ElfExecStackStripper {

	public static boolean isELFFile(ByteBuffer buf) {
		if (buf.limit() < 16) return false;

		ByteBuffer slice = buf.duplicate(); // safe copy for inspection
		byte[] eIdent = new byte[4];
		slice.get(eIdent);
		return eIdent[0] == 0x7F && eIdent[1] == 'E' && eIdent[2] == 'L' && eIdent[3] == 'F';
	}

	public static void stripExecStackFlag(ByteBuffer inputBuf) throws UnsatisfiedLinkError {
		try {
			// Create a duplicate to avoid modifying caller's buffer state
			ByteBuffer buf = inputBuf.duplicate().order(ByteOrder.LITTLE_ENDIAN);

			if (buf.get(0) != 0x7F || buf.get(1) != 'E' || buf.get(2) != 'L' || buf.get(3) != 'F') {
				throw new IOException("Not a valid ELF file.");
			}

			boolean is64Bit = buf.get(4) == 2;
			boolean isLittleEndian = buf.get(5) == 1;
			if (!is64Bit) throw new IOException("Only 64-bit ELF files supported.");
			if (!isLittleEndian) throw new IOException("Only little-endian ELF files supported.");

			// e_phoff = offset 32, 8 bytes
			long phoff = getLongLE(buf, 32);
			int phentsize = getShortLE(buf, 54);
			int phnum = getShortLE(buf, 56);

			final int PT_GNU_STACK = 0x6474e551;
			final int PF_X = 0x1;

			for (int i = 0; i < phnum; i++) {
				int entryOffset = (int) (phoff + i * phentsize);
				int type = getIntLE(buf, entryOffset);

				if (type == PT_GNU_STACK) {
					int flags = getIntLE(buf, entryOffset + 4);
					if ((flags & PF_X) != 0) {
						int newFlags = flags & ~PF_X;
						putIntLE(buf, entryOffset + 4, newFlags);
						System.out.println("Cleared PF_X flag on PT_GNU_STACK.");
					} else {
						System.out.println("PF_X flag was already not set.");
					}
					return;
				}
			}

			throw new IOException("No PT_GNU_STACK segment found.");
		} catch (Throwable t) {
			UnsatisfiedLinkError err = new UnsatisfiedLinkError();
			err.initCause(t);
			throw err;
		}
	}

	// Helper methods
	private static int getShortLE(ByteBuffer buf, int offset) {
		return buf.getShort(offset) & 0xFFFF;
	}

	private static int getIntLE(ByteBuffer buf, int offset) {
		return buf.getInt(offset);
	}

	private static long getLongLE(ByteBuffer buf, int offset) {
		return buf.getLong(offset);
	}

	private static void putIntLE(ByteBuffer buf, int offset, int value) {
		buf.putInt(offset, value);
	}

}
