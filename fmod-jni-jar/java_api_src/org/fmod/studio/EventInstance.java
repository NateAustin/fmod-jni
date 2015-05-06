package org.fmod.studio;

import org.fmod.jni.*;
import org.fmod.lowlevel.FMODResultTracker;

import static org.fmod.jni.FMOD.*;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class EventInstance extends FMODResultTracker {

	private final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE pointer;
	private final EventDescription parent;
	private FMOD_3D_ATTRIBUTES fmod3DAttributes;


	EventInstance(SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE pointer, EventDescription parent) {
		this.pointer = pointer;
		this.parent = parent;
	}

	public SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return FMOD_Studio_EventInstance_IsValid(pointer) != 0;
	}

	public void start() {
		processApiResult(FMOD_Studio_EventInstance_Start(pointer), "FMOD_Studio_EventInstance_Start");
	}
	public void stop(FMOD_STUDIO_STOP_MODE stopMode) {
		processApiResult(FMOD_Studio_EventInstance_Stop(pointer, stopMode), "FMOD_Studio_EventInstance_Stop");
	}
	public void release() {
		processApiResult(FMOD_Studio_EventInstance_Release(pointer), "FMOD_Studio_EventInstance_Release");
	}

	public EventDescription getDescription() {
		//Note, don't bother to call into C for this, just return the java object that created us.
		return parent;
	}
	
	public float getVolume() {
		float [] v  = new float[1];
		processApiResult(FMOD_Studio_EventInstance_GetVolume(pointer, v), "FMOD_Studio_EventInstance_GetVolume");
		return v[0];
	}
	public void setVolume(float v) {
		processApiResult(FMOD_Studio_EventInstance_SetVolume(pointer, v), "FMOD_Studio_EventInstance_SetVolume");
	}
	
	public float getPitch() {
		float[] v = new float[1];
		processApiResult(FMOD_Studio_EventInstance_GetPitch(pointer, v), "FMOD_Studio_EventInstance_GetPitch");
		return v[0];
	}
	public void setPitch(float v) {
		processApiResult(FMOD_Studio_EventInstance_SetPitch(pointer, v), "FMOD_Studio_EventInstance_SetPitch");
	}

	/**
	 * returns a temporary FMOD_3D_ATTRIBUTES object is reused per call.
	 * If that's not what you want you can call the other version of the function instead.
	 */
	public FMOD_3D_ATTRIBUTES get3DAttributes() {
		if (fmod3DAttributes == null) {
			fmod3DAttributes = new FMOD_3D_ATTRIBUTES();
		}
		return get3DAttributes(fmod3DAttributes);
	}
	/**
	 * Fills the given FMOD_3D_ATTRIBUTES object with the listener attributes.
	 */
	public FMOD_3D_ATTRIBUTES get3DAttributes(FMOD_3D_ATTRIBUTES attributes) {
		processApiResult(FMOD_Studio_EventInstance_Get3DAttributes(pointer, attributes), "FMOD_Studio_EventInstance_Get3DAttributes");
		return attributes;
	}
	public void setListenerAttributes(FMOD_3D_ATTRIBUTES attributes) {
		processApiResult(FMOD_Studio_EventInstance_Set3DAttributes(pointer, attributes), "FMOD_Studio_EventInstance_Set3DAttributes");
	}

	public float getProperty(FMOD_STUDIO_EVENT_PROPERTY property) {
		float[] p = new float[1];
		processApiResult(FMOD_Studio_EventInstance_GetProperty(pointer, property, p), "FMOD_Studio_EventInstance_GetProperty");
		return p[0];
	}
	public void setProperty(FMOD_STUDIO_EVENT_PROPERTY property, float value) {
		processApiResult(FMOD_Studio_EventInstance_SetProperty(pointer, property, value),"FMOD_Studio_EventInstance_SetProperty");
	}

	public boolean getPaused(){
		int[] p = new int[1];
		processApiResult(FMOD_Studio_EventInstance_GetPaused(pointer, p), "FMOD_Studio_EventInstance_GetPaused");
		return p[0] != 0;
	}
	public void setPaused(boolean paused) {
		processApiResult(FMOD_Studio_EventInstance_SetPaused(pointer, paused ? 1 : 0), "FMOD_Studio_EventInstance_SetPaused");
	}
	public int getTimelinePosition(){
		int[] p = new int[1];
		processApiResult(FMOD_Studio_EventInstance_GetTimelinePosition(pointer, p), "FMOD_Studio_EventInstance_GetTimelinePosition");
		return p[0];
	}
	public void setTimelinePosition(int position) {
		processApiResult(FMOD_Studio_EventInstance_SetTimelinePosition(pointer, position), "FMOD_Studio_EventInstance_SetTimelinePosition");
	}

	public FMOD_STUDIO_PLAYBACK_STATE getPlaybackState() {
		int[] p = new int[1];
		processApiResult(FMOD_Studio_EventInstance_GetPlaybackState(pointer, p), "FMOD_Studio_EventInstance_GetPlaybackState");
		return FMOD_STUDIO_PLAYBACK_STATE.swigToEnum(p[0]);
	}

	public boolean isVirtual() {
		int[] p = new int[1];
		processApiResult(FMOD_Studio_EventInstance_IsVirtual(pointer, p), "FMOD_Studio_EventInstance_IsVirtual");
		return p[0] != 0;
	}

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

	//TODO should we attempt to re-use the same java object? Should we attempt to implement a meaningful .equals for ChannelGroup?
//FMOD_RESULT F_API FMOD_Studio_EventInstance_GetChannelGroup(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_CHANNELGROUP **group);
}
