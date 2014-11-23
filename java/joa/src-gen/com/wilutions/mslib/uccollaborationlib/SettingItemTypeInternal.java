/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SettingItemTypeInternal.
 * Enumerates setting types for internal use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SettingItemTypeInternal {
  ucPC2PCVideoEnabled(0),
  ucAVConferencingEnable(1),
  ucAudioSetting(2),
  ucAllowedAppSharingLevel(3),
  ucEnableAppSharing(4),
  ucPhotoBase64(5),
  ucDefaultLCID(6),
  ucCurrentLocation(7);

  public final int value;
  private SettingItemTypeInternal(int value) { this.value = value; }
  public static  SettingItemTypeInternal valueOf(int value) {
    switch(value) {
    case 0: return ucPC2PCVideoEnabled;
    case 1: return ucAVConferencingEnable;
    case 2: return ucAudioSetting;
    case 3: return ucAllowedAppSharingLevel;
    case 4: return ucEnableAppSharing;
    case 5: return ucPhotoBase64;
    case 6: return ucDefaultLCID;
    case 7: return ucCurrentLocation;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SettingItemTypeInternal.class);
    }
  }
}
