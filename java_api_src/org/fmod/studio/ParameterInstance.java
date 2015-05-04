package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class ParameterInstance {
	private final SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE pointer;

	ParameterInstance(SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE pointer) {
		this.pointer = pointer;
	}
}
