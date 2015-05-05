/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_PARAMETER_DESCRIPTION {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_PARAMETER_DESCRIPTION(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_PARAMETER_DESCRIPTION obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fmodJNI.delete_FMOD_STUDIO_PARAMETER_DESCRIPTION(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_name_get(swigCPtr, this);
  }

  public void setMinimum(float value) {
    fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_minimum_set(swigCPtr, this, value);
  }

  public float getMinimum() {
    return fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_minimum_get(swigCPtr, this);
  }

  public void setMaximum(float value) {
    fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_maximum_set(swigCPtr, this, value);
  }

  public float getMaximum() {
    return fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_maximum_get(swigCPtr, this);
  }

  public void setType(FMOD_STUDIO_PARAMETER_TYPE value) {
    fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_type_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_STUDIO_PARAMETER_TYPE getType() {
    return FMOD_STUDIO_PARAMETER_TYPE.swigToEnum(fmodJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_type_get(swigCPtr, this));
  }

  public FMOD_STUDIO_PARAMETER_DESCRIPTION() {
    this(fmodJNI.new_FMOD_STUDIO_PARAMETER_DESCRIPTION(), true);
  }

}