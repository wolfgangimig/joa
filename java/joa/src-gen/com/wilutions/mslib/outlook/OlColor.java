/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlColor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlColor {
  olAutoColor(0),
  olColorBlack(1),
  olColorMaroon(2),
  olColorGreen(3),
  olColorOlive(4),
  olColorNavy(5),
  olColorPurple(6),
  olColorTeal(7),
  olColorGray(8),
  olColorSilver(9),
  olColorRed(10),
  olColorLime(11),
  olColorYellow(12),
  olColorBlue(13),
  olColorFuchsia(14),
  olColorAqua(15),
  olColorWhite(16);

  public final int value;
  private OlColor(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlColor.class);
    }
  }
}
