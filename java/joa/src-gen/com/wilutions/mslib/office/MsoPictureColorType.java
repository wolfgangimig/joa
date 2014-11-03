/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPictureColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPictureColorType {
  msoPictureMixed(-2),
  msoPictureAutomatic(1),
  msoPictureGrayscale(2),
  msoPictureBlackAndWhite(3),
  msoPictureWatermark(4);

  public final int value;
  private MsoPictureColorType(int value) { this.value = value; }
  public static  MsoPictureColorType valueOf(int value) {
    switch(value) {
    case -2: return msoPictureMixed;
    case 1: return msoPictureAutomatic;
    case 2: return msoPictureGrayscale;
    case 3: return msoPictureBlackAndWhite;
    case 4: return msoPictureWatermark;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPictureColorType.class);
    }
  }
}
