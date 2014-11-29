/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAutoPreview.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAutoPreview {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAutoPreview olAutoPreviewAll = new OlAutoPreview(0);
  public final static OlAutoPreview olAutoPreviewUnread = new OlAutoPreview(1);
  public final static OlAutoPreview olAutoPreviewNone = new OlAutoPreview(2);

  // Integer constants for bitsets and switch statements
  public final static int _olAutoPreviewAll = 0;
  public final static int _olAutoPreviewUnread = 1;
  public final static int _olAutoPreviewNone = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAutoPreview(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAutoPreview valueOf(int value) {
    switch(value) {
    case 0: return olAutoPreviewAll;
    case 1: return olAutoPreviewUnread;
    case 2: return olAutoPreviewNone;
    default: return new OlAutoPreview(value);
    }
  }
}
