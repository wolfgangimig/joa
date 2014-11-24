/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutAngleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCalloutAngleType {

  // Typed constants
  public final static MsoCalloutAngleType msoCalloutAngleMixed = new MsoCalloutAngleType(-2);
  public final static MsoCalloutAngleType msoCalloutAngleAutomatic = new MsoCalloutAngleType(1);
  public final static MsoCalloutAngleType msoCalloutAngle30 = new MsoCalloutAngleType(2);
  public final static MsoCalloutAngleType msoCalloutAngle45 = new MsoCalloutAngleType(3);
  public final static MsoCalloutAngleType msoCalloutAngle60 = new MsoCalloutAngleType(4);
  public final static MsoCalloutAngleType msoCalloutAngle90 = new MsoCalloutAngleType(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoCalloutAngleMixed = -2;
  public final static int _msoCalloutAngleAutomatic = 1;
  public final static int _msoCalloutAngle30 = 2;
  public final static int _msoCalloutAngle45 = 3;
  public final static int _msoCalloutAngle60 = 4;
  public final static int _msoCalloutAngle90 = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCalloutAngleType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCalloutAngleType valueOf(int value) {
    switch(value) {
    case -2: return msoCalloutAngleMixed;
    case 1: return msoCalloutAngleAutomatic;
    case 2: return msoCalloutAngle30;
    case 3: return msoCalloutAngle45;
    case 4: return msoCalloutAngle60;
    case 5: return msoCalloutAngle90;
    default: return new MsoCalloutAngleType(value);
    }
  }
}
