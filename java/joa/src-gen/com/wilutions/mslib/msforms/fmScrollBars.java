/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmScrollBars.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5931055E-16BA-101B-989C-00006B82871A}")
public enum fmScrollBars {
  fmScrollBarsNone(0),
  fmScrollBarsHorizontal(1),
  fmScrollBarsVertical(2),
  fmScrollBarsBoth(3);

  public final int value;
  private fmScrollBars(int value) { this.value = value; }
  public static  fmScrollBars valueOf(int value) {
    switch(value) {
    case 0: return fmScrollBarsNone;
    case 1: return fmScrollBarsHorizontal;
    case 2: return fmScrollBarsVertical;
    case 3: return fmScrollBarsBoth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmScrollBars.class);
    }
  }
}
