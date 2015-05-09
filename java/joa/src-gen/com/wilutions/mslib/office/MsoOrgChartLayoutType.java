/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrgChartLayoutType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoOrgChartLayoutType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoOrgChartLayoutType msoOrgChartLayoutMixed = new MsoOrgChartLayoutType(-2);
  public final static MsoOrgChartLayoutType msoOrgChartLayoutStandard = new MsoOrgChartLayoutType(1);
  public final static MsoOrgChartLayoutType msoOrgChartLayoutBothHanging = new MsoOrgChartLayoutType(2);
  public final static MsoOrgChartLayoutType msoOrgChartLayoutLeftHanging = new MsoOrgChartLayoutType(3);
  public final static MsoOrgChartLayoutType msoOrgChartLayoutRightHanging = new MsoOrgChartLayoutType(4);
  public final static MsoOrgChartLayoutType msoOrgChartLayoutDefault = new MsoOrgChartLayoutType(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoOrgChartLayoutMixed = -2;
  public final static int _msoOrgChartLayoutStandard = 1;
  public final static int _msoOrgChartLayoutBothHanging = 2;
  public final static int _msoOrgChartLayoutLeftHanging = 3;
  public final static int _msoOrgChartLayoutRightHanging = 4;
  public final static int _msoOrgChartLayoutDefault = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoOrgChartLayoutType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoOrgChartLayoutType valueOf(int value) {
    switch(value) {
    case -2: return msoOrgChartLayoutMixed;
    case 1: return msoOrgChartLayoutStandard;
    case 2: return msoOrgChartLayoutBothHanging;
    case 3: return msoOrgChartLayoutLeftHanging;
    case 4: return msoOrgChartLayoutRightHanging;
    case 5: return msoOrgChartLayoutDefault;
    default: return new MsoOrgChartLayoutType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "msoOrgChartLayoutMixed";
    case 1: return "msoOrgChartLayoutStandard";
    case 2: return "msoOrgChartLayoutBothHanging";
    case 3: return "msoOrgChartLayoutLeftHanging";
    case 4: return "msoOrgChartLayoutRightHanging";
    case 5: return "msoOrgChartLayoutDefault";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoOrgChartLayoutMixed");
      if ((value & 1) != 0) sbuf.append("|msoOrgChartLayoutStandard");
      if ((value & 2) != 0) sbuf.append("|msoOrgChartLayoutBothHanging");
      if ((value & 3) != 0) sbuf.append("|msoOrgChartLayoutLeftHanging");
      if ((value & 4) != 0) sbuf.append("|msoOrgChartLayoutRightHanging");
      if ((value & 5) != 0) sbuf.append("|msoOrgChartLayoutDefault");
      return sbuf.toString();
      }
    }
  }
}
