/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlLegendPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{04D217CD-1859-4786-B583-07BA2092A552}")
public enum XlLegendPosition {
  xlLegendPositionBottom(-4107),
  xlLegendPositionCorner(2),
  xlLegendPositionLeft(-4131),
  xlLegendPositionRight(-4152),
  xlLegendPositionTop(-4160),
  xlLegendPositionCustom(-4161);

  public final int value;
  private XlLegendPosition(int value) { this.value = value; }
  public static  XlLegendPosition valueOf(int value) {
    switch(value) {
    case -4107: return xlLegendPositionBottom;
    case 2: return xlLegendPositionCorner;
    case -4131: return xlLegendPositionLeft;
    case -4152: return xlLegendPositionRight;
    case -4160: return xlLegendPositionTop;
    case -4161: return xlLegendPositionCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlLegendPosition.class);
    }
  }
}
