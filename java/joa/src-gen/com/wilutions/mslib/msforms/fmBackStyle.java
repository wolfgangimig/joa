/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBackStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{1AFB3130-C129-11CD-A777-00DD01143C57}")
public enum fmBackStyle {
  fmBackStyleTransparent(0),
  fmBackStyleOpaque(1);

  public final int value;
  private fmBackStyle(int value) { this.value = value; }
  public static  fmBackStyle valueOf(int value) {
    switch(value) {
    case 0: return fmBackStyleTransparent;
    case 1: return fmBackStyleOpaque;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmBackStyle.class);
    }
  }
}
