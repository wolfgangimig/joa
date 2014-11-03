/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatEnumeration.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatEnumeration {
  olFormatEnumBitmap(1),
  olFormatEnumText(2);

  public final int value;
  private OlFormatEnumeration(int value) { this.value = value; }
  public static  OlFormatEnumeration valueOf(int value) {
    switch(value) {
    case 1: return olFormatEnumBitmap;
    case 2: return olFormatEnumText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatEnumeration.class);
    }
  }
}
