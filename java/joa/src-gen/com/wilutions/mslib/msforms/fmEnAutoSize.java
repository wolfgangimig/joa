/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmEnAutoSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C3689F20-C231-11CE-A30C-00AA004A3D3D}")
public enum fmEnAutoSize {
  _fmEnAutoSizeNone(0),
  _fmEnAutoSizeHorizontal(1),
  _fmEnAutoSizeVertical(2),
  _fmEnAutoSizeBoth(3);

  public final int value;
  private fmEnAutoSize(int value) { this.value = value; }
  public static  fmEnAutoSize valueOf(int value) {
    switch(value) {
    case 0: return _fmEnAutoSizeNone;
    case 1: return _fmEnAutoSizeHorizontal;
    case 2: return _fmEnAutoSizeVertical;
    case 3: return _fmEnAutoSizeBoth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmEnAutoSize.class);
    }
  }
}
