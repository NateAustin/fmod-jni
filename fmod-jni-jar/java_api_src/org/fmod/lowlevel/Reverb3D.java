package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_REVERB3D;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Reverb3D {
	private final SWIGTYPE_p_FMOD_REVERB3D pointer;

	Reverb3D(SWIGTYPE_p_FMOD_REVERB3D pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_REVERB3D getPointer() {
		return pointer;
	}
	
	
	
	
/*
    'Reverb3D' API
*/

//FMOD_RESULT F_API FMOD_Reverb3D_Release                 (FMOD_REVERB3D *reverb3d);

/*
     Reverb manipulation.
*/

//FMOD_RESULT F_API FMOD_Reverb3D_Set3DAttributes         (FMOD_REVERB3D *reverb3d, const FMOD_VECTOR *position, float mindistance, float maxdistance);
//FMOD_RESULT F_API FMOD_Reverb3D_Get3DAttributes         (FMOD_REVERB3D *reverb3d, FMOD_VECTOR *position, float *mindistance, float *maxdistance);
//FMOD_RESULT F_API FMOD_Reverb3D_SetProperties           (FMOD_REVERB3D *reverb3d, const FMOD_REVERB_PROPERTIES *properties);
//FMOD_RESULT F_API FMOD_Reverb3D_GetProperties           (FMOD_REVERB3D *reverb3d, FMOD_REVERB_PROPERTIES *properties);
//FMOD_RESULT F_API FMOD_Reverb3D_SetActive               (FMOD_REVERB3D *reverb3d, FMOD_BOOL active);
//FMOD_RESULT F_API FMOD_Reverb3D_GetActive               (FMOD_REVERB3D *reverb3d, FMOD_BOOL *active);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_Reverb3D_SetUserData             (FMOD_REVERB3D *reverb3d, void *userdata);
//FMOD_RESULT F_API FMOD_Reverb3D_GetUserData             (FMOD_REVERB3D *reverb3d, void **userdata);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Reverb3D reverb3D = (Reverb3D) o;
		return Objects.equals(pointer, reverb3D.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
