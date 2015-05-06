package org.fmod.studio;

import org.fmod.jni.FMOD_STUDIO_PARAMETER_DESCRIPTION;
import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE;
import org.fmod.lowlevel.FMODResultTracker;

import static org.fmod.jni.FMOD.*;

/**
 * proxy to FMOD ParameterInstance class
 *
 * {@link org.fmod.jni.FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_ParameterInstance.html" >FMOD ParameterInstance Documentation</a>
 *
 * Author: Nate
 * Date: 5/1/2015
 */
public class ParameterInstance extends FMODResultTracker {
	private final SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE pointer;

	private FMOD_STUDIO_PARAMETER_DESCRIPTION tmpDescription;

	ParameterInstance(SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_PARAMETERINSTANCE getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return FMOD_Studio_ParameterInstance_IsValid(pointer) != 0;
	}

	public FMOD_STUDIO_PARAMETER_DESCRIPTION getDescription() {
		if(tmpDescription == null) {
			tmpDescription = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
		}
		processApiResult(FMOD_Studio_ParameterInstance_GetDescription(pointer, tmpDescription),"FMOD_Studio_ParameterInstance_GetDescription");
		return tmpDescription;
	}

	public float getValue() {
		float [] p = new float[1];
		processApiResult(FMOD_Studio_ParameterInstance_GetValue(pointer, p), "FMOD_Studio_ParameterInstance_GetValue");
		return p[0];
	}
	public void setValue(float value) {
		processApiResult(FMOD_Studio_ParameterInstance_SetValue(pointer, value),"FMOD_Studio_ParameterInstance_SetValue");
	}

}
