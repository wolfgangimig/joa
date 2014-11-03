/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatYesNo.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatYesNo {
  olFormatYesNoYesNo(1),
  olFormatYesNoOnOff(2),
  olFormatYesNoTrueFalse(3),
  olFormatYesNoIcon(4);

  public final int value;
  private OlFormatYesNo(int value) { this.value = value; }
  public static  OlFormatYesNo valueOf(int value) {
    switch(value) {
    case 1: return olFormatYesNoYesNo;
    case 2: return olFormatYesNoOnOff;
    case 3: return olFormatYesNoTrueFalse;
    case 4: return olFormatYesNoIcon;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatYesNo.class);
    }
  }
}
