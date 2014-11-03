/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTableContents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTableContents {
  olUserItems(0),
  olHiddenItems(1);

  public final int value;
  private OlTableContents(int value) { this.value = value; }
  public static  OlTableContents valueOf(int value) {
    switch(value) {
    case 0: return olUserItems;
    case 1: return olHiddenItems;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTableContents.class);
    }
  }
}
