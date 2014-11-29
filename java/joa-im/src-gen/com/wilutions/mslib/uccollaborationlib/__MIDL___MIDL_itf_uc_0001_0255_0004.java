/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0004.
 * Enumerates MAPI status 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0004 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusOk = new __MIDL___MIDL_itf_uc_0001_0255_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusInstallationMisconfigured = new __MIDL___MIDL_itf_uc_0001_0255_0004(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusProfileMisconfigured = new __MIDL___MIDL_itf_uc_0001_0255_0004(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusEmailAddressesDoNotMatch = new __MIDL___MIDL_itf_uc_0001_0255_0004(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusAuthenticationFailedOrServerDown = new __MIDL___MIDL_itf_uc_0001_0255_0004(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusOutlookContactProviderAuthenticationFailedOrServerDown = new __MIDL___MIDL_itf_uc_0001_0255_0004(5);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusOutlookContactProviderUnknownError = new __MIDL___MIDL_itf_uc_0001_0255_0004(6);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusAutodiscoveryPending = new __MIDL___MIDL_itf_uc_0001_0255_0004(7);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusAutodiscoveryFailedTemporarily = new __MIDL___MIDL_itf_uc_0001_0255_0004(8);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusAutodiscoveryFailedPermanently = new __MIDL___MIDL_itf_uc_0001_0255_0004(9);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusWebServiceAuthenticationFailedOrServerDown = new __MIDL___MIDL_itf_uc_0001_0255_0004(10);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusCalendarUnknownError = new __MIDL___MIDL_itf_uc_0001_0255_0004(11);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusCredentialDialogCancel = new __MIDL___MIDL_itf_uc_0001_0255_0004(12);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusOffline = new __MIDL___MIDL_itf_uc_0001_0255_0004(13);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusNotReady = new __MIDL___MIDL_itf_uc_0001_0255_0004(14);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusMisconfiguration = new __MIDL___MIDL_itf_uc_0001_0255_0004(15);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusWabContactProviderUnknownError = new __MIDL___MIDL_itf_uc_0001_0255_0004(16);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusSpoolerMalfunctioning = new __MIDL___MIDL_itf_uc_0001_0255_0004(17);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusSpoolerDiscardedOldFiles = new __MIDL___MIDL_itf_uc_0001_0255_0004(18);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusOtherFailure = new __MIDL___MIDL_itf_uc_0001_0255_0004(19);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusMapiFolderCriticalError = new __MIDL___MIDL_itf_uc_0001_0255_0004(20);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusEwsFolderCriticalError = new __MIDL___MIDL_itf_uc_0001_0255_0004(21);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusEwsFolderConnectionError = new __MIDL___MIDL_itf_uc_0001_0255_0004(22);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusEwsFolderSecurityError = new __MIDL___MIDL_itf_uc_0001_0255_0004(23);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0004 ucMapiStatusFolderManagerUnknownError = new __MIDL___MIDL_itf_uc_0001_0255_0004(24);

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
  private __MIDL___MIDL_itf_uc_0001_0255_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0004 valueOf(int value) {
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
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0004(value);
    }
  }
}
