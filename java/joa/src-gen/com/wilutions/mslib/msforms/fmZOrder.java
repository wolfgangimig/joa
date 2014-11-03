/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmZOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14C73C30-1612-11CE-9E98-00AA00574A4F}")
public enum fmZOrder {
  fmZOrderFront(0),
  fmZOrderBack(1);

  public final int value;
  private fmZOrder(int value) { this.value = value; }
  public static  fmZOrder valueOf(int value) {
    switch(value) {
    case 0: return fmZOrderFront;
    case 1: return fmZOrderBack;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmZOrder.class);
    }
  }
}
