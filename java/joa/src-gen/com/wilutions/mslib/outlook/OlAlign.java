/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAlign {
  olAlignLeft(0),
  olAlignCenter(1),
  olAlignRight(2);

  public final int value;
  private OlAlign(int value) { this.value = value; }
  public static  OlAlign valueOf(int value) {
    switch(value) {
    case 0: return olAlignLeft;
    case 1: return olAlignCenter;
    case 2: return olAlignRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAlign.class);
    }
  }
}
