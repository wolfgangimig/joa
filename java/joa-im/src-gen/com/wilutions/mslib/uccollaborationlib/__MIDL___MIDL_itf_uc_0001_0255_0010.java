/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0010.
 * Enumerates the capabilities that for preferred client. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0010 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityUserActivity = new __MIDL___MIDL_itf_uc_0001_0255_0010(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityText = new __MIDL___MIDL_itf_uc_0001_0255_0010(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityGifInk = new __MIDL___MIDL_itf_uc_0001_0255_0010(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityIsfInk = new __MIDL___MIDL_itf_uc_0001_0255_0010(8);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityAudio = new __MIDL___MIDL_itf_uc_0001_0255_0010(16);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityVideo = new __MIDL___MIDL_itf_uc_0001_0255_0010(32);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityCccp = new __MIDL___MIDL_itf_uc_0001_0255_0010(64);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityCalendar = new __MIDL___MIDL_itf_uc_0001_0255_0010(128);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityRemoteCallControl = new __MIDL___MIDL_itf_uc_0001_0255_0010(256);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityBreakthrough = new __MIDL___MIDL_itf_uc_0001_0255_0010(512);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0010 ucCapabilityApplicationSharing = new __MIDL___MIDL_itf_uc_0001_0255_0010(1024);

  // Integer constants for bitsets and switch statements
  public final static int _ucCapabilityUserActivity = 1;
  public final static int _ucCapabilityText = 2;
  public final static int _ucCapabilityGifInk = 4;
  public final static int _ucCapabilityIsfInk = 8;
  public final static int _ucCapabilityAudio = 16;
  public final static int _ucCapabilityVideo = 32;
  public final static int _ucCapabilityCccp = 64;
  public final static int _ucCapabilityCalendar = 128;
  public final static int _ucCapabilityRemoteCallControl = 256;
  public final static int _ucCapabilityBreakthrough = 512;
  public final static int _ucCapabilityApplicationSharing = 1024;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0010(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0010 valueOf(int value) {
    switch(value) {
    case 1: return ucCapabilityUserActivity;
    case 2: return ucCapabilityText;
    case 4: return ucCapabilityGifInk;
    case 8: return ucCapabilityIsfInk;
    case 16: return ucCapabilityAudio;
    case 32: return ucCapabilityVideo;
    case 64: return ucCapabilityCccp;
    case 128: return ucCapabilityCalendar;
    case 256: return ucCapabilityRemoteCallControl;
    case 512: return ucCapabilityBreakthrough;
    case 1024: return ucCapabilityApplicationSharing;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0010(value);
    }
  }
}
