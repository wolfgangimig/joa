/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSegmentType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSegmentType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSegmentType msoSegmentLine = new MsoSegmentType(0);
  public final static MsoSegmentType msoSegmentCurve = new MsoSegmentType(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoSegmentLine = 0;
  public final static int _msoSegmentCurve = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSegmentType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSegmentType valueOf(int value) {
    switch(value) {
    case 0: return msoSegmentLine;
    case 1: return msoSegmentCurve;
    default: return new MsoSegmentType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoSegmentLine";
    case 1: return "msoSegmentCurve";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoSegmentLine");
      if ((value & 1) != 0) sbuf.append("|msoSegmentCurve");
      return sbuf.toString();
      }
    }
  }
}
