/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * InstantMessageContentType.
 * Enumerates the InstantMessage content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum InstantMessageContentType {
  ucInstantMessageContentPlainText(0),
  ucInstantMessageContentHtml(1),
  ucInstantMessageContentRichText(2),
  ucInstantMessageContentGif(3),
  ucInstantMessageContentInk(4),
  ucInstantMessageContentUnknown(5);

  public final int value;
  private InstantMessageContentType(int value) { this.value = value; }
  public static  InstantMessageContentType valueOf(int value) {
    switch(value) {
    case 0: return ucInstantMessageContentPlainText;
    case 1: return ucInstantMessageContentHtml;
    case 2: return ucInstantMessageContentRichText;
    case 3: return ucInstantMessageContentGif;
    case 4: return ucInstantMessageContentInk;
    case 5: return ucInstantMessageContentUnknown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + InstantMessageContentType.class);
    }
  }
}
