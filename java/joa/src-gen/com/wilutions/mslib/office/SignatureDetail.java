/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SignatureDetail {
  sigdetLocalSigningTime(0),
  sigdetApplicationName(1),
  sigdetApplicationVersion(2),
  sigdetOfficeVersion(3),
  sigdetWindowsVersion(4),
  sigdetNumberOfMonitors(5),
  sigdetHorizResolution(6),
  sigdetVertResolution(7),
  sigdetColorDepth(8),
  sigdetSignedData(9),
  sigdetDocPreviewImg(10),
  sigdetIPFormHash(11),
  sigdetIPCurrentView(12),
  sigdetSignatureType(13),
  sigdetHashAlgorithm(14),
  sigdetShouldShowViewWarning(15),
  sigdetDelSuggSigner(16),
  sigdetDelSuggSignerSet(17),
  sigdetDelSuggSignerLine2(18),
  sigdetDelSuggSignerLine2Set(19),
  sigdetDelSuggSignerEmail(20),
  sigdetDelSuggSignerEmailSet(21);

  public final int value;
  private SignatureDetail(int value) { this.value = value; }
  public static  SignatureDetail valueOf(int value) {
    switch(value) {
    case 0: return sigdetLocalSigningTime;
    case 1: return sigdetApplicationName;
    case 2: return sigdetApplicationVersion;
    case 3: return sigdetOfficeVersion;
    case 4: return sigdetWindowsVersion;
    case 5: return sigdetNumberOfMonitors;
    case 6: return sigdetHorizResolution;
    case 7: return sigdetVertResolution;
    case 8: return sigdetColorDepth;
    case 9: return sigdetSignedData;
    case 10: return sigdetDocPreviewImg;
    case 11: return sigdetIPFormHash;
    case 12: return sigdetIPCurrentView;
    case 13: return sigdetSignatureType;
    case 14: return sigdetHashAlgorithm;
    case 15: return sigdetShouldShowViewWarning;
    case 16: return sigdetDelSuggSigner;
    case 17: return sigdetDelSuggSignerSet;
    case 18: return sigdetDelSuggSignerLine2;
    case 19: return sigdetDelSuggSignerLine2Set;
    case 20: return sigdetDelSuggSignerEmail;
    case 21: return sigdetDelSuggSignerEmailSet;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SignatureDetail.class);
    }
  }
}
