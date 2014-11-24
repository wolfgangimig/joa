/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class VideoViewMode {

  // Typed constants
  public final static VideoViewMode ucVideoViewModeGallery = new VideoViewMode(0);
  public final static VideoViewMode uiaVideoViewModeActiveSpeakerOnly = new VideoViewMode(1);
  public final static VideoViewMode uiaVideoViewModeContentOnly = new VideoViewMode(2);
  public final static VideoViewMode uiaVideoViewModeCompact = new VideoViewMode(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucVideoViewModeGallery = 0;
  public final static int _uiaVideoViewModeActiveSpeakerOnly = 1;
  public final static int _uiaVideoViewModeContentOnly = 2;
  public final static int _uiaVideoViewModeCompact = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private VideoViewMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  VideoViewMode valueOf(int value) {
    switch(value) {
    case 0: return ucVideoViewModeGallery;
    case 1: return uiaVideoViewModeActiveSpeakerOnly;
    case 2: return uiaVideoViewModeContentOnly;
    case 3: return uiaVideoViewModeCompact;
    default: return new VideoViewMode(value);
    }
  }
}
