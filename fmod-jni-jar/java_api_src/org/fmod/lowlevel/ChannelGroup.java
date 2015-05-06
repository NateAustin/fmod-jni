package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_CHANNELGROUP;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class ChannelGroup extends FMODResultTracker {
	private final SWIGTYPE_p_FMOD_CHANNELGROUP pointer;

	public ChannelGroup(SWIGTYPE_p_FMOD_CHANNELGROUP pointer) {
		this.pointer = pointer;
	}




//Holy Crap.


//FMOD_RESULT F_API FMOD_ChannelGroup_GetSystemObject     (FMOD_CHANNELGROUP *channelgroup, FMOD_SYSTEM **system);
//
///*
//     General control functionality for Channels and ChannelGroups.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_Stop                (FMOD_CHANNELGROUP *channelgroup);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetPaused           (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL paused);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetPaused           (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL *paused);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetVolume           (FMOD_CHANNELGROUP *channelgroup, float volume);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetVolume           (FMOD_CHANNELGROUP *channelgroup, float *volume);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetVolumeRamp       (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL ramp);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetVolumeRamp       (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL *ramp);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetAudibility       (FMOD_CHANNELGROUP *channelgroup, float *audibility);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetPitch            (FMOD_CHANNELGROUP *channelgroup, float pitch);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetPitch            (FMOD_CHANNELGROUP *channelgroup, float *pitch);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetMute             (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL mute);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetMute             (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL *mute);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetReverbProperties (FMOD_CHANNELGROUP *channelgroup, int instance, float wet);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetReverbProperties (FMOD_CHANNELGROUP *channelgroup, int instance, float *wet);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetLowPassGain      (FMOD_CHANNELGROUP *channelgroup, float gain);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetLowPassGain      (FMOD_CHANNELGROUP *channelgroup, float *gain);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetMode             (FMOD_CHANNELGROUP *channelgroup, FMOD_MODE mode);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetMode             (FMOD_CHANNELGROUP *channelgroup, FMOD_MODE *mode);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetCallback         (FMOD_CHANNELGROUP *channelgroup, FMOD_CHANNELCONTROL_CALLBACK callback);
//FMOD_RESULT F_API FMOD_ChannelGroup_IsPlaying           (FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL *isplaying);
//
///*
//     Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning incorrect/obsolete values.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_SetPan              (FMOD_CHANNELGROUP *channelgroup, float pan);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetMixLevelsOutput  (FMOD_CHANNELGROUP *channelgroup, float frontleft, float frontright, float center, float lfe, float surroundleft, float surroundright, float backleft, float backright);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetMixLevelsInput   (FMOD_CHANNELGROUP *channelgroup, float *levels, int numlevels);
//FMOD_RESULT F_API FMOD_ChannelGroup_SetMixMatrix        (FMOD_CHANNELGROUP *channelgroup, float *matrix, int outchannels, int inchannels, int inchannel_hop);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetMixMatrix        (FMOD_CHANNELGROUP *channelgroup, float *matrix, int *outchannels, int *inchannels, int inchannel_hop);
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
///*
//     Userdata set/get.
//*/
//
//FMOD_RESULT F_API FMOD_ChannelGroup_SetUserData         (FMOD_CHANNELGROUP *channelgroup, void *userdata);
//FMOD_RESULT F_API FMOD_ChannelGroup_GetUserData         (FMOD_CHANNELGROUP *channelgroup, void **userdata);
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
