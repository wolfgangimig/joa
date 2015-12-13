/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDataLabelsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlDataLabelsType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlDataLabelsType xlDataLabelsShowNone = new XlDataLabelsType(-4142);
  public final static XlDataLabelsType xlDataLabelsShowValue = new XlDataLabelsType(2);
  public final static XlDataLabelsType xlDataLabelsShowPercent = new XlDataLabelsType(3);
  public final static XlDataLabelsType xlDataLabelsShowLabel = new XlDataLabelsType(4);
  public final static XlDataLabelsType xlDataLabelsShowLabelAndPercent = new XlDataLabelsType(5);
  public final static XlDataLabelsType xlDataLabelsShowBubbleSizes = new XlDataLabelsType(6);

  // Integer constants for bitsets and switch statements
  public final static int _xlDataLabelsShowNone = -4142;
  public final static int _xlDataLabelsShowValue = 2;
  public final static int _xlDataLabelsShowPercent = 3;
  public final static int _xlDataLabelsShowLabel = 4;
  public final static int _xlDataLabelsShowLabelAndPercent = 5;
  public final static int _xlDataLabelsShowBubbleSizes = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlDataLabelsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlDataLabelsType valueOf(int value) {
    switch(value) {
    case -4142: return xlDataLabelsShowNone;
    case 2: return xlDataLabelsShowValue;
    case 3: return xlDataLabelsShowPercent;
    case 4: return xlDataLabelsShowLabel;
    case 5: return xlDataLabelsShowLabelAndPercent;
    case 6: return xlDataLabelsShowBubbleSizes;
    default: return new XlDataLabelsType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 6: return "xlDataLabelsShowBubbleSizes";
    case -4142: return "xlDataLabelsShowNone";
    case 2: return "xlDataLabelsShowValue";
    case 3: return "xlDataLabelsShowPercent";
    case 4: return "xlDataLabelsShowLabel";
    case 5: return "xlDataLabelsShowLabelAndPercent";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 6) != 0) sbuf.append("|xlDataLabelsShowBubbleSizes");
      if ((value & -4142) != 0) sbuf.append("|xlDataLabelsShowNone");
      if ((value & 2) != 0) sbuf.append("|xlDataLabelsShowValue");
      if ((value & 3) != 0) sbuf.append("|xlDataLabelsShowPercent");
      if ((value & 4) != 0) sbuf.append("|xlDataLabelsShowLabel");
      if ((value & 5) != 0) sbuf.append("|xlDataLabelsShowLabelAndPercent");
      return sbuf.toString();
      }
    }
  }
}
