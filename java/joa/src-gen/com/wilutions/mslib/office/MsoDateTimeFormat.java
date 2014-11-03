/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDateTimeFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDateTimeFormat {
  msoDateTimeFormatMixed(-2),
  msoDateTimeMdyy(1),
  msoDateTimeddddMMMMddyyyy(2),
  msoDateTimedMMMMyyyy(3),
  msoDateTimeMMMMdyyyy(4),
  msoDateTimedMMMyy(5),
  msoDateTimeMMMMyy(6),
  msoDateTimeMMyy(7),
  msoDateTimeMMddyyHmm(8),
  msoDateTimeMMddyyhmmAMPM(9),
  msoDateTimeHmm(10),
  msoDateTimeHmmss(11),
  msoDateTimehmmAMPM(12),
  msoDateTimehmmssAMPM(13),
  msoDateTimeFigureOut(14);

  public final int value;
  private MsoDateTimeFormat(int value) { this.value = value; }
  public static  MsoDateTimeFormat valueOf(int value) {
    switch(value) {
    case -2: return msoDateTimeFormatMixed;
    case 1: return msoDateTimeMdyy;
    case 2: return msoDateTimeddddMMMMddyyyy;
    case 3: return msoDateTimedMMMMyyyy;
    case 4: return msoDateTimeMMMMdyyyy;
    case 5: return msoDateTimedMMMyy;
    case 6: return msoDateTimeMMMMyy;
    case 7: return msoDateTimeMMyy;
    case 8: return msoDateTimeMMddyyHmm;
    case 9: return msoDateTimeMMddyyhmmAMPM;
    case 10: return msoDateTimeHmm;
    case 11: return msoDateTimeHmmss;
    case 12: return msoDateTimehmmAMPM;
    case 13: return msoDateTimehmmssAMPM;
    case 14: return msoDateTimeFigureOut;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDateTimeFormat.class);
    }
  }
}
