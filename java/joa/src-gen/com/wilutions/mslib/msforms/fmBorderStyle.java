/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBorderStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5931055C-16BA-101B-989C-00006B82871A}")
public enum fmBorderStyle {
  fmBorderStyleNone(0),
  fmBorderStyleSingle(1);

  public final int value;
  private fmBorderStyle(int value) { this.value = value; }
  public static  fmBorderStyle valueOf(int value) {
    switch(value) {
    case 0: return fmBorderStyleNone;
    case 1: return fmBorderStyleSingle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmBorderStyle.class);
    }
  }
}
