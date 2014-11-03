/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoIconType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoIconType {
  msoIconNone(0),
  msoIconAlert(2),
  msoIconTip(3),
  msoIconAlertInfo(4),
  msoIconAlertWarning(5),
  msoIconAlertQuery(6),
  msoIconAlertCritical(7);

  public final int value;
  private MsoIconType(int value) { this.value = value; }
  public static  MsoIconType valueOf(int value) {
    switch(value) {
    case 0: return msoIconNone;
    case 2: return msoIconAlert;
    case 3: return msoIconTip;
    case 4: return msoIconAlertInfo;
    case 5: return msoIconAlertWarning;
    case 6: return msoIconAlertQuery;
    case 7: return msoIconAlertCritical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoIconType.class);
    }
  }
}
