/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIFeature.
 * Enumerates the features supported by this client for Office integration. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OIFeature {
  oiFeatureFastSearch(1),
  oiFeaturePictures(2),
  oiFeatureNonBuddyPresence(4),
  oiFeatureContactTagging(8),
  oiFeatureSinglePartyFileTransfer(16),
  oiFeatureMultipartyFileTransfer(32),
  oiFeatureQuickContacts(64),
  oiFeatureResolveContact(128),
  oiFeatureAddPowerPointToConversation(256),
  oiFeatureAddOneNoteToConversation(512),
  oiFeatureFreeBusyIntegration(1024),
  oiFeaturePhoneNormalization(2048);

  public final int value;
  private OIFeature(int value) { this.value = value; }
  public static  OIFeature valueOf(int value) {
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OIFeature.class);
    }
  }
}
