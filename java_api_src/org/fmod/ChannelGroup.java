package org.fmod;

import org.fmod.jni.SWIGTYPE_p_FMOD_CHANNELGROUP;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class ChannelGroup {
	private final SWIGTYPE_p_FMOD_CHANNELGROUP pointer;

	ChannelGroup(SWIGTYPE_p_FMOD_CHANNELGROUP pointer) {
		this.pointer = pointer;
	}
}
