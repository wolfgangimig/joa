/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBorderStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0B17239E-C724-444B-ACB1-579893197A3C}")
public enum OlBorderStyle {
  olBorderStyleNone(0),
  olBorderStyleSingle(1);

  public final int value;
  private OlBorderStyle(int value) { this.value = value; }
  public static  OlBorderStyle valueOf(int value) {
    switch(value) {
    case 0: return olBorderStyleNone;
    case 1: return olBorderStyleSingle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlBorderStyle.class);
    }
  }
}
