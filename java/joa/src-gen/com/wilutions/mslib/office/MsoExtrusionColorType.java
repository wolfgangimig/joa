/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoExtrusionColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoExtrusionColorType {
  msoExtrusionColorTypeMixed(-2),
  msoExtrusionColorAutomatic(1),
  msoExtrusionColorCustom(2);

  public final int value;
  private MsoExtrusionColorType(int value) { this.value = value; }
  public static  MsoExtrusionColorType valueOf(int value) {
    switch(value) {
    case -2: return msoExtrusionColorTypeMixed;
    case 1: return msoExtrusionColorAutomatic;
    case 2: return msoExtrusionColorCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoExtrusionColorType.class);
    }
  }
}
