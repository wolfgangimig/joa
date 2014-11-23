/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentType.
 * Enumerates supported content types 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ShareableContentType {
  ucShareableContentTypeUnsupported(0),
  ucShareableContentTypePowerPoint(1),
  ucShareableContentTypeWhiteboard(2),
  ucShareableContentTypeNativeFile(3),
  ucShareableContentTypePoll(4),
  ucShareableContentTypeSharedNotes(5);

  public final int value;
  private ShareableContentType(int value) { this.value = value; }
  public static  ShareableContentType valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentTypeUnsupported;
    case 1: return ucShareableContentTypePowerPoint;
    case 2: return ucShareableContentTypeWhiteboard;
    case 3: return ucShareableContentTypeNativeFile;
    case 4: return ucShareableContentTypePoll;
    case 5: return ucShareableContentTypeSharedNotes;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ShareableContentType.class);
    }
  }
}
