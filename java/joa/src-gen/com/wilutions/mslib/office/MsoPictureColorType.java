/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPictureColorType {

  // Typed constants
  public final static MsoPictureColorType msoPictureMixed = new MsoPictureColorType(-2);
  public final static MsoPictureColorType msoPictureAutomatic = new MsoPictureColorType(1);
  public final static MsoPictureColorType msoPictureGrayscale = new MsoPictureColorType(2);
  public final static MsoPictureColorType msoPictureBlackAndWhite = new MsoPictureColorType(3);
  public final static MsoPictureColorType msoPictureWatermark = new MsoPictureColorType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoPictureMixed = -2;
  public final static int _msoPictureAutomatic = 1;
  public final static int _msoPictureGrayscale = 2;
  public final static int _msoPictureBlackAndWhite = 3;
  public final static int _msoPictureWatermark = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPictureColorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPictureColorType valueOf(int value) {
    switch(value) {
    case -2: return msoPictureMixed;
    case 1: return msoPictureAutomatic;
    case 2: return msoPictureGrayscale;
    case 3: return msoPictureBlackAndWhite;
    case 4: return msoPictureWatermark;
    default: return new MsoPictureColorType(value);
    }
  }
}
