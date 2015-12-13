/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartSplitType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{732091CB-0A8D-44BC-B977-418CCB37B552}")
public class XlChartSplitType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlChartSplitType xlSplitByPosition = new XlChartSplitType(1);
  public final static XlChartSplitType xlSplitByPercentValue = new XlChartSplitType(3);
  public final static XlChartSplitType xlSplitByCustomSplit = new XlChartSplitType(4);
  public final static XlChartSplitType xlSplitByValue = new XlChartSplitType(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlSplitByPosition = 1;
  public final static int _xlSplitByPercentValue = 3;
  public final static int _xlSplitByCustomSplit = 4;
  public final static int _xlSplitByValue = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartSplitType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartSplitType valueOf(int value) {
    switch(value) {
    case 1: return xlSplitByPosition;
    case 3: return xlSplitByPercentValue;
    case 4: return xlSplitByCustomSplit;
    case 2: return xlSplitByValue;
    default: return new XlChartSplitType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "xlSplitByPosition";
    case 3: return "xlSplitByPercentValue";
    case 4: return "xlSplitByCustomSplit";
    case 2: return "xlSplitByValue";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|xlSplitByPosition");
      if ((value & 3) != 0) sbuf.append("|xlSplitByPercentValue");
      if ((value & 4) != 0) sbuf.append("|xlSplitByCustomSplit");
      if ((value & 2) != 0) sbuf.append("|xlSplitByValue");
      return sbuf.toString();
      }
    }
  }
}
