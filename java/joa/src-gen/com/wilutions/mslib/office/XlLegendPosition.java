/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlLegendPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{04D217CD-1859-4786-B583-07BA2092A552}")
public class XlLegendPosition {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlLegendPosition xlLegendPositionBottom = new XlLegendPosition(-4107);
  public final static XlLegendPosition xlLegendPositionCorner = new XlLegendPosition(2);
  public final static XlLegendPosition xlLegendPositionLeft = new XlLegendPosition(-4131);
  public final static XlLegendPosition xlLegendPositionRight = new XlLegendPosition(-4152);
  public final static XlLegendPosition xlLegendPositionTop = new XlLegendPosition(-4160);
  public final static XlLegendPosition xlLegendPositionCustom = new XlLegendPosition(-4161);

  // Integer constants for bitsets and switch statements
  public final static int _xlLegendPositionBottom = -4107;
  public final static int _xlLegendPositionCorner = 2;
  public final static int _xlLegendPositionLeft = -4131;
  public final static int _xlLegendPositionRight = -4152;
  public final static int _xlLegendPositionTop = -4160;
  public final static int _xlLegendPositionCustom = -4161;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlLegendPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlLegendPosition valueOf(int value) {
    switch(value) {
    case -4107: return xlLegendPositionBottom;
    case 2: return xlLegendPositionCorner;
    case -4131: return xlLegendPositionLeft;
    case -4152: return xlLegendPositionRight;
    case -4160: return xlLegendPositionTop;
    case -4161: return xlLegendPositionCustom;
    default: return new XlLegendPosition(value);
    }
  }
}
