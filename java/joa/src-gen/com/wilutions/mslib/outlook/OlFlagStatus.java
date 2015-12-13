/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFlagStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFlagStatus implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFlagStatus olNoFlag = new OlFlagStatus(0);
  public final static OlFlagStatus olFlagComplete = new OlFlagStatus(1);
  public final static OlFlagStatus olFlagMarked = new OlFlagStatus(2);

  // Integer constants for bitsets and switch statements
  public final static int _olNoFlag = 0;
  public final static int _olFlagComplete = 1;
  public final static int _olFlagMarked = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFlagStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFlagStatus valueOf(int value) {
    switch(value) {
    case 0: return olNoFlag;
    case 1: return olFlagComplete;
    case 2: return olFlagMarked;
    default: return new OlFlagStatus(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olNoFlag";
    case 1: return "olFlagComplete";
    case 2: return "olFlagMarked";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olNoFlag");
      if ((value & 1) != 0) sbuf.append("|olFlagComplete");
      if ((value & 2) != 0) sbuf.append("|olFlagMarked");
      return sbuf.toString();
      }
    }
  }
}
