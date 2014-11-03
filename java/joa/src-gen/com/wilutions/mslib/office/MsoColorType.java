/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoColorType {
  msoColorTypeMixed(-2),
  msoColorTypeRGB(1),
  msoColorTypeScheme(2),
  msoColorTypeCMYK(3),
  msoColorTypeCMS(4),
  msoColorTypeInk(5);

  public final int value;
  private MsoColorType(int value) { this.value = value; }
  public static  MsoColorType valueOf(int value) {
    switch(value) {
    case -2: return msoColorTypeMixed;
    case 1: return msoColorTypeRGB;
    case 2: return msoColorTypeScheme;
    case 3: return msoColorTypeCMYK;
    case 4: return msoColorTypeCMS;
    case 5: return msoColorTypeInk;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoColorType.class);
    }
  }
}
