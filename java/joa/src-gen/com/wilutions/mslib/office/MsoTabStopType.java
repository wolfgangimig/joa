/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTabStopType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTabStopType {
  msoTabStopMixed(-2),
  msoTabStopLeft(1),
  msoTabStopCenter(2),
  msoTabStopRight(3),
  msoTabStopDecimal(4);

  public final int value;
  private MsoTabStopType(int value) { this.value = value; }
  public static  MsoTabStopType valueOf(int value) {
    switch(value) {
    case -2: return msoTabStopMixed;
    case 1: return msoTabStopLeft;
    case 2: return msoTabStopCenter;
    case 3: return msoTabStopRight;
    case 4: return msoTabStopDecimal;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTabStopType.class);
    }
  }
}
