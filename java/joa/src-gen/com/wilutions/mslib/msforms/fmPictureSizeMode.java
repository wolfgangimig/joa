/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPictureSizeMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{53327010-E90B-11CE-9E0B-00AA006002F3}")
public class fmPictureSizeMode {

  // Typed constants
  public final static fmPictureSizeMode fmPictureSizeModeClip = new fmPictureSizeMode(0);
  public final static fmPictureSizeMode fmPictureSizeModeStretch = new fmPictureSizeMode(1);
  public final static fmPictureSizeMode fmPictureSizeModeZoom = new fmPictureSizeMode(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmPictureSizeModeClip = 0;
  public final static int _fmPictureSizeModeStretch = 1;
  public final static int _fmPictureSizeModeZoom = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmPictureSizeMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmPictureSizeMode valueOf(int value) {
    switch(value) {
    case 0: return fmPictureSizeModeClip;
    case 1: return fmPictureSizeModeStretch;
    case 3: return fmPictureSizeModeZoom;
    default: return new fmPictureSizeMode(value);
    }
  }
}
