/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmRepeatDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C3689F20-C231-11CE-A30C-00AA004A3D3C}")
public enum fmRepeatDirection {
  _fmRepeatDirectionHorizontal(0),
  _fmRepeatDirectionVertical(1);

  public final int value;
  private fmRepeatDirection(int value) { this.value = value; }
  public static  fmRepeatDirection valueOf(int value) {
    switch(value) {
    case 0: return _fmRepeatDirectionHorizontal;
    case 1: return _fmRepeatDirectionVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmRepeatDirection.class);
    }
  }
}
