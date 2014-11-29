/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * NotificationUrgencyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class NotificationUrgencyType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static NotificationUrgencyType ucNotificationUrgencyLow = new NotificationUrgencyType(20);
  public final static NotificationUrgencyType ucNotificationUrgencyNeutral = new NotificationUrgencyType(50);
  public final static NotificationUrgencyType ucNotificationUrgencyHigh = new NotificationUrgencyType(80);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotificationUrgencyLow = 20;
  public final static int _ucNotificationUrgencyNeutral = 50;
  public final static int _ucNotificationUrgencyHigh = 80;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private NotificationUrgencyType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  NotificationUrgencyType valueOf(int value) {
    switch(value) {
    case 20: return ucNotificationUrgencyLow;
    case 50: return ucNotificationUrgencyNeutral;
    case 80: return ucNotificationUrgencyHigh;
    default: return new NotificationUrgencyType(value);
    }
  }
}
