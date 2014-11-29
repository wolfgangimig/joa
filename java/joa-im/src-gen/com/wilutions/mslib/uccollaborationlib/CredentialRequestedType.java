/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CredentialRequestedType.
 * Enumerates password types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CredentialRequestedType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static CredentialRequestedType ucCredentialRequestSignIn = new CredentialRequestedType(0);
  public final static CredentialRequestedType ucCredentialRequestGlobalAddressListImport = new CredentialRequestedType(1);
  public final static CredentialRequestedType ucCredentialRequestDGExpansion = new CredentialRequestedType(2);
  public final static CredentialRequestedType ucCredentialRequestCalendarData = new CredentialRequestedType(3);
  public final static CredentialRequestedType ucCredentialRequestAutoUpdate = new CredentialRequestedType(4);
  public final static CredentialRequestedType ucCredentialRequestWebSearch = new CredentialRequestedType(5);
  public final static CredentialRequestedType ucCredentialRequestPhotoProvider = new CredentialRequestedType(6);
  public final static CredentialRequestedType ucCredentialRequestSharePointManagement = new CredentialRequestedType(7);
  public final static CredentialRequestedType ucCredentialRequestCertificateProvider = new CredentialRequestedType(8);
  public final static CredentialRequestedType ucCredentialRequestLocationProvider = new CredentialRequestedType(9);
  public final static CredentialRequestedType ucCredentialRequestResponseGroupServer = new CredentialRequestedType(10);
  public final static CredentialRequestedType ucCredentialRequestAnonymousSignIn = new CredentialRequestedType(11);
  public final static CredentialRequestedType ucCredentialRequestBitsDownloadManager = new CredentialRequestedType(12);
  public final static CredentialRequestedType ucCredentialRequestSipAuthBroker = new CredentialRequestedType(13);
  public final static CredentialRequestedType ucCredentialRequestLyncAutodiscover = new CredentialRequestedType(14);
  public final static CredentialRequestedType ucCredentialRequestUnknown = new CredentialRequestedType(15);
  public final static CredentialRequestedType ucCredentialRequestQueryConferenceInfo = new CredentialRequestedType(16);

  // Integer constants for bitsets and switch statements
  public final static int _ucCredentialRequestSignIn = 0;
  public final static int _ucCredentialRequestGlobalAddressListImport = 1;
  public final static int _ucCredentialRequestDGExpansion = 2;
  public final static int _ucCredentialRequestCalendarData = 3;
  public final static int _ucCredentialRequestAutoUpdate = 4;
  public final static int _ucCredentialRequestWebSearch = 5;
  public final static int _ucCredentialRequestPhotoProvider = 6;
  public final static int _ucCredentialRequestSharePointManagement = 7;
  public final static int _ucCredentialRequestCertificateProvider = 8;
  public final static int _ucCredentialRequestLocationProvider = 9;
  public final static int _ucCredentialRequestResponseGroupServer = 10;
  public final static int _ucCredentialRequestAnonymousSignIn = 11;
  public final static int _ucCredentialRequestBitsDownloadManager = 12;
  public final static int _ucCredentialRequestSipAuthBroker = 13;
  public final static int _ucCredentialRequestLyncAutodiscover = 14;
  public final static int _ucCredentialRequestUnknown = 15;
  public final static int _ucCredentialRequestQueryConferenceInfo = 16;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CredentialRequestedType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new CredentialRequestedType(value);
    }
  }
}
