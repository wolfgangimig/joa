/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmListBoxStyles.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C2-B17B-11CE-A95D-00AA006CB389}")
public enum fmListBoxStyles {
  _fmListBoxStylesNone(0),
  _fmListBoxStylesListBox(1),
  _fmListBoxStylesComboBox(2);

  public final int value;
  private fmListBoxStyles(int value) { this.value = value; }
  public static  fmListBoxStyles valueOf(int value) {
    switch(value) {
    case 0: return _fmListBoxStylesNone;
    case 1: return _fmListBoxStylesListBox;
    case 2: return _fmListBoxStylesComboBox;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmListBoxStyles.class);
    }
  }
}
