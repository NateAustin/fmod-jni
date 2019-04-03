package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_DSP;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class DSP {
	private final SWIGTYPE_p_FMOD_DSP pointer;

	DSP(SWIGTYPE_p_FMOD_DSP pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_DSP getPointer() {
		return pointer;
	}
	
	
	
	
	
	/*
    'DSP' API
*/

//FMOD_RESULT F_API FMOD_DSP_Release                      (FMOD_DSP *dsp);
//FMOD_RESULT F_API FMOD_DSP_GetSystemObject              (FMOD_DSP *dsp, FMOD_SYSTEM **system);

/*
     Connection / disconnection / input and output enumeration.
*/

//FMOD_RESULT F_API FMOD_DSP_AddInput                     (FMOD_DSP *dsp, FMOD_DSP *input, FMOD_DSPCONNECTION **connection, FMOD_DSPCONNECTION_TYPE type);
//FMOD_RESULT F_API FMOD_DSP_DisconnectFrom               (FMOD_DSP *dsp, FMOD_DSP *target, FMOD_DSPCONNECTION *connection);
//FMOD_RESULT F_API FMOD_DSP_DisconnectAll                (FMOD_DSP *dsp, FMOD_BOOL inputs, FMOD_BOOL outputs);
//FMOD_RESULT F_API FMOD_DSP_GetNumInputs                 (FMOD_DSP *dsp, int *numinputs);
//FMOD_RESULT F_API FMOD_DSP_GetNumOutputs                (FMOD_DSP *dsp, int *numoutputs);
//FMOD_RESULT F_API FMOD_DSP_GetInput                     (FMOD_DSP *dsp, int index, FMOD_DSP **input, FMOD_DSPCONNECTION **inputconnection);
//FMOD_RESULT F_API FMOD_DSP_GetOutput                    (FMOD_DSP *dsp, int index, FMOD_DSP **output, FMOD_DSPCONNECTION **outputconnection);

/*
     DSP unit control.
*/

//FMOD_RESULT F_API FMOD_DSP_SetActive                    (FMOD_DSP *dsp, FMOD_BOOL active);
//FMOD_RESULT F_API FMOD_DSP_GetActive                    (FMOD_DSP *dsp, FMOD_BOOL *active);
//FMOD_RESULT F_API FMOD_DSP_SetBypass                    (FMOD_DSP *dsp, FMOD_BOOL bypass);
//FMOD_RESULT F_API FMOD_DSP_GetBypass                    (FMOD_DSP *dsp, FMOD_BOOL *bypass);
//FMOD_RESULT F_API FMOD_DSP_SetWetDryMix                 (FMOD_DSP *dsp, float prewet, float postwet, float dry);
//FMOD_RESULT F_API FMOD_DSP_GetWetDryMix                 (FMOD_DSP *dsp, float *prewet, float *postwet, float *dry);
//FMOD_RESULT F_API FMOD_DSP_SetChannelFormat             (FMOD_DSP *dsp, FMOD_CHANNELMASK channelmask, int numchannels, FMOD_SPEAKERMODE source_speakermode);
//FMOD_RESULT F_API FMOD_DSP_GetChannelFormat             (FMOD_DSP *dsp, FMOD_CHANNELMASK *channelmask, int *numchannels, FMOD_SPEAKERMODE *source_speakermode);
//FMOD_RESULT F_API FMOD_DSP_GetOutputChannelFormat       (FMOD_DSP *dsp, FMOD_CHANNELMASK inmask, int inchannels, FMOD_SPEAKERMODE inspeakermode, FMOD_CHANNELMASK *outmask, int *outchannels, FMOD_SPEAKERMODE *outspeakermode);
//FMOD_RESULT F_API FMOD_DSP_Reset                        (FMOD_DSP *dsp);

/*
     DSP parameter control.
*/

//FMOD_RESULT F_API FMOD_DSP_SetParameterFloat            (FMOD_DSP *dsp, int index, float value);
//FMOD_RESULT F_API FMOD_DSP_SetParameterInt              (FMOD_DSP *dsp, int index, int value);
//FMOD_RESULT F_API FMOD_DSP_SetParameterBool             (FMOD_DSP *dsp, int index, FMOD_BOOL value);
//FMOD_RESULT F_API FMOD_DSP_SetParameterData             (FMOD_DSP *dsp, int index, void *data, unsigned int length);
//FMOD_RESULT F_API FMOD_DSP_GetParameterFloat            (FMOD_DSP *dsp, int index, float *value, char *valuestr, int valuestrlen);
//FMOD_RESULT F_API FMOD_DSP_GetParameterInt              (FMOD_DSP *dsp, int index, int *value, char *valuestr, int valuestrlen);
//FMOD_RESULT F_API FMOD_DSP_GetParameterBool             (FMOD_DSP *dsp, int index, FMOD_BOOL *value, char *valuestr, int valuestrlen);
//FMOD_RESULT F_API FMOD_DSP_GetParameterData             (FMOD_DSP *dsp, int index, void **data, unsigned int *length, char *valuestr, int valuestrlen);
//FMOD_RESULT F_API FMOD_DSP_GetNumParameters             (FMOD_DSP *dsp, int *numparams);
//FMOD_RESULT F_API FMOD_DSP_GetParameterInfo             (FMOD_DSP *dsp, int index, FMOD_DSP_PARAMETER_DESC **desc);
//FMOD_RESULT F_API FMOD_DSP_GetDataParameterIndex        (FMOD_DSP *dsp, int datatype, int *index);
//FMOD_RESULT F_API FMOD_DSP_ShowConfigDialog             (FMOD_DSP *dsp, void *hwnd, FMOD_BOOL show);

/*
     DSP attributes.
*/

//FMOD_RESULT F_API FMOD_DSP_GetInfo                      (FMOD_DSP *dsp, char *name, unsigned int *version, int *channels, int *configwidth, int *configheight);
//FMOD_RESULT F_API FMOD_DSP_GetType                      (FMOD_DSP *dsp, FMOD_DSP_TYPE *type);
//FMOD_RESULT F_API FMOD_DSP_GetIdle                      (FMOD_DSP *dsp, FMOD_BOOL *idle);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_DSP_SetUserData                  (FMOD_DSP *dsp, void *userdata);
//FMOD_RESULT F_API FMOD_DSP_GetUserData                  (FMOD_DSP *dsp, void **userdata);

/*
     Metering.
*/

//FMOD_RESULT F_API FMOD_DSP_SetMeteringEnabled           (FMOD_DSP *dsp, FMOD_BOOL inputEnabled, FMOD_BOOL outputEnabled);
//FMOD_RESULT F_API FMOD_DSP_GetMeteringEnabled           (FMOD_DSP *dsp, FMOD_BOOL *inputEnabled, FMOD_BOOL *outputEnabled);
//FMOD_RESULT F_API FMOD_DSP_GetMeteringInfo              (FMOD_DSP *dsp, FMOD_DSP_METERING_INFO *inputInfo, FMOD_DSP_METERING_INFO *outputInfo);
//FMOD_RESULT F_API FMOD_DSP_GetCPUUsage                  (FMOD_DSP *dsp, unsigned int *exclusive, unsigned int *inclusive);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DSP dsp = (DSP) o;
		return Objects.equals(pointer, dsp.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
