/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTextAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{03FADFE8-2527-46C3-9CCD-DBBBCD05156B}")
public enum OlTextAlign {
  olTextAlignLeft(1),
  olTextAlignCenter(2),
  olTextAlignRight(3);

  public final int value;
  private OlTextAlign(int value) { this.value = value; }
  public static  OlTextAlign valueOf(int value) {
    switch(value) {
    case 1: return olTextAlignLeft;
    case 2: return olTextAlignCenter;
    case 3: return olTextAlignRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTextAlign.class);
    }
  }
}
