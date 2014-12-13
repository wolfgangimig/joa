/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionResponseStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlActionResponseStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlActionResponseStyle olOpen = new OlActionResponseStyle(0);
  public final static OlActionResponseStyle olSend = new OlActionResponseStyle(1);
  public final static OlActionResponseStyle olPrompt = new OlActionResponseStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _olOpen = 0;
  public final static int _olSend = 1;
  public final static int _olPrompt = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlActionResponseStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlActionResponseStyle valueOf(int value) {
    switch(value) {
    case 0: return olOpen;
    case 1: return olSend;
    case 2: return olPrompt;
    default: return new OlActionResponseStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olOpen";
    case 1: return "olSend";
    case 2: return "olPrompt";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olOpen");
      if ((value & 1) != 0) sbuf.append("|olSend");
      if ((value & 2) != 0) sbuf.append("|olPrompt");
      return sbuf.toString();
      }
    }
  }
}
