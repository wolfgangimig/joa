/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlogImageType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBlogImageType {
  msoblogImageTypeJPEG(1),
  msoblogImageTypeGIF(2),
  msoblogImageTypePNG(3);

  public final int value;
  private MsoBlogImageType(int value) { this.value = value; }
  public static  MsoBlogImageType valueOf(int value) {
    switch(value) {
    case 1: return msoblogImageTypeJPEG;
    case 2: return msoblogImageTypeGIF;
    case 3: return msoblogImageTypePNG;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBlogImageType.class);
    }
  }
}
