/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIFeature.
 * Enumerates the features supported by this client for Office integration. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OIFeature {

  // Typed constants
  public final static OIFeature oiFeatureFastSearch = new OIFeature(1);
  public final static OIFeature oiFeaturePictures = new OIFeature(2);
  public final static OIFeature oiFeatureNonBuddyPresence = new OIFeature(4);
  public final static OIFeature oiFeatureContactTagging = new OIFeature(8);
  public final static OIFeature oiFeatureSinglePartyFileTransfer = new OIFeature(16);
  public final static OIFeature oiFeatureMultipartyFileTransfer = new OIFeature(32);
  public final static OIFeature oiFeatureQuickContacts = new OIFeature(64);
  public final static OIFeature oiFeatureResolveContact = new OIFeature(128);
  public final static OIFeature oiFeatureAddPowerPointToConversation = new OIFeature(256);
  public final static OIFeature oiFeatureAddOneNoteToConversation = new OIFeature(512);
  public final static OIFeature oiFeatureFreeBusyIntegration = new OIFeature(1024);
  public final static OIFeature oiFeaturePhoneNormalization = new OIFeature(2048);

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
  private OIFeature(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OIFeature(value);
    }
  }
}
