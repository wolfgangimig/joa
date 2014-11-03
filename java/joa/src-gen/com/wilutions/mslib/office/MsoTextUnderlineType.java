/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextUnderlineType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextUnderlineType {
  msoUnderlineMixed(-2),
  msoNoUnderline(0),
  msoUnderlineWords(1),
  msoUnderlineSingleLine(2),
  msoUnderlineDoubleLine(3),
  msoUnderlineHeavyLine(4),
  msoUnderlineDottedLine(5),
  msoUnderlineDottedHeavyLine(6),
  msoUnderlineDashLine(7),
  msoUnderlineDashHeavyLine(8),
  msoUnderlineDashLongLine(9),
  msoUnderlineDashLongHeavyLine(10),
  msoUnderlineDotDashLine(11),
  msoUnderlineDotDashHeavyLine(12),
  msoUnderlineDotDotDashLine(13),
  msoUnderlineDotDotDashHeavyLine(14),
  msoUnderlineWavyLine(15),
  msoUnderlineWavyHeavyLine(16),
  msoUnderlineWavyDoubleLine(17);

  public final int value;
  private MsoTextUnderlineType(int value) { this.value = value; }
  public static  MsoTextUnderlineType valueOf(int value) {
    switch(value) {
    case -2: return msoUnderlineMixed;
    case 0: return msoNoUnderline;
    case 1: return msoUnderlineWords;
    case 2: return msoUnderlineSingleLine;
    case 3: return msoUnderlineDoubleLine;
    case 4: return msoUnderlineHeavyLine;
    case 5: return msoUnderlineDottedLine;
    case 6: return msoUnderlineDottedHeavyLine;
    case 7: return msoUnderlineDashLine;
    case 8: return msoUnderlineDashHeavyLine;
    case 9: return msoUnderlineDashLongLine;
    case 10: return msoUnderlineDashLongHeavyLine;
    case 11: return msoUnderlineDotDashLine;
    case 12: return msoUnderlineDotDashHeavyLine;
    case 13: return msoUnderlineDotDotDashLine;
    case 14: return msoUnderlineDotDotDashHeavyLine;
    case 15: return msoUnderlineWavyLine;
    case 16: return msoUnderlineWavyHeavyLine;
    case 17: return msoUnderlineWavyDoubleLine;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextUnderlineType.class);
    }
  }
}
