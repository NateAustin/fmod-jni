package org.fmod.lowlevel;

import org.fmod.jni.FMODConstants;
import org.fmod.jni.FMOD_ADVANCEDSETTINGS;
import org.fmod.jni.SWIGTYPE_p_FMOD_SYSTEM;

import static org.fmod.jni.FMOD.FMOD_System_GetAdvancedSettings;
import static org.fmod.jni.FMOD.FMOD_System_Release;
import static org.fmod.jni.FMOD.FMOD_System_SetAdvancedSettings;

/**
 *
 * The low-level FMOD::System object.
 *
 * Author: Nate
 * Date: 5/1/2015
 */
@SuppressWarnings("WeakerAccess")
public class FmodSystem extends FMODResultTracker {


	private final SWIGTYPE_p_FMOD_SYSTEM pointer;
	
	private FMOD_ADVANCEDSETTINGS tmpAdvancedSettings;

	private FmodSystem(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {

		this.pointer = lowLevel_p;
	}

	/**
	 * This is for internal use by studio.System.getLowLevelSystem().
	 */
	public static FmodSystem fromPointer(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {
		return new FmodSystem(lowLevel_p);
	}
	
	public FMOD_ADVANCEDSETTINGS getAdvancedSettings() {
		if(tmpAdvancedSettings == null) {
			tmpAdvancedSettings = new FMOD_ADVANCEDSETTINGS();
			tmpAdvancedSettings.setCbSize(FMODConstants.sizeof_FMOD_ADVANCEDSETTINGS);
		}
		return getAdvancedSettings(tmpAdvancedSettings);
	}

	public FMOD_ADVANCEDSETTINGS getAdvancedSettings(FMOD_ADVANCEDSETTINGS toFill) {
		processApiResult(FMOD_System_GetAdvancedSettings(pointer, toFill), "System.getAdvancedSettings");
		return toFill;
	}
	
	public void setAdvancedSettings(FMOD_ADVANCEDSETTINGS settings) {
		processApiResult(FMOD_System_SetAdvancedSettings(pointer, settings), "System.setAdvancedSettings");
	}
	
	public void release() {
		processApiResult(FMOD_System_Release(pointer), "System.release");
	}

	//TODO: fill in.. don't forget create function
}
