/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SignatureType {
  sigtypeUnknown(0),
  sigtypeNonVisible(1),
  sigtypeSignatureLine(2),
  sigtypeMax(3);

  public final int value;
  private SignatureType(int value) { this.value = value; }
  public static  SignatureType valueOf(int value) {
    switch(value) {
    case 0: return sigtypeUnknown;
    case 1: return sigtypeNonVisible;
    case 2: return sigtypeSignatureLine;
    case 3: return sigtypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SignatureType.class);
    }
  }
}
