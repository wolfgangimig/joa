/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoGradientColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoGradientColorType {
  msoGradientColorMixed(-2),
  msoGradientOneColor(1),
  msoGradientTwoColors(2),
  msoGradientPresetColors(3),
  msoGradientMultiColor(4);

  public final int value;
  private MsoGradientColorType(int value) { this.value = value; }
  public static  MsoGradientColorType valueOf(int value) {
    switch(value) {
    case -2: return msoGradientColorMixed;
    case 1: return msoGradientOneColor;
    case 2: return msoGradientTwoColors;
    case 3: return msoGradientPresetColors;
    case 4: return msoGradientMultiColor;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoGradientColorType.class);
    }
  }
}
