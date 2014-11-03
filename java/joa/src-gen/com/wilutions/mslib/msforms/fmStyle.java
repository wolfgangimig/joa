/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9C37F9D0-FDE5-11CE-9560-00AA004B9DFA}")
public enum fmStyle {
  fmStyleDropDownCombo(0),
  fmStyleDropDownList(2);

  public final int value;
  private fmStyle(int value) { this.value = value; }
  public static  fmStyle valueOf(int value) {
    switch(value) {
    case 0: return fmStyleDropDownCombo;
    case 2: return fmStyleDropDownList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmStyle.class);
    }
  }
}
