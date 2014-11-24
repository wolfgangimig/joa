/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0011.
 * Enumerates the features supported by this client for Office integration. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0011 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureFastSearch = new __MIDL___MIDL_itf_uc_0001_0255_0011(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeaturePictures = new __MIDL___MIDL_itf_uc_0001_0255_0011(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureNonBuddyPresence = new __MIDL___MIDL_itf_uc_0001_0255_0011(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureContactTagging = new __MIDL___MIDL_itf_uc_0001_0255_0011(8);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureSinglePartyFileTransfer = new __MIDL___MIDL_itf_uc_0001_0255_0011(16);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureMultipartyFileTransfer = new __MIDL___MIDL_itf_uc_0001_0255_0011(32);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureQuickContacts = new __MIDL___MIDL_itf_uc_0001_0255_0011(64);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureResolveContact = new __MIDL___MIDL_itf_uc_0001_0255_0011(128);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureAddPowerPointToConversation = new __MIDL___MIDL_itf_uc_0001_0255_0011(256);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureAddOneNoteToConversation = new __MIDL___MIDL_itf_uc_0001_0255_0011(512);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeatureFreeBusyIntegration = new __MIDL___MIDL_itf_uc_0001_0255_0011(1024);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0011 oiFeaturePhoneNormalization = new __MIDL___MIDL_itf_uc_0001_0255_0011(2048);

  // Integer constants for bitsets and switch statements
  public final static int _oiFeatureFastSearch = 1;
  public final static int _oiFeaturePictures = 2;
  public final static int _oiFeatureNonBuddyPresence = 4;
  public final static int _oiFeatureContactTagging = 8;
  public final static int _oiFeatureSinglePartyFileTransfer = 16;
  public final static int _oiFeatureMultipartyFileTransfer = 32;
  public final static int _oiFeatureQuickContacts = 64;
  public final static int _oiFeatureResolveContact = 128;
  public final static int _oiFeatureAddPowerPointToConversation = 256;
  public final static int _oiFeatureAddOneNoteToConversation = 512;
  public final static int _oiFeatureFreeBusyIntegration = 1024;
  public final static int _oiFeaturePhoneNormalization = 2048;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0011(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0011 valueOf(int value) {
    switch(value) {
    case 1: return oiFeatureFastSearch;
    case 2: return oiFeaturePictures;
    case 4: return oiFeatureNonBuddyPresence;
    case 8: return oiFeatureContactTagging;
    case 16: return oiFeatureSinglePartyFileTransfer;
    case 32: return oiFeatureMultipartyFileTransfer;
    case 64: return oiFeatureQuickContacts;
    case 128: return oiFeatureResolveContact;
    case 256: return oiFeatureAddPowerPointToConversation;
    case 512: return oiFeatureAddOneNoteToConversation;
    case 1024: return oiFeatureFreeBusyIntegration;
    case 2048: return oiFeaturePhoneNormalization;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0011(value);
    }
  }
}
