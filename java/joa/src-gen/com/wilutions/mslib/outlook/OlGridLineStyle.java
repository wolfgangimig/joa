/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGridLineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlGridLineStyle {
  olGridLineNone(0),
  olGridLineSmallDots(1),
  olGridLineLargeDots(2),
  olGridLineDashes(3),
  olGridLineSolid(4);

  public final int value;
  private OlGridLineStyle(int value) { this.value = value; }
  public static  OlGridLineStyle valueOf(int value) {
    switch(value) {
    case 0: return olGridLineNone;
    case 1: return olGridLineSmallDots;
    case 2: return olGridLineLargeDots;
    case 3: return olGridLineDashes;
    case 4: return olGridLineSolid;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlGridLineStyle.class);
    }
  }
}
