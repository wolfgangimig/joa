/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPickerField.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C4B07795-AE88-400C-AF72-6F7F75A3EC0B}")
public class MsoPickerField {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoPickerField msoPickerFieldUnknown = new MsoPickerField(0);
  public final static MsoPickerField msoPickerFieldDateTime = new MsoPickerField(1);
  public final static MsoPickerField msoPickerFieldNumber = new MsoPickerField(2);
  public final static MsoPickerField msoPickerFieldText = new MsoPickerField(3);
  public final static MsoPickerField msoPickerFieldUser = new MsoPickerField(4);
  public final static MsoPickerField msoPickerFieldMax = new MsoPickerField(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoPickerFieldUnknown = 0;
  public final static int _msoPickerFieldDateTime = 1;
  public final static int _msoPickerFieldNumber = 2;
  public final static int _msoPickerFieldText = 3;
  public final static int _msoPickerFieldUser = 4;
  public final static int _msoPickerFieldMax = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPickerField(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPickerField valueOf(int value) {
    switch(value) {
    case 0: return msoPickerFieldUnknown;
    case 1: return msoPickerFieldDateTime;
    case 2: return msoPickerFieldNumber;
    case 3: return msoPickerFieldText;
    case 4: return msoPickerFieldUser;
    case 5: return msoPickerFieldMax;
    default: return new MsoPickerField(value);
    }
  }
}
