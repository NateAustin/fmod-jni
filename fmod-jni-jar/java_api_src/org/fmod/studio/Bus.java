package org.fmod.studio;

import org.fmod.lowlevel.FMODResultTracker;
import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_BUS;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Bus extends FMODResultTracker{

	private final SWIGTYPE_p_FMOD_STUDIO_BUS pointer;

	Bus(SWIGTYPE_p_FMOD_STUDIO_BUS pointer) {
		this.pointer = pointer;
	}


}
