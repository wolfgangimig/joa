/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLastModified.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLastModified {
  msoLastModifiedYesterday(1),
  msoLastModifiedToday(2),
  msoLastModifiedLastWeek(3),
  msoLastModifiedThisWeek(4),
  msoLastModifiedLastMonth(5),
  msoLastModifiedThisMonth(6),
  msoLastModifiedAnyTime(7);

  public final int value;
  private MsoLastModified(int value) { this.value = value; }
  public static  MsoLastModified valueOf(int value) {
    switch(value) {
    case 1: return msoLastModifiedYesterday;
    case 2: return msoLastModifiedToday;
    case 3: return msoLastModifiedLastWeek;
    case 4: return msoLastModifiedThisWeek;
    case 5: return msoLastModifiedLastMonth;
    case 6: return msoLastModifiedThisMonth;
    case 7: return msoLastModifiedAnyTime;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLastModified.class);
    }
  }
}
