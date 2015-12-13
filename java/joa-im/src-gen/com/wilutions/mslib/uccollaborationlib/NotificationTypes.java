/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * NotificationTypes.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class NotificationTypes {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static NotificationTypes ucNotificationTypeUnknown = new NotificationTypes(0);
  public final static NotificationTypes ucNotificationTypeAudio = new NotificationTypes(1);
  public final static NotificationTypes ucNotificationTypeVideo = new NotificationTypes(2);
  public final static NotificationTypes ucNotificationTypeInstantMessage = new NotificationTypes(4);
  public final static NotificationTypes ucNotificationTypeSharing = new NotificationTypes(8);
  public final static NotificationTypes ucNotificationTypeFileTransfer = new NotificationTypes(16);
  public final static NotificationTypes ucNotificationTypeAll = new NotificationTypes(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotificationTypeUnknown = 0;
  public final static int _ucNotificationTypeAudio = 1;
  public final static int _ucNotificationTypeVideo = 2;
  public final static int _ucNotificationTypeInstantMessage = 4;
  public final static int _ucNotificationTypeSharing = 8;
  public final static int _ucNotificationTypeFileTransfer = 16;
  public final static int _ucNotificationTypeAll = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private NotificationTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  NotificationTypes valueOf(int value) {
    switch(value) {
    case 0: return ucNotificationTypeUnknown;
    case 1: return ucNotificationTypeAudio;
    case 2: return ucNotificationTypeVideo;
    case 4: return ucNotificationTypeInstantMessage;
    case 8: return ucNotificationTypeSharing;
    case 16: return ucNotificationTypeFileTransfer;
    case -1: return ucNotificationTypeAll;
    default: return new NotificationTypes(value);
    }
  }
}
