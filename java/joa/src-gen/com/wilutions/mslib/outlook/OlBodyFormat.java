/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBodyFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlBodyFormat {
  olFormatUnspecified(0),
  olFormatPlain(1),
  olFormatHTML(2),
  olFormatRichText(3);

  public final int value;
  private OlBodyFormat(int value) { this.value = value; }
  public static  OlBodyFormat valueOf(int value) {
    switch(value) {
    case 0: return olFormatUnspecified;
    case 1: return olFormatPlain;
    case 2: return olFormatHTML;
    case 3: return olFormatRichText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlBodyFormat.class);
    }
  }
}
