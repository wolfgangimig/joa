/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SignatureDetail {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SignatureDetail sigdetLocalSigningTime = new SignatureDetail(0);
  public final static SignatureDetail sigdetApplicationName = new SignatureDetail(1);
  public final static SignatureDetail sigdetApplicationVersion = new SignatureDetail(2);
  public final static SignatureDetail sigdetOfficeVersion = new SignatureDetail(3);
  public final static SignatureDetail sigdetWindowsVersion = new SignatureDetail(4);
  public final static SignatureDetail sigdetNumberOfMonitors = new SignatureDetail(5);
  public final static SignatureDetail sigdetHorizResolution = new SignatureDetail(6);
  public final static SignatureDetail sigdetVertResolution = new SignatureDetail(7);
  public final static SignatureDetail sigdetColorDepth = new SignatureDetail(8);
  public final static SignatureDetail sigdetSignedData = new SignatureDetail(9);
  public final static SignatureDetail sigdetDocPreviewImg = new SignatureDetail(10);
  public final static SignatureDetail sigdetIPFormHash = new SignatureDetail(11);
  public final static SignatureDetail sigdetIPCurrentView = new SignatureDetail(12);
  public final static SignatureDetail sigdetSignatureType = new SignatureDetail(13);
  public final static SignatureDetail sigdetHashAlgorithm = new SignatureDetail(14);
  public final static SignatureDetail sigdetShouldShowViewWarning = new SignatureDetail(15);
  public final static SignatureDetail sigdetDelSuggSigner = new SignatureDetail(16);
  public final static SignatureDetail sigdetDelSuggSignerSet = new SignatureDetail(17);
  public final static SignatureDetail sigdetDelSuggSignerLine2 = new SignatureDetail(18);
  public final static SignatureDetail sigdetDelSuggSignerLine2Set = new SignatureDetail(19);
  public final static SignatureDetail sigdetDelSuggSignerEmail = new SignatureDetail(20);
  public final static SignatureDetail sigdetDelSuggSignerEmailSet = new SignatureDetail(21);

  // Integer constants for bitsets and switch statements
  public final static int _sigdetLocalSigningTime = 0;
  public final static int _sigdetApplicationName = 1;
  public final static int _sigdetApplicationVersion = 2;
  public final static int _sigdetOfficeVersion = 3;
  public final static int _sigdetWindowsVersion = 4;
  public final static int _sigdetNumberOfMonitors = 5;
  public final static int _sigdetHorizResolution = 6;
  public final static int _sigdetVertResolution = 7;
  public final static int _sigdetColorDepth = 8;
  public final static int _sigdetSignedData = 9;
  public final static int _sigdetDocPreviewImg = 10;
  public final static int _sigdetIPFormHash = 11;
  public final static int _sigdetIPCurrentView = 12;
  public final static int _sigdetSignatureType = 13;
  public final static int _sigdetHashAlgorithm = 14;
  public final static int _sigdetShouldShowViewWarning = 15;
  public final static int _sigdetDelSuggSigner = 16;
  public final static int _sigdetDelSuggSignerSet = 17;
  public final static int _sigdetDelSuggSignerLine2 = 18;
  public final static int _sigdetDelSuggSignerLine2Set = 19;
  public final static int _sigdetDelSuggSignerEmail = 20;
  public final static int _sigdetDelSuggSignerEmailSet = 21;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SignatureDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new SignatureDetail(value);
    }
  }
}
