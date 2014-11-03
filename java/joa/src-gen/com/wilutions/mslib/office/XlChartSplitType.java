/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartSplitType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{732091CB-0A8D-44BC-B977-418CCB37B552}")
public enum XlChartSplitType {
  xlSplitByPosition(1),
  xlSplitByPercentValue(3),
  xlSplitByCustomSplit(4),
  xlSplitByValue(2);

  public final int value;
  private XlChartSplitType(int value) { this.value = value; }
  public static  XlChartSplitType valueOf(int value) {
    switch(value) {
    case 1: return xlSplitByPosition;
    case 3: return xlSplitByPercentValue;
    case 4: return xlSplitByCustomSplit;
    case 2: return xlSplitByValue;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartSplitType.class);
    }
  }
}
