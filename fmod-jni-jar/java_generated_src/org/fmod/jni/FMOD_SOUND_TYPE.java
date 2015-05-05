/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public final class FMOD_SOUND_TYPE {
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_UNKNOWN = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_UNKNOWN");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_AIFF = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_AIFF");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_ASF = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_ASF");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_AT3 = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_AT3");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_DLS = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_DLS");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_FLAC = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_FLAC");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_FSB = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_FSB");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_GCADPCM = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_GCADPCM");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_IT = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_IT");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MIDI = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MIDI");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MOD = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MOD");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MPEG = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MPEG");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_OGGVORBIS = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_OGGVORBIS");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_PLAYLIST = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_PLAYLIST");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_RAW = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_RAW");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_S3M = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_S3M");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_USER = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_USER");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_WAV = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_WAV");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_XM = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_XM");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_XMA = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_XMA");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_VAG = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_VAG");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_AUDIOQUEUE = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_AUDIOQUEUE");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_XWMA = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_XWMA");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_BCWAV = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_BCWAV");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_AT9 = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_AT9");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_VORBIS = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_VORBIS");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MEDIA_FOUNDATION = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MEDIA_FOUNDATION");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MEDIACODEC = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MEDIACODEC");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_FADPCM = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_FADPCM");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_MAX = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_MAX");
  public final static FMOD_SOUND_TYPE FMOD_SOUND_TYPE_FORCEINT = new FMOD_SOUND_TYPE("FMOD_SOUND_TYPE_FORCEINT", fmodJNI.FMOD_SOUND_TYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_SOUND_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_SOUND_TYPE.class + " with value " + swigValue);
  }

  private FMOD_SOUND_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_SOUND_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_SOUND_TYPE(String swigName, FMOD_SOUND_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_SOUND_TYPE[] swigValues = { FMOD_SOUND_TYPE_UNKNOWN, FMOD_SOUND_TYPE_AIFF, FMOD_SOUND_TYPE_ASF, FMOD_SOUND_TYPE_AT3, FMOD_SOUND_TYPE_DLS, FMOD_SOUND_TYPE_FLAC, FMOD_SOUND_TYPE_FSB, FMOD_SOUND_TYPE_GCADPCM, FMOD_SOUND_TYPE_IT, FMOD_SOUND_TYPE_MIDI, FMOD_SOUND_TYPE_MOD, FMOD_SOUND_TYPE_MPEG, FMOD_SOUND_TYPE_OGGVORBIS, FMOD_SOUND_TYPE_PLAYLIST, FMOD_SOUND_TYPE_RAW, FMOD_SOUND_TYPE_S3M, FMOD_SOUND_TYPE_USER, FMOD_SOUND_TYPE_WAV, FMOD_SOUND_TYPE_XM, FMOD_SOUND_TYPE_XMA, FMOD_SOUND_TYPE_VAG, FMOD_SOUND_TYPE_AUDIOQUEUE, FMOD_SOUND_TYPE_XWMA, FMOD_SOUND_TYPE_BCWAV, FMOD_SOUND_TYPE_AT9, FMOD_SOUND_TYPE_VORBIS, FMOD_SOUND_TYPE_MEDIA_FOUNDATION, FMOD_SOUND_TYPE_MEDIACODEC, FMOD_SOUND_TYPE_FADPCM, FMOD_SOUND_TYPE_MAX, FMOD_SOUND_TYPE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
