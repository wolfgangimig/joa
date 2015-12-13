/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * VideoViewInformationType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class VideoViewInformationType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static VideoViewInformationType uiaVideoViewIsDocked = new VideoViewInformationType(269549568);
  public final static VideoViewInformationType uiaVideoViewIsFullScreen = new VideoViewInformationType(269549569);
  public final static VideoViewInformationType uiaVideoViewHasPano = new VideoViewInformationType(269549570);
  public final static VideoViewInformationType uiaVideoViewHasGallery = new VideoViewInformationType(269549571);
  public final static VideoViewInformationType uiaVideoViewHasSelfVideo = new VideoViewInformationType(269549572);
  public final static VideoViewInformationType uiaVideoViewIsExtended = new VideoViewInformationType(269549573);
  public final static VideoViewInformationType uiaVideoViewMode = new VideoViewInformationType(806420486);
  public final static VideoViewInformationType uiaVideoViewMultipleVideoEnabled = new VideoViewInformationType(269549575);

  // Integer constants for bitsets and switch statements
  public final static int _uiaVideoViewIsDocked = 269549568;
  public final static int _uiaVideoViewIsFullScreen = 269549569;
  public final static int _uiaVideoViewHasPano = 269549570;
  public final static int _uiaVideoViewHasGallery = 269549571;
  public final static int _uiaVideoViewHasSelfVideo = 269549572;
  public final static int _uiaVideoViewIsExtended = 269549573;
  public final static int _uiaVideoViewMode = 806420486;
  public final static int _uiaVideoViewMultipleVideoEnabled = 269549575;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private VideoViewInformationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new VideoViewInformationType(value);
    }
  }
}
