/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlComboBoxStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{382F8459-84AD-4CEB-8705-A8F8E2DC15E1}")
public enum OlComboBoxStyle {
  olComboBoxStyleCombo(0),
  olComboBoxStyleList(2);

  public final int value;
  private OlComboBoxStyle(int value) { this.value = value; }
  public static  OlComboBoxStyle valueOf(int value) {
    switch(value) {
    case 0: return olComboBoxStyleCombo;
    case 2: return olComboBoxStyleList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlComboBoxStyle.class);
    }
  }
}
