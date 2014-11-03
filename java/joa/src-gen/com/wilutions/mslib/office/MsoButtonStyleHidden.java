/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonStyleHidden.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoButtonStyleHidden {
  msoButtonWrapText(4),
  msoButtonTextBelow(8);

  public final int value;
  private MsoButtonStyleHidden(int value) { this.value = value; }
  public static  MsoButtonStyleHidden valueOf(int value) {
    switch(value) {
    case 4: return msoButtonWrapText;
    case 8: return msoButtonTextBelow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoButtonStyleHidden.class);
    }
  }
}
