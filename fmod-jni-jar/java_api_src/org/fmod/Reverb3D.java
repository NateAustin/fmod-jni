package org.fmod;

import org.fmod.jni.SWIGTYPE_p_FMOD_REVERB3D;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Reverb3D {
	private final SWIGTYPE_p_FMOD_REVERB3D pointer;

	Reverb3D(SWIGTYPE_p_FMOD_REVERB3D pointer) {
		this.pointer = pointer;
	}
}
