/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoViewInformationType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum VideoViewInformationType {
  uiaVideoViewIsDocked(269549568),
  uiaVideoViewIsFullScreen(269549569),
  uiaVideoViewHasPano(269549570),
  uiaVideoViewHasGallery(269549571),
  uiaVideoViewHasSelfVideo(269549572),
  uiaVideoViewIsExtended(269549573),
  uiaVideoViewMode(806420486),
  uiaVideoViewMultipleVideoEnabled(269549575);

  public final int value;
  private VideoViewInformationType(int value) { this.value = value; }
  public static  VideoViewInformationType valueOf(int value) {
    switch(value) {
    case 269549568: return uiaVideoViewIsDocked;
    case 269549569: return uiaVideoViewIsFullScreen;
    case 269549570: return uiaVideoViewHasPano;
    case 269549571: return uiaVideoViewHasGallery;
    case 269549572: return uiaVideoViewHasSelfVideo;
    case 269549573: return uiaVideoViewIsExtended;
    case 806420486: return uiaVideoViewMode;
    case 269549575: return uiaVideoViewMultipleVideoEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + VideoViewInformationType.class);
    }
  }
}
