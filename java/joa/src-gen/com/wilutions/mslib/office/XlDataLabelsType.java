/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDataLabelsType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlDataLabelsType {
  xlDataLabelsShowNone(-4142),
  xlDataLabelsShowValue(2),
  xlDataLabelsShowPercent(3),
  xlDataLabelsShowLabel(4),
  xlDataLabelsShowLabelAndPercent(5),
  xlDataLabelsShowBubbleSizes(6);

  public final int value;
  private XlDataLabelsType(int value) { this.value = value; }
  public static  XlDataLabelsType valueOf(int value) {
    switch(value) {
    case -4142: return xlDataLabelsShowNone;
    case 2: return xlDataLabelsShowValue;
    case 3: return xlDataLabelsShowPercent;
    case 4: return xlDataLabelsShowLabel;
    case 5: return xlDataLabelsShowLabelAndPercent;
    case 6: return xlDataLabelsShowBubbleSizes;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlDataLabelsType.class);
    }
  }
}
