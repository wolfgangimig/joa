/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSearchIn.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSearchIn {
  msoSearchInMyComputer(0),
  msoSearchInOutlook(1),
  msoSearchInMyNetworkPlaces(2),
  msoSearchInCustom(3);

  public final int value;
  private MsoSearchIn(int value) { this.value = value; }
  public static  MsoSearchIn valueOf(int value) {
    switch(value) {
    case 0: return msoSearchInMyComputer;
    case 1: return msoSearchInOutlook;
    case 2: return msoSearchInMyNetworkPlaces;
    case 3: return msoSearchInCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSearchIn.class);
    }
  }
}
