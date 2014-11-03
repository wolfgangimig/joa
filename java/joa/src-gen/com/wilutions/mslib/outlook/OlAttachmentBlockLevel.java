/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAttachmentBlockLevel.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAttachmentBlockLevel {
  olAttachmentBlockLevelNone(0),
  olAttachmentBlockLevelOpen(1);

  public final int value;
  private OlAttachmentBlockLevel(int value) { this.value = value; }
  public static  OlAttachmentBlockLevel valueOf(int value) {
    switch(value) {
    case 0: return olAttachmentBlockLevelNone;
    case 1: return olAttachmentBlockLevelOpen;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAttachmentBlockLevel.class);
    }
  }
}
