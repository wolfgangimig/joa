/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertIconType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAlertIconType {
  msoAlertIconNoIcon(0),
  msoAlertIconCritical(1),
  msoAlertIconQuery(2),
  msoAlertIconWarning(3),
  msoAlertIconInfo(4);

  public final int value;
  private MsoAlertIconType(int value) { this.value = value; }
  public static  MsoAlertIconType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertIconNoIcon;
    case 1: return msoAlertIconCritical;
    case 2: return msoAlertIconQuery;
    case 3: return msoAlertIconWarning;
    case 4: return msoAlertIconInfo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAlertIconType.class);
    }
  }
}
