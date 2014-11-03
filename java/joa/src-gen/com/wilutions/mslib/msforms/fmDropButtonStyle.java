/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDropButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14D122B0-C6E7-11CE-827C-00AA004BA6AE}")
public enum fmDropButtonStyle {
  fmDropButtonStylePlain(0),
  fmDropButtonStyleArrow(1),
  fmDropButtonStyleEllipsis(2),
  fmDropButtonStyleReduce(3);

  public final int value;
  private fmDropButtonStyle(int value) { this.value = value; }
  public static  fmDropButtonStyle valueOf(int value) {
    switch(value) {
    case 0: return fmDropButtonStylePlain;
    case 1: return fmDropButtonStyleArrow;
    case 2: return fmDropButtonStyleEllipsis;
    case 3: return fmDropButtonStyleReduce;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmDropButtonStyle.class);
    }
  }
}
