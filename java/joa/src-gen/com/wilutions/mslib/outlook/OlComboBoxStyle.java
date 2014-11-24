/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlComboBoxStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{382F8459-84AD-4CEB-8705-A8F8E2DC15E1}")
public class OlComboBoxStyle {

  // Typed constants
  public final static OlComboBoxStyle olComboBoxStyleCombo = new OlComboBoxStyle(0);
  public final static OlComboBoxStyle olComboBoxStyleList = new OlComboBoxStyle(2);

  // Integer constants for bitsets and switch statements
  public final static int _olComboBoxStyleCombo = 0;
  public final static int _olComboBoxStyleList = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlComboBoxStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlComboBoxStyle valueOf(int value) {
    switch(value) {
    case 0: return olComboBoxStyleCombo;
    case 2: return olComboBoxStyleList;
    default: return new OlComboBoxStyle(value);
    }
  }
}
