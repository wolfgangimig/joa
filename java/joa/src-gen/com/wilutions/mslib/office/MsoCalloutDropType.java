/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutDropType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCalloutDropType {
  msoCalloutDropMixed(-2),
  msoCalloutDropCustom(1),
  msoCalloutDropTop(2),
  msoCalloutDropCenter(3),
  msoCalloutDropBottom(4);

  public final int value;
  private MsoCalloutDropType(int value) { this.value = value; }
  public static  MsoCalloutDropType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutDropMixed;
    case 1: return msoCalloutDropCustom;
    case 2: return msoCalloutDropTop;
    case 3: return msoCalloutDropCenter;
    case 4: return msoCalloutDropBottom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCalloutDropType.class);
    }
  }
}
