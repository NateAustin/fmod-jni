package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_SYSTEM;

/**
 *
 * The low-level FMOD::System object.
 *
 * Author: Nate
 * Date: 5/1/2015
 */
public class FmodSystem extends FMODResultTracker {


	private final SWIGTYPE_p_FMOD_SYSTEM lowLevel_p;

	private FmodSystem(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {

		this.lowLevel_p = lowLevel_p;
	}

	/**
	 * This is for internal use by studio.System.getLowLevelSystem().
	 */
	public static FmodSystem fromPointer(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {
		return new FmodSystem(lowLevel_p);
	}

	//TODO: fill in.. don't forget create function
}
