/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0223_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0223_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0223_0002 ucVideoViewModeGallery = new __MIDL___MIDL_itf_uc_0001_0223_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0002 uiaVideoViewModeActiveSpeakerOnly = new __MIDL___MIDL_itf_uc_0001_0223_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0002 uiaVideoViewModeContentOnly = new __MIDL___MIDL_itf_uc_0001_0223_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0223_0002 uiaVideoViewModeCompact = new __MIDL___MIDL_itf_uc_0001_0223_0002(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucVideoViewModeGallery = 0;
  public final static int _uiaVideoViewModeActiveSpeakerOnly = 1;
  public final static int _uiaVideoViewModeContentOnly = 2;
  public final static int _uiaVideoViewModeCompact = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0223_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0223_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucVideoViewModeGallery;
    case 1: return uiaVideoViewModeActiveSpeakerOnly;
    case 2: return uiaVideoViewModeContentOnly;
    case 3: return uiaVideoViewModeCompact;
    default: return new __MIDL___MIDL_itf_uc_0001_0223_0002(value);
    }
  }
}
