/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatDateTime.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatDateTime {
  olFormatDateTimeLongDayDateTime(1),
  olFormatDateTimeShortDateTime(2),
  olFormatDateTimeShortDayDateTime(3),
  olFormatDateTimeShortDayMonthDateTime(4),
  OlFormatDateTimeLongDayDate(5),
  olFormatDateTimeLongDate(6),
  olFormatDateTimeLongDateReversed(7),
  olFormatDateTimeShortDate(8),
  olFormatDateTimeShortDateNumOnly(9),
  olFormatDateTimeShortDayMonth(10),
  olFormatDateTimeShortMonthYear(11),
  olFormatDateTimeShortMonthYearNumOnly(12),
  olFormatDateTimeShortDayDate(13),
  olFormatDateTimeLongTime(15),
  olFormatDateTimeShortTime(16),
  olFormatDateTimeBestFit(17);

  public final int value;
  private OlFormatDateTime(int value) { this.value = value; }
  public static  OlFormatDateTime valueOf(int value) {
    switch(value) {
    case 1: return olFormatDateTimeLongDayDateTime;
    case 2: return olFormatDateTimeShortDateTime;
    case 3: return olFormatDateTimeShortDayDateTime;
    case 4: return olFormatDateTimeShortDayMonthDateTime;
    case 5: return OlFormatDateTimeLongDayDate;
    case 6: return olFormatDateTimeLongDate;
    case 7: return olFormatDateTimeLongDateReversed;
    case 8: return olFormatDateTimeShortDate;
    case 9: return olFormatDateTimeShortDateNumOnly;
    case 10: return olFormatDateTimeShortDayMonth;
    case 11: return olFormatDateTimeShortMonthYear;
    case 12: return olFormatDateTimeShortMonthYearNumOnly;
    case 13: return olFormatDateTimeShortDayDate;
    case 15: return olFormatDateTimeLongTime;
    case 16: return olFormatDateTimeShortTime;
    case 17: return olFormatDateTimeBestFit;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatDateTime.class);
    }
  }
}
