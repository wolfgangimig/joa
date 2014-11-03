/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAttachmentType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAttachmentType {
  olByValue(1),
  olByReference(4),
  olEmbeddeditem(5),
  olOLE(6);

  public final int value;
  private OlAttachmentType(int value) { this.value = value; }
  public static  OlAttachmentType valueOf(int value) {
    switch(value) {
    case 1: return olByValue;
    case 4: return olByReference;
    case 5: return olEmbeddeditem;
    case 6: return olOLE;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAttachmentType.class);
    }
  }
}
