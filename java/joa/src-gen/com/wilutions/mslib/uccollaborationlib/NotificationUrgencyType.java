/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * NotificationUrgencyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum NotificationUrgencyType {
  ucNotificationUrgencyLow(20),
  ucNotificationUrgencyNeutral(50),
  ucNotificationUrgencyHigh(80);

  public final int value;
  private NotificationUrgencyType(int value) { this.value = value; }
  public static  NotificationUrgencyType valueOf(int value) {
    switch(value) {
    case 20: return ucNotificationUrgencyLow;
    case 50: return ucNotificationUrgencyNeutral;
    case 80: return ucNotificationUrgencyHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + NotificationUrgencyType.class);
    }
  }
}
