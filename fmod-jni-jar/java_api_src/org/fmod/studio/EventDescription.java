package org.fmod.studio;

import org.fmod.jni.*;
import org.fmod.lowlevel.FMODResultTracker;

import java.nio.charset.StandardCharsets;

import static org.fmod.jni.FMOD.*;

/**
 * Proxy to FMOD EventDescription class.
 *
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_EventDescription.html" >FMOD EventDescription Documentation</a>
 *
 * Author: Nate
 * Date: 5/1/2015
 */
public final class EventDescription extends FMODResultTracker{

	private final SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION pointer;

	private FMOD_GUID tmpId;


	private int[] pi = new int[1];
	private float[] pf = new float[1];

	EventDescription(SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION getPointer() {
		return pointer;
	}
	

	public boolean isValid() {
		return FMOD_Studio_EventDescription_IsValid(pointer) != 0;
	}
	public FMOD_GUID getId() {
		if(tmpId == null) {
			tmpId = new FMOD_GUID();
		}
		processApiResult(FMOD_Studio_EventDescription_GetID(pointer, tmpId), "EventDescription.getId");
		return tmpId;
	}

	public EventInstance createInstance() {
		SWIGTYPE_p_p_FMOD_STUDIO_EVENTINSTANCE pp = new_FMOD_STUDIO_EVENTINSTANCE_p_p();
		processApiResult(FMOD_Studio_EventDescription_CreateInstance(pointer, pp), "EventDescription.createInstance");
		final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE p = FMOD_STUDIO_EVENTINSTANCE_p_p_value(pp);
		delete_FMOD_STUDIO_EVENTINSTANCE_p_p(pp);
		return new EventInstance(p, this);
	}
	
	public synchronized boolean hasCue() {
		processApiResult(FMOD_Studio_EventDescription_HasCue(pointer, pi), "EventDescription.hasCue");
		return pi[0] != 0;
	}
	
	public void loadSampleData() {
		processApiResult(FMOD_Studio_EventDescription_LoadSampleData(pointer), "EventDescription.loadSampleData");
	}
	
	
	public synchronized String getPath() {
		byte[] buf = new byte[512];
		processApiResult(FMOD_Studio_EventDescription_GetPath(pointer, buf, 512, pi), "EventDescription.getPath");

		int clen = pi[0];
		if(clen > 0) {
			return new String(buf, 0, clen - 1, StandardCharsets.UTF_8);
		}
		return "";
	}
	
	public synchronized int getParameterCount() {
		processApiResult(FMOD_Studio_EventDescription_GetParameterCount(pointer, pi), "EventDescription.getParameterCount");
		return pi[0];
	}
	
	public FMOD_STUDIO_PARAMETER_DESCRIPTION getParameterByIndex(int index) {
		FMOD_STUDIO_PARAMETER_DESCRIPTION desc = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
		processApiResult(FMOD_Studio_EventDescription_GetParameterByIndex(pointer, index, desc), "EventDescription.getParameterByIndex");
		return desc;
	}
	
	public FMOD_STUDIO_PARAMETER_DESCRIPTION getParameter(String name) {
		FMOD_STUDIO_PARAMETER_DESCRIPTION desc = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
		processApiResult(FMOD_Studio_EventDescription_GetParameter(pointer, name, desc), "EventDescription.getParameter");
		return desc;
	}
	public synchronized int getUserPropertyCount() {
		processApiResult(FMOD_Studio_EventDescription_GetParameterCount(pointer, pi), "EventDescription.getUserPropertyCount");
		return pi[0];
	}
	
	public FMOD_STUDIO_USER_PROPERTY getUserPropertyByIndex(int index) {
		FMOD_STUDIO_USER_PROPERTY property = new FMOD_STUDIO_USER_PROPERTY();
		processApiResult(FMOD_Studio_EventDescription_GetUserPropertyByIndex(pointer, index, property), "EventDescription.getUserPropertyByIndex");
		return property;
	}
	
	public FMOD_STUDIO_USER_PROPERTY getUserProperty(String name) {
		FMOD_STUDIO_USER_PROPERTY property = new FMOD_STUDIO_USER_PROPERTY();
		processApiResult(FMOD_Studio_EventDescription_GetUserProperty(pointer, name, property), "EventDescription.getUserProperty");
		return property;
	}

	public synchronized int getLength() {
		processApiResult(FMOD_Studio_EventDescription_GetLength(pointer, pi), "EventDescription.getLength");
		return pi[0];
	}
	public synchronized float getMinimumDistance() {
		processApiResult(FMOD_Studio_EventDescription_GetMinimumDistance(pointer, pf), "EventDescription.getMinimumDistance");
		return pf[0];
	}
	public synchronized float getMaximumDistance() {
		processApiResult(FMOD_Studio_EventDescription_GetMaximumDistance(pointer, pf), "EventDescription.getMaximumDistance");
		return pf[0];
	}

	public synchronized boolean isOneshot() {
		processApiResult(FMOD_Studio_EventDescription_IsOneshot(pointer, pi), "EventDescription.isOneshot");
		return pi[0] != 0;
	}
	public synchronized boolean isStream() {
		processApiResult(FMOD_Studio_EventDescription_IsStream(pointer, pi), "EventDescription.isStream");
		return pi[0] != 0;
	}
	public synchronized boolean is3D() {
		processApiResult(FMOD_Studio_EventDescription_Is3D(pointer, pi), "EventDescription.is3D");
		return pi[0] != 0;
	}
	public synchronized int getInstanceCount() {
		processApiResult(FMOD_Studio_EventDescription_GetInstanceCount(pointer, pi), "EventDescription.getInstanceCount");
		return pi[0];
	}

	
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetInstanceList(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENTINSTANCE **array, int capacity, int *count);
//	/**
//	 * calls getInstanceCount to allocate the right sized list
//	 * @return
//	 */
//	public synchronized boolean getInstanceList() {
//		int count = getInstanceCount();
//		SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE[] instancePointers = new SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE[count];
//		//TODO we can get back a pointer to a pointer, but we can't iterate it, so we're stuck. Needs some swig work.
//		processApiResult(FMOD_Studio_EventDescription_GetInstanceList(pointer, instancePointers, count, pi), "EventDescription.getInstanceList");
//		return pi[0] != 0;
//	}


	public void unloadSampleData() {
		processApiResult(FMOD_Studio_EventDescription_UnloadSampleData(pointer), "EventDescription.unloadSampleData");
	}
	
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetSampleLoadingState(FMOD_STUDIO_EVENTDESCRIPTION *eventDesc, FMOD_STUDIO_LOADING_STATE *state);
//	public void getSampleLoadingState() {
//		//TODO need to implement enum functionality here maybe? See EventInstance.getPlaybackState()
//		processApiResult(FMOD_Studio_EventDescription_GetSampleLoadingState(pointer, p), "EventDescription.getSampleLoadingState");
//	}

	public void releaseAllInstances() {
		processApiResult(FMOD_Studio_EventDescription_ReleaseAllInstances(pointer), "EventDescription.ReleaseAllInstances");
	}


	
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void **userData);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_SetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void *userData);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_SetCallback(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EventDescription that = (EventDescription) o;
		return pointer.equals(that.pointer);
	}

	@Override
	public int hashCode() {
		return pointer.hashCode();
	}
	
	
}
