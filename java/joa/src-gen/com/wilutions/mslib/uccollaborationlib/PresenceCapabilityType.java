/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PresenceCapabilityType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PresenceCapabilityType {
  ucPresenceCapabilityInstantMessaging(0),
  ucPresenceCapabilityAudio(1),
  ucPresenceCapabilityVideo(2),
  ucPresenceCapabilityAppShare(3);

  public final int value;
  private PresenceCapabilityType(int value) { this.value = value; }
  public static  PresenceCapabilityType valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceCapabilityInstantMessaging;
    case 1: return ucPresenceCapabilityAudio;
    case 2: return ucPresenceCapabilityVideo;
    case 3: return ucPresenceCapabilityAppShare;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PresenceCapabilityType.class);
    }
  }
}
