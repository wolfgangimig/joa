/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonSetType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoButtonSetType {
  msoButtonSetNone(0),
  msoButtonSetOK(1),
  msoButtonSetCancel(2),
  msoButtonSetOkCancel(3),
  msoButtonSetYesNo(4),
  msoButtonSetYesNoCancel(5),
  msoButtonSetBackClose(6),
  msoButtonSetNextClose(7),
  msoButtonSetBackNextClose(8),
  msoButtonSetRetryCancel(9),
  msoButtonSetAbortRetryIgnore(10),
  msoButtonSetSearchClose(11),
  msoButtonSetBackNextSnooze(12),
  msoButtonSetTipsOptionsClose(13),
  msoButtonSetYesAllNoCancel(14);

  public final int value;
  private MsoButtonSetType(int value) { this.value = value; }
  public static  MsoButtonSetType valueOf(int value) {
    switch(value) {
    case 0: return msoButtonSetNone;
    case 1: return msoButtonSetOK;
    case 2: return msoButtonSetCancel;
    case 3: return msoButtonSetOkCancel;
    case 4: return msoButtonSetYesNo;
    case 5: return msoButtonSetYesNoCancel;
    case 6: return msoButtonSetBackClose;
    case 7: return msoButtonSetNextClose;
    case 8: return msoButtonSetBackNextClose;
    case 9: return msoButtonSetRetryCancel;
    case 10: return msoButtonSetAbortRetryIgnore;
    case 11: return msoButtonSetSearchClose;
    case 12: return msoButtonSetBackNextSnooze;
    case 13: return msoButtonSetTipsOptionsClose;
    case 14: return msoButtonSetYesAllNoCancel;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoButtonSetType.class);
    }
  }
}
