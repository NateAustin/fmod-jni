package org.fmod.studio;

import org.fmod.jni.*;
import org.fmod.lowlevel.ChannelGroup;
import org.fmod.lowlevel.FMODResultTracker;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.fmod.jni.FMOD.*;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Bus extends FMODResultTracker{

	private final SWIGTYPE_p_FMOD_STUDIO_BUS pointer;

	private FMOD_GUID tmpId;

	private int[] ip = new int[1];
	private float[] fp = new float[1];

	Bus(SWIGTYPE_p_FMOD_STUDIO_BUS pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_BUS getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return FMOD_Studio_Bus_IsValid(pointer) != 0;
	}

	public FMOD_GUID getId() {
		if (tmpId == null) {
			tmpId = new FMOD_GUID();
		}
		processApiResult(FMOD_Studio_Bus_GetID(pointer, tmpId), "Bus.getId");
		return tmpId;
	}

	public synchronized String getPath() {
		byte[] buf = new byte[512];
		processApiResult(FMOD_Studio_Bus_GetPath(pointer, buf, 512, ip), "Bus.getPath");

		int clen = ip[0];
		if (clen > 0) {
			return new String(buf, 0, clen - 1, StandardCharsets.UTF_8);
		}
		return "";
	}

	public synchronized float getVolume() {
		processApiResult(FMOD_Studio_Bus_GetVolume(pointer, fp, null), "Bus.GetVolume");
		return fp[0];
	}

	public void setVolume(float v) {
		processApiResult(FMOD_Studio_Bus_SetVolume(pointer, v), "Bus.SetVolume");
	}

	public synchronized boolean getPaused() {
		processApiResult(FMOD_Studio_Bus_GetPaused(pointer, ip), "Bus.GetPaused");
		return ip[0] != 0;
	}

	public void setPaused(boolean paused) {
		processApiResult(FMOD_Studio_Bus_SetPaused(pointer, paused ? 1 : 0), "Bus.SetPaused");
	}

	public synchronized boolean getMute() {
		processApiResult(FMOD_Studio_Bus_GetMute(pointer, ip), "Bus.GetMute");
		return ip[0] != 0;
	}

	public void setMute(boolean mute) {
		processApiResult(FMOD_Studio_Bus_SetMute(pointer, mute ? 1 : 0), "Bus.SetMute");
	}

	public void stopAllEvents(FMOD_STUDIO_STOP_MODE stopMode) {
		processApiResult(FMOD_Studio_Bus_StopAllEvents(pointer, stopMode), "Bus.StopAllEvents");
	}
	
	public void lockChannelGroup() {
		processApiResult(FMOD_Studio_Bus_LockChannelGroup(pointer), "Bus.LockChannelGroup");
	}
	
	public void unlockChannelGroup() {
		processApiResult(FMOD_Studio_Bus_UnlockChannelGroup(pointer), "Bus.UnlockChannelGroup");
	}


	public ChannelGroup getChannelGroup() {
		SWIGTYPE_p_p_FMOD_CHANNELGROUP pp = new_FMOD_CHANNELGROUP_p_p();
		processApiResult(FMOD_Studio_Bus_GetChannelGroup(pointer, pp), "Bus.getChannelGroup");
		SWIGTYPE_p_FMOD_CHANNELGROUP p = FMOD_CHANNELGROUP_p_p_value(pp);
		delete_FMOD_CHANNELGROUP_p_p(pp);
		return new ChannelGroup(p);
	}
	

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
