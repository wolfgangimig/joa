/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDisplayStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{A4069F25-4221-11CE-8EA0-00AA004BA6AE}")
public enum fmDisplayStyle {
  fmDisplayStyleText(1),
  fmDisplayStyleList(2),
  fmDisplayStyleCombo(3),
  fmDisplayStyleCheckBox(4),
  fmDisplayStyleOptionButton(5),
  fmDisplayStyleToggle(6),
  fmDisplayStyleDropList(7);

  public final int value;
  private fmDisplayStyle(int value) { this.value = value; }
  public static  fmDisplayStyle valueOf(int value) {
    switch(value) {
    case 1: return fmDisplayStyleText;
    case 2: return fmDisplayStyleList;
    case 3: return fmDisplayStyleCombo;
    case 4: return fmDisplayStyleCheckBox;
    case 5: return fmDisplayStyleOptionButton;
    case 6: return fmDisplayStyleToggle;
    case 7: return fmDisplayStyleDropList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmDisplayStyle.class);
    }
  }
}
