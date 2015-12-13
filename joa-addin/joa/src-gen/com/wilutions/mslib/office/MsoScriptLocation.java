/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScriptLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoScriptLocation implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoScriptLocation msoScriptLocationInHead = new MsoScriptLocation(1);
  public final static MsoScriptLocation msoScriptLocationInBody = new MsoScriptLocation(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoScriptLocationInHead = 1;
  public final static int _msoScriptLocationInBody = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoScriptLocation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoScriptLocation valueOf(int value) {
    switch(value) {
    case 1: return msoScriptLocationInHead;
    case 2: return msoScriptLocationInBody;
    default: return new MsoScriptLocation(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoScriptLocationInHead";
    case 2: return "msoScriptLocationInBody";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoScriptLocationInHead");
      if ((value & 2) != 0) sbuf.append("|msoScriptLocationInBody");
      return sbuf.toString();
      }
    }
  }
}
