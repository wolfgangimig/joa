/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBalloonType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBalloonType msoBalloonTypeButtons = new MsoBalloonType(0);
  public final static MsoBalloonType msoBalloonTypeBullets = new MsoBalloonType(1);
  public final static MsoBalloonType msoBalloonTypeNumbers = new MsoBalloonType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoBalloonTypeButtons = 0;
  public final static int _msoBalloonTypeBullets = 1;
  public final static int _msoBalloonTypeNumbers = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBalloonType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBalloonType valueOf(int value) {
    switch(value) {
    case 0: return msoBalloonTypeButtons;
    case 1: return msoBalloonTypeBullets;
    case 2: return msoBalloonTypeNumbers;
    default: return new MsoBalloonType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoBalloonTypeButtons";
    case 1: return "msoBalloonTypeBullets";
    case 2: return "msoBalloonTypeNumbers";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoBalloonTypeButtons");
      if ((value & 1) != 0) sbuf.append("|msoBalloonTypeBullets");
      if ((value & 2) != 0) sbuf.append("|msoBalloonTypeNumbers");
      return sbuf.toString();
      }
    }
  }
}
