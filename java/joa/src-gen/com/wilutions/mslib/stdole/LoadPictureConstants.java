/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * LoadPictureConstants.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E6C8FA08-BD9F-11D0-985E-00C04FC29993}")
public enum LoadPictureConstants {
  Default(0),
  Monochrome(1),
  VgaColor(2),
  Color(4);

  public final int value;
  private LoadPictureConstants(int value) { this.value = value; }
  public static  LoadPictureConstants valueOf(int value) {
    switch(value) {
    case 0: return Default;
    case 1: return Monochrome;
    case 2: return VgaColor;
    case 4: return Color;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + LoadPictureConstants.class);
    }
  }
}
