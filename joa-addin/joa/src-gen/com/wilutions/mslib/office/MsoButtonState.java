/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoButtonState implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoButtonState msoButtonUp = new MsoButtonState(0);
  public final static MsoButtonState msoButtonDown = new MsoButtonState(-1);
  public final static MsoButtonState msoButtonMixed = new MsoButtonState(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoButtonUp = 0;
  public final static int _msoButtonDown = -1;
  public final static int _msoButtonMixed = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoButtonState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoButtonState valueOf(int value) {
    switch(value) {
    case 0: return msoButtonUp;
    case -1: return msoButtonDown;
    case 2: return msoButtonMixed;
    default: return new MsoButtonState(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoButtonUp";
    case -1: return "msoButtonDown";
    case 2: return "msoButtonMixed";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoButtonUp");
      if ((value & -1) != 0) sbuf.append("|msoButtonDown");
      if ((value & 2) != 0) sbuf.append("|msoButtonMixed");
      return sbuf.toString();
      }
    }
  }
}
