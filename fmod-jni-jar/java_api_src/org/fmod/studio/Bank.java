package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_BANK;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Bank {
	private final SWIGTYPE_p_FMOD_STUDIO_BANK pointer;

	Bank(SWIGTYPE_p_FMOD_STUDIO_BANK pointer) {
		this.pointer = pointer;
	}
}
