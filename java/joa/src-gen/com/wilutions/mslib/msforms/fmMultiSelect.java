/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMultiSelect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C0-B17B-11CE-A95D-00AA006CB389}")
public enum fmMultiSelect {
  fmMultiSelectSingle(0),
  fmMultiSelectMulti(1),
  fmMultiSelectExtended(2);

  public final int value;
  private fmMultiSelect(int value) { this.value = value; }
  public static  fmMultiSelect valueOf(int value) {
    switch(value) {
    case 0: return fmMultiSelectSingle;
    case 1: return fmMultiSelectMulti;
    case 2: return fmMultiSelectExtended;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmMultiSelect.class);
    }
  }
}
