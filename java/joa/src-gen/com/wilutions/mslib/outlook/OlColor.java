/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlColor implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlColor olAutoColor = new OlColor(0);
  public final static OlColor olColorBlack = new OlColor(1);
  public final static OlColor olColorMaroon = new OlColor(2);
  public final static OlColor olColorGreen = new OlColor(3);
  public final static OlColor olColorOlive = new OlColor(4);
  public final static OlColor olColorNavy = new OlColor(5);
  public final static OlColor olColorPurple = new OlColor(6);
  public final static OlColor olColorTeal = new OlColor(7);
  public final static OlColor olColorGray = new OlColor(8);
  public final static OlColor olColorSilver = new OlColor(9);
  public final static OlColor olColorRed = new OlColor(10);
  public final static OlColor olColorLime = new OlColor(11);
  public final static OlColor olColorYellow = new OlColor(12);
  public final static OlColor olColorBlue = new OlColor(13);
  public final static OlColor olColorFuchsia = new OlColor(14);
  public final static OlColor olColorAqua = new OlColor(15);
  public final static OlColor olColorWhite = new OlColor(16);

  // Integer constants for bitsets and switch statements
  public final static int _olAutoColor = 0;
  public final static int _olColorBlack = 1;
  public final static int _olColorMaroon = 2;
  public final static int _olColorGreen = 3;
  public final static int _olColorOlive = 4;
  public final static int _olColorNavy = 5;
  public final static int _olColorPurple = 6;
  public final static int _olColorTeal = 7;
  public final static int _olColorGray = 8;
  public final static int _olColorSilver = 9;
  public final static int _olColorRed = 10;
  public final static int _olColorLime = 11;
  public final static int _olColorYellow = 12;
  public final static int _olColorBlue = 13;
  public final static int _olColorFuchsia = 14;
  public final static int _olColorAqua = 15;
  public final static int _olColorWhite = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlColor(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlColor valueOf(int value) {
    switch(value) {
    case 0: return olAutoColor;
    case 1: return olColorBlack;
    case 2: return olColorMaroon;
    case 3: return olColorGreen;
    case 4: return olColorOlive;
    case 5: return olColorNavy;
    case 6: return olColorPurple;
    case 7: return olColorTeal;
    case 8: return olColorGray;
    case 9: return olColorSilver;
    case 10: return olColorRed;
    case 11: return olColorLime;
    case 12: return olColorYellow;
    case 13: return olColorBlue;
    case 14: return olColorFuchsia;
    case 15: return olColorAqua;
    case 16: return olColorWhite;
    default: return new OlColor(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "olColorGray";
    case 10: return "olColorRed";
    case 0: return "olAutoColor";
    case 1: return "olColorBlack";
    case 2: return "olColorMaroon";
    case 3: return "olColorGreen";
    case 4: return "olColorOlive";
    case 5: return "olColorNavy";
    case 6: return "olColorPurple";
    case 7: return "olColorTeal";
    case 9: return "olColorSilver";
    case 11: return "olColorLime";
    case 12: return "olColorYellow";
    case 13: return "olColorBlue";
    case 14: return "olColorFuchsia";
    case 15: return "olColorAqua";
    case 16: return "olColorWhite";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|olColorGray");
      if ((value & 10) != 0) sbuf.append("|olColorRed");
      if ((value & 0) != 0) sbuf.append("|olAutoColor");
      if ((value & 1) != 0) sbuf.append("|olColorBlack");
      if ((value & 2) != 0) sbuf.append("|olColorMaroon");
      if ((value & 3) != 0) sbuf.append("|olColorGreen");
      if ((value & 4) != 0) sbuf.append("|olColorOlive");
      if ((value & 5) != 0) sbuf.append("|olColorNavy");
      if ((value & 6) != 0) sbuf.append("|olColorPurple");
      if ((value & 7) != 0) sbuf.append("|olColorTeal");
      if ((value & 9) != 0) sbuf.append("|olColorSilver");
      if ((value & 11) != 0) sbuf.append("|olColorLime");
      if ((value & 12) != 0) sbuf.append("|olColorYellow");
      if ((value & 13) != 0) sbuf.append("|olColorBlue");
      if ((value & 14) != 0) sbuf.append("|olColorFuchsia");
      if ((value & 15) != 0) sbuf.append("|olColorAqua");
      if ((value & 16) != 0) sbuf.append("|olColorWhite");
      return sbuf.toString();
      }
    }
  }
}
