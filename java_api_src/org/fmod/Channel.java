package org.fmod;

import org.fmod.jni.SWIGTYPE_p_FMOD_CHANNEL;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Channel {
	private final SWIGTYPE_p_FMOD_CHANNEL pointer;

	Channel(SWIGTYPE_p_FMOD_CHANNEL pointer) {
		this.pointer = pointer;
	}
}
