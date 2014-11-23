/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0029_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0029_0001 {
  ucPresenceCapabilityInstantMessaging(0),
  ucPresenceCapabilityAudio(1),
  ucPresenceCapabilityVideo(2),
  ucPresenceCapabilityAppShare(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0029_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0029_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceCapabilityInstantMessaging;
    case 1: return ucPresenceCapabilityAudio;
    case 2: return ucPresenceCapabilityVideo;
    case 3: return ucPresenceCapabilityAppShare;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0029_0001.class);
    }
  }
}
