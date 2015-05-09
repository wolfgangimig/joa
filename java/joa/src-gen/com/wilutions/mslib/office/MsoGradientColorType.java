/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoGradientColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoGradientColorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoGradientColorType msoGradientColorMixed = new MsoGradientColorType(-2);
  public final static MsoGradientColorType msoGradientOneColor = new MsoGradientColorType(1);
  public final static MsoGradientColorType msoGradientTwoColors = new MsoGradientColorType(2);
  public final static MsoGradientColorType msoGradientPresetColors = new MsoGradientColorType(3);
  public final static MsoGradientColorType msoGradientMultiColor = new MsoGradientColorType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoGradientColorMixed = -2;
  public final static int _msoGradientOneColor = 1;
  public final static int _msoGradientTwoColors = 2;
  public final static int _msoGradientPresetColors = 3;
  public final static int _msoGradientMultiColor = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoGradientColorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoGradientColorType valueOf(int value) {
    switch(value) {
    case -2: return msoGradientColorMixed;
    case 1: return msoGradientOneColor;
    case 2: return msoGradientTwoColors;
    case 3: return msoGradientPresetColors;
    case 4: return msoGradientMultiColor;
    default: return new MsoGradientColorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoGradientColorMixed";
    case 1: return "msoGradientOneColor";
    case 2: return "msoGradientTwoColors";
    case 3: return "msoGradientPresetColors";
    case 4: return "msoGradientMultiColor";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoGradientColorMixed");
      if ((value & 1) != 0) sbuf.append("|msoGradientOneColor");
      if ((value & 2) != 0) sbuf.append("|msoGradientTwoColors");
      if ((value & 3) != 0) sbuf.append("|msoGradientPresetColors");
      if ((value & 4) != 0) sbuf.append("|msoGradientMultiColor");
      return sbuf.toString();
      }
    }
  }
}
