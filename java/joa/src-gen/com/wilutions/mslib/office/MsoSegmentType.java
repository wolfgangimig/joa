/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSegmentType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSegmentType {

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
}
