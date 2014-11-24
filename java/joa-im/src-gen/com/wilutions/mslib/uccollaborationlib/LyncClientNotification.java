/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LyncClientNotification.
 * Enumerates the UC Client notification type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class LyncClientNotification {

  // Typed constants
  public final static LyncClientNotification ucClientNotificationMapiStatus = new LyncClientNotification(0);
  public final static LyncClientNotification ucClientNotificationAutodiscovery = new LyncClientNotification(1);
  public final static LyncClientNotification ucClientNotificationCalendarQueryStatus = new LyncClientNotification(2);
  public final static LyncClientNotification ucClientNotificationOutlookContactProviderStatus = new LyncClientNotification(3);
  public final static LyncClientNotification ucClientNotificationWabContactProviderStatus = new LyncClientNotification(4);
  public final static LyncClientNotification ucClientNotificationFolderManagerStatus = new LyncClientNotification(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucClientNotificationMapiStatus = 0;
  public final static int _ucClientNotificationAutodiscovery = 1;
  public final static int _ucClientNotificationCalendarQueryStatus = 2;
  public final static int _ucClientNotificationOutlookContactProviderStatus = 3;
  public final static int _ucClientNotificationWabContactProviderStatus = 4;
  public final static int _ucClientNotificationFolderManagerStatus = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private LyncClientNotification(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  LyncClientNotification valueOf(int value) {
    switch(value) {
    case 0: return ucClientNotificationMapiStatus;
    case 1: return ucClientNotificationAutodiscovery;
    case 2: return ucClientNotificationCalendarQueryStatus;
    case 3: return ucClientNotificationOutlookContactProviderStatus;
    case 4: return ucClientNotificationWabContactProviderStatus;
    case 5: return ucClientNotificationFolderManagerStatus;
    default: return new LyncClientNotification(value);
    }
  }
}
