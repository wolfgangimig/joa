/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCategoryColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlCategoryColor implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlCategoryColor olCategoryColorNone = new OlCategoryColor(0);
  public final static OlCategoryColor olCategoryColorRed = new OlCategoryColor(1);
  public final static OlCategoryColor olCategoryColorOrange = new OlCategoryColor(2);
  public final static OlCategoryColor olCategoryColorPeach = new OlCategoryColor(3);
  public final static OlCategoryColor olCategoryColorYellow = new OlCategoryColor(4);
  public final static OlCategoryColor olCategoryColorGreen = new OlCategoryColor(5);
  public final static OlCategoryColor olCategoryColorTeal = new OlCategoryColor(6);
  public final static OlCategoryColor olCategoryColorOlive = new OlCategoryColor(7);
  public final static OlCategoryColor olCategoryColorBlue = new OlCategoryColor(8);
  public final static OlCategoryColor olCategoryColorPurple = new OlCategoryColor(9);
  public final static OlCategoryColor olCategoryColorMaroon = new OlCategoryColor(10);
  public final static OlCategoryColor olCategoryColorSteel = new OlCategoryColor(11);
  public final static OlCategoryColor olCategoryColorDarkSteel = new OlCategoryColor(12);
  public final static OlCategoryColor olCategoryColorGray = new OlCategoryColor(13);
  public final static OlCategoryColor olCategoryColorDarkGray = new OlCategoryColor(14);
  public final static OlCategoryColor olCategoryColorBlack = new OlCategoryColor(15);
  public final static OlCategoryColor olCategoryColorDarkRed = new OlCategoryColor(16);
  public final static OlCategoryColor olCategoryColorDarkOrange = new OlCategoryColor(17);
  public final static OlCategoryColor olCategoryColorDarkPeach = new OlCategoryColor(18);
  public final static OlCategoryColor olCategoryColorDarkYellow = new OlCategoryColor(19);
  public final static OlCategoryColor olCategoryColorDarkGreen = new OlCategoryColor(20);
  public final static OlCategoryColor olCategoryColorDarkTeal = new OlCategoryColor(21);
  public final static OlCategoryColor olCategoryColorDarkOlive = new OlCategoryColor(22);
  public final static OlCategoryColor olCategoryColorDarkBlue = new OlCategoryColor(23);
  public final static OlCategoryColor olCategoryColorDarkPurple = new OlCategoryColor(24);
  public final static OlCategoryColor olCategoryColorDarkMaroon = new OlCategoryColor(25);

  // Integer constants for bitsets and switch statements
  public final static int _olCategoryColorNone = 0;
  public final static int _olCategoryColorRed = 1;
  public final static int _olCategoryColorOrange = 2;
  public final static int _olCategoryColorPeach = 3;
  public final static int _olCategoryColorYellow = 4;
  public final static int _olCategoryColorGreen = 5;
  public final static int _olCategoryColorTeal = 6;
  public final static int _olCategoryColorOlive = 7;
  public final static int _olCategoryColorBlue = 8;
  public final static int _olCategoryColorPurple = 9;
  public final static int _olCategoryColorMaroon = 10;
  public final static int _olCategoryColorSteel = 11;
  public final static int _olCategoryColorDarkSteel = 12;
  public final static int _olCategoryColorGray = 13;
  public final static int _olCategoryColorDarkGray = 14;
  public final static int _olCategoryColorBlack = 15;
  public final static int _olCategoryColorDarkRed = 16;
  public final static int _olCategoryColorDarkOrange = 17;
  public final static int _olCategoryColorDarkPeach = 18;
  public final static int _olCategoryColorDarkYellow = 19;
  public final static int _olCategoryColorDarkGreen = 20;
  public final static int _olCategoryColorDarkTeal = 21;
  public final static int _olCategoryColorDarkOlive = 22;
  public final static int _olCategoryColorDarkBlue = 23;
  public final static int _olCategoryColorDarkPurple = 24;
  public final static int _olCategoryColorDarkMaroon = 25;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlCategoryColor(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlCategoryColor valueOf(int value) {
    switch(value) {
    case 0: return olCategoryColorNone;
    case 1: return olCategoryColorRed;
    case 2: return olCategoryColorOrange;
    case 3: return olCategoryColorPeach;
    case 4: return olCategoryColorYellow;
    case 5: return olCategoryColorGreen;
    case 6: return olCategoryColorTeal;
    case 7: return olCategoryColorOlive;
    case 8: return olCategoryColorBlue;
    case 9: return olCategoryColorPurple;
    case 10: return olCategoryColorMaroon;
    case 11: return olCategoryColorSteel;
    case 12: return olCategoryColorDarkSteel;
    case 13: return olCategoryColorGray;
    case 14: return olCategoryColorDarkGray;
    case 15: return olCategoryColorBlack;
    case 16: return olCategoryColorDarkRed;
    case 17: return olCategoryColorDarkOrange;
    case 18: return olCategoryColorDarkPeach;
    case 19: return olCategoryColorDarkYellow;
    case 20: return olCategoryColorDarkGreen;
    case 21: return olCategoryColorDarkTeal;
    case 22: return olCategoryColorDarkOlive;
    case 23: return olCategoryColorDarkBlue;
    case 24: return olCategoryColorDarkPurple;
    case 25: return olCategoryColorDarkMaroon;
    default: return new OlCategoryColor(value);
    }
  }

  public String toString() {
    switch(value) {
    case 18: return "olCategoryColorDarkPeach";
    case 8: return "olCategoryColorBlue";
    case 10: return "olCategoryColorMaroon";
    case 0: return "olCategoryColorNone";
    case 1: return "olCategoryColorRed";
    case 2: return "olCategoryColorOrange";
    case 3: return "olCategoryColorPeach";
    case 4: return "olCategoryColorYellow";
    case 5: return "olCategoryColorGreen";
    case 6: return "olCategoryColorTeal";
    case 7: return "olCategoryColorOlive";
    case 20: return "olCategoryColorDarkGreen";
    case 9: return "olCategoryColorPurple";
    case 11: return "olCategoryColorSteel";
    case 12: return "olCategoryColorDarkSteel";
    case 13: return "olCategoryColorGray";
    case 14: return "olCategoryColorDarkGray";
    case 15: return "olCategoryColorBlack";
    case 16: return "olCategoryColorDarkRed";
    case 17: return "olCategoryColorDarkOrange";
    case 19: return "olCategoryColorDarkYellow";
    case 21: return "olCategoryColorDarkTeal";
    case 22: return "olCategoryColorDarkOlive";
    case 23: return "olCategoryColorDarkBlue";
    case 24: return "olCategoryColorDarkPurple";
    case 25: return "olCategoryColorDarkMaroon";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 18) != 0) sbuf.append("|olCategoryColorDarkPeach");
      if ((value & 8) != 0) sbuf.append("|olCategoryColorBlue");
      if ((value & 10) != 0) sbuf.append("|olCategoryColorMaroon");
      if ((value & 0) != 0) sbuf.append("|olCategoryColorNone");
      if ((value & 1) != 0) sbuf.append("|olCategoryColorRed");
      if ((value & 2) != 0) sbuf.append("|olCategoryColorOrange");
      if ((value & 3) != 0) sbuf.append("|olCategoryColorPeach");
      if ((value & 4) != 0) sbuf.append("|olCategoryColorYellow");
      if ((value & 5) != 0) sbuf.append("|olCategoryColorGreen");
      if ((value & 6) != 0) sbuf.append("|olCategoryColorTeal");
      if ((value & 7) != 0) sbuf.append("|olCategoryColorOlive");
      if ((value & 20) != 0) sbuf.append("|olCategoryColorDarkGreen");
      if ((value & 9) != 0) sbuf.append("|olCategoryColorPurple");
      if ((value & 11) != 0) sbuf.append("|olCategoryColorSteel");
      if ((value & 12) != 0) sbuf.append("|olCategoryColorDarkSteel");
      if ((value & 13) != 0) sbuf.append("|olCategoryColorGray");
      if ((value & 14) != 0) sbuf.append("|olCategoryColorDarkGray");
      if ((value & 15) != 0) sbuf.append("|olCategoryColorBlack");
      if ((value & 16) != 0) sbuf.append("|olCategoryColorDarkRed");
      if ((value & 17) != 0) sbuf.append("|olCategoryColorDarkOrange");
      if ((value & 19) != 0) sbuf.append("|olCategoryColorDarkYellow");
      if ((value & 21) != 0) sbuf.append("|olCategoryColorDarkTeal");
      if ((value & 22) != 0) sbuf.append("|olCategoryColorDarkOlive");
      if ((value & 23) != 0) sbuf.append("|olCategoryColorDarkBlue");
      if ((value & 24) != 0) sbuf.append("|olCategoryColorDarkPurple");
      if ((value & 25) != 0) sbuf.append("|olCategoryColorDarkMaroon");
      return sbuf.toString();
      }
    }
  }
}
