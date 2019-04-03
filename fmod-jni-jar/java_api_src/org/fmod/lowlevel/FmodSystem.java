package org.fmod.lowlevel;

import org.fmod.jni.*;

import java.util.Objects;

import static org.fmod.jni.FMOD.*;

/**
 *
 * The low-level FMOD::System object.
 * 
 * I don't know that this object is actually needed by the client? I'm confused..
 * 
 * I guess, need to look at the fmod docs to find out how to use it.
 *
 * Author: Nate
 * Date: 5/1/2015
 */
@SuppressWarnings("WeakerAccess")
public class FmodSystem extends FMODResultTracker {


	private final SWIGTYPE_p_FMOD_SYSTEM pointer;
	
	private FMOD_ADVANCEDSETTINGS tmpAdvancedSettings;

	private FmodSystem(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {

		this.pointer = lowLevel_p;
	}

	/**
	 * This is for internal use by studio.System.getLowLevelSystem().
	 */
	public static FmodSystem fromPointer(SWIGTYPE_p_FMOD_SYSTEM lowLevel_p) {
		return new FmodSystem(lowLevel_p);
	}
	
	public SWIGTYPE_p_FMOD_SYSTEM getPointer() {
		return pointer;
	}
	
	public void setAdvancedSettings(FMOD_ADVANCEDSETTINGS settings) {
		processApiResult(FMOD_System_SetAdvancedSettings(pointer, settings), "System.setAdvancedSettings");
	}
	
	public void release() {
		processApiResult(FMOD_System_Release(pointer), "System.release");
	}

	public static FmodSystem create() {
		SWIGTYPE_p_p_FMOD_SYSTEM pp = new_FMOD_SYSTEM_p_p();
		FMOD_RESULT result = FMOD_System_Create(pp);
		final FmodSystem system = new FmodSystem(FMOD_SYSTEM_p_p_value(pp));
		system.processApiResult(result, "System.create");
		delete_FMOD_SYSTEM_p_p(pp);
		return system;
	}
	
	public FMOD_ADVANCEDSETTINGS getAdvancedSettings() {
		if(tmpAdvancedSettings == null) {
			tmpAdvancedSettings = new FMOD_ADVANCEDSETTINGS();
			tmpAdvancedSettings.setCbSize(FMODConstants.sizeof_FMOD_ADVANCEDSETTINGS);
		}
		return getAdvancedSettings(tmpAdvancedSettings);
	}

	public FMOD_ADVANCEDSETTINGS getAdvancedSettings(FMOD_ADVANCEDSETTINGS toFill) {
		processApiResult(FMOD_System_GetAdvancedSettings(pointer, toFill), "System.getAdvancedSettings");
		return toFill;
	}


	/*
     Setup functions.
*/

//FMOD_RESULT F_API FMOD_System_SetOutput                 (FMOD_SYSTEM *system, FMOD_OUTPUTTYPE output);
//FMOD_RESULT F_API FMOD_System_GetOutput                 (FMOD_SYSTEM *system, FMOD_OUTPUTTYPE *output);
//FMOD_RESULT F_API FMOD_System_GetNumDrivers             (FMOD_SYSTEM *system, int *numdrivers);
//FMOD_RESULT F_API FMOD_System_GetDriverInfo             (FMOD_SYSTEM *system, int id, char *name, int namelen, FMOD_GUID *guid, int *systemrate, FMOD_SPEAKERMODE *speakermode, int *speakermodechannels);
//FMOD_RESULT F_API FMOD_System_SetDriver                 (FMOD_SYSTEM *system, int driver);
//FMOD_RESULT F_API FMOD_System_GetDriver                 (FMOD_SYSTEM *system, int *driver);
//FMOD_RESULT F_API FMOD_System_SetSoftwareChannels       (FMOD_SYSTEM *system, int numsoftwarechannels);
//FMOD_RESULT F_API FMOD_System_GetSoftwareChannels       (FMOD_SYSTEM *system, int *numsoftwarechannels);
//FMOD_RESULT F_API FMOD_System_SetSoftwareFormat         (FMOD_SYSTEM *system, int samplerate, FMOD_SPEAKERMODE speakermode, int numrawspeakers);
//FMOD_RESULT F_API FMOD_System_GetSoftwareFormat         (FMOD_SYSTEM *system, int *samplerate, FMOD_SPEAKERMODE *speakermode, int *numrawspeakers);
//FMOD_RESULT F_API FMOD_System_SetDSPBufferSize          (FMOD_SYSTEM *system, unsigned int bufferlength, int numbuffers);
//FMOD_RESULT F_API FMOD_System_GetDSPBufferSize          (FMOD_SYSTEM *system, unsigned int *bufferlength, int *numbuffers);
//FMOD_RESULT F_API FMOD_System_SetFileSystem             (FMOD_SYSTEM *system, FMOD_FILE_OPEN_CALLBACK useropen, FMOD_FILE_CLOSE_CALLBACK userclose, FMOD_FILE_READ_CALLBACK userread, FMOD_FILE_SEEK_CALLBACK userseek, FMOD_FILE_ASYNCREAD_CALLBACK userasyncread, FMOD_FILE_ASYNCCANCEL_CALLBACK userasynccancel, int blockalign);
//FMOD_RESULT F_API FMOD_System_AttachFileSystem          (FMOD_SYSTEM *system, FMOD_FILE_OPEN_CALLBACK useropen, FMOD_FILE_CLOSE_CALLBACK userclose, FMOD_FILE_READ_CALLBACK userread, FMOD_FILE_SEEK_CALLBACK userseek);
//FMOD_RESULT F_API FMOD_System_SetCallback               (FMOD_SYSTEM *system, FMOD_SYSTEM_CALLBACK callback, FMOD_SYSTEM_CALLBACK_TYPE callbackmask);

/*
     Plug-in support.
*/

//FMOD_RESULT F_API FMOD_System_SetPluginPath             (FMOD_SYSTEM *system, const char *path);
//FMOD_RESULT F_API FMOD_System_LoadPlugin                (FMOD_SYSTEM *system, const char *filename, unsigned int *handle, unsigned int priority);
//FMOD_RESULT F_API FMOD_System_UnloadPlugin              (FMOD_SYSTEM *system, unsigned int handle);
//FMOD_RESULT F_API FMOD_System_GetNumNestedPlugins       (FMOD_SYSTEM *system, unsigned int handle, int *count);
//FMOD_RESULT F_API FMOD_System_GetNestedPlugin           (FMOD_SYSTEM *system, unsigned int handle, int index, unsigned int *nestedhandle);
//FMOD_RESULT F_API FMOD_System_GetNumPlugins             (FMOD_SYSTEM *system, FMOD_PLUGINTYPE plugintype, int *numplugins);
//FMOD_RESULT F_API FMOD_System_GetPluginHandle           (FMOD_SYSTEM *system, FMOD_PLUGINTYPE plugintype, int index, unsigned int *handle);
//FMOD_RESULT F_API FMOD_System_GetPluginInfo             (FMOD_SYSTEM *system, unsigned int handle, FMOD_PLUGINTYPE *plugintype, char *name, int namelen, unsigned int *version);
//FMOD_RESULT F_API FMOD_System_SetOutputByPlugin         (FMOD_SYSTEM *system, unsigned int handle);
//FMOD_RESULT F_API FMOD_System_GetOutputByPlugin         (FMOD_SYSTEM *system, unsigned int *handle);
//FMOD_RESULT F_API FMOD_System_CreateDSPByPlugin         (FMOD_SYSTEM *system, unsigned int handle, FMOD_DSP **dsp);
//FMOD_RESULT F_API FMOD_System_GetDSPInfoByPlugin        (FMOD_SYSTEM *system, unsigned int handle, const FMOD_DSP_DESCRIPTION **description);
//FMOD_RESULT F_API FMOD_System_RegisterCodec             (FMOD_SYSTEM *system, FMOD_CODEC_DESCRIPTION *description, unsigned int *handle, unsigned int priority);
//FMOD_RESULT F_API FMOD_System_RegisterDSP               (FMOD_SYSTEM *system, const FMOD_DSP_DESCRIPTION *description, unsigned int *handle);
//FMOD_RESULT F_API FMOD_System_RegisterOutput            (FMOD_SYSTEM *system, const FMOD_OUTPUT_DESCRIPTION *description, unsigned int *handle);

/*
     Init/Close.
*/

//FMOD_RESULT F_API FMOD_System_Init                      (FMOD_SYSTEM *system, int maxchannels, FMOD_INITFLAGS flags, void *extradriverdata);
//FMOD_RESULT F_API FMOD_System_Close                     (FMOD_SYSTEM *system);

/*
     General post-init system functions.
*/

//FMOD_RESULT F_API FMOD_System_Update                    (FMOD_SYSTEM *system);
//
//FMOD_RESULT F_API FMOD_System_SetSpeakerPosition        (FMOD_SYSTEM *system, FMOD_SPEAKER speaker, float x, float y, FMOD_BOOL active);
//FMOD_RESULT F_API FMOD_System_GetSpeakerPosition        (FMOD_SYSTEM *system, FMOD_SPEAKER speaker, float *x, float *y, FMOD_BOOL *active);
//FMOD_RESULT F_API FMOD_System_SetStreamBufferSize       (FMOD_SYSTEM *system, unsigned int filebuffersize, FMOD_TIMEUNIT filebuffersizetype);
//FMOD_RESULT F_API FMOD_System_GetStreamBufferSize       (FMOD_SYSTEM *system, unsigned int *filebuffersize, FMOD_TIMEUNIT *filebuffersizetype);
//FMOD_RESULT F_API FMOD_System_Set3DSettings             (FMOD_SYSTEM *system, float dopplerscale, float distancefactor, float rolloffscale);
//FMOD_RESULT F_API FMOD_System_Get3DSettings             (FMOD_SYSTEM *system, float *dopplerscale, float *distancefactor, float *rolloffscale);
//FMOD_RESULT F_API FMOD_System_Set3DNumListeners         (FMOD_SYSTEM *system, int numlisteners);
//FMOD_RESULT F_API FMOD_System_Get3DNumListeners         (FMOD_SYSTEM *system, int *numlisteners);
//FMOD_RESULT F_API FMOD_System_Set3DListenerAttributes   (FMOD_SYSTEM *system, int listener, const FMOD_VECTOR *pos, const FMOD_VECTOR *vel, const FMOD_VECTOR *forward, const FMOD_VECTOR *up);
//FMOD_RESULT F_API FMOD_System_Get3DListenerAttributes   (FMOD_SYSTEM *system, int listener, FMOD_VECTOR *pos, FMOD_VECTOR *vel, FMOD_VECTOR *forward, FMOD_VECTOR *up);
//FMOD_RESULT F_API FMOD_System_Set3DRolloffCallback      (FMOD_SYSTEM *system, FMOD_3D_ROLLOFF_CALLBACK callback);
//FMOD_RESULT F_API FMOD_System_MixerSuspend              (FMOD_SYSTEM *system);
//FMOD_RESULT F_API FMOD_System_MixerResume               (FMOD_SYSTEM *system);
//FMOD_RESULT F_API FMOD_System_GetDefaultMixMatrix       (FMOD_SYSTEM *system, FMOD_SPEAKERMODE sourcespeakermode, FMOD_SPEAKERMODE targetspeakermode, float *matrix, int matrixhop);
//FMOD_RESULT F_API FMOD_System_GetSpeakerModeChannels    (FMOD_SYSTEM *system, FMOD_SPEAKERMODE mode, int *channels);

/*
     System information functions.
*/

//FMOD_RESULT F_API FMOD_System_GetVersion                (FMOD_SYSTEM *system, unsigned int *version);
//FMOD_RESULT F_API FMOD_System_GetOutputHandle           (FMOD_SYSTEM *system, void **handle);
//FMOD_RESULT F_API FMOD_System_GetChannelsPlaying        (FMOD_SYSTEM *system, int *channels, int *realchannels);
//FMOD_RESULT F_API FMOD_System_GetCPUUsage               (FMOD_SYSTEM *system, float *dsp, float *stream, float *geometry, float *update, float *total);
//FMOD_RESULT F_API FMOD_System_GetFileUsage              (FMOD_SYSTEM *system, long long *sampleBytesRead, long long *streamBytesRead, long long *otherBytesRead);
//FMOD_RESULT F_API FMOD_System_GetSoundRAM               (FMOD_SYSTEM *system, int *currentalloced, int *maxalloced, int *total);

/*
     Sound/DSP/Channel/FX creation and retrieval.
*/

//FMOD_RESULT F_API FMOD_System_CreateSound               (FMOD_SYSTEM *system, const char *name_or_data, FMOD_MODE mode, FMOD_CREATESOUNDEXINFO *exinfo, FMOD_SOUND **sound);
//FMOD_RESULT F_API FMOD_System_CreateStream              (FMOD_SYSTEM *system, const char *name_or_data, FMOD_MODE mode, FMOD_CREATESOUNDEXINFO *exinfo, FMOD_SOUND **sound);
//FMOD_RESULT F_API FMOD_System_CreateDSP                 (FMOD_SYSTEM *system, const FMOD_DSP_DESCRIPTION *description, FMOD_DSP **dsp);
//FMOD_RESULT F_API FMOD_System_CreateDSPByType           (FMOD_SYSTEM *system, FMOD_DSP_TYPE type, FMOD_DSP **dsp);
//FMOD_RESULT F_API FMOD_System_CreateChannelGroup        (FMOD_SYSTEM *system, const char *name, FMOD_CHANNELGROUP **channelgroup);
//FMOD_RESULT F_API FMOD_System_CreateSoundGroup          (FMOD_SYSTEM *system, const char *name, FMOD_SOUNDGROUP **soundgroup);
//FMOD_RESULT F_API FMOD_System_CreateReverb3D            (FMOD_SYSTEM *system, FMOD_REVERB3D **reverb);
//
//FMOD_RESULT F_API FMOD_System_PlaySound                 (FMOD_SYSTEM *system, FMOD_SOUND *sound, FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL paused, FMOD_CHANNEL **channel);
//FMOD_RESULT F_API FMOD_System_PlayDSP                   (FMOD_SYSTEM *system, FMOD_DSP *dsp, FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL paused, FMOD_CHANNEL **channel);
//FMOD_RESULT F_API FMOD_System_GetChannel                (FMOD_SYSTEM *system, int channelid, FMOD_CHANNEL **channel);
//FMOD_RESULT F_API FMOD_System_GetMasterChannelGroup     (FMOD_SYSTEM *system, FMOD_CHANNELGROUP **channelgroup);
//FMOD_RESULT F_API FMOD_System_GetMasterSoundGroup       (FMOD_SYSTEM *system, FMOD_SOUNDGROUP **soundgroup);

/*
     Routing to ports.
*/

//FMOD_RESULT F_API FMOD_System_AttachChannelGroupToPort  (FMOD_SYSTEM *system, FMOD_PORT_TYPE portType, FMOD_PORT_INDEX portIndex, FMOD_CHANNELGROUP *channelgroup, FMOD_BOOL passThru);
//FMOD_RESULT F_API FMOD_System_DetachChannelGroupFromPort(FMOD_SYSTEM *system, FMOD_CHANNELGROUP *channelgroup);

/*
     Reverb API.
*/

//FMOD_RESULT F_API FMOD_System_SetReverbProperties       (FMOD_SYSTEM *system, int instance, const FMOD_REVERB_PROPERTIES *prop);
//FMOD_RESULT F_API FMOD_System_GetReverbProperties       (FMOD_SYSTEM *system, int instance, FMOD_REVERB_PROPERTIES *prop);

/*
     System level DSP functionality.
*/

//FMOD_RESULT F_API FMOD_System_LockDSP                   (FMOD_SYSTEM *system);
//FMOD_RESULT F_API FMOD_System_UnlockDSP                 (FMOD_SYSTEM *system);

/*
     Recording API.
*/

//FMOD_RESULT F_API FMOD_System_GetRecordNumDrivers       (FMOD_SYSTEM *system, int *numdrivers, int *numconnected);
//FMOD_RESULT F_API FMOD_System_GetRecordDriverInfo       (FMOD_SYSTEM *system, int id, char *name, int namelen, FMOD_GUID *guid, int *systemrate, FMOD_SPEAKERMODE *speakermode, int *speakermodechannels, FMOD_DRIVER_STATE *state);
//FMOD_RESULT F_API FMOD_System_GetRecordPosition         (FMOD_SYSTEM *system, int id, unsigned int *position);
//FMOD_RESULT F_API FMOD_System_RecordStart               (FMOD_SYSTEM *system, int id, FMOD_SOUND *sound, FMOD_BOOL loop);
//FMOD_RESULT F_API FMOD_System_RecordStop                (FMOD_SYSTEM *system, int id);
//FMOD_RESULT F_API FMOD_System_IsRecording               (FMOD_SYSTEM *system, int id, FMOD_BOOL *recording);

/*
     Geometry API.
*/

//FMOD_RESULT F_API FMOD_System_CreateGeometry            (FMOD_SYSTEM *system, int maxpolygons, int maxvertices, FMOD_GEOMETRY **geometry);
//FMOD_RESULT F_API FMOD_System_SetGeometrySettings       (FMOD_SYSTEM *system, float maxworldsize);
//FMOD_RESULT F_API FMOD_System_GetGeometrySettings       (FMOD_SYSTEM *system, float *maxworldsize);
//FMOD_RESULT F_API FMOD_System_LoadGeometry              (FMOD_SYSTEM *system, const void *data, int datasize, FMOD_GEOMETRY **geometry);
//FMOD_RESULT F_API FMOD_System_GetGeometryOcclusion      (FMOD_SYSTEM *system, const FMOD_VECTOR *listener, const FMOD_VECTOR *source, float *direct, float *reverb);

/*
     Network functions.
*/

//FMOD_RESULT F_API FMOD_System_SetNetworkProxy           (FMOD_SYSTEM *system, const char *proxy);
//FMOD_RESULT F_API FMOD_System_GetNetworkProxy           (FMOD_SYSTEM *system, char *proxy, int proxylen);
//FMOD_RESULT F_API FMOD_System_SetNetworkTimeout         (FMOD_SYSTEM *system, int timeout);
//FMOD_RESULT F_API FMOD_System_GetNetworkTimeout         (FMOD_SYSTEM *system, int *timeout);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_System_SetUserData               (FMOD_SYSTEM *system, void *userdata);
//FMOD_RESULT F_API FMOD_System_GetUserData               (FMOD_SYSTEM *system, void **userdata);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FmodSystem that = (FmodSystem) o;
		return Objects.equals(pointer, that.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer, tmpAdvancedSettings);
	}
}
