/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoModeType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoModeType {
  msoModeModal(0),
  msoModeAutoDown(1),
  msoModeModeless(2);

  public final int value;
  private MsoModeType(int value) { this.value = value; }
  public static  MsoModeType valueOf(int value) {
    switch(value) {
    case 0: return msoModeModal;
    case 1: return msoModeAutoDown;
    case 2: return msoModeModeless;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoModeType.class);
    }
  }
}
