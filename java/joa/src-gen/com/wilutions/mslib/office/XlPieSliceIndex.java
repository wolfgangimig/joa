/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPieSliceIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{2B4C8AB7-6E70-422A-B7CC-206452289F16}")
public class XlPieSliceIndex implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlPieSliceIndex xlOuterCounterClockwisePoint = new XlPieSliceIndex(1);
  public final static XlPieSliceIndex xlOuterCenterPoint = new XlPieSliceIndex(2);
  public final static XlPieSliceIndex xlOuterClockwisePoint = new XlPieSliceIndex(3);
  public final static XlPieSliceIndex xlMidClockwiseRadiusPoint = new XlPieSliceIndex(4);
  public final static XlPieSliceIndex xlCenterPoint = new XlPieSliceIndex(5);
  public final static XlPieSliceIndex xlMidCounterClockwiseRadiusPoint = new XlPieSliceIndex(6);
  public final static XlPieSliceIndex xlInnerClockwisePoint = new XlPieSliceIndex(7);
  public final static XlPieSliceIndex xlInnerCenterPoint = new XlPieSliceIndex(8);
  public final static XlPieSliceIndex xlInnerCounterClockwisePoint = new XlPieSliceIndex(9);

  // Integer constants for bitsets and switch statements
  public final static int _xlOuterCounterClockwisePoint = 1;
  public final static int _xlOuterCenterPoint = 2;
  public final static int _xlOuterClockwisePoint = 3;
  public final static int _xlMidClockwiseRadiusPoint = 4;
  public final static int _xlCenterPoint = 5;
  public final static int _xlMidCounterClockwiseRadiusPoint = 6;
  public final static int _xlInnerClockwisePoint = 7;
  public final static int _xlInnerCenterPoint = 8;
  public final static int _xlInnerCounterClockwisePoint = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlPieSliceIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlPieSliceIndex valueOf(int value) {
    switch(value) {
    case 1: return xlOuterCounterClockwisePoint;
    case 2: return xlOuterCenterPoint;
    case 3: return xlOuterClockwisePoint;
    case 4: return xlMidClockwiseRadiusPoint;
    case 5: return xlCenterPoint;
    case 6: return xlMidCounterClockwiseRadiusPoint;
    case 7: return xlInnerClockwisePoint;
    case 8: return xlInnerCenterPoint;
    case 9: return xlInnerCounterClockwisePoint;
    default: return new XlPieSliceIndex(value);
    }
  }

  public String toString() {
    switch(value) {
    case 9: return "xlInnerCounterClockwisePoint";
    case 1: return "xlOuterCounterClockwisePoint";
    case 2: return "xlOuterCenterPoint";
    case 3: return "xlOuterClockwisePoint";
    case 4: return "xlMidClockwiseRadiusPoint";
    case 5: return "xlCenterPoint";
    case 6: return "xlMidCounterClockwiseRadiusPoint";
    case 7: return "xlInnerClockwisePoint";
    case 8: return "xlInnerCenterPoint";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 9) != 0) sbuf.append("|xlInnerCounterClockwisePoint");
      if ((value & 1) != 0) sbuf.append("|xlOuterCounterClockwisePoint");
      if ((value & 2) != 0) sbuf.append("|xlOuterCenterPoint");
      if ((value & 3) != 0) sbuf.append("|xlOuterClockwisePoint");
      if ((value & 4) != 0) sbuf.append("|xlMidClockwiseRadiusPoint");
      if ((value & 5) != 0) sbuf.append("|xlCenterPoint");
      if ((value & 6) != 0) sbuf.append("|xlMidCounterClockwiseRadiusPoint");
      if ((value & 7) != 0) sbuf.append("|xlInnerClockwisePoint");
      if ((value & 8) != 0) sbuf.append("|xlInnerCenterPoint");
      return sbuf.toString();
      }
    }
  }
}
