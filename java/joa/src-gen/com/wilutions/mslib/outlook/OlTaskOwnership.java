/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskOwnership.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTaskOwnership implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTaskOwnership olNewTask = new OlTaskOwnership(0);
  public final static OlTaskOwnership olDelegatedTask = new OlTaskOwnership(1);
  public final static OlTaskOwnership olOwnTask = new OlTaskOwnership(2);

  // Integer constants for bitsets and switch statements
  public final static int _olNewTask = 0;
  public final static int _olDelegatedTask = 1;
  public final static int _olOwnTask = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTaskOwnership(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTaskOwnership valueOf(int value) {
    switch(value) {
    case 0: return olNewTask;
    case 1: return olDelegatedTask;
    case 2: return olOwnTask;
    default: return new OlTaskOwnership(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olNewTask";
    case 1: return "olDelegatedTask";
    case 2: return "olOwnTask";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olNewTask");
      if ((value & 1) != 0) sbuf.append("|olDelegatedTask");
      if ((value & 2) != 0) sbuf.append("|olOwnTask");
      return sbuf.toString();
      }
    }
  }
}
