/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PresenceCapabilityType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PresenceCapabilityType {

  // Typed constants
  public final static PresenceCapabilityType ucPresenceCapabilityInstantMessaging = new PresenceCapabilityType(0);
  public final static PresenceCapabilityType ucPresenceCapabilityAudio = new PresenceCapabilityType(1);
  public final static PresenceCapabilityType ucPresenceCapabilityVideo = new PresenceCapabilityType(2);
  public final static PresenceCapabilityType ucPresenceCapabilityAppShare = new PresenceCapabilityType(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucPresenceCapabilityInstantMessaging = 0;
  public final static int _ucPresenceCapabilityAudio = 1;
  public final static int _ucPresenceCapabilityVideo = 2;
  public final static int _ucPresenceCapabilityAppShare = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PresenceCapabilityType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PresenceCapabilityType valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceCapabilityInstantMessaging;
    case 1: return ucPresenceCapabilityAudio;
    case 2: return ucPresenceCapabilityVideo;
    case 3: return ucPresenceCapabilityAppShare;
    default: return new PresenceCapabilityType(value);
    }
  }
}
