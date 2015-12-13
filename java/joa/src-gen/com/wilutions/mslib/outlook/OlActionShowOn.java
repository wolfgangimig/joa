/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionShowOn.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlActionShowOn implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlActionShowOn olDontShow = new OlActionShowOn(0);
  public final static OlActionShowOn olMenu = new OlActionShowOn(1);
  public final static OlActionShowOn olMenuAndToolbar = new OlActionShowOn(2);

  // Integer constants for bitsets and switch statements
  public final static int _olDontShow = 0;
  public final static int _olMenu = 1;
  public final static int _olMenuAndToolbar = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlActionShowOn(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlActionShowOn valueOf(int value) {
    switch(value) {
    case 0: return olDontShow;
    case 1: return olMenu;
    case 2: return olMenuAndToolbar;
    default: return new OlActionShowOn(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olDontShow";
    case 1: return "olMenu";
    case 2: return "olMenuAndToolbar";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olDontShow");
      if ((value & 1) != 0) sbuf.append("|olMenu");
      if ((value & 2) != 0) sbuf.append("|olMenuAndToolbar");
      return sbuf.toString();
      }
    }
  }
}
