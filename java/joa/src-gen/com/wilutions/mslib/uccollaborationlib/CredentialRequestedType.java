/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CredentialRequestedType.
 * Enumerates password types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum CredentialRequestedType {
  ucCredentialRequestSignIn(0),
  ucCredentialRequestGlobalAddressListImport(1),
  ucCredentialRequestDGExpansion(2),
  ucCredentialRequestCalendarData(3),
  ucCredentialRequestAutoUpdate(4),
  ucCredentialRequestWebSearch(5),
  ucCredentialRequestPhotoProvider(6),
  ucCredentialRequestSharePointManagement(7),
  ucCredentialRequestCertificateProvider(8),
  ucCredentialRequestLocationProvider(9),
  ucCredentialRequestResponseGroupServer(10),
  ucCredentialRequestAnonymousSignIn(11),
  ucCredentialRequestBitsDownloadManager(12),
  ucCredentialRequestSipAuthBroker(13),
  ucCredentialRequestLyncAutodiscover(14),
  ucCredentialRequestUnknown(15),
  ucCredentialRequestQueryConferenceInfo(16);

  public final int value;
  private CredentialRequestedType(int value) { this.value = value; }
  public static  CredentialRequestedType valueOf(int value) {
    switch(value) {
    case 0: return ucCredentialRequestSignIn;
    case 1: return ucCredentialRequestGlobalAddressListImport;
    case 2: return ucCredentialRequestDGExpansion;
    case 3: return ucCredentialRequestCalendarData;
    case 4: return ucCredentialRequestAutoUpdate;
    case 5: return ucCredentialRequestWebSearch;
    case 6: return ucCredentialRequestPhotoProvider;
    case 7: return ucCredentialRequestSharePointManagement;
    case 8: return ucCredentialRequestCertificateProvider;
    case 9: return ucCredentialRequestLocationProvider;
    case 10: return ucCredentialRequestResponseGroupServer;
    case 11: return ucCredentialRequestAnonymousSignIn;
    case 12: return ucCredentialRequestBitsDownloadManager;
    case 13: return ucCredentialRequestSipAuthBroker;
    case 14: return ucCredentialRequestLyncAutodiscover;
    case 15: return ucCredentialRequestUnknown;
    case 16: return ucCredentialRequestQueryConferenceInfo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + CredentialRequestedType.class);
    }
  }
}
