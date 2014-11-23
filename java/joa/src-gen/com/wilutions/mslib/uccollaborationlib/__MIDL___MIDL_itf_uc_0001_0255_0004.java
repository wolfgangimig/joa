/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0004.
 * Enumerates MAPI status 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0004 {
  ucMapiStatusOk(0),
  ucMapiStatusInstallationMisconfigured(1),
  ucMapiStatusProfileMisconfigured(2),
  ucMapiStatusEmailAddressesDoNotMatch(3),
  ucMapiStatusAuthenticationFailedOrServerDown(4),
  ucMapiStatusOutlookContactProviderAuthenticationFailedOrServerDown(5),
  ucMapiStatusOutlookContactProviderUnknownError(6),
  ucMapiStatusAutodiscoveryPending(7),
  ucMapiStatusAutodiscoveryFailedTemporarily(8),
  ucMapiStatusAutodiscoveryFailedPermanently(9),
  ucMapiStatusWebServiceAuthenticationFailedOrServerDown(10),
  ucMapiStatusCalendarUnknownError(11),
  ucMapiStatusCredentialDialogCancel(12),
  ucMapiStatusOffline(13),
  ucMapiStatusNotReady(14),
  ucMapiStatusMisconfiguration(15),
  ucMapiStatusWabContactProviderUnknownError(16),
  ucMapiStatusSpoolerMalfunctioning(17),
  ucMapiStatusSpoolerDiscardedOldFiles(18),
  ucMapiStatusOtherFailure(19),
  ucMapiStatusMapiFolderCriticalError(20),
  ucMapiStatusEwsFolderCriticalError(21),
  ucMapiStatusEwsFolderConnectionError(22),
  ucMapiStatusEwsFolderSecurityError(23),
  ucMapiStatusFolderManagerUnknownError(24);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0004(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0004.class);
    }
  }
}
