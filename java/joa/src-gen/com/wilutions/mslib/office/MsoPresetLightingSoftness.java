/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetLightingSoftness.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetLightingSoftness {

  // Typed constants
  public final static MsoPresetLightingSoftness msoPresetLightingSoftnessMixed = new MsoPresetLightingSoftness(-2);
  public final static MsoPresetLightingSoftness msoLightingDim = new MsoPresetLightingSoftness(1);
  public final static MsoPresetLightingSoftness msoLightingNormal = new MsoPresetLightingSoftness(2);
  public final static MsoPresetLightingSoftness msoLightingBright = new MsoPresetLightingSoftness(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetLightingSoftnessMixed = -2;
  public final static int _msoLightingDim = 1;
  public final static int _msoLightingNormal = 2;
  public final static int _msoLightingBright = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetLightingSoftness(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetLightingSoftness valueOf(int value) {
    switch(value) {
    case -2: return msoPresetLightingSoftnessMixed;
    case 1: return msoLightingDim;
    case 2: return msoLightingNormal;
    case 3: return msoLightingBright;
    default: return new MsoPresetLightingSoftness(value);
    }
  }
}
