/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_BUFFER_INFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_BUFFER_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_BUFFER_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fmodJNI.delete_FMOD_STUDIO_BUFFER_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrentUsage(int value) {
    fmodJNI.FMOD_STUDIO_BUFFER_INFO_currentUsage_set(swigCPtr, this, value);
  }

  public int getCurrentUsage() {
    return fmodJNI.FMOD_STUDIO_BUFFER_INFO_currentUsage_get(swigCPtr, this);
  }

  public void setPeakUsage(int value) {
    fmodJNI.FMOD_STUDIO_BUFFER_INFO_peakUsage_set(swigCPtr, this, value);
  }

  public int getPeakUsage() {
    return fmodJNI.FMOD_STUDIO_BUFFER_INFO_peakUsage_get(swigCPtr, this);
  }

  public void setCapacity(int value) {
    fmodJNI.FMOD_STUDIO_BUFFER_INFO_capacity_set(swigCPtr, this, value);
  }

  public int getCapacity() {
    return fmodJNI.FMOD_STUDIO_BUFFER_INFO_capacity_get(swigCPtr, this);
  }

  public void setStallCount(int value) {
    fmodJNI.FMOD_STUDIO_BUFFER_INFO_stallCount_set(swigCPtr, this, value);
  }

  public int getStallCount() {
    return fmodJNI.FMOD_STUDIO_BUFFER_INFO_stallCount_get(swigCPtr, this);
  }

  public void setStallTime(float value) {
    fmodJNI.FMOD_STUDIO_BUFFER_INFO_stallTime_set(swigCPtr, this, value);
  }

  public float getStallTime() {
    return fmodJNI.FMOD_STUDIO_BUFFER_INFO_stallTime_get(swigCPtr, this);
  }

  public FMOD_STUDIO_BUFFER_INFO() {
    this(fmodJNI.new_FMOD_STUDIO_BUFFER_INFO(), true);
  }

}