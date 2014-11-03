/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBackStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{AA3E840F-7079-4AA4-91A9-6F3546DA6A95}")
public enum OlBackStyle {
  olBackStyleTransparent(0),
  olBackStyleOpaque(1);

  public final int value;
  private OlBackStyle(int value) { this.value = value; }
  public static  OlBackStyle valueOf(int value) {
    switch(value) {
    case 0: return olBackStyleTransparent;
    case 1: return olBackStyleOpaque;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlBackStyle.class);
    }
  }
}
