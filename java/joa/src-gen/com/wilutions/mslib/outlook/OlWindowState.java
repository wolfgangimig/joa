/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlWindowState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlWindowState implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlWindowState olMaximized = new OlWindowState(0);
  public final static OlWindowState olMinimized = new OlWindowState(1);
  public final static OlWindowState olNormalWindow = new OlWindowState(2);

  // Integer constants for bitsets and switch statements
  public final static int _olMaximized = 0;
  public final static int _olMinimized = 1;
  public final static int _olNormalWindow = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlWindowState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlWindowState valueOf(int value) {
    switch(value) {
    case 0: return olMaximized;
    case 1: return olMinimized;
    case 2: return olNormalWindow;
    default: return new OlWindowState(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olMaximized";
    case 1: return "olMinimized";
    case 2: return "olNormalWindow";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olMaximized");
      if ((value & 1) != 0) sbuf.append("|olMinimized");
      if ((value & 2) != 0) sbuf.append("|olNormalWindow");
      return sbuf.toString();
      }
    }
  }
}
