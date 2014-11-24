/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatYesNo.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatYesNo {

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
}
