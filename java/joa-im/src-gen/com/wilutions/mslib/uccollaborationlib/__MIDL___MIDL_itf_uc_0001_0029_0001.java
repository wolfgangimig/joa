/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0029_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0029_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0029_0001 ucPresenceCapabilityInstantMessaging = new __MIDL___MIDL_itf_uc_0001_0029_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0029_0001 ucPresenceCapabilityAudio = new __MIDL___MIDL_itf_uc_0001_0029_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0029_0001 ucPresenceCapabilityVideo = new __MIDL___MIDL_itf_uc_0001_0029_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0029_0001 ucPresenceCapabilityAppShare = new __MIDL___MIDL_itf_uc_0001_0029_0001(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucPresenceCapabilityInstantMessaging = 0;
  public final static int _ucPresenceCapabilityAudio = 1;
  public final static int _ucPresenceCapabilityVideo = 2;
  public final static int _ucPresenceCapabilityAppShare = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0029_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0029_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceCapabilityInstantMessaging;
    case 1: return ucPresenceCapabilityAudio;
    case 2: return ucPresenceCapabilityVideo;
    case 3: return ucPresenceCapabilityAppShare;
    default: return new __MIDL___MIDL_itf_uc_0001_0029_0001(value);
    }
  }
}
