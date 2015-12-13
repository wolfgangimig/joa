/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoChartFieldType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoChartFieldType implements ComEnum {
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

  public String toString() {
    switch(value) {
    case 1: return "msoChartFieldBubbleSize";
    case 2: return "msoChartFieldCategoryName";
    case 3: return "msoChartFieldPercentage";
    case 4: return "msoChartFieldSeriesName";
    case 5: return "msoChartFieldValue";
    case 6: return "msoChartFieldFormula";
    case 7: return "msoChartFieldRange";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoChartFieldBubbleSize");
      if ((value & 2) != 0) sbuf.append("|msoChartFieldCategoryName");
      if ((value & 3) != 0) sbuf.append("|msoChartFieldPercentage");
      if ((value & 4) != 0) sbuf.append("|msoChartFieldSeriesName");
      if ((value & 5) != 0) sbuf.append("|msoChartFieldValue");
      if ((value & 6) != 0) sbuf.append("|msoChartFieldFormula");
      if ((value & 7) != 0) sbuf.append("|msoChartFieldRange");
      return sbuf.toString();
      }
    }
  }
}
