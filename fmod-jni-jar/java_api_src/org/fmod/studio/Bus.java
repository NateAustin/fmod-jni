package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_BUS;
import org.fmod.lowlevel.FMODResultTracker;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Bus extends FMODResultTracker{

	private final SWIGTYPE_p_FMOD_STUDIO_BUS pointer;

	Bus(SWIGTYPE_p_FMOD_STUDIO_BUS pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_BUS getPointer() {
		return pointer;
	}
	
//FMOD_BOOL   F_API FMOD_Studio_Bus_IsValid(FMOD_STUDIO_BUS *bus);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetID(FMOD_STUDIO_BUS *bus, FMOD_GUID *id);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetPath(FMOD_STUDIO_BUS *bus, char *path, int size, int *retrieved);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetVolume(FMOD_STUDIO_BUS *bus, float *volume, float *finalvolume);
//FMOD_RESULT F_API FMOD_Studio_Bus_SetVolume(FMOD_STUDIO_BUS *bus, float volume);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetPaused(FMOD_STUDIO_BUS *bus, FMOD_BOOL *paused);
//FMOD_RESULT F_API FMOD_Studio_Bus_SetPaused(FMOD_STUDIO_BUS *bus, FMOD_BOOL paused);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetMute(FMOD_STUDIO_BUS *bus, FMOD_BOOL *mute);
//FMOD_RESULT F_API FMOD_Studio_Bus_SetMute(FMOD_STUDIO_BUS *bus, FMOD_BOOL mute);
//FMOD_RESULT F_API FMOD_Studio_Bus_StopAllEvents(FMOD_STUDIO_BUS *bus, FMOD_STUDIO_STOP_MODE mode);
//FMOD_RESULT F_API FMOD_Studio_Bus_LockChannelGroup(FMOD_STUDIO_BUS *bus);
//FMOD_RESULT F_API FMOD_Studio_Bus_UnlockChannelGroup(FMOD_STUDIO_BUS *bus);
//FMOD_RESULT F_API FMOD_Studio_Bus_GetChannelGroup(FMOD_STUDIO_BUS *bus, FMOD_CHANNELGROUP **group);	


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bus bus = (Bus) o;
		return Objects.equals(pointer, bus.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
