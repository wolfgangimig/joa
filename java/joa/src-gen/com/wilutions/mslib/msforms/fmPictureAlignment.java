/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPictureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3574BBE0-F520-11CE-83F6-00AA00479846}")
public enum fmPictureAlignment {
  fmPictureAlignmentTopLeft(0),
  fmPictureAlignmentTopRight(1),
  fmPictureAlignmentCenter(2),
  fmPictureAlignmentBottomLeft(3),
  fmPictureAlignmentBottomRight(4);

  public final int value;
  private fmPictureAlignment(int value) { this.value = value; }
  public static  fmPictureAlignment valueOf(int value) {
    switch(value) {
    case 0: return fmPictureAlignmentTopLeft;
    case 1: return fmPictureAlignmentTopRight;
    case 2: return fmPictureAlignmentCenter;
    case 3: return fmPictureAlignmentBottomLeft;
    case 4: return fmPictureAlignmentBottomRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmPictureAlignment.class);
    }
  }
}
