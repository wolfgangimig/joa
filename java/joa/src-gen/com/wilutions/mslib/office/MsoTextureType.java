/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextureType {
  msoTextureTypeMixed(-2),
  msoTexturePreset(1),
  msoTextureUserDefined(2);

  public final int value;
  private MsoTextureType(int value) { this.value = value; }
  public static  MsoTextureType valueOf(int value) {
    switch(value) {
    case -2: return msoTextureTypeMixed;
    case 1: return msoTexturePreset;
    case 2: return msoTextureUserDefined;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextureType.class);
    }
  }
}
