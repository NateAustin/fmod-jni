package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_CHANNELGROUP;
import org.fmod.jni.SWIGTYPE_p_FMOD_SYSTEM;
import org.fmod.jni.SWIGTYPE_p_p_FMOD_SYSTEM;

import static org.fmod.jni.FMOD.*;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class ChannelGroup extends FMODResultTracker {
	private final SWIGTYPE_p_FMOD_CHANNELGROUP pointer;

	private int[] ip = new int[1];
	private float[] fp = new float[1];
	private long[] lp = new long[1];
	

	public ChannelGroup(SWIGTYPE_p_FMOD_CHANNELGROUP pointer) {
		this.pointer = pointer;
	}

	
	public FmodSystem getSystemObject() {
		SWIGTYPE_p_p_FMOD_SYSTEM pp = new_FMOD_SYSTEM_p_p();
		processApiResult(FMOD_ChannelGroup_GetSystemObject(pointer, pp), "ChannelGroup.getSystemObject");
		SWIGTYPE_p_FMOD_SYSTEM p = FMOD_SYSTEM_p_p_value(pp);
		delete_FMOD_SYSTEM_p_p(pp);
		return FmodSystem.fromPointer(p);
	}
	
	
	public void stop() {
		processApiResult(FMOD_ChannelGroup_Stop(pointer), "ChannelGroup.Stop");
	}


	public synchronized float getVolume() {
		processApiResult(FMOD_ChannelGroup_GetVolume(pointer, fp), "ChannelGroup.GetVolume");
		return fp[0];
	}

	public void setVolume(float v) {
		processApiResult(FMOD_ChannelGroup_SetVolume(pointer, v), "ChannelGroup.SetVolume");
	}

	public synchronized boolean getPaused() {
		processApiResult(FMOD_ChannelGroup_GetPaused(pointer, ip), "ChannelGroup.GetPaused");
		return ip[0] != 0;
	}

	public void setPaused(boolean paused) {
		processApiResult(FMOD_ChannelGroup_SetPaused(pointer, paused ? 1 : 0), "ChannelGroup.SetPaused");
	}

	public synchronized boolean getMute() {
		processApiResult(FMOD_ChannelGroup_GetMute(pointer, ip), "ChannelGroup.GetMute");
		return ip[0] != 0;
	}

	public void setMute(boolean mute) {
		processApiResult(FMOD_ChannelGroup_SetMute(pointer, mute ? 1 : 0), "ChannelGroup.SetMute");
	}
	public synchronized boolean getVolumeRamp() {
		processApiResult(FMOD_ChannelGroup_GetVolumeRamp(pointer, ip), "ChannelGroup.GetVolumeRamp");
		return ip[0] != 0;
	}

	public void setVolumeRamp(boolean volumeRamp) {
		processApiResult(FMOD_ChannelGroup_SetVolumeRamp(pointer, volumeRamp ? 1 : 0), "ChannelGroup.SetVolumeRamp");
	}
	
	public synchronized boolean getIsPlaying() {
		processApiResult(FMOD_ChannelGroup_IsPlaying(pointer, ip), "ChannelGroup.IsPlaying");
		return ip[0] != 0;
	}

	public synchronized float getAudibility() {
		processApiResult(FMOD_ChannelGroup_GetAudibility(pointer, fp), "ChannelGroup.GetAudibility");
		return fp[0];
	}

	public synchronized float getPitch() {
		processApiResult(FMOD_ChannelGroup_GetPitch(pointer, fp), "ChannelGroup.GetPitch");
		return fp[0];
	}

	public void setPitch(float v) {
		processApiResult(FMOD_ChannelGroup_SetPitch(pointer,  v), "ChannelGroup.SetPitch");
	}

	public void setReverbProperties(int instance, float v) {
		processApiResult(FMOD_ChannelGroup_SetReverbProperties(pointer, instance, v), "ChannelGroup.SetReverbProperties");
	}

	public synchronized float getReverbProperties(int instance) {
		processApiResult(FMOD_ChannelGroup_GetReverbProperties(pointer, instance, fp), "ChannelGroup.GetReverbProperties");
		return fp[0];
	}

	public void setLowPassGain(float v) {
		processApiResult(FMOD_ChannelGroup_SetLowPassGain(pointer, v), "ChannelGroup.SetLowPassGain");
	}

	public synchronized float getLowPassGain() {
		processApiResult(FMOD_ChannelGroup_GetLowPassGain(pointer, fp), "ChannelGroup.GetLowPassGain");
		return fp[0];
	}

	public void setMode(long mode) {
		processApiResult(FMOD_ChannelGroup_SetMode(pointer, mode), "ChannelGroup.SetMode");
	}

	public synchronized long getMode() {
		processApiResult(FMOD_ChannelGroup_GetMode(pointer, lp), "ChannelGroup.GetMode");
		return lp[0];
	}

	public void setPan(float pan) {
		processApiResult(FMOD_ChannelGroup_SetPan(pointer, pan), "ChannelGroup.SetPan");
	}
	public void setMixLevelsOutput(float frontleft, float frontright, float center, float lfe, float surroundleft, float surroundright, float backleft, float backright) {
		processApiResult(FMOD_ChannelGroup_SetMixLevelsOutput(pointer, frontleft, frontright, center, lfe, surroundleft, surroundright, backleft, backright), "ChannelGroup.SetMixLevelsOutput");
	}
	public void setMixLevelsInput(float[] levels) {
		processApiResult(FMOD_ChannelGroup_SetMixLevelsInput(pointer, levels, levels.length), "ChannelGroup.SetMixLevelsInput");
	}
	public void setMixMatrix(float[] matrix, int outChannels, int inChannels, int channelHop) {
		processApiResult(FMOD_ChannelGroup_SetMixMatrix(pointer, matrix, outChannels, inChannels, channelHop), "ChannelGroup.SetMixMatrix");
	}
	
	
	
//	//TODO figure this out... what size to allocate the array? in/out etc? check fmod docs...
//	//FMOD_RESULT F_API FMOD_ChannelGroup_GetMixMatrix        (FMOD_CHANNELGROUP *channelgroup, float *matrix, int *outchannels, int *inchannels, int inchannel_hop);
//	public float[] getMixMatrix(int channelHop) {
//		float[] matrix = new float[1000];//what.
//		processApiResult(FMOD_ChannelGroup_GetMixMatrix(pointer, matrix, outChannels, inChannels, channelHop), "ChannelGroup.GetMixMatrix");
//	}

	
	



//
///*
//     Clock based functionality.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_GetDSPClock         (FMOD_CHANNELGROUP *channelgroup, unsigned long long *dspclock, unsigned long long *parentclock);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetDelay            (FMOD_CHANNELGROUP *channelgroup, unsigned long long dspclock_start, unsigned long long dspclock_end, FMOD_BOOL stopchannels);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetDelay            (FMOD_CHANNELGROUP *channelgroup, unsigned long long *dspclock_start, unsigned long long *dspclock_end, FMOD_BOOL *stopchannels);
//FMOD_RESULT F_API FMOD_ChannelGroup_AddFadePoint        (FMOD_CHANNELGROUP *channelgroup, unsigned long long dspclock, float volume);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetFadePointRamp    (FMOD_CHANNELGROUP *channelgroup, unsigned long long dspclock, float volume);
//FMOD_RESULT F_API FMOD_ChannelGroup_RemoveFadePoints    (FMOD_CHANNELGROUP *channelgroup, unsigned long long dspclock_start, unsigned long long dspclock_end);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetFadePoints       (FMOD_CHANNELGROUP *channelgroup, unsigned int *numpoints, unsigned long long *point_dspclock, float *point_volume);
//
///*
//     DSP effects.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_GetDSP              (FMOD_CHANNELGROUP *channelgroup, int index, FMOD_DSP **dsp);
//FMOD_RESULT F_API FMOD_ChannelGroup_AddDSP              (FMOD_CHANNELGROUP *channelgroup, int index, FMOD_DSP *dsp);
//FMOD_RESULT F_API FMOD_ChannelGroup_RemoveDSP           (FMOD_CHANNELGROUP *channelgroup, FMOD_DSP *dsp);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetNumDSPs          (FMOD_CHANNELGROUP *channelgroup, int *numdsps);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetDSPIndex         (FMOD_CHANNELGROUP *channelgroup, FMOD_DSP *dsp, int index);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetDSPIndex         (FMOD_CHANNELGROUP *channelgroup, FMOD_DSP *dsp, int *index);
//FMOD_RESULT F_API FMOD_ChannelGroup_OverridePanDSP      (FMOD_CHANNELGROUP *channelgroup, FMOD_DSP *pan);
//
///*
//     3D functionality.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DAttributes     (FMOD_CHANNELGROUP *channelgroup, const FMOD_VECTOR *pos, const FMOD_VECTOR *vel, const FMOD_VECTOR *alt_pan_pos);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DAttributes     (FMOD_CHANNELGROUP *channelgroup, FMOD_VECTOR *pos, FMOD_VECTOR *vel, FMOD_VECTOR *alt_pan_pos);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DMinMaxDistance (FMOD_CHANNELGROUP *channelgroup, float mindistance, float maxdistance);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DMinMaxDistance (FMOD_CHANNELGROUP *channelgroup, float *mindistance, float *maxdistance);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DConeSettings   (FMOD_CHANNELGROUP *channelgroup, float insideconeangle, float outsideconeangle, float outsidevolume);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DConeSettings   (FMOD_CHANNELGROUP *channelgroup, float *insideconeangle, float *outsideconeangle, float *outsidevolume);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DConeOrientation(FMOD_CHANNELGROUP *channelgroup, FMOD_VECTOR *orientation);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DConeOrientation(FMOD_CHANNELGROUP *channelgroup, FMOD_VECTOR *orientation);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DCustomRolloff  (FMOD_CHANNELGROUP *channelgroup, FMOD_VECTOR *points, int numpoints);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DCustomRolloff  (FMOD_CHANNELGROUP *channelgroup, FMOD_VECTOR **points, int *numpoints);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DOcclusion      (FMOD_CHANNELGROUP *channelgroup, float directocclusion, float reverbocclusion);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DOcclusion      (FMOD_CHANNELGROUP *channelgroup, float *directocclusion, float *reverbocclusion);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DSpread         (FMOD_CHANNELGROUP *channelgroup, float angle);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DSpread         (FMOD_CHANNELGROUP *channelgroup, float *angle);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DLevel          (FMOD_CHANNELGROUP *channelgroup, float level);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DLevel          (FMOD_CHANNELGROUP *channelgroup, float *level);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DDopplerLevel   (FMOD_CHANNELGROUP *channelgroup, float level);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DDopplerLevel   (FMOD_CHANNELGROUP *channelgroup, float *level);
//FMOD_RESULT F_API FMOD_ChannelGroup_Set3DDistanceFilter (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL custom, float customLevel, float centerFreq);
//FMOD_RESULT F_API FMOD_ChannelGroup_Get3DDistanceFilter (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL *custom, float *customLevel, float *centerFreq);
//
//
//FMOD_RESULT F_API FMOD_ChannelGroup_Release             (FMOD_CHANNELGROUP *channelgroup);
//
///*
//     Nested channel groups.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_AddGroup            (FMOD_CHANNELGROUP *channelgroup, FMOD_CHANNELGROUP *group, FMOD_BOOL propagatedspclock, FMOD_DSPCONNECTION **connection);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetNumGroups        (FMOD_CHANNELGROUP *channelgroup, int *numgroups);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetGroup            (FMOD_CHANNELGROUP *channelgroup, int index, FMOD_CHANNELGROUP **group);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetParentGroup      (FMOD_CHANNELGROUP *channelgroup, FMOD_CHANNELGROUP **group);
//
///*
//     Information only functions.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_GetName             (FMOD_CHANNELGROUP *channelgroup, char *name, int namelen);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetNumChannels      (FMOD_CHANNELGROUP *channelgroup, int *numchannels);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetChannel          (FMOD_CHANNELGROUP *channelgroup, int index, FMOD_CHANNEL **channel);

//FMOD_RESULT F_API FMOD_ChannelGroup_SetCallback         (FMOD_CHANNELGROUP *channelgroup, FMOD_CHANNELCONTROL_CALLBACK callback);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetUserData         (FMOD_CHANNELGROUP *channelgroup, void *userdata);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetUserData         (FMOD_CHANNELGROUP *channelgroup, void **userdata);

	public SWIGTYPE_p_FMOD_CHANNELGROUP getPointer() {
		return pointer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ChannelGroup that = (ChannelGroup) o;
		return pointer.equals(that.pointer);
	}

	@Override
	public int hashCode() {
		return pointer.hashCode();
	}
}
