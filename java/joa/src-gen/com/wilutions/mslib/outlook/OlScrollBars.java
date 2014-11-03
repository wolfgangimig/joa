/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlScrollBars.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{D1788312-EDEE-4673-AE33-B3C3BC0753EA}")
public enum OlScrollBars {
  olScrollBarsNone(0),
  olScrollBarsHorizontal(1),
  olScrollBarsVertical(2),
  olScrollBarsBoth(3);

  public final int value;
  private OlScrollBars(int value) { this.value = value; }
  public static  OlScrollBars valueOf(int value) {
    switch(value) {
    case 0: return olScrollBarsNone;
    case 1: return olScrollBarsHorizontal;
    case 2: return olScrollBarsVertical;
    case 3: return olScrollBarsBoth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlScrollBars.class);
    }
  }
}
