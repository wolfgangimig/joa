/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextStrike.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextStrike {
  msoStrikeMixed(-2),
  msoNoStrike(0),
  msoSingleStrike(1),
  msoDoubleStrike(2);

  public final int value;
  private MsoTextStrike(int value) { this.value = value; }
  public static  MsoTextStrike valueOf(int value) {
    switch(value) {
    case -2: return msoStrikeMixed;
    case 0: return msoNoStrike;
    case 1: return msoSingleStrike;
    case 2: return msoDoubleStrike;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextStrike.class);
    }
  }
}
