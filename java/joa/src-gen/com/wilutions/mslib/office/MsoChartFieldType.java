/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoChartFieldType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoChartFieldType {
  msoChartFieldBubbleSize(1),
  msoChartFieldCategoryName(2),
  msoChartFieldPercentage(3),
  msoChartFieldSeriesName(4),
  msoChartFieldValue(5),
  msoChartFieldFormula(6),
  msoChartFieldRange(7);

  public final int value;
  private MsoChartFieldType(int value) { this.value = value; }
  public static  MsoChartFieldType valueOf(int value) {
    switch(value) {
    case 1: return msoChartFieldBubbleSize;
    case 2: return msoChartFieldCategoryName;
    case 3: return msoChartFieldPercentage;
    case 4: return msoChartFieldSeriesName;
    case 5: return msoChartFieldValue;
    case 6: return msoChartFieldFormula;
    case 7: return msoChartFieldRange;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoChartFieldType.class);
    }
  }
}
