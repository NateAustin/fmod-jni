package org.fmod;

import org.fmod.jni.SWIGTYPE_p_FMOD_SOUND;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Sound {
	private final SWIGTYPE_p_FMOD_SOUND pointer;

	Sound(SWIGTYPE_p_FMOD_SOUND pointer) {
		this.pointer = pointer;
	}
}
