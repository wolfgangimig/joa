/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDateTimeFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDateTimeFormat implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoDateTimeFormat msoDateTimeFormatMixed = new MsoDateTimeFormat(-2);
  public final static MsoDateTimeFormat msoDateTimeMdyy = new MsoDateTimeFormat(1);
  public final static MsoDateTimeFormat msoDateTimeddddMMMMddyyyy = new MsoDateTimeFormat(2);
  public final static MsoDateTimeFormat msoDateTimedMMMMyyyy = new MsoDateTimeFormat(3);
  public final static MsoDateTimeFormat msoDateTimeMMMMdyyyy = new MsoDateTimeFormat(4);
  public final static MsoDateTimeFormat msoDateTimedMMMyy = new MsoDateTimeFormat(5);
  public final static MsoDateTimeFormat msoDateTimeMMMMyy = new MsoDateTimeFormat(6);
  public final static MsoDateTimeFormat msoDateTimeMMyy = new MsoDateTimeFormat(7);
  public final static MsoDateTimeFormat msoDateTimeMMddyyHmm = new MsoDateTimeFormat(8);
  public final static MsoDateTimeFormat msoDateTimeMMddyyhmmAMPM = new MsoDateTimeFormat(9);
  public final static MsoDateTimeFormat msoDateTimeHmm = new MsoDateTimeFormat(10);
  public final static MsoDateTimeFormat msoDateTimeHmmss = new MsoDateTimeFormat(11);
  public final static MsoDateTimeFormat msoDateTimehmmAMPM = new MsoDateTimeFormat(12);
  public final static MsoDateTimeFormat msoDateTimehmmssAMPM = new MsoDateTimeFormat(13);
  public final static MsoDateTimeFormat msoDateTimeFigureOut = new MsoDateTimeFormat(14);

  // Integer constants for bitsets and switch statements
  public final static int _msoDateTimeFormatMixed = -2;
  public final static int _msoDateTimeMdyy = 1;
  public final static int _msoDateTimeddddMMMMddyyyy = 2;
  public final static int _msoDateTimedMMMMyyyy = 3;
  public final static int _msoDateTimeMMMMdyyyy = 4;
  public final static int _msoDateTimedMMMyy = 5;
  public final static int _msoDateTimeMMMMyy = 6;
  public final static int _msoDateTimeMMyy = 7;
  public final static int _msoDateTimeMMddyyHmm = 8;
  public final static int _msoDateTimeMMddyyhmmAMPM = 9;
  public final static int _msoDateTimeHmm = 10;
  public final static int _msoDateTimeHmmss = 11;
  public final static int _msoDateTimehmmAMPM = 12;
  public final static int _msoDateTimehmmssAMPM = 13;
  public final static int _msoDateTimeFigureOut = 14;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDateTimeFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoDateTimeFormat(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoDateTimeFormatMixed";
    case 2: return "msoDateTimeddddMMMMddyyyy";
    case 1: return "msoDateTimeMdyy";
    case 3: return "msoDateTimedMMMMyyyy";
    case 4: return "msoDateTimeMMMMdyyyy";
    case 5: return "msoDateTimedMMMyy";
    case 6: return "msoDateTimeMMMMyy";
    case 7: return "msoDateTimeMMyy";
    case 8: return "msoDateTimeMMddyyHmm";
    case 9: return "msoDateTimeMMddyyhmmAMPM";
    case 10: return "msoDateTimeHmm";
    case 11: return "msoDateTimeHmmss";
    case 12: return "msoDateTimehmmAMPM";
    case 13: return "msoDateTimehmmssAMPM";
    case 14: return "msoDateTimeFigureOut";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoDateTimeFormatMixed");
      if ((value & 2) != 0) sbuf.append("|msoDateTimeddddMMMMddyyyy");
      if ((value & 1) != 0) sbuf.append("|msoDateTimeMdyy");
      if ((value & 3) != 0) sbuf.append("|msoDateTimedMMMMyyyy");
      if ((value & 4) != 0) sbuf.append("|msoDateTimeMMMMdyyyy");
      if ((value & 5) != 0) sbuf.append("|msoDateTimedMMMyy");
      if ((value & 6) != 0) sbuf.append("|msoDateTimeMMMMyy");
      if ((value & 7) != 0) sbuf.append("|msoDateTimeMMyy");
      if ((value & 8) != 0) sbuf.append("|msoDateTimeMMddyyHmm");
      if ((value & 9) != 0) sbuf.append("|msoDateTimeMMddyyhmmAMPM");
      if ((value & 10) != 0) sbuf.append("|msoDateTimeHmm");
      if ((value & 11) != 0) sbuf.append("|msoDateTimeHmmss");
      if ((value & 12) != 0) sbuf.append("|msoDateTimehmmAMPM");
      if ((value & 13) != 0) sbuf.append("|msoDateTimehmmssAMPM");
      if ((value & 14) != 0) sbuf.append("|msoDateTimeFigureOut");
      return sbuf.toString();
      }
    }
  }
}
