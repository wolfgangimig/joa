/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertIconType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAlertIconType {

  // Typed constants
  public final static MsoAlertIconType msoAlertIconNoIcon = new MsoAlertIconType(0);
  public final static MsoAlertIconType msoAlertIconCritical = new MsoAlertIconType(1);
  public final static MsoAlertIconType msoAlertIconQuery = new MsoAlertIconType(2);
  public final static MsoAlertIconType msoAlertIconWarning = new MsoAlertIconType(3);
  public final static MsoAlertIconType msoAlertIconInfo = new MsoAlertIconType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoAlertIconNoIcon = 0;
  public final static int _msoAlertIconCritical = 1;
  public final static int _msoAlertIconQuery = 2;
  public final static int _msoAlertIconWarning = 3;
  public final static int _msoAlertIconInfo = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAlertIconType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAlertIconType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertIconNoIcon;
    case 1: return msoAlertIconCritical;
    case 2: return msoAlertIconQuery;
    case 3: return msoAlertIconWarning;
    case 4: return msoAlertIconInfo;
    default: return new MsoAlertIconType(value);
    }
  }
}
