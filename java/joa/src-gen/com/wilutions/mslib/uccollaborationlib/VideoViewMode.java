/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum VideoViewMode {
  ucVideoViewModeGallery(0),
  uiaVideoViewModeActiveSpeakerOnly(1),
  uiaVideoViewModeContentOnly(2),
  uiaVideoViewModeCompact(3);

  public final int value;
  private VideoViewMode(int value) { this.value = value; }
  public static  VideoViewMode valueOf(int value) {
    switch(value) {
    case 0: return ucVideoViewModeGallery;
    case 1: return uiaVideoViewModeActiveSpeakerOnly;
    case 2: return uiaVideoViewModeContentOnly;
    case 3: return uiaVideoViewModeCompact;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + VideoViewMode.class);
    }
  }
}
