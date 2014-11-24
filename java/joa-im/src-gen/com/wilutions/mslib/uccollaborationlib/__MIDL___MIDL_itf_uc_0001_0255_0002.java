/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0002.
 * Enumerates password types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestSignIn = new __MIDL___MIDL_itf_uc_0001_0255_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestGlobalAddressListImport = new __MIDL___MIDL_itf_uc_0001_0255_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestDGExpansion = new __MIDL___MIDL_itf_uc_0001_0255_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestCalendarData = new __MIDL___MIDL_itf_uc_0001_0255_0002(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestAutoUpdate = new __MIDL___MIDL_itf_uc_0001_0255_0002(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestWebSearch = new __MIDL___MIDL_itf_uc_0001_0255_0002(5);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestPhotoProvider = new __MIDL___MIDL_itf_uc_0001_0255_0002(6);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestSharePointManagement = new __MIDL___MIDL_itf_uc_0001_0255_0002(7);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestCertificateProvider = new __MIDL___MIDL_itf_uc_0001_0255_0002(8);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestLocationProvider = new __MIDL___MIDL_itf_uc_0001_0255_0002(9);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestResponseGroupServer = new __MIDL___MIDL_itf_uc_0001_0255_0002(10);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestAnonymousSignIn = new __MIDL___MIDL_itf_uc_0001_0255_0002(11);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestBitsDownloadManager = new __MIDL___MIDL_itf_uc_0001_0255_0002(12);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestSipAuthBroker = new __MIDL___MIDL_itf_uc_0001_0255_0002(13);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestLyncAutodiscover = new __MIDL___MIDL_itf_uc_0001_0255_0002(14);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestUnknown = new __MIDL___MIDL_itf_uc_0001_0255_0002(15);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0002 ucCredentialRequestQueryConferenceInfo = new __MIDL___MIDL_itf_uc_0001_0255_0002(16);

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
  private __MIDL___MIDL_itf_uc_0001_0255_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0002 valueOf(int value) {
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
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0002(value);
    }
  }
}
