/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoIconType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoIconType {

  // Typed constants
  public final static MsoIconType msoIconNone = new MsoIconType(0);
  public final static MsoIconType msoIconAlert = new MsoIconType(2);
  public final static MsoIconType msoIconTip = new MsoIconType(3);
  public final static MsoIconType msoIconAlertInfo = new MsoIconType(4);
  public final static MsoIconType msoIconAlertWarning = new MsoIconType(5);
  public final static MsoIconType msoIconAlertQuery = new MsoIconType(6);
  public final static MsoIconType msoIconAlertCritical = new MsoIconType(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoIconNone = 0;
  public final static int _msoIconAlert = 2;
  public final static int _msoIconTip = 3;
  public final static int _msoIconAlertInfo = 4;
  public final static int _msoIconAlertWarning = 5;
  public final static int _msoIconAlertQuery = 6;
  public final static int _msoIconAlertCritical = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoIconType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoIconType valueOf(int value) {
    switch(value) {
    case 0: return msoIconNone;
    case 2: return msoIconAlert;
    case 3: return msoIconTip;
    case 4: return msoIconAlertInfo;
    case 5: return msoIconAlertWarning;
    case 6: return msoIconAlertQuery;
    case 7: return msoIconAlertCritical;
    default: return new MsoIconType(value);
    }
  }
}
