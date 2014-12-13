/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoEditingType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoEditingType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoEditingType msoEditingAuto = new MsoEditingType(0);
  public final static MsoEditingType msoEditingCorner = new MsoEditingType(1);
  public final static MsoEditingType msoEditingSmooth = new MsoEditingType(2);
  public final static MsoEditingType msoEditingSymmetric = new MsoEditingType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoEditingAuto = 0;
  public final static int _msoEditingCorner = 1;
  public final static int _msoEditingSmooth = 2;
  public final static int _msoEditingSymmetric = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoEditingType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoEditingType valueOf(int value) {
    switch(value) {
    case 0: return msoEditingAuto;
    case 1: return msoEditingCorner;
    case 2: return msoEditingSmooth;
    case 3: return msoEditingSymmetric;
    default: return new MsoEditingType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoEditingAuto";
    case 1: return "msoEditingCorner";
    case 2: return "msoEditingSmooth";
    case 3: return "msoEditingSymmetric";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoEditingAuto");
      if ((value & 1) != 0) sbuf.append("|msoEditingCorner");
      if ((value & 2) != 0) sbuf.append("|msoEditingSmooth");
      if ((value & 3) != 0) sbuf.append("|msoEditingSymmetric");
      return sbuf.toString();
      }
    }
  }
}
