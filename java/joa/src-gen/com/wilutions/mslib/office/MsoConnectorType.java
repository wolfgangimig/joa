/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoConnectorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoConnectorType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoConnectorType msoConnectorTypeMixed = new MsoConnectorType(-2);
  public final static MsoConnectorType msoConnectorStraight = new MsoConnectorType(1);
  public final static MsoConnectorType msoConnectorElbow = new MsoConnectorType(2);
  public final static MsoConnectorType msoConnectorCurve = new MsoConnectorType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoConnectorTypeMixed = -2;
  public final static int _msoConnectorStraight = 1;
  public final static int _msoConnectorElbow = 2;
  public final static int _msoConnectorCurve = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoConnectorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoConnectorType valueOf(int value) {
    switch(value) {
    case -2: return msoConnectorTypeMixed;
    case 1: return msoConnectorStraight;
    case 2: return msoConnectorElbow;
    case 3: return msoConnectorCurve;
    default: return new MsoConnectorType(value);
    }
  }
}
