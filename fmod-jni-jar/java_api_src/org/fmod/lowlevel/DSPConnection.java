package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_DSPCONNECTION;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class DSPConnection {
	private final SWIGTYPE_p_FMOD_DSPCONNECTION pointer;

	DSPConnection(SWIGTYPE_p_FMOD_DSPCONNECTION pointer) {
		this.pointer = pointer;
	}
}
