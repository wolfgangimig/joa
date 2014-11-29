/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoChartFieldType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoChartFieldType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoChartFieldType msoChartFieldBubbleSize = new MsoChartFieldType(1);
  public final static MsoChartFieldType msoChartFieldCategoryName = new MsoChartFieldType(2);
  public final static MsoChartFieldType msoChartFieldPercentage = new MsoChartFieldType(3);
  public final static MsoChartFieldType msoChartFieldSeriesName = new MsoChartFieldType(4);
  public final static MsoChartFieldType msoChartFieldValue = new MsoChartFieldType(5);
  public final static MsoChartFieldType msoChartFieldFormula = new MsoChartFieldType(6);
  public final static MsoChartFieldType msoChartFieldRange = new MsoChartFieldType(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoChartFieldBubbleSize = 1;
  public final static int _msoChartFieldCategoryName = 2;
  public final static int _msoChartFieldPercentage = 3;
  public final static int _msoChartFieldSeriesName = 4;
  public final static int _msoChartFieldValue = 5;
  public final static int _msoChartFieldFormula = 6;
  public final static int _msoChartFieldRange = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoChartFieldType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoChartFieldType valueOf(int value) {
    switch(value) {
    case 1: return msoChartFieldBubbleSize;
    case 2: return msoChartFieldCategoryName;
    case 3: return msoChartFieldPercentage;
    case 4: return msoChartFieldSeriesName;
    case 5: return msoChartFieldValue;
    case 6: return msoChartFieldFormula;
    case 7: return msoChartFieldRange;
    default: return new MsoChartFieldType(value);
    }
  }
}
