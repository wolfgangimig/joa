/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskResponse.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTaskResponse implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTaskResponse olTaskSimple = new OlTaskResponse(0);
  public final static OlTaskResponse olTaskAssign = new OlTaskResponse(1);
  public final static OlTaskResponse olTaskAccept = new OlTaskResponse(2);
  public final static OlTaskResponse olTaskDecline = new OlTaskResponse(3);

  // Integer constants for bitsets and switch statements
  public final static int _olTaskSimple = 0;
  public final static int _olTaskAssign = 1;
  public final static int _olTaskAccept = 2;
  public final static int _olTaskDecline = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTaskResponse(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTaskResponse valueOf(int value) {
    switch(value) {
    case 0: return olTaskSimple;
    case 1: return olTaskAssign;
    case 2: return olTaskAccept;
    case 3: return olTaskDecline;
    default: return new OlTaskResponse(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olTaskSimple";
    case 1: return "olTaskAssign";
    case 2: return "olTaskAccept";
    case 3: return "olTaskDecline";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olTaskSimple");
      if ((value & 1) != 0) sbuf.append("|olTaskAssign");
      if ((value & 2) != 0) sbuf.append("|olTaskAccept");
      if ((value & 3) != 0) sbuf.append("|olTaskDecline");
      return sbuf.toString();
      }
    }
  }
}
