/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentType.
 * Enumerates supported content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ShareableContentType {

  // Typed constants
  public final static ShareableContentType ucShareableContentTypeUnsupported = new ShareableContentType(0);
  public final static ShareableContentType ucShareableContentTypePowerPoint = new ShareableContentType(1);
  public final static ShareableContentType ucShareableContentTypeWhiteboard = new ShareableContentType(2);
  public final static ShareableContentType ucShareableContentTypeNativeFile = new ShareableContentType(3);
  public final static ShareableContentType ucShareableContentTypePoll = new ShareableContentType(4);
  public final static ShareableContentType ucShareableContentTypeSharedNotes = new ShareableContentType(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentTypeUnsupported = 0;
  public final static int _ucShareableContentTypePowerPoint = 1;
  public final static int _ucShareableContentTypeWhiteboard = 2;
  public final static int _ucShareableContentTypeNativeFile = 3;
  public final static int _ucShareableContentTypePoll = 4;
  public final static int _ucShareableContentTypeSharedNotes = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ShareableContentType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ShareableContentType valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentTypeUnsupported;
    case 1: return ucShareableContentTypePowerPoint;
    case 2: return ucShareableContentTypeWhiteboard;
    case 3: return ucShareableContentTypeNativeFile;
    case 4: return ucShareableContentTypePoll;
    case 5: return ucShareableContentTypeSharedNotes;
    default: return new ShareableContentType(value);
    }
  }
}
