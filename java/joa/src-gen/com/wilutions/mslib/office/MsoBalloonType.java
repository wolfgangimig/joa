/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBalloonType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBalloonType {
  msoBalloonTypeButtons(0),
  msoBalloonTypeBullets(1),
  msoBalloonTypeNumbers(2);

  public final int value;
  private MsoBalloonType(int value) { this.value = value; }
  public static  MsoBalloonType valueOf(int value) {
    switch(value) {
    case 0: return msoBalloonTypeButtons;
    case 1: return msoBalloonTypeBullets;
    case 2: return msoBalloonTypeNumbers;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBalloonType.class);
    }
  }
}
