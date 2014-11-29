/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchProviderStatusType.
 * Enumerates search provider statuses. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SearchProviderStatusType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SearchProviderStatusType ucProviderStatusSyncNotStarted = new SearchProviderStatusType(0);
  public final static SearchProviderStatusType ucProviderStatusSyncInProgress = new SearchProviderStatusType(1);
  public final static SearchProviderStatusType ucProviderStatusSyncSucceeded = new SearchProviderStatusType(2);
  public final static SearchProviderStatusType ucProviderStatusSyncSucceededForInternalOnly = new SearchProviderStatusType(3);
  public final static SearchProviderStatusType ucProviderStatusSyncSucceededForExternalOnly = new SearchProviderStatusType(4);
  public final static SearchProviderStatusType ucProviderStatusOtherFailure = new SearchProviderStatusType(1000);
  public final static SearchProviderStatusType ucProviderStatusLocalDatabaseFailure = new SearchProviderStatusType(1001);
  public final static SearchProviderStatusType ucProviderStatusFileNotFound = new SearchProviderStatusType(1002);
  public final static SearchProviderStatusType ucProviderStatusFileCorrupted = new SearchProviderStatusType(1003);
  public final static SearchProviderStatusType ucProviderStatusCredentialsNotEntered = new SearchProviderStatusType(1004);
  public final static SearchProviderStatusType ucProviderStatusNotConfigured = new SearchProviderStatusType(1005);
  public final static SearchProviderStatusType ucProviderStatusInitializationFailed = new SearchProviderStatusType(1006);

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
  private SearchProviderStatusType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SearchProviderStatusType valueOf(int value) {
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
    default: return new SearchProviderStatusType(value);
    }
  }
}
