/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0006.
 * Enumerates the modality types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0006 {
  ucModalityNone(0),
  ucModalityInstantMessage(1),
  ucModalityAudioVideo(2),
  ucModalityApplicationSharing(4),
  ucModalityContentSharing(8),
  ucModalityAppSharing(16),
  ucModalityContent(32);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0006(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucModalityNone;
    case 1: return ucModalityInstantMessage;
    case 2: return ucModalityAudioVideo;
    case 4: return ucModalityApplicationSharing;
    case 8: return ucModalityContentSharing;
    case 16: return ucModalityAppSharing;
    case 32: return ucModalityContent;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0006.class);
    }
  }
}
