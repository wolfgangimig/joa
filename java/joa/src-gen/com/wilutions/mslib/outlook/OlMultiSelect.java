/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMultiSelect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5A0FB768-AAF4-4E8C-9C57-89ACA8B6249F}")
public enum OlMultiSelect {
  olMultiSelectSingle(0),
  olMultiSelectMulti(1),
  olMultiSelectExtended(2);

  public final int value;
  private OlMultiSelect(int value) { this.value = value; }
  public static  OlMultiSelect valueOf(int value) {
    switch(value) {
    case 0: return olMultiSelectSingle;
    case 1: return olMultiSelectMulti;
    case 2: return olMultiSelectExtended;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMultiSelect.class);
    }
  }
}
