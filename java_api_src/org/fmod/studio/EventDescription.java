package org.fmod.studio;

import org.fmod.FMODResultTracker;
import org.fmod.jni.*;

/**
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_EventDescription.html" >FMOD Documentation</a>
 *
 * Author: Nate
 * Date: 5/1/2015
 */
public final class EventDescription extends FMODResultTracker{

	private final SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION pointer;

	private FMOD_GUID tmpId;

	EventDescription(SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return fmod.FMOD_Studio_EventDescription_IsValid(pointer) != 0;
	}
	public FMOD_GUID getId() {
		if(tmpId == null) {
			tmpId = new FMOD_GUID();
		}
		processApiResult(fmod.FMOD_Studio_EventDescription_GetID(pointer, tmpId), "EventDescription.getId");
		return tmpId;
	}

	public EventInstance createInstance() {
		SWIGTYPE_p_p_FMOD_STUDIO_EVENTINSTANCE pp = fmod.new_FMOD_STUDIO_EVENTINSTANCE_p_p();
		processApiResult(fmod.FMOD_Studio_EventDescription_CreateInstance(pointer, pp), "EventDescription.createInstance");
		final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE p = fmod.FMOD_STUDIO_EVENTINSTANCE_p_p_value(pp);
		fmod.delete_FMOD_STUDIO_EVENTINSTANCE_p_p(pp);
		return new EventInstance(p);
	}
	public void loadSampleData() {
		processApiResult(fmod.FMOD_Studio_EventDescription_LoadSampleData(pointer), "EventDescription.loadSampleData");
	}

//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetPath(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, char *path, int size, int *retrieved);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterByIndex(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int index, FMOD_STUDIO_PARAMETER_DESCRIPTION *parameter);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameter(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, const char *name, FMOD_STUDIO_PARAMETER_DESCRIPTION *parameter);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserPropertyCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserPropertyByIndex(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int index, FMOD_STUDIO_USER_PROPERTY *property);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserProperty(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, const char *name, FMOD_STUDIO_USER_PROPERTY *property);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetLength(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *length);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetMinimumDistance(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, float *distance);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetMaximumDistance(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, float *distance);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_IsOneshot(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *oneshot);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_IsStream(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *isStream);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_Is3D(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *is3D);


//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetInstanceCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetInstanceList(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENTINSTANCE **array, int capacity, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_UnloadSampleData(FMOD_STUDIO_EVENTDESCRIPTION *eventDesc);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetSampleLoadingState(FMOD_STUDIO_EVENTDESCRIPTION *eventDesc, FMOD_STUDIO_LOADING_STATE *state);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_ReleaseAllInstances(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_SetCallback(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void **userData);
//FMOD_RESULT F_API FMOD_Studio_EventDescription_SetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void *userData);
}
