/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadLength.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoArrowheadLength {
  msoArrowheadLengthMixed(-2),
  msoArrowheadShort(1),
  msoArrowheadLengthMedium(2),
  msoArrowheadLong(3);

  public final int value;
  private MsoArrowheadLength(int value) { this.value = value; }
  public static  MsoArrowheadLength valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadLengthMixed;
    case 1: return msoArrowheadShort;
    case 2: return msoArrowheadLengthMedium;
    case 3: return msoArrowheadLong;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoArrowheadLength.class);
    }
  }
}
