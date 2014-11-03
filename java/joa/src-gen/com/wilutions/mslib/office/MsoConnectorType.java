/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoConnectorType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoConnectorType {
  msoConnectorTypeMixed(-2),
  msoConnectorStraight(1),
  msoConnectorElbow(2),
  msoConnectorCurve(3);

  public final int value;
  private MsoConnectorType(int value) { this.value = value; }
  public static  MsoConnectorType valueOf(int value) {
    switch(value) {
    case -2: return msoConnectorTypeMixed;
    case 1: return msoConnectorStraight;
    case 2: return msoConnectorElbow;
    case 3: return msoConnectorCurve;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoConnectorType.class);
    }
  }
}
