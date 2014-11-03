/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoComboStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoComboStyle {
  msoComboNormal(0),
  msoComboLabel(1);

  public final int value;
  private MsoComboStyle(int value) { this.value = value; }
  public static  MsoComboStyle valueOf(int value) {
    switch(value) {
    case 0: return msoComboNormal;
    case 1: return msoComboLabel;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoComboStyle.class);
    }
  }
}
