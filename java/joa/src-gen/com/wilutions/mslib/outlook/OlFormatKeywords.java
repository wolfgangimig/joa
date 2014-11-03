/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatKeywords.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatKeywords {
  olFormatKeywordsText(1);

  public final int value;
  private OlFormatKeywords(int value) { this.value = value; }
  public static  OlFormatKeywords valueOf(int value) {
    switch(value) {
    case 1: return olFormatKeywordsText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatKeywords.class);
    }
  }
}
