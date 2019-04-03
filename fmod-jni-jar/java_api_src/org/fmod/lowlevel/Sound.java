package org.fmod.lowlevel;

import org.fmod.jni.*;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Sound {
	private final SWIGTYPE_p_FMOD_SOUND pointer;

	Sound(SWIGTYPE_p_FMOD_SOUND pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_SOUND getPointer() {
		return pointer;
	}
	
/*
    'Sound' API
*/

//FMOD_RESULT F_API FMOD_Sound_Release                    (FMOD_SOUND *sound);
//FMOD_RESULT F_API FMOD_Sound_GetSystemObject            (FMOD_SOUND *sound, FMOD_SYSTEM **system);

/*
     Standard sound manipulation functions.
*/

//FMOD_RESULT F_API FMOD_Sound_Lock                       (FMOD_SOUND *sound, unsigned int offset, unsigned int length, void **ptr1, void **ptr2, unsigned int *len1, unsigned int *len2);
//FMOD_RESULT F_API FMOD_Sound_Unlock                     (FMOD_SOUND *sound, void *ptr1, void *ptr2, unsigned int len1, unsigned int len2);
//FMOD_RESULT F_API FMOD_Sound_SetDefaults                (FMOD_SOUND *sound, float frequency, int priority);
//FMOD_RESULT F_API FMOD_Sound_GetDefaults                (FMOD_SOUND *sound, float *frequency, int *priority);
//FMOD_RESULT F_API FMOD_Sound_Set3DMinMaxDistance        (FMOD_SOUND *sound, float min, float max);
//FMOD_RESULT F_API FMOD_Sound_Get3DMinMaxDistance        (FMOD_SOUND *sound, float *min, float *max);
//FMOD_RESULT F_API FMOD_Sound_Set3DConeSettings          (FMOD_SOUND *sound, float insideconeangle, float outsideconeangle, float outsidevolume);
//FMOD_RESULT F_API FMOD_Sound_Get3DConeSettings          (FMOD_SOUND *sound, float *insideconeangle, float *outsideconeangle, float *outsidevolume);
//FMOD_RESULT F_API FMOD_Sound_Set3DCustomRolloff         (FMOD_SOUND *sound, FMOD_VECTOR *points, int numpoints);
//FMOD_RESULT F_API FMOD_Sound_Get3DCustomRolloff         (FMOD_SOUND *sound, FMOD_VECTOR **points, int *numpoints);
//FMOD_RESULT F_API FMOD_Sound_GetSubSound                (FMOD_SOUND *sound, int index, FMOD_SOUND **subsound);
//FMOD_RESULT F_API FMOD_Sound_GetSubSoundParent          (FMOD_SOUND *sound, FMOD_SOUND **parentsound);
//FMOD_RESULT F_API FMOD_Sound_GetName                    (FMOD_SOUND *sound, char *name, int namelen);
//FMOD_RESULT F_API FMOD_Sound_GetLength                  (FMOD_SOUND *sound, unsigned int *length, FMOD_TIMEUNIT lengthtype);
//FMOD_RESULT F_API FMOD_Sound_GetFormat                  (FMOD_SOUND *sound, FMOD_SOUND_TYPE *type, FMOD_SOUND_FORMAT *format, int *channels, int *bits);
//FMOD_RESULT F_API FMOD_Sound_GetNumSubSounds            (FMOD_SOUND *sound, int *numsubsounds);
//FMOD_RESULT F_API FMOD_Sound_GetNumTags                 (FMOD_SOUND *sound, int *numtags, int *numtagsupdated);
//FMOD_RESULT F_API FMOD_Sound_GetTag                     (FMOD_SOUND *sound, const char *name, int index, FMOD_TAG *tag);
//FMOD_RESULT F_API FMOD_Sound_GetOpenState               (FMOD_SOUND *sound, FMOD_OPENSTATE *openstate, unsigned int *percentbuffered, FMOD_BOOL *starving, FMOD_BOOL *diskbusy);
//FMOD_RESULT F_API FMOD_Sound_ReadData                   (FMOD_SOUND *sound, void *buffer, unsigned int length, unsigned int *read);
//FMOD_RESULT F_API FMOD_Sound_SeekData                   (FMOD_SOUND *sound, unsigned int pcm);
//
//FMOD_RESULT F_API FMOD_Sound_SetSoundGroup              (FMOD_SOUND *sound, FMOD_SOUNDGROUP *soundgroup);
//FMOD_RESULT F_API FMOD_Sound_GetSoundGroup              (FMOD_SOUND *sound, FMOD_SOUNDGROUP **soundgroup);

/*
     Synchronization point API.  These points can come from markers embedded in wav files, and can also generate channel callbacks.
*/

//FMOD_RESULT F_API FMOD_Sound_GetNumSyncPoints           (FMOD_SOUND *sound, int *numsyncpoints);
//FMOD_RESULT F_API FMOD_Sound_GetSyncPoint               (FMOD_SOUND *sound, int index, FMOD_SYNCPOINT **point);
//FMOD_RESULT F_API FMOD_Sound_GetSyncPointInfo           (FMOD_SOUND *sound, FMOD_SYNCPOINT *point, char *name, int namelen, unsigned int *offset, FMOD_TIMEUNIT offsettype);
//FMOD_RESULT F_API FMOD_Sound_AddSyncPoint               (FMOD_SOUND *sound, unsigned int offset, FMOD_TIMEUNIT offsettype, const char *name, FMOD_SYNCPOINT **point);
//FMOD_RESULT F_API FMOD_Sound_DeleteSyncPoint            (FMOD_SOUND *sound, FMOD_SYNCPOINT *point);

/*
     Functions also in Channel class but here they are the 'default' to save having to change it in Channel all the time.
*/

//FMOD_RESULT F_API FMOD_Sound_SetMode                    (FMOD_SOUND *sound, FMOD_MODE mode);
//FMOD_RESULT F_API FMOD_Sound_GetMode                    (FMOD_SOUND *sound, FMOD_MODE *mode);
//FMOD_RESULT F_API FMOD_Sound_SetLoopCount               (FMOD_SOUND *sound, int loopcount);
//FMOD_RESULT F_API FMOD_Sound_GetLoopCount               (FMOD_SOUND *sound, int *loopcount);
//FMOD_RESULT F_API FMOD_Sound_SetLoopPoints              (FMOD_SOUND *sound, unsigned int loopstart, FMOD_TIMEUNIT loopstarttype, unsigned int loopend, FMOD_TIMEUNIT loopendtype);
//FMOD_RESULT F_API FMOD_Sound_GetLoopPoints              (FMOD_SOUND *sound, unsigned int *loopstart, FMOD_TIMEUNIT loopstarttype, unsigned int *loopend, FMOD_TIMEUNIT loopendtype);

/*
     For MOD/S3M/XM/IT/MID sequenced formats only.
*/

//FMOD_RESULT F_API FMOD_Sound_GetMusicNumChannels        (FMOD_SOUND *sound, int *numchannels);
//FMOD_RESULT F_API FMOD_Sound_SetMusicChannelVolume      (FMOD_SOUND *sound, int channel, float volume);
//FMOD_RESULT F_API FMOD_Sound_GetMusicChannelVolume      (FMOD_SOUND *sound, int channel, float *volume);
//FMOD_RESULT F_API FMOD_Sound_SetMusicSpeed              (FMOD_SOUND *sound, float speed);
//FMOD_RESULT F_API FMOD_Sound_GetMusicSpeed              (FMOD_SOUND *sound, float *speed);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_Sound_SetUserData                (FMOD_SOUND *sound, void *userdata);
//FMOD_RESULT F_API FMOD_Sound_GetUserData                (FMOD_SOUND *sound, void **userdata);	


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sound sound = (Sound) o;
		return Objects.equals(pointer, sound.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
