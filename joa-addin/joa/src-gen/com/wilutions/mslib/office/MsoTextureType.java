/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextureType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextureType msoTextureTypeMixed = new MsoTextureType(-2);
  public final static MsoTextureType msoTexturePreset = new MsoTextureType(1);
  public final static MsoTextureType msoTextureUserDefined = new MsoTextureType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoTextureTypeMixed = -2;
  public final static int _msoTexturePreset = 1;
  public final static int _msoTextureUserDefined = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextureType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextureType valueOf(int value) {
    switch(value) {
    case -2: return msoTextureTypeMixed;
    case 1: return msoTexturePreset;
    case 2: return msoTextureUserDefined;
    default: return new MsoTextureType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoTextureTypeMixed";
    case 1: return "msoTexturePreset";
    case 2: return "msoTextureUserDefined";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoTextureTypeMixed");
      if ((value & 1) != 0) sbuf.append("|msoTexturePreset");
      if ((value & 2) != 0) sbuf.append("|msoTextureUserDefined");
      return sbuf.toString();
      }
    }
  }
}
