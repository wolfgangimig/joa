/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0006.
 * Enumerates the modality types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0000_0006 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityNone = new __MIDL___MIDL_itf_uc_0001_0000_0006(0);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityInstantMessage = new __MIDL___MIDL_itf_uc_0001_0000_0006(1);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityAudioVideo = new __MIDL___MIDL_itf_uc_0001_0000_0006(2);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityApplicationSharing = new __MIDL___MIDL_itf_uc_0001_0000_0006(4);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityContentSharing = new __MIDL___MIDL_itf_uc_0001_0000_0006(8);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityAppSharing = new __MIDL___MIDL_itf_uc_0001_0000_0006(16);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0006 ucModalityContent = new __MIDL___MIDL_itf_uc_0001_0000_0006(32);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityNone = 0;
  public final static int _ucModalityInstantMessage = 1;
  public final static int _ucModalityAudioVideo = 2;
  public final static int _ucModalityApplicationSharing = 4;
  public final static int _ucModalityContentSharing = 8;
  public final static int _ucModalityAppSharing = 16;
  public final static int _ucModalityContent = 32;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0000_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0000_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucModalityNone;
    case 1: return ucModalityInstantMessage;
    case 2: return ucModalityAudioVideo;
    case 4: return ucModalityApplicationSharing;
    case 8: return ucModalityContentSharing;
    case 16: return ucModalityAppSharing;
    case 32: return ucModalityContent;
    default: return new __MIDL___MIDL_itf_uc_0001_0000_0006(value);
    }
  }
}
