package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_CHANNEL;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Channel {
	private final SWIGTYPE_p_FMOD_CHANNEL pointer;

	Channel(SWIGTYPE_p_FMOD_CHANNEL pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_CHANNEL getPointer() {
		return pointer;
	}
	
	
	
	
/*
    'Channel' API
*/

//FMOD_RESULT F_API FMOD_Channel_GetSystemObject          (FMOD_CHANNEL *channel, FMOD_SYSTEM **system);

/*
     General control functionality for Channels and ChannelGroups.
*/

//FMOD_RESULT F_API FMOD_Channel_Stop                     (FMOD_CHANNEL *channel);
//FMOD_RESULT F_API FMOD_Channel_SetPaused                (FMOD_CHANNEL *channel, FMOD_BOOL paused);
//FMOD_RESULT F_API FMOD_Channel_GetPaused                (FMOD_CHANNEL *channel, FMOD_BOOL *paused);
//FMOD_RESULT F_API FMOD_Channel_SetVolume                (FMOD_CHANNEL *channel, float volume);
//FMOD_RESULT F_API FMOD_Channel_GetVolume                (FMOD_CHANNEL *channel, float *volume);
//FMOD_RESULT F_API FMOD_Channel_SetVolumeRamp            (FMOD_CHANNEL *channel, FMOD_BOOL ramp);
//FMOD_RESULT F_API FMOD_Channel_GetVolumeRamp            (FMOD_CHANNEL *channel, FMOD_BOOL *ramp);
//FMOD_RESULT F_API FMOD_Channel_GetAudibility            (FMOD_CHANNEL *channel, float *audibility);
//FMOD_RESULT F_API FMOD_Channel_SetPitch                 (FMOD_CHANNEL *channel, float pitch);
//FMOD_RESULT F_API FMOD_Channel_GetPitch                 (FMOD_CHANNEL *channel, float *pitch);
//FMOD_RESULT F_API FMOD_Channel_SetMute                  (FMOD_CHANNEL *channel, FMOD_BOOL mute);
//FMOD_RESULT F_API FMOD_Channel_GetMute                  (FMOD_CHANNEL *channel, FMOD_BOOL *mute);
//FMOD_RESULT F_API FMOD_Channel_SetReverbProperties      (FMOD_CHANNEL *channel, int instance, float wet);
//FMOD_RESULT F_API FMOD_Channel_GetReverbProperties      (FMOD_CHANNEL *channel, int instance, float *wet);
//FMOD_RESULT F_API FMOD_Channel_SetLowPassGain           (FMOD_CHANNEL *channel, float gain);
//FMOD_RESULT F_API FMOD_Channel_GetLowPassGain           (FMOD_CHANNEL *channel, float *gain);
//FMOD_RESULT F_API FMOD_Channel_SetMode                  (FMOD_CHANNEL *channel, FMOD_MODE mode);
//FMOD_RESULT F_API FMOD_Channel_GetMode                  (FMOD_CHANNEL *channel, FMOD_MODE *mode);
//FMOD_RESULT F_API FMOD_Channel_SetCallback              (FMOD_CHANNEL *channel, FMOD_CHANNELCONTROL_CALLBACK callback);
//FMOD_RESULT F_API FMOD_Channel_IsPlaying                (FMOD_CHANNEL *channel, FMOD_BOOL *isplaying);

/*
     Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning incorrect/obsolete values.
*/

//FMOD_RESULT F_API FMOD_Channel_SetPan                   (FMOD_CHANNEL *channel, float pan);
//FMOD_RESULT F_API FMOD_Channel_SetMixLevelsOutput       (FMOD_CHANNEL *channel, float frontleft, float frontright, float center, float lfe, float surroundleft, float surroundright, float backleft, float backright);
//FMOD_RESULT F_API FMOD_Channel_SetMixLevelsInput        (FMOD_CHANNEL *channel, float *levels, int numlevels);
//FMOD_RESULT F_API FMOD_Channel_SetMixMatrix             (FMOD_CHANNEL *channel, float *matrix, int outchannels, int inchannels, int inchannel_hop);
//FMOD_RESULT F_API FMOD_Channel_GetMixMatrix             (FMOD_CHANNEL *channel, float *matrix, int *outchannels, int *inchannels, int inchannel_hop);

/*
     Clock based functionality.
*/

//FMOD_RESULT F_API FMOD_Channel_GetDSPClock              (FMOD_CHANNEL *channel, unsigned long long *dspclock, unsigned long long *parentclock);
//FMOD_RESULT F_API FMOD_Channel_SetDelay                 (FMOD_CHANNEL *channel, unsigned long long dspclock_start, unsigned long long dspclock_end, FMOD_BOOL stopchannels);
//FMOD_RESULT F_API FMOD_Channel_GetDelay                 (FMOD_CHANNEL *channel, unsigned long long *dspclock_start, unsigned long long *dspclock_end, FMOD_BOOL *stopchannels);
//FMOD_RESULT F_API FMOD_Channel_AddFadePoint             (FMOD_CHANNEL *channel, unsigned long long dspclock, float volume);
//FMOD_RESULT F_API FMOD_Channel_SetFadePointRamp         (FMOD_CHANNEL *channel, unsigned long long dspclock, float volume);
//FMOD_RESULT F_API FMOD_Channel_RemoveFadePoints         (FMOD_CHANNEL *channel, unsigned long long dspclock_start, unsigned long long dspclock_end);
//FMOD_RESULT F_API FMOD_Channel_GetFadePoints            (FMOD_CHANNEL *channel, unsigned int *numpoints, unsigned long long *point_dspclock, float *point_volume);

/*
     DSP effects.
*/

//FMOD_RESULT F_API FMOD_Channel_GetDSP                   (FMOD_CHANNEL *channel, int index, FMOD_DSP **dsp);
//FMOD_RESULT F_API FMOD_Channel_AddDSP                   (FMOD_CHANNEL *channel, int index, FMOD_DSP *dsp);
//FMOD_RESULT F_API FMOD_Channel_RemoveDSP                (FMOD_CHANNEL *channel, FMOD_DSP *dsp);
//FMOD_RESULT F_API FMOD_Channel_GetNumDSPs               (FMOD_CHANNEL *channel, int *numdsps);
//FMOD_RESULT F_API FMOD_Channel_SetDSPIndex              (FMOD_CHANNEL *channel, FMOD_DSP *dsp, int index);
//FMOD_RESULT F_API FMOD_Channel_GetDSPIndex              (FMOD_CHANNEL *channel, FMOD_DSP *dsp, int *index);

/*
     3D functionality.
*/

//FMOD_RESULT F_API FMOD_Channel_Set3DAttributes          (FMOD_CHANNEL *channel, const FMOD_VECTOR *pos, const FMOD_VECTOR *vel, const FMOD_VECTOR *alt_pan_pos);
//FMOD_RESULT F_API FMOD_Channel_Get3DAttributes          (FMOD_CHANNEL *channel, FMOD_VECTOR *pos, FMOD_VECTOR *vel, FMOD_VECTOR *alt_pan_pos);
//FMOD_RESULT F_API FMOD_Channel_Set3DMinMaxDistance      (FMOD_CHANNEL *channel, float mindistance, float maxdistance);
//FMOD_RESULT F_API FMOD_Channel_Get3DMinMaxDistance      (FMOD_CHANNEL *channel, float *mindistance, float *maxdistance);
//FMOD_RESULT F_API FMOD_Channel_Set3DConeSettings        (FMOD_CHANNEL *channel, float insideconeangle, float outsideconeangle, float outsidevolume);
//FMOD_RESULT F_API FMOD_Channel_Get3DConeSettings        (FMOD_CHANNEL *channel, float *insideconeangle, float *outsideconeangle, float *outsidevolume);
//FMOD_RESULT F_API FMOD_Channel_Set3DConeOrientation     (FMOD_CHANNEL *channel, FMOD_VECTOR *orientation);
//FMOD_RESULT F_API FMOD_Channel_Get3DConeOrientation     (FMOD_CHANNEL *channel, FMOD_VECTOR *orientation);
//FMOD_RESULT F_API FMOD_Channel_Set3DCustomRolloff       (FMOD_CHANNEL *channel, FMOD_VECTOR *points, int numpoints);
//FMOD_RESULT F_API FMOD_Channel_Get3DCustomRolloff       (FMOD_CHANNEL *channel, FMOD_VECTOR **points, int *numpoints);
//FMOD_RESULT F_API FMOD_Channel_Set3DOcclusion           (FMOD_CHANNEL *channel, float directocclusion, float reverbocclusion);
//FMOD_RESULT F_API FMOD_Channel_Get3DOcclusion           (FMOD_CHANNEL *channel, float *directocclusion, float *reverbocclusion);
//FMOD_RESULT F_API FMOD_Channel_Set3DSpread              (FMOD_CHANNEL *channel, float angle);
//FMOD_RESULT F_API FMOD_Channel_Get3DSpread              (FMOD_CHANNEL *channel, float *angle);
//FMOD_RESULT F_API FMOD_Channel_Set3DLevel               (FMOD_CHANNEL *channel, float level);
//FMOD_RESULT F_API FMOD_Channel_Get3DLevel               (FMOD_CHANNEL *channel, float *level);
//FMOD_RESULT F_API FMOD_Channel_Set3DDopplerLevel        (FMOD_CHANNEL *channel, float level);
//FMOD_RESULT F_API FMOD_Channel_Get3DDopplerLevel        (FMOD_CHANNEL *channel, float *level);
//FMOD_RESULT F_API FMOD_Channel_Set3DDistanceFilter      (FMOD_CHANNEL *channel, FMOD_BOOL custom, float customLevel, float centerFreq);
//FMOD_RESULT F_API FMOD_Channel_Get3DDistanceFilter      (FMOD_CHANNEL *channel, FMOD_BOOL *custom, float *customLevel, float *centerFreq);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_Channel_SetUserData              (FMOD_CHANNEL *channel, void *userdata);
//FMOD_RESULT F_API FMOD_Channel_GetUserData              (FMOD_CHANNEL *channel, void **userdata);

/*
     Channel specific control functionality.
*/

//FMOD_RESULT F_API FMOD_Channel_SetFrequency             (FMOD_CHANNEL *channel, float frequency);
//FMOD_RESULT F_API FMOD_Channel_GetFrequency             (FMOD_CHANNEL *channel, float *frequency);
//FMOD_RESULT F_API FMOD_Channel_SetPriority              (FMOD_CHANNEL *channel, int priority);
//FMOD_RESULT F_API FMOD_Channel_GetPriority              (FMOD_CHANNEL *channel, int *priority);
//FMOD_RESULT F_API FMOD_Channel_SetPosition              (FMOD_CHANNEL *channel, unsigned int position, FMOD_TIMEUNIT postype);
//FMOD_RESULT F_API FMOD_Channel_GetPosition              (FMOD_CHANNEL *channel, unsigned int *position, FMOD_TIMEUNIT postype);
//FMOD_RESULT F_API FMOD_Channel_SetChannelGroup          (FMOD_CHANNEL *channel, FMOD_CHANNELGROUP *channelgroup);
//FMOD_RESULT F_API FMOD_Channel_GetChannelGroup          (FMOD_CHANNEL *channel, FMOD_CHANNELGROUP **channelgroup);
//FMOD_RESULT F_API FMOD_Channel_SetLoopCount             (FMOD_CHANNEL *channel, int loopcount);
//FMOD_RESULT F_API FMOD_Channel_GetLoopCount             (FMOD_CHANNEL *channel, int *loopcount);
//FMOD_RESULT F_API FMOD_Channel_SetLoopPoints            (FMOD_CHANNEL *channel, unsigned int loopstart, FMOD_TIMEUNIT loopstarttype, unsigned int loopend, FMOD_TIMEUNIT loopendtype);
//FMOD_RESULT F_API FMOD_Channel_GetLoopPoints            (FMOD_CHANNEL *channel, unsigned int *loopstart, FMOD_TIMEUNIT loopstarttype, unsigned int *loopend, FMOD_TIMEUNIT loopendtype);

/*
     Information only functions.
*/

//FMOD_RESULT F_API FMOD_Channel_IsVirtual                (FMOD_CHANNEL *channel, FMOD_BOOL *isvirtual);
//FMOD_RESULT F_API FMOD_Channel_GetCurrentSound          (FMOD_CHANNEL *channel, FMOD_SOUND **sound);
//FMOD_RESULT F_API FMOD_Channel_GetIndex                 (FMOD_CHANNEL *channel, int *index);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Channel channel = (Channel) o;
		return Objects.equals(pointer, channel.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
