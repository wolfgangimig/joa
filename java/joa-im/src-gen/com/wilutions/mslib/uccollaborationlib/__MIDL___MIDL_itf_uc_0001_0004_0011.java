/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0011.
 * Enumerates search provider statuses. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0011 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusSyncNotStarted = new __MIDL___MIDL_itf_uc_0001_0004_0011(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusSyncInProgress = new __MIDL___MIDL_itf_uc_0001_0004_0011(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusSyncSucceeded = new __MIDL___MIDL_itf_uc_0001_0004_0011(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusSyncSucceededForInternalOnly = new __MIDL___MIDL_itf_uc_0001_0004_0011(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusSyncSucceededForExternalOnly = new __MIDL___MIDL_itf_uc_0001_0004_0011(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusOtherFailure = new __MIDL___MIDL_itf_uc_0001_0004_0011(1000);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusLocalDatabaseFailure = new __MIDL___MIDL_itf_uc_0001_0004_0011(1001);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusFileNotFound = new __MIDL___MIDL_itf_uc_0001_0004_0011(1002);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusFileCorrupted = new __MIDL___MIDL_itf_uc_0001_0004_0011(1003);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusCredentialsNotEntered = new __MIDL___MIDL_itf_uc_0001_0004_0011(1004);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusNotConfigured = new __MIDL___MIDL_itf_uc_0001_0004_0011(1005);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0011 ucProviderStatusInitializationFailed = new __MIDL___MIDL_itf_uc_0001_0004_0011(1006);

  // Integer constants for bitsets and switch statements
  public final static int _ucProviderStatusSyncNotStarted = 0;
  public final static int _ucProviderStatusSyncInProgress = 1;
  public final static int _ucProviderStatusSyncSucceeded = 2;
  public final static int _ucProviderStatusSyncSucceededForInternalOnly = 3;
  public final static int _ucProviderStatusSyncSucceededForExternalOnly = 4;
  public final static int _ucProviderStatusOtherFailure = 1000;
  public final static int _ucProviderStatusLocalDatabaseFailure = 1001;
  public final static int _ucProviderStatusFileNotFound = 1002;
  public final static int _ucProviderStatusFileCorrupted = 1003;
  public final static int _ucProviderStatusCredentialsNotEntered = 1004;
  public final static int _ucProviderStatusNotConfigured = 1005;
  public final static int _ucProviderStatusInitializationFailed = 1006;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0011(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0011(value);
    }
  }
}
