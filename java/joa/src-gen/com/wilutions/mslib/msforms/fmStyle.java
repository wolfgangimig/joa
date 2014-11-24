/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9C37F9D0-FDE5-11CE-9560-00AA004B9DFA}")
public class fmStyle {

  // Typed constants
  public final static fmStyle fmStyleDropDownCombo = new fmStyle(0);
  public final static fmStyle fmStyleDropDownList = new fmStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmStyleDropDownCombo = 0;
  public final static int _fmStyleDropDownList = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmStyle valueOf(int value) {
    switch(value) {
    case 0: return fmStyleDropDownCombo;
    case 2: return fmStyleDropDownList;
    default: return new fmStyle(value);
    }
  }
}
