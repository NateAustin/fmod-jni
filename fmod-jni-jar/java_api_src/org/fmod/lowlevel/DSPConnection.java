package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_DSPCONNECTION;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class DSPConnection {
	private final SWIGTYPE_p_FMOD_DSPCONNECTION pointer;

	DSPConnection(SWIGTYPE_p_FMOD_DSPCONNECTION pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_DSPCONNECTION getPointer() {
		return pointer;
	}
	
	
/*
    'DSPConnection' API
*/

//FMOD_RESULT F_API FMOD_DSPConnection_GetInput           (FMOD_DSPCONNECTION *dspconnection, FMOD_DSP **input);
//FMOD_RESULT F_API FMOD_DSPConnection_GetOutput          (FMOD_DSPCONNECTION *dspconnection, FMOD_DSP **output);
//FMOD_RESULT F_API FMOD_DSPConnection_SetMix             (FMOD_DSPCONNECTION *dspconnection, float volume);
//FMOD_RESULT F_API FMOD_DSPConnection_GetMix             (FMOD_DSPCONNECTION *dspconnection, float *volume);
//FMOD_RESULT F_API FMOD_DSPConnection_SetMixMatrix       (FMOD_DSPCONNECTION *dspconnection, float *matrix, int outchannels, int inchannels, int inchannel_hop);
//FMOD_RESULT F_API FMOD_DSPConnection_GetMixMatrix       (FMOD_DSPCONNECTION *dspconnection, float *matrix, int *outchannels, int *inchannels, int inchannel_hop);
//FMOD_RESULT F_API FMOD_DSPConnection_GetType            (FMOD_DSPCONNECTION *dspconnection, FMOD_DSPCONNECTION_TYPE *type);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_DSPConnection_SetUserData        (FMOD_DSPCONNECTION *dspconnection, void *userdata);

//FMOD_RESULT F_API FMOD_DSPConnection_GetUserData        (FMOD_DSPCONNECTION *dspconnection, void **userdata);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DSPConnection that = (DSPConnection) o;
		return Objects.equals(pointer, that.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
