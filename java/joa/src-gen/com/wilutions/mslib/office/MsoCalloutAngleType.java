/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCalloutAngleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCalloutAngleType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

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

  public String toString() {
    switch(value) {
    case -2: return "msoCalloutAngleMixed";
    case 1: return "msoCalloutAngleAutomatic";
    case 2: return "msoCalloutAngle30";
    case 3: return "msoCalloutAngle45";
    case 4: return "msoCalloutAngle60";
    case 5: return "msoCalloutAngle90";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|msoCalloutAngleMixed");
      if ((value & 1) != 0) sbuf.append("|msoCalloutAngleAutomatic");
      if ((value & 2) != 0) sbuf.append("|msoCalloutAngle30");
      if ((value & 3) != 0) sbuf.append("|msoCalloutAngle45");
      if ((value & 4) != 0) sbuf.append("|msoCalloutAngle60");
      if ((value & 5) != 0) sbuf.append("|msoCalloutAngle90");
      return sbuf.toString();
      }
    }
  }
}
