package org.fmod;

import org.fmod.jni.SWIGTYPE_p_FMOD_SOUNDGROUP;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class SoundGroup {
	private final SWIGTYPE_p_FMOD_SOUNDGROUP pointer;

	SoundGroup(SWIGTYPE_p_FMOD_SOUNDGROUP pointer) {
		this.pointer = pointer;
	}
}
