package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_DSP;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class DSP {
	private final SWIGTYPE_p_FMOD_DSP pointer;

	DSP(SWIGTYPE_p_FMOD_DSP pointer) {
		this.pointer = pointer;
	}
}
