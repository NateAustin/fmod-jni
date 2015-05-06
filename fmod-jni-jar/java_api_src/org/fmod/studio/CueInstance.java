package org.fmod.studio;

import org.fmod.jni.FMOD;
import org.fmod.jni.FMOD_RESULT;
import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE;
import org.fmod.lowlevel.FMODResultTracker;

/**
 * Proxy to FMOD CueInstance class
 *
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_CueInstance.html" >FMOD CueInstance Documentation</a>
 *
 * Author: Nate
 * Date: 5/1/2015
 */
public class CueInstance extends FMODResultTracker {
	private final SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE pointer;

	CueInstance(SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE pointer) {
		this.pointer = pointer;
	}


	public boolean isValid() {
		return FMOD.FMOD_Studio_CueInstance_IsValid(pointer) != 0;
	}
	public void trigger() {
		processApiResult(FMOD.FMOD_Studio_CueInstance_Trigger(pointer),"FMOD_Studio_CueInstance_Trigger");
	}

	public SWIGTYPE_p_FMOD_STUDIO_CUEINSTANCE getPointer() {
		return pointer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CueInstance that = (CueInstance) o;
		return pointer.equals(that.pointer);
	}

	@Override
	public int hashCode() {
		return pointer.hashCode();
	}
}
