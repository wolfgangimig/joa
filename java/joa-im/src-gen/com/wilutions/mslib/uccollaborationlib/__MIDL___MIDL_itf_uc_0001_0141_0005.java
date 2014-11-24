/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0005.
 * Enumerates setting types for internal use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0141_0005 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucPC2PCVideoEnabled = new __MIDL___MIDL_itf_uc_0001_0141_0005(0);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucAVConferencingEnable = new __MIDL___MIDL_itf_uc_0001_0141_0005(1);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucAudioSetting = new __MIDL___MIDL_itf_uc_0001_0141_0005(2);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucAllowedAppSharingLevel = new __MIDL___MIDL_itf_uc_0001_0141_0005(3);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucEnableAppSharing = new __MIDL___MIDL_itf_uc_0001_0141_0005(4);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucPhotoBase64 = new __MIDL___MIDL_itf_uc_0001_0141_0005(5);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucDefaultLCID = new __MIDL___MIDL_itf_uc_0001_0141_0005(6);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0005 ucCurrentLocation = new __MIDL___MIDL_itf_uc_0001_0141_0005(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucPC2PCVideoEnabled = 0;
  public final static int _ucAVConferencingEnable = 1;
  public final static int _ucAudioSetting = 2;
  public final static int _ucAllowedAppSharingLevel = 3;
  public final static int _ucEnableAppSharing = 4;
  public final static int _ucPhotoBase64 = 5;
  public final static int _ucDefaultLCID = 6;
  public final static int _ucCurrentLocation = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0141_0005(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0141_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucPC2PCVideoEnabled;
    case 1: return ucAVConferencingEnable;
    case 2: return ucAudioSetting;
    case 3: return ucAllowedAppSharingLevel;
    case 4: return ucEnableAppSharing;
    case 5: return ucPhotoBase64;
    case 6: return ucDefaultLCID;
    case 7: return ucCurrentLocation;
    default: return new __MIDL___MIDL_itf_uc_0001_0141_0005(value);
    }
  }
}
