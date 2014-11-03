/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetLightingSoftness.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetLightingSoftness {
  msoPresetLightingSoftnessMixed(-2),
  msoLightingDim(1),
  msoLightingNormal(2),
  msoLightingBright(3);

  public final int value;
  private MsoPresetLightingSoftness(int value) { this.value = value; }
  public static  MsoPresetLightingSoftness valueOf(int value) {
    switch(value) {
    case -2: return msoPresetLightingSoftnessMixed;
    case 1: return msoLightingDim;
    case 2: return msoLightingNormal;
    case 3: return msoLightingBright;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetLightingSoftness.class);
    }
  }
}
