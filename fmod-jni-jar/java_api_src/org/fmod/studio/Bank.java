package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_BANK;
import org.fmod.lowlevel.FMODResultTracker;

import static org.fmod.jni.FMOD.*;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Bank extends FMODResultTracker{
	private final SWIGTYPE_p_FMOD_STUDIO_BANK pointer;

	Bank(SWIGTYPE_p_FMOD_STUDIO_BANK pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_BANK getPointer() {
		return pointer;
	}

	public boolean isValid() {
		return FMOD_Studio_Bank_IsValid(pointer) != 0;
	}
	public void unload() {
		processApiResult(FMOD_Studio_Bank_Unload(pointer), "FMOD_Studio_Bank_Unload");
	}


	//FMOD_RESULT F_API FMOD_Studio_Bank_GetID(FMOD_STUDIO_BANK *bank, FMOD_GUID *id);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetPath(FMOD_STUDIO_BANK *bank, char *path, int size, int *retrieved);
	//FMOD_RESULT F_API FMOD_Studio_Bank_LoadSampleData(FMOD_STUDIO_BANK *bank);
	//FMOD_RESULT F_API FMOD_Studio_Bank_UnloadSampleData(FMOD_STUDIO_BANK *bank);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetLoadingState(FMOD_STUDIO_BANK *bank, FMOD_STUDIO_LOADING_STATE *state);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetSampleLoadingState(FMOD_STUDIO_BANK *bank, FMOD_STUDIO_LOADING_STATE *state);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetStringCount(FMOD_STUDIO_BANK *bank, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetStringInfo(FMOD_STUDIO_BANK *bank, int index, FMOD_GUID *id, char *path, int size, int *retrieved);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetEventCount(FMOD_STUDIO_BANK *bank, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetEventList(FMOD_STUDIO_BANK *bank, FMOD_STUDIO_EVENTDESCRIPTION **array, int capacity, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetBusCount(FMOD_STUDIO_BANK *bank, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetBusList(FMOD_STUDIO_BANK *bank, FMOD_STUDIO_BUS **array, int capacity, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetVCACount(FMOD_STUDIO_BANK *bank, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetVCAList(FMOD_STUDIO_BANK *bank, FMOD_STUDIO_VCA **array, int capacity, int *count);
	//FMOD_RESULT F_API FMOD_Studio_Bank_GetUserData(FMOD_STUDIO_BANK *bank, void **userData);
	//FMOD_RESULT F_API FMOD_Studio_Bank_SetUserData(FMOD_STUDIO_BANK *bank, void *userData);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bank bank = (Bank) o;
		return pointer.equals(bank.pointer);
	}

	@Override
	public int hashCode() {
		return pointer.hashCode();
	}
}
