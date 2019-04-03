package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_VCA;

import java.util.Objects;

/**
 * 
 * 
 * Author: Nate
 * Date: 5/1/2015
 */
public class VCA {
	private final SWIGTYPE_p_FMOD_STUDIO_VCA pointer;

	VCA(SWIGTYPE_p_FMOD_STUDIO_VCA pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_VCA getPointer() {
		return pointer;
	}
	
	
	
//FMOD_BOOL   F_API FMOD_Studio_VCA_IsValid(FMOD_STUDIO_VCA *vca);
//FMOD_RESULT F_API FMOD_Studio_VCA_GetID(FMOD_STUDIO_VCA *vca, FMOD_GUID *id);
//FMOD_RESULT F_API FMOD_Studio_VCA_GetPath(FMOD_STUDIO_VCA *vca, char *path, int size, int *retrieved);
//FMOD_RESULT F_API FMOD_Studio_VCA_GetVolume(FMOD_STUDIO_VCA *vca, float *volume, float *finalvolume);
//FMOD_RESULT F_API FMOD_Studio_VCA_SetVolume(FMOD_STUDIO_VCA *vca, float volume);

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		VCA vca = (VCA) o;
		return Objects.equals(pointer, vca.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
