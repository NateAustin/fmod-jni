package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_VCA;

/**
 * 
 * 
 * Author: Nate
 * Date: 5/1/2015
 */
public class VCA {
	private final SWIGTYPE_p_FMOD_STUDIO_VCA pointer;

	VCA(SWIGTYPE_p_FMOD_STUDIO_VCA pointer) {
		this.pointer = pointer;
	}
}
