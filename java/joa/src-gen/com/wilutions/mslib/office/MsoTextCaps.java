/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextCaps.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextCaps {
  msoCapsMixed(-2),
  msoNoCaps(0),
  msoSmallCaps(1),
  msoAllCaps(2);

  public final int value;
  private MsoTextCaps(int value) { this.value = value; }
  public static  MsoTextCaps valueOf(int value) {
    switch(value) {
    case -2: return msoCapsMixed;
    case 0: return msoNoCaps;
    case 1: return msoSmallCaps;
    case 2: return msoAllCaps;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextCaps.class);
    }
  }
}
