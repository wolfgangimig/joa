/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LyncClientNotification.
 * Enumerates the UC Client notification type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum LyncClientNotification {
  ucClientNotificationMapiStatus(0),
  ucClientNotificationAutodiscovery(1),
  ucClientNotificationCalendarQueryStatus(2),
  ucClientNotificationOutlookContactProviderStatus(3),
  ucClientNotificationWabContactProviderStatus(4),
  ucClientNotificationFolderManagerStatus(5);

  public final int value;
  private LyncClientNotification(int value) { this.value = value; }
  public static  LyncClientNotification valueOf(int value) {
    switch(value) {
    case 0: return ucClientNotificationMapiStatus;
    case 1: return ucClientNotificationAutodiscovery;
    case 2: return ucClientNotificationCalendarQueryStatus;
    case 3: return ucClientNotificationOutlookContactProviderStatus;
    case 4: return ucClientNotificationWabContactProviderStatus;
    case 5: return ucClientNotificationFolderManagerStatus;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + LyncClientNotification.class);
    }
  }
}
