/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatDateTime.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatDateTime implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatDateTime olFormatDateTimeLongDayDateTime = new OlFormatDateTime(1);
  public final static OlFormatDateTime olFormatDateTimeShortDateTime = new OlFormatDateTime(2);
  public final static OlFormatDateTime olFormatDateTimeShortDayDateTime = new OlFormatDateTime(3);
  public final static OlFormatDateTime olFormatDateTimeShortDayMonthDateTime = new OlFormatDateTime(4);
  public final static OlFormatDateTime OlFormatDateTimeLongDayDate = new OlFormatDateTime(5);
  public final static OlFormatDateTime olFormatDateTimeLongDate = new OlFormatDateTime(6);
  public final static OlFormatDateTime olFormatDateTimeLongDateReversed = new OlFormatDateTime(7);
  public final static OlFormatDateTime olFormatDateTimeShortDate = new OlFormatDateTime(8);
  public final static OlFormatDateTime olFormatDateTimeShortDateNumOnly = new OlFormatDateTime(9);
  public final static OlFormatDateTime olFormatDateTimeShortDayMonth = new OlFormatDateTime(10);
  public final static OlFormatDateTime olFormatDateTimeShortMonthYear = new OlFormatDateTime(11);
  public final static OlFormatDateTime olFormatDateTimeShortMonthYearNumOnly = new OlFormatDateTime(12);
  public final static OlFormatDateTime olFormatDateTimeShortDayDate = new OlFormatDateTime(13);
  public final static OlFormatDateTime olFormatDateTimeLongTime = new OlFormatDateTime(15);
  public final static OlFormatDateTime olFormatDateTimeShortTime = new OlFormatDateTime(16);
  public final static OlFormatDateTime olFormatDateTimeBestFit = new OlFormatDateTime(17);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatDateTimeLongDayDateTime = 1;
  public final static int _olFormatDateTimeShortDateTime = 2;
  public final static int _olFormatDateTimeShortDayDateTime = 3;
  public final static int _olFormatDateTimeShortDayMonthDateTime = 4;
  public final static int _OlFormatDateTimeLongDayDate = 5;
  public final static int _olFormatDateTimeLongDate = 6;
  public final static int _olFormatDateTimeLongDateReversed = 7;
  public final static int _olFormatDateTimeShortDate = 8;
  public final static int _olFormatDateTimeShortDateNumOnly = 9;
  public final static int _olFormatDateTimeShortDayMonth = 10;
  public final static int _olFormatDateTimeShortMonthYear = 11;
  public final static int _olFormatDateTimeShortMonthYearNumOnly = 12;
  public final static int _olFormatDateTimeShortDayDate = 13;
  public final static int _olFormatDateTimeLongTime = 15;
  public final static int _olFormatDateTimeShortTime = 16;
  public final static int _olFormatDateTimeBestFit = 17;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatDateTime(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlFormatDateTime(value);
    }
  }

  public String toString() {
    switch(value) {
    case 9: return "olFormatDateTimeShortDateNumOnly";
    case 1: return "olFormatDateTimeLongDayDateTime";
    case 2: return "olFormatDateTimeShortDateTime";
    case 3: return "olFormatDateTimeShortDayDateTime";
    case 4: return "olFormatDateTimeShortDayMonthDateTime";
    case 5: return "OlFormatDateTimeLongDayDate";
    case 6: return "olFormatDateTimeLongDate";
    case 7: return "olFormatDateTimeLongDateReversed";
    case 8: return "olFormatDateTimeShortDate";
    case 10: return "olFormatDateTimeShortDayMonth";
    case 11: return "olFormatDateTimeShortMonthYear";
    case 12: return "olFormatDateTimeShortMonthYearNumOnly";
    case 13: return "olFormatDateTimeShortDayDate";
    case 15: return "olFormatDateTimeLongTime";
    case 16: return "olFormatDateTimeShortTime";
    case 17: return "olFormatDateTimeBestFit";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 9) != 0) sbuf.append("|olFormatDateTimeShortDateNumOnly");
      if ((value & 1) != 0) sbuf.append("|olFormatDateTimeLongDayDateTime");
      if ((value & 2) != 0) sbuf.append("|olFormatDateTimeShortDateTime");
      if ((value & 3) != 0) sbuf.append("|olFormatDateTimeShortDayDateTime");
      if ((value & 4) != 0) sbuf.append("|olFormatDateTimeShortDayMonthDateTime");
      if ((value & 5) != 0) sbuf.append("|OlFormatDateTimeLongDayDate");
      if ((value & 6) != 0) sbuf.append("|olFormatDateTimeLongDate");
      if ((value & 7) != 0) sbuf.append("|olFormatDateTimeLongDateReversed");
      if ((value & 8) != 0) sbuf.append("|olFormatDateTimeShortDate");
      if ((value & 10) != 0) sbuf.append("|olFormatDateTimeShortDayMonth");
      if ((value & 11) != 0) sbuf.append("|olFormatDateTimeShortMonthYear");
      if ((value & 12) != 0) sbuf.append("|olFormatDateTimeShortMonthYearNumOnly");
      if ((value & 13) != 0) sbuf.append("|olFormatDateTimeShortDayDate");
      if ((value & 15) != 0) sbuf.append("|olFormatDateTimeLongTime");
      if ((value & 16) != 0) sbuf.append("|olFormatDateTimeShortTime");
      if ((value & 17) != 0) sbuf.append("|olFormatDateTimeBestFit");
      return sbuf.toString();
      }
    }
  }
}
