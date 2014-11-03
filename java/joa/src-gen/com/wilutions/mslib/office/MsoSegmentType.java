/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSegmentType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSegmentType {
  msoSegmentLine(0),
  msoSegmentCurve(1);

  public final int value;
  private MsoSegmentType(int value) { this.value = value; }
  public static  MsoSegmentType valueOf(int value) {
    switch(value) {
    case 0: return msoSegmentLine;
    case 1: return msoSegmentCurve;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSegmentType.class);
    }
  }
}
