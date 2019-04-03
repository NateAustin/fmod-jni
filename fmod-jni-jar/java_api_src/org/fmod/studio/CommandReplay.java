package org.fmod.studio;

import org.fmod.jni.SWIGTYPE_p_FMOD_STUDIO_COMMANDREPLAY;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class CommandReplay {
	private final SWIGTYPE_p_FMOD_STUDIO_COMMANDREPLAY pointer;

	public CommandReplay(SWIGTYPE_p_FMOD_STUDIO_COMMANDREPLAY pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_STUDIO_COMMANDREPLAY getPointer() {
		return pointer;
	}
	
//FMOD_BOOL   F_API FMOD_Studio_CommandReplay_IsValid(FMOD_STUDIO_COMMANDREPLAY *replay);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetSystem(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_STUDIO_SYSTEM **system);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetLength(FMOD_STUDIO_COMMANDREPLAY *replay, float *length);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetCommandCount(FMOD_STUDIO_COMMANDREPLAY *replay, int *count);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetCommandInfo(FMOD_STUDIO_COMMANDREPLAY *replay, int commandindex, FMOD_STUDIO_COMMAND_INFO *info);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetCommandString(FMOD_STUDIO_COMMANDREPLAY *replay, int commandindex, char *description, int capacity);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetCommandAtTime(FMOD_STUDIO_COMMANDREPLAY *replay, float time, int *commandindex);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetBankPath(FMOD_STUDIO_COMMANDREPLAY *replay, const char *bankPath);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_Start(FMOD_STUDIO_COMMANDREPLAY *replay);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_Stop(FMOD_STUDIO_COMMANDREPLAY *replay);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SeekToTime(FMOD_STUDIO_COMMANDREPLAY *replay, float time);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SeekToCommand(FMOD_STUDIO_COMMANDREPLAY *replay, int commandindex);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetPaused(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_BOOL *paused);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetPaused(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_BOOL paused);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetPlaybackState(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_STUDIO_PLAYBACK_STATE *state);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetCurrentCommand(FMOD_STUDIO_COMMANDREPLAY *replay, int *commandindex, float *currenttime);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_Release(FMOD_STUDIO_COMMANDREPLAY *replay);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetFrameCallback(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK callback);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetLoadBankCallback(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK callback);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetCreateInstanceCallback(FMOD_STUDIO_COMMANDREPLAY *replay, FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK callback);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_GetUserData(FMOD_STUDIO_COMMANDREPLAY *replay, void **userdata);
//FMOD_RESULT F_API FMOD_Studio_CommandReplay_SetUserData(FMOD_STUDIO_COMMANDREPLAY *replay, void *userdata);	


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CommandReplay that = (CommandReplay) o;
		return Objects.equals(pointer, that.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
