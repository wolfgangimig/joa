/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0011.
 * Enumerates search provider statuses. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0011 {
  ucProviderStatusSyncNotStarted(0),
  ucProviderStatusSyncInProgress(1),
  ucProviderStatusSyncSucceeded(2),
  ucProviderStatusSyncSucceededForInternalOnly(3),
  ucProviderStatusSyncSucceededForExternalOnly(4),
  ucProviderStatusOtherFailure(1000),
  ucProviderStatusLocalDatabaseFailure(1001),
  ucProviderStatusFileNotFound(1002),
  ucProviderStatusFileCorrupted(1003),
  ucProviderStatusCredentialsNotEntered(1004),
  ucProviderStatusNotConfigured(1005),
  ucProviderStatusInitializationFailed(1006);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0011(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0011 valueOf(int value) {
    switch(value) {
    case 0: return ucProviderStatusSyncNotStarted;
    case 1: return ucProviderStatusSyncInProgress;
    case 2: return ucProviderStatusSyncSucceeded;
    case 3: return ucProviderStatusSyncSucceededForInternalOnly;
    case 4: return ucProviderStatusSyncSucceededForExternalOnly;
    case 1000: return ucProviderStatusOtherFailure;
    case 1001: return ucProviderStatusLocalDatabaseFailure;
    case 1002: return ucProviderStatusFileNotFound;
    case 1003: return ucProviderStatusFileCorrupted;
    case 1004: return ucProviderStatusCredentialsNotEntered;
    case 1005: return ucProviderStatusNotConfigured;
    case 1006: return ucProviderStatusInitializationFailed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0011.class);
    }
  }
}
