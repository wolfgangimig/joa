/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0223_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0223_0002 {
  ucVideoViewModeGallery(0),
  uiaVideoViewModeActiveSpeakerOnly(1),
  uiaVideoViewModeContentOnly(2),
  uiaVideoViewModeCompact(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0223_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0223_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucVideoViewModeGallery;
    case 1: return uiaVideoViewModeActiveSpeakerOnly;
    case 2: return uiaVideoViewModeContentOnly;
    case 3: return uiaVideoViewModeCompact;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0223_0002.class);
    }
  }
}
