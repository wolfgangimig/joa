/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0223_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0223_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewIsDocked = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549568);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewIsFullScreen = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549569);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewHasPano = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549570);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewHasGallery = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549571);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewHasSelfVideo = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549572);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewIsExtended = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549573);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewMode = new __MIDL___MIDL_itf_uc_0001_0223_0001(806420486);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0001 uiaVideoViewMultipleVideoEnabled = new __MIDL___MIDL_itf_uc_0001_0223_0001(269549575);

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
  private __MIDL___MIDL_itf_uc_0001_0223_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0223_0001 valueOf(int value) {
    switch(value) {
    case 269549568: return uiaVideoViewIsDocked;
    case 269549569: return uiaVideoViewIsFullScreen;
    case 269549570: return uiaVideoViewHasPano;
    case 269549571: return uiaVideoViewHasGallery;
    case 269549572: return uiaVideoViewHasSelfVideo;
    case 269549573: return uiaVideoViewIsExtended;
    case 806420486: return uiaVideoViewMode;
    case 269549575: return uiaVideoViewMultipleVideoEnabled;
    default: return new __MIDL___MIDL_itf_uc_0001_0223_0001(value);
    }
  }
}
