/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoModeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoModeType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoModeType msoModeModal = new MsoModeType(0);
  public final static MsoModeType msoModeAutoDown = new MsoModeType(1);
  public final static MsoModeType msoModeModeless = new MsoModeType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoModeModal = 0;
  public final static int _msoModeAutoDown = 1;
  public final static int _msoModeModeless = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoModeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoModeType valueOf(int value) {
    switch(value) {
    case 0: return msoModeModal;
    case 1: return msoModeAutoDown;
    case 2: return msoModeModeless;
    default: return new MsoModeType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoModeModal";
    case 1: return "msoModeAutoDown";
    case 2: return "msoModeModeless";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoModeModal");
      if ((value & 1) != 0) sbuf.append("|msoModeAutoDown");
      if ((value & 2) != 0) sbuf.append("|msoModeModeless");
      return sbuf.toString();
      }
    }
  }
}
