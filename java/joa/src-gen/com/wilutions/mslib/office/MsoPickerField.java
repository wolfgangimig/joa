/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPickerField.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C4B07795-AE88-400C-AF72-6F7F75A3EC0B}")
public enum MsoPickerField {
  msoPickerFieldUnknown(0),
  msoPickerFieldDateTime(1),
  msoPickerFieldNumber(2),
  msoPickerFieldText(3),
  msoPickerFieldUser(4),
  msoPickerFieldMax(5);

  public final int value;
  private MsoPickerField(int value) { this.value = value; }
  public static  MsoPickerField valueOf(int value) {
    switch(value) {
    case 0: return msoPickerFieldUnknown;
    case 1: return msoPickerFieldDateTime;
    case 2: return msoPickerFieldNumber;
    case 3: return msoPickerFieldText;
    case 4: return msoPickerFieldUser;
    case 5: return msoPickerFieldMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPickerField.class);
    }
  }
}
