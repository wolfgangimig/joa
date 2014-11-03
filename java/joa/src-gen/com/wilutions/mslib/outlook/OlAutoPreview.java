/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAutoPreview.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAutoPreview {
  olAutoPreviewAll(0),
  olAutoPreviewUnread(1),
  olAutoPreviewNone(2);

  public final int value;
  private OlAutoPreview(int value) { this.value = value; }
  public static  OlAutoPreview valueOf(int value) {
    switch(value) {
    case 0: return olAutoPreviewAll;
    case 1: return olAutoPreviewUnread;
    case 2: return olAutoPreviewNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAutoPreview.class);
    }
  }
}
