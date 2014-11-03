/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPictureSizeMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{53327010-E90B-11CE-9E0B-00AA006002F3}")
public enum fmPictureSizeMode {
  fmPictureSizeModeClip(0),
  fmPictureSizeModeStretch(1),
  fmPictureSizeModeZoom(3);

  public final int value;
  private fmPictureSizeMode(int value) { this.value = value; }
  public static  fmPictureSizeMode valueOf(int value) {
    switch(value) {
    case 0: return fmPictureSizeModeClip;
    case 1: return fmPictureSizeModeStretch;
    case 3: return fmPictureSizeModeZoom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmPictureSizeMode.class);
    }
  }
}
