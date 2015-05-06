package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_GEOMETRY;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Geometry {
	private final SWIGTYPE_p_FMOD_GEOMETRY pointer;

	Geometry(SWIGTYPE_p_FMOD_GEOMETRY pointer) {
		this.pointer = pointer;
	}
}
