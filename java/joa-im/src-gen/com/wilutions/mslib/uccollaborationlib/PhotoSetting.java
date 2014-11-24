/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PhotoSetting.
 * Enumerates the types for Display AD Photo. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PhotoSetting {

  // Typed constants
  public final static PhotoSetting ucADPhotoDisplay = new PhotoSetting(0);
  public final static PhotoSetting ucADPhotoDoNotDisplay = new PhotoSetting(1);
  public final static PhotoSetting ucADPhotoDefault = new PhotoSetting(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucADPhotoDisplay = 0;
  public final static int _ucADPhotoDoNotDisplay = 1;
  public final static int _ucADPhotoDefault = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PhotoSetting(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PhotoSetting valueOf(int value) {
    switch(value) {
    case 0: return ucADPhotoDisplay;
    case 1: return ucADPhotoDoNotDisplay;
    case 2: return ucADPhotoDefault;
    default: return new PhotoSetting(value);
    }
  }
}
