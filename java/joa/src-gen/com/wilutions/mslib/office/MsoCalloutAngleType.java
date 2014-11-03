/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutAngleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCalloutAngleType {
  msoCalloutAngleMixed(-2),
  msoCalloutAngleAutomatic(1),
  msoCalloutAngle30(2),
  msoCalloutAngle45(3),
  msoCalloutAngle60(4),
  msoCalloutAngle90(5);

  public final int value;
  private MsoCalloutAngleType(int value) { this.value = value; }
  public static  MsoCalloutAngleType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutAngleMixed;
    case 1: return msoCalloutAngleAutomatic;
    case 2: return msoCalloutAngle30;
    case 3: return msoCalloutAngle45;
    case 4: return msoCalloutAngle60;
    case 5: return msoCalloutAngle90;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCalloutAngleType.class);
    }
  }
}
