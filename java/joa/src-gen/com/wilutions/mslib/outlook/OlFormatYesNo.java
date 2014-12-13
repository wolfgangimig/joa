/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatYesNo.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatYesNo implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatYesNo olFormatYesNoYesNo = new OlFormatYesNo(1);
  public final static OlFormatYesNo olFormatYesNoOnOff = new OlFormatYesNo(2);
  public final static OlFormatYesNo olFormatYesNoTrueFalse = new OlFormatYesNo(3);
  public final static OlFormatYesNo olFormatYesNoIcon = new OlFormatYesNo(4);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatYesNoYesNo = 1;
  public final static int _olFormatYesNoOnOff = 2;
  public final static int _olFormatYesNoTrueFalse = 3;
  public final static int _olFormatYesNoIcon = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatYesNo(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatYesNo valueOf(int value) {
    switch(value) {
    case 1: return olFormatYesNoYesNo;
    case 2: return olFormatYesNoOnOff;
    case 3: return olFormatYesNoTrueFalse;
    case 4: return olFormatYesNoIcon;
    default: return new OlFormatYesNo(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olFormatYesNoYesNo";
    case 2: return "olFormatYesNoOnOff";
    case 3: return "olFormatYesNoTrueFalse";
    case 4: return "olFormatYesNoIcon";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olFormatYesNoYesNo");
      if ((value & 2) != 0) sbuf.append("|olFormatYesNoOnOff");
      if ((value & 3) != 0) sbuf.append("|olFormatYesNoTrueFalse");
      if ((value & 4) != 0) sbuf.append("|olFormatYesNoIcon");
      return sbuf.toString();
      }
    }
  }
}
