/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlVerticalLayout.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EA33F29D-6159-4E76-8A14-BCEAA808FA91}")
public class OlVerticalLayout implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlVerticalLayout olVerticalLayoutAlignTop = new OlVerticalLayout(0);
  public final static OlVerticalLayout olVerticalLayoutAlignMiddle = new OlVerticalLayout(1);
  public final static OlVerticalLayout olVerticalLayoutAlignBottom = new OlVerticalLayout(2);
  public final static OlVerticalLayout olVerticalLayoutGrow = new OlVerticalLayout(3);

  // Integer constants for bitsets and switch statements
  public final static int _olVerticalLayoutAlignTop = 0;
  public final static int _olVerticalLayoutAlignMiddle = 1;
  public final static int _olVerticalLayoutAlignBottom = 2;
  public final static int _olVerticalLayoutGrow = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlVerticalLayout(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlVerticalLayout valueOf(int value) {
    switch(value) {
    case 0: return olVerticalLayoutAlignTop;
    case 1: return olVerticalLayoutAlignMiddle;
    case 2: return olVerticalLayoutAlignBottom;
    case 3: return olVerticalLayoutGrow;
    default: return new OlVerticalLayout(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olVerticalLayoutAlignTop";
    case 1: return "olVerticalLayoutAlignMiddle";
    case 2: return "olVerticalLayoutAlignBottom";
    case 3: return "olVerticalLayoutGrow";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olVerticalLayoutAlignTop");
      if ((value & 1) != 0) sbuf.append("|olVerticalLayoutAlignMiddle");
      if ((value & 2) != 0) sbuf.append("|olVerticalLayoutAlignBottom");
      if ((value & 3) != 0) sbuf.append("|olVerticalLayoutGrow");
      return sbuf.toString();
      }
    }
  }
}
