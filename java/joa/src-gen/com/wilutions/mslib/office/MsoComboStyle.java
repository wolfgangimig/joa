/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoComboStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoComboStyle {

  // Typed constants
  public final static MsoComboStyle msoComboNormal = new MsoComboStyle(0);
  public final static MsoComboStyle msoComboLabel = new MsoComboStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoComboNormal = 0;
  public final static int _msoComboLabel = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoComboStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoComboStyle valueOf(int value) {
    switch(value) {
    case 0: return msoComboNormal;
    case 1: return msoComboLabel;
    default: return new MsoComboStyle(value);
    }
  }
}
