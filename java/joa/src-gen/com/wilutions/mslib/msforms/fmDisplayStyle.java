/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDisplayStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A4069F25-4221-11CE-8EA0-00AA004BA6AE}")
public class fmDisplayStyle {

  // Typed constants
  public final static fmDisplayStyle fmDisplayStyleText = new fmDisplayStyle(1);
  public final static fmDisplayStyle fmDisplayStyleList = new fmDisplayStyle(2);
  public final static fmDisplayStyle fmDisplayStyleCombo = new fmDisplayStyle(3);
  public final static fmDisplayStyle fmDisplayStyleCheckBox = new fmDisplayStyle(4);
  public final static fmDisplayStyle fmDisplayStyleOptionButton = new fmDisplayStyle(5);
  public final static fmDisplayStyle fmDisplayStyleToggle = new fmDisplayStyle(6);
  public final static fmDisplayStyle fmDisplayStyleDropList = new fmDisplayStyle(7);

  // Integer constants for bitsets and switch statements
  public final static int _fmDisplayStyleText = 1;
  public final static int _fmDisplayStyleList = 2;
  public final static int _fmDisplayStyleCombo = 3;
  public final static int _fmDisplayStyleCheckBox = 4;
  public final static int _fmDisplayStyleOptionButton = 5;
  public final static int _fmDisplayStyleToggle = 6;
  public final static int _fmDisplayStyleDropList = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmDisplayStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmDisplayStyle valueOf(int value) {
    switch(value) {
    case 1: return fmDisplayStyleText;
    case 2: return fmDisplayStyleList;
    case 3: return fmDisplayStyleCombo;
    case 4: return fmDisplayStyleCheckBox;
    case 5: return fmDisplayStyleOptionButton;
    case 6: return fmDisplayStyleToggle;
    case 7: return fmDisplayStyleDropList;
    default: return new fmDisplayStyle(value);
    }
  }
}
