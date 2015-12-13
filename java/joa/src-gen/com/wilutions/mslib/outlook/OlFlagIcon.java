/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFlagIcon.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFlagIcon implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFlagIcon olNoFlagIcon = new OlFlagIcon(0);
  public final static OlFlagIcon olPurpleFlagIcon = new OlFlagIcon(1);
  public final static OlFlagIcon olOrangeFlagIcon = new OlFlagIcon(2);
  public final static OlFlagIcon olGreenFlagIcon = new OlFlagIcon(3);
  public final static OlFlagIcon olYellowFlagIcon = new OlFlagIcon(4);
  public final static OlFlagIcon olBlueFlagIcon = new OlFlagIcon(5);
  public final static OlFlagIcon olRedFlagIcon = new OlFlagIcon(6);

  // Integer constants for bitsets and switch statements
  public final static int _olNoFlagIcon = 0;
  public final static int _olPurpleFlagIcon = 1;
  public final static int _olOrangeFlagIcon = 2;
  public final static int _olGreenFlagIcon = 3;
  public final static int _olYellowFlagIcon = 4;
  public final static int _olBlueFlagIcon = 5;
  public final static int _olRedFlagIcon = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFlagIcon(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFlagIcon valueOf(int value) {
    switch(value) {
    case 0: return olNoFlagIcon;
    case 1: return olPurpleFlagIcon;
    case 2: return olOrangeFlagIcon;
    case 3: return olGreenFlagIcon;
    case 4: return olYellowFlagIcon;
    case 5: return olBlueFlagIcon;
    case 6: return olRedFlagIcon;
    default: return new OlFlagIcon(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olNoFlagIcon";
    case 1: return "olPurpleFlagIcon";
    case 2: return "olOrangeFlagIcon";
    case 3: return "olGreenFlagIcon";
    case 4: return "olYellowFlagIcon";
    case 5: return "olBlueFlagIcon";
    case 6: return "olRedFlagIcon";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olNoFlagIcon");
      if ((value & 1) != 0) sbuf.append("|olPurpleFlagIcon");
      if ((value & 2) != 0) sbuf.append("|olOrangeFlagIcon");
      if ((value & 3) != 0) sbuf.append("|olGreenFlagIcon");
      if ((value & 4) != 0) sbuf.append("|olYellowFlagIcon");
      if ((value & 5) != 0) sbuf.append("|olBlueFlagIcon");
      if ((value & 6) != 0) sbuf.append("|olRedFlagIcon");
      return sbuf.toString();
      }
    }
  }
}
