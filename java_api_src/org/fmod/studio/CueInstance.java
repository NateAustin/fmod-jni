package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class CueInstance {
	private final SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE pointer;

	CueInstance(SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE pointer) {
		this.pointer = pointer;
	}
}
