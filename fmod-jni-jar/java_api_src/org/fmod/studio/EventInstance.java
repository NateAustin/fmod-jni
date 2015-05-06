package org.fmod.studio;

import org.fmod.lowlevel.FMODResultTracker;
import org.fmod.jni.FMOD_STUDIO_STOP_MODE;
import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE;
import org.fmod.jni.fmod;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class EventInstance extends FMODResultTracker {

	private final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE pointer;

	EventInstance(SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return fmod.FMOD_Studio_EventInstance_IsValid(pointer) != 0;
	}

	public void start() {
		processApiResult(fmod.FMOD_Studio_EventInstance_Start(pointer), "FMOD_Studio_EventInstance_Start");
	}
	public void stop(FMOD_STUDIO_STOP_MODE stopMode) {
		processApiResult(fmod.FMOD_Studio_EventInstance_Stop(pointer, stopMode), "FMOD_Studio_EventInstance_Stop");
	}
	public void release() {
		processApiResult(fmod.FMOD_Studio_EventInstance_Release(pointer), "FMOD_Studio_EventInstance_Release");
	}

//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetDescription(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENTDESCRIPTION **description);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetVolume(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float *volume);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetVolume(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float volume);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPitch(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float *pitch);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetPitch(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float pitch);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_Get3DAttributes(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_3D_ATTRIBUTES *attributes);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_Set3DAttributes(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_3D_ATTRIBUTES *attributes);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetProperty(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float *value);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetProperty(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float value);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPaused(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL *paused);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetPaused(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL paused);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int *position);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int position);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPlaybackState(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_PLAYBACK_STATE *state);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetChannelGroup(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_CHANNELGROUP **group);

//FMOD_RESULT F_API FMOD_Studio_EventInstance_IsVirtual(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL *virtualState);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetParameter(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, FMOD_STUDIO_PARAMETERINSTANCE **parameter);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetParameterByIndex(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int index, FMOD_STUDIO_PARAMETERINSTANCE **parameter);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetParameterCount(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterValue(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, float value);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterValueByIndex(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int index, float value);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetCue(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, FMOD_STUDIO_CUEINSTANCE **cue);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetCueByIndex(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int index, FMOD_STUDIO_CUEINSTANCE **cue);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetCueCount(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int *count);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetCallback(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetUserData(FMOD_STUDIO_EVENTINSTANCE *eventinstance, void **userData);
//FMOD_RESULT F_API FMOD_Studio_EventInstance_SetUserData(FMOD_STUDIO_EVENTINSTANCE *eventinstance, void *userData);


}
