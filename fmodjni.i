%module fmod
%{
#include "fmod_common.h"
#include "fmod.h"
#include "fmod_studio_common.h"
#include "fmod_studio.h"
%}


/* handle primitive pointers as INOUT. This is conservative, they are (almost?) exclusively used as OUT by FMOD. */
%include "typemaps.i"

%apply int *INOUT {int *};
%apply float *INOUT {float *};
%apply unsigned int *INOUT {unsigned int *};

/* TODO fix FMOD_CREATESOUNDEXINFO.inclusionList (generates bad java due to interaction with typemaps.i ? */
%ignore int * inclusionlist;

/* TODO char * -> String out (getPathByID) */
/* TODO unsigned long long typemap (maybe just use a long instead of BigInteger?) */
/* TODO void* -> byte buffer, for in and out */
/* TODO FMOD_Studio_System_LoadBankMemory const char *buffer -> byte array (see SWIG docs, this one is easy*/

%include "fmod_api/lowlevel/inc/fmod_common.h"
%include "fmod_api/lowlevel/inc/fmod.h"
%include "fmod_api/studio/inc/fmod_studio_common.h"
%include "fmod_api/studio/inc/fmod_studio.h"

/* need to make sure all these pointer functions are here so we can use them to retrieve values via OUT params: */

%include "cpointer.i"
%inline %{
typedef FMOD_STUDIO_SYSTEM* FMOD_STUDIO_SYSTEM_p;
typedef FMOD_SYSTEM* FMOD_SYSTEM_p;
typedef FMOD_STUDIO_EVENTDESCRIPTION* FMOD_STUDIO_EVENTDESCRIPTION_p;
typedef FMOD_STUDIO_BUS* FMOD_STUDIO_BUS_p;
typedef FMOD_STUDIO_VCA* FMOD_STUDIO_VCA_p;
typedef FMOD_STUDIO_BANK* FMOD_STUDIO_BANK_p;
typedef FMOD_STUDIO_EVENTINSTANCE* FMOD_STUDIO_EVENTINSTANCE_p;
typedef FMOD_CHANNELGROUP* FMOD_CHANNELGROUP_p;
typedef FMOD_STUDIO_PARAMETERINSTANCE* FMOD_STUDIO_PARAMETERINSTANCE_p;
typedef FMOD_STUDIO_CUEINSTANCE* FMOD_STUDIO_CUEINSTANCE_p;
typedef FMOD_DSP* FMOD_DSP_p;
typedef FMOD_DSP_DESCRIPTION* FMOD_DSP_DESCRIPTION_p;
typedef FMOD_SOUNDGROUP* FMOD_SOUNDGROUP_p;
typedef FMOD_REVERB3D* FMOD_REVERB3D_p;
typedef FMOD_CHANNEL* FMOD_CHANNEL_p;
typedef FMOD_GEOMETRY* FMOD_GEOMETRY_p;
typedef FMOD_VECTOR* FMOD_VECTOR_p;
typedef FMOD_SOUND* FMOD_SOUND_p;
typedef FMOD_SYNCPOINT* FMOD_SYNCPOINT_p;
typedef FMOD_DSPCONNECTION* FMOD_DSPCONNECTION_p;
typedef FMOD_DSP_PARAMETER_DESC* FMOD_DSP_PARAMETER_DESC_p;
%}

%pointer_functions(FMOD_STUDIO_SYSTEM_p, FMOD_STUDIO_SYSTEM_p_p);
%pointer_functions(FMOD_SYSTEM_p, FMOD_SYSTEM_p_p);
%pointer_functions(FMOD_STUDIO_EVENTDESCRIPTION_p, FMOD_STUDIO_EVENTDESCRIPTION_p_p);
%pointer_functions(FMOD_STUDIO_BUS_p, FMOD_STUDIO_BUS_p_p);
%pointer_functions(FMOD_STUDIO_VCA_p, FMOD_STUDIO_VCA_p_p);
%pointer_functions(FMOD_STUDIO_BANK_p, FMOD_STUDIO_BANK_p_p);
%pointer_functions(FMOD_STUDIO_EVENTINSTANCE_p, FMOD_STUDIO_EVENTINSTANCE_p_p);
%pointer_functions(FMOD_CHANNELGROUP_p, FMOD_CHANNELGROUP_p_p);
%pointer_functions(FMOD_STUDIO_PARAMETERINSTANCE_p, FMOD_STUDIO_PARAMETERINSTANCE_p_p);
%pointer_functions(FMOD_STUDIO_CUEINSTANCE_p, FMOD_STUDIO_CUEINSTANCE_p_p);
%pointer_functions(FMOD_DSP_p, FMOD_DSP_p_p);
%pointer_functions(FMOD_DSP_DESCRIPTION_p, FMOD_DSP_DESCRIPTION_p_p);
%pointer_functions(FMOD_SOUNDGROUP_p, FMOD_SOUNDGROUP_p_p);
%pointer_functions(FMOD_REVERB3D_p, FMOD_REVERB3D_p_p);
%pointer_functions(FMOD_CHANNEL_p, FMOD_CHANNEL_p_p);
%pointer_functions(FMOD_GEOMETRY_p, FMOD_GEOMETRY_p_p);
%pointer_functions(FMOD_VECTOR_p, FMOD_VECTOR_p_p);
%pointer_functions(FMOD_SOUND_p, FMOD_SOUND_p_p);
%pointer_functions(FMOD_SYNCPOINT_p, FMOD_SYNCPOINT_p_p);
%pointer_functions(FMOD_DSPCONNECTION_p, FMOD_DSPCONNECTION_p_p);
%pointer_functions(FMOD_DSP_PARAMETER_DESC_p, FMOD_DSP_PARAMETER_DESC_p_p);



