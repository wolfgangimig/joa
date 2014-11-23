/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PhotoSetting.
 * Enumerates the types for Display AD Photo. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PhotoSetting {
  ucADPhotoDisplay(0),
  ucADPhotoDoNotDisplay(1),
  ucADPhotoDefault(2);

  public final int value;
  private PhotoSetting(int value) { this.value = value; }
  public static  PhotoSetting valueOf(int value) {
    switch(value) {
    case 0: return ucADPhotoDisplay;
    case 1: return ucADPhotoDoNotDisplay;
    case 2: return ucADPhotoDefault;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PhotoSetting.class);
    }
  }
}
