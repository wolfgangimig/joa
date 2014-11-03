/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAlertButtonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAlertButtonType {
  msoAlertButtonOK(0),
  msoAlertButtonOKCancel(1),
  msoAlertButtonAbortRetryIgnore(2),
  msoAlertButtonYesNoCancel(3),
  msoAlertButtonYesNo(4),
  msoAlertButtonRetryCancel(5),
  msoAlertButtonYesAllNoCancel(6);

  public final int value;
  private MsoAlertButtonType(int value) { this.value = value; }
  public static  MsoAlertButtonType valueOf(int value) {
    switch(value) {
    case 0: return msoAlertButtonOK;
    case 1: return msoAlertButtonOKCancel;
    case 2: return msoAlertButtonAbortRetryIgnore;
    case 3: return msoAlertButtonYesNoCancel;
    case 4: return msoAlertButtonYesNo;
    case 5: return msoAlertButtonRetryCancel;
    case 6: return msoAlertButtonYesAllNoCancel;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAlertButtonType.class);
    }
  }
}
