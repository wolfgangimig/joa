/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * MapiStatus.
 * Enumerates MAPI status 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MapiStatus {

  // Typed constants
  public final static MapiStatus ucMapiStatusOk = new MapiStatus(0);
  public final static MapiStatus ucMapiStatusInstallationMisconfigured = new MapiStatus(1);
  public final static MapiStatus ucMapiStatusProfileMisconfigured = new MapiStatus(2);
  public final static MapiStatus ucMapiStatusEmailAddressesDoNotMatch = new MapiStatus(3);
  public final static MapiStatus ucMapiStatusAuthenticationFailedOrServerDown = new MapiStatus(4);
  public final static MapiStatus ucMapiStatusOutlookContactProviderAuthenticationFailedOrServerDown = new MapiStatus(5);
  public final static MapiStatus ucMapiStatusOutlookContactProviderUnknownError = new MapiStatus(6);
  public final static MapiStatus ucMapiStatusAutodiscoveryPending = new MapiStatus(7);
  public final static MapiStatus ucMapiStatusAutodiscoveryFailedTemporarily = new MapiStatus(8);
  public final static MapiStatus ucMapiStatusAutodiscoveryFailedPermanently = new MapiStatus(9);
  public final static MapiStatus ucMapiStatusWebServiceAuthenticationFailedOrServerDown = new MapiStatus(10);
  public final static MapiStatus ucMapiStatusCalendarUnknownError = new MapiStatus(11);
  public final static MapiStatus ucMapiStatusCredentialDialogCancel = new MapiStatus(12);
  public final static MapiStatus ucMapiStatusOffline = new MapiStatus(13);
  public final static MapiStatus ucMapiStatusNotReady = new MapiStatus(14);
  public final static MapiStatus ucMapiStatusMisconfiguration = new MapiStatus(15);
  public final static MapiStatus ucMapiStatusWabContactProviderUnknownError = new MapiStatus(16);
  public final static MapiStatus ucMapiStatusSpoolerMalfunctioning = new MapiStatus(17);
  public final static MapiStatus ucMapiStatusSpoolerDiscardedOldFiles = new MapiStatus(18);
  public final static MapiStatus ucMapiStatusOtherFailure = new MapiStatus(19);
  public final static MapiStatus ucMapiStatusMapiFolderCriticalError = new MapiStatus(20);
  public final static MapiStatus ucMapiStatusEwsFolderCriticalError = new MapiStatus(21);
  public final static MapiStatus ucMapiStatusEwsFolderConnectionError = new MapiStatus(22);
  public final static MapiStatus ucMapiStatusEwsFolderSecurityError = new MapiStatus(23);
  public final static MapiStatus ucMapiStatusFolderManagerUnknownError = new MapiStatus(24);

  // Integer constants for bitsets and switch statements
  public final static int _ucMapiStatusOk = 0;
  public final static int _ucMapiStatusInstallationMisconfigured = 1;
  public final static int _ucMapiStatusProfileMisconfigured = 2;
  public final static int _ucMapiStatusEmailAddressesDoNotMatch = 3;
  public final static int _ucMapiStatusAuthenticationFailedOrServerDown = 4;
  public final static int _ucMapiStatusOutlookContactProviderAuthenticationFailedOrServerDown = 5;
  public final static int _ucMapiStatusOutlookContactProviderUnknownError = 6;
  public final static int _ucMapiStatusAutodiscoveryPending = 7;
  public final static int _ucMapiStatusAutodiscoveryFailedTemporarily = 8;
  public final static int _ucMapiStatusAutodiscoveryFailedPermanently = 9;
  public final static int _ucMapiStatusWebServiceAuthenticationFailedOrServerDown = 10;
  public final static int _ucMapiStatusCalendarUnknownError = 11;
  public final static int _ucMapiStatusCredentialDialogCancel = 12;
  public final static int _ucMapiStatusOffline = 13;
  public final static int _ucMapiStatusNotReady = 14;
  public final static int _ucMapiStatusMisconfiguration = 15;
  public final static int _ucMapiStatusWabContactProviderUnknownError = 16;
  public final static int _ucMapiStatusSpoolerMalfunctioning = 17;
  public final static int _ucMapiStatusSpoolerDiscardedOldFiles = 18;
  public final static int _ucMapiStatusOtherFailure = 19;
  public final static int _ucMapiStatusMapiFolderCriticalError = 20;
  public final static int _ucMapiStatusEwsFolderCriticalError = 21;
  public final static int _ucMapiStatusEwsFolderConnectionError = 22;
  public final static int _ucMapiStatusEwsFolderSecurityError = 23;
  public final static int _ucMapiStatusFolderManagerUnknownError = 24;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MapiStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MapiStatus valueOf(int value) {
    switch(value) {
    case 0: return ucMapiStatusOk;
    case 1: return ucMapiStatusInstallationMisconfigured;
    case 2: return ucMapiStatusProfileMisconfigured;
    case 3: return ucMapiStatusEmailAddressesDoNotMatch;
    case 4: return ucMapiStatusAuthenticationFailedOrServerDown;
    case 5: return ucMapiStatusOutlookContactProviderAuthenticationFailedOrServerDown;
    case 6: return ucMapiStatusOutlookContactProviderUnknownError;
    case 7: return ucMapiStatusAutodiscoveryPending;
    case 8: return ucMapiStatusAutodiscoveryFailedTemporarily;
    case 9: return ucMapiStatusAutodiscoveryFailedPermanently;
    case 10: return ucMapiStatusWebServiceAuthenticationFailedOrServerDown;
    case 11: return ucMapiStatusCalendarUnknownError;
    case 12: return ucMapiStatusCredentialDialogCancel;
    case 13: return ucMapiStatusOffline;
    case 14: return ucMapiStatusNotReady;
    case 15: return ucMapiStatusMisconfiguration;
    case 16: return ucMapiStatusWabContactProviderUnknownError;
    case 17: return ucMapiStatusSpoolerMalfunctioning;
    case 18: return ucMapiStatusSpoolerDiscardedOldFiles;
    case 19: return ucMapiStatusOtherFailure;
    case 20: return ucMapiStatusMapiFolderCriticalError;
    case 21: return ucMapiStatusEwsFolderCriticalError;
    case 22: return ucMapiStatusEwsFolderConnectionError;
    case 23: return ucMapiStatusEwsFolderSecurityError;
    case 24: return ucMapiStatusFolderManagerUnknownError;
    default: return new MapiStatus(value);
    }
  }
}
