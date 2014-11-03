/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCategoryColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlCategoryColor {
  olCategoryColorNone(0),
  olCategoryColorRed(1),
  olCategoryColorOrange(2),
  olCategoryColorPeach(3),
  olCategoryColorYellow(4),
  olCategoryColorGreen(5),
  olCategoryColorTeal(6),
  olCategoryColorOlive(7),
  olCategoryColorBlue(8),
  olCategoryColorPurple(9),
  olCategoryColorMaroon(10),
  olCategoryColorSteel(11),
  olCategoryColorDarkSteel(12),
  olCategoryColorGray(13),
  olCategoryColorDarkGray(14),
  olCategoryColorBlack(15),
  olCategoryColorDarkRed(16),
  olCategoryColorDarkOrange(17),
  olCategoryColorDarkPeach(18),
  olCategoryColorDarkYellow(19),
  olCategoryColorDarkGreen(20),
  olCategoryColorDarkTeal(21),
  olCategoryColorDarkOlive(22),
  olCategoryColorDarkBlue(23),
  olCategoryColorDarkPurple(24),
  olCategoryColorDarkMaroon(25);

  public final int value;
  private OlCategoryColor(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlCategoryColor.class);
    }
  }
}
