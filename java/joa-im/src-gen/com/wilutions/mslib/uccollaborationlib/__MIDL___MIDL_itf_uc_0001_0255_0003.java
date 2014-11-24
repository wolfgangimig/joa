/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0003.
 * Enumerates the UC Client notification type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0003 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationMapiStatus = new __MIDL___MIDL_itf_uc_0001_0255_0003(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationAutodiscovery = new __MIDL___MIDL_itf_uc_0001_0255_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationCalendarQueryStatus = new __MIDL___MIDL_itf_uc_0001_0255_0003(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationOutlookContactProviderStatus = new __MIDL___MIDL_itf_uc_0001_0255_0003(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationWabContactProviderStatus = new __MIDL___MIDL_itf_uc_0001_0255_0003(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0003 ucClientNotificationFolderManagerStatus = new __MIDL___MIDL_itf_uc_0001_0255_0003(5);

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
  private __MIDL___MIDL_itf_uc_0001_0255_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucClientNotificationMapiStatus;
    case 1: return ucClientNotificationAutodiscovery;
    case 2: return ucClientNotificationCalendarQueryStatus;
    case 3: return ucClientNotificationOutlookContactProviderStatus;
    case 4: return ucClientNotificationWabContactProviderStatus;
    case 5: return ucClientNotificationFolderManagerStatus;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0003(value);
    }
  }
}
