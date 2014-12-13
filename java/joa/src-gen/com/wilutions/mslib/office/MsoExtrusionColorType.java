/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoExtrusionColorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoExtrusionColorType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoExtrusionColorType msoExtrusionColorTypeMixed = new MsoExtrusionColorType(-2);
  public final static MsoExtrusionColorType msoExtrusionColorAutomatic = new MsoExtrusionColorType(1);
  public final static MsoExtrusionColorType msoExtrusionColorCustom = new MsoExtrusionColorType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoExtrusionColorTypeMixed = -2;
  public final static int _msoExtrusionColorAutomatic = 1;
  public final static int _msoExtrusionColorCustom = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoExtrusionColorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoExtrusionColorType valueOf(int value) {
    switch(value) {
    case -2: return msoExtrusionColorTypeMixed;
    case 1: return msoExtrusionColorAutomatic;
    case 2: return msoExtrusionColorCustom;
    default: return new MsoExtrusionColorType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoExtrusionColorCustom";
    case -2: return "msoExtrusionColorTypeMixed";
    case 1: return "msoExtrusionColorAutomatic";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoExtrusionColorCustom");
      if ((value & -2) != 0) sbuf.append("|msoExtrusionColorTypeMixed");
      if ((value & 1) != 0) sbuf.append("|msoExtrusionColorAutomatic");
      return sbuf.toString();
      }
    }
  }
}
