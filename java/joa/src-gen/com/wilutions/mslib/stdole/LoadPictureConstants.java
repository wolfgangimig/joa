/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * LoadPictureConstants.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E6C8FA08-BD9F-11D0-985E-00C04FC29993}")
public class LoadPictureConstants {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static LoadPictureConstants Default = new LoadPictureConstants(0);
  public final static LoadPictureConstants Monochrome = new LoadPictureConstants(1);
  public final static LoadPictureConstants VgaColor = new LoadPictureConstants(2);
  public final static LoadPictureConstants Color = new LoadPictureConstants(4);

  // Integer constants for bitsets and switch statements
  public final static int _Default = 0;
  public final static int _Monochrome = 1;
  public final static int _VgaColor = 2;
  public final static int _Color = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private LoadPictureConstants(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  LoadPictureConstants valueOf(int value) {
    switch(value) {
    case 0: return Default;
    case 1: return Monochrome;
    case 2: return VgaColor;
    case 4: return Color;
    default: return new LoadPictureConstants(value);
    }
  }
}
