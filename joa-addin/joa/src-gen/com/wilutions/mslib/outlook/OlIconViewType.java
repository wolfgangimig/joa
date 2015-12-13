/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlIconViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlIconViewType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlIconViewType olIconViewLarge = new OlIconViewType(0);
  public final static OlIconViewType olIconViewSmall = new OlIconViewType(1);
  public final static OlIconViewType olIconViewList = new OlIconViewType(2);

  // Integer constants for bitsets and switch statements
  public final static int _olIconViewLarge = 0;
  public final static int _olIconViewSmall = 1;
  public final static int _olIconViewList = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlIconViewType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlIconViewType valueOf(int value) {
    switch(value) {
    case 0: return olIconViewLarge;
    case 1: return olIconViewSmall;
    case 2: return olIconViewList;
    default: return new OlIconViewType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olIconViewLarge";
    case 1: return "olIconViewSmall";
    case 2: return "olIconViewList";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olIconViewLarge");
      if ((value & 1) != 0) sbuf.append("|olIconViewSmall");
      if ((value & 2) != 0) sbuf.append("|olIconViewList");
      return sbuf.toString();
      }
    }
  }
}
