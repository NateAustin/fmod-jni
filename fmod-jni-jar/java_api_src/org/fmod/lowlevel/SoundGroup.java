package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_SOUNDGROUP;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class SoundGroup {
	private final SWIGTYPE_p_FMOD_SOUNDGROUP pointer;

	SoundGroup(SWIGTYPE_p_FMOD_SOUNDGROUP pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_SOUNDGROUP getPointer() {
		return pointer;
	}
	
/*
    'SoundGroup' API1
*/

//FMOD_RESULT F_API FMOD_SoundGroup_Release               (FMOD_SOUNDGROUP *soundgroup);
//FMOD_RESULT F_API FMOD_SoundGroup_GetSystemObject       (FMOD_SOUNDGROUP *soundgroup, FMOD_SYSTEM **system);

/*
     SoundGroup control functions.
*/

//FMOD_RESULT F_API FMOD_SoundGroup_SetMaxAudible         (FMOD_SOUNDGROUP *soundgroup, int maxaudible);
//FMOD_RESULT F_API FMOD_SoundGroup_GetMaxAudible         (FMOD_SOUNDGROUP *soundgroup, int *maxaudible);
//FMOD_RESULT F_API FMOD_SoundGroup_SetMaxAudibleBehavior (FMOD_SOUNDGROUP *soundgroup, FMOD_SOUNDGROUP_BEHAVIOR behavior);
//FMOD_RESULT F_API FMOD_SoundGroup_GetMaxAudibleBehavior (FMOD_SOUNDGROUP *soundgroup, FMOD_SOUNDGROUP_BEHAVIOR *behavior);
//FMOD_RESULT F_API FMOD_SoundGroup_SetMuteFadeSpeed      (FMOD_SOUNDGROUP *soundgroup, float speed);
//FMOD_RESULT F_API FMOD_SoundGroup_GetMuteFadeSpeed      (FMOD_SOUNDGROUP *soundgroup, float *speed);
//FMOD_RESULT F_API FMOD_SoundGroup_SetVolume             (FMOD_SOUNDGROUP *soundgroup, float volume);
//FMOD_RESULT F_API FMOD_SoundGroup_GetVolume             (FMOD_SOUNDGROUP *soundgroup, float *volume);
//FMOD_RESULT F_API FMOD_SoundGroup_Stop                  (FMOD_SOUNDGROUP *soundgroup);

/*
     Information only functions.
*/

//FMOD_RESULT F_API FMOD_SoundGroup_GetName               (FMOD_SOUNDGROUP *soundgroup, char *name, int namelen);
//FMOD_RESULT F_API FMOD_SoundGroup_GetNumSounds          (FMOD_SOUNDGROUP *soundgroup, int *numsounds);
//FMOD_RESULT F_API FMOD_SoundGroup_GetSound              (FMOD_SOUNDGROUP *soundgroup, int index, FMOD_SOUND **sound);
//FMOD_RESULT F_API FMOD_SoundGroup_GetNumPlaying         (FMOD_SOUNDGROUP *soundgroup, int *numplaying);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_SoundGroup_SetUserData           (FMOD_SOUNDGROUP *soundgroup, void *userdata);
//FMOD_RESULT F_API FMOD_SoundGroup_GetUserData           (FMOD_SOUNDGROUP *soundgroup, void **userdata);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SoundGroup that = (SoundGroup) o;
		return Objects.equals(pointer, that.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
