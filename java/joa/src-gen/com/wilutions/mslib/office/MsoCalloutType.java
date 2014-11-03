/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCalloutType {
  msoCalloutMixed(-2),
  msoCalloutOne(1),
  msoCalloutTwo(2),
  msoCalloutThree(3),
  msoCalloutFour(4);

  public final int value;
  private MsoCalloutType(int value) { this.value = value; }
  public static  MsoCalloutType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutMixed;
    case 1: return msoCalloutOne;
    case 2: return msoCalloutTwo;
    case 3: return msoCalloutThree;
    case 4: return msoCalloutFour;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCalloutType.class);
    }
  }
}
