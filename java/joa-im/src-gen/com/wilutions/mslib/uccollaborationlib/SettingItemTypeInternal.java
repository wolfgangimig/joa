/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SettingItemTypeInternal.
 * Enumerates setting types for internal use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SettingItemTypeInternal {

  // Typed constants
  public final static SettingItemTypeInternal ucPC2PCVideoEnabled = new SettingItemTypeInternal(0);
  public final static SettingItemTypeInternal ucAVConferencingEnable = new SettingItemTypeInternal(1);
  public final static SettingItemTypeInternal ucAudioSetting = new SettingItemTypeInternal(2);
  public final static SettingItemTypeInternal ucAllowedAppSharingLevel = new SettingItemTypeInternal(3);
  public final static SettingItemTypeInternal ucEnableAppSharing = new SettingItemTypeInternal(4);
  public final static SettingItemTypeInternal ucPhotoBase64 = new SettingItemTypeInternal(5);
  public final static SettingItemTypeInternal ucDefaultLCID = new SettingItemTypeInternal(6);
  public final static SettingItemTypeInternal ucCurrentLocation = new SettingItemTypeInternal(7);

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
  private SettingItemTypeInternal(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new SettingItemTypeInternal(value);
    }
  }
}
