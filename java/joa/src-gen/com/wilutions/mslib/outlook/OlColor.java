/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlColor {

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
}
