/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmBorders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E1FC1640-70DF-101B-BC16-00AA003E3B29}")
public enum fmBorders {
  fmBordersNone(0),
  fmBordersBox(1),
  fmBordersLeft(2),
  fmBordersTop(3);

  public final int value;
  private fmBorders(int value) { this.value = value; }
  public static  fmBorders valueOf(int value) {
    switch(value) {
    case 0: return fmBordersNone;
    case 1: return fmBordersBox;
    case 2: return fmBordersLeft;
    case 3: return fmBordersTop;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmBorders.class);
    }
  }
}
