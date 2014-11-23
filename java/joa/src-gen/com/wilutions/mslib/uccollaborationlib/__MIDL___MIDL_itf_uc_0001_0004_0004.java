/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0004.
 * Enumerates the contact information types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0004 {
  ucPresenceAvailability(0),
  ucPresenceActivityId(1),
  ucPresenceLocationName(2),
  ucPresenceTimeZone(3),
  ucPresenceTimeZoneBias(4),
  ucPresenceMeetingSubject(5),
  ucPresenceMeetingLocation(6),
  ucPresenceActivity(7),
  ucPresenceCustomActivity(8),
  ucPresenceIdleStartTime(9),
  ucPresenceDisplayName(10),
  ucPresenceLegacyInstantMessageAddresses(11),
  ucPresencePrimaryEmailAddress(12),
  ucPresenceEmailAddresses(13),
  ucPresenceTitle(14),
  ucPresenceCompany(15),
  ucPresenceDepartment(16),
  ucPresenceOffice(17),
  ucPresenceHomePageUrl(18),
  ucPresencePhoto(19),
  ucPresenceDefaultNote(20),
  ucPresenceDefaultNoteType(21),
  ucPresencePersonalNote(22),
  ucPresenceOutOfficeNote(23),
  ucPresenceSourceNetwork(24),
  ucPresenceIconUrl(25),
  ucPresenceIconStream(26),
  ucPresenceContactEndpoints(27),
  ucPresenceCurrentLegacyCalendarState(28),
  ucPresenceNextLegacyCalendarState(29),
  ucPresenceNextCalendarStateStartTime(30),
  ucPresenceWorkingHours(31),
  ucPresenceCapabilityString(32),
  ucPresenceCapabilities(33),
  ucPresenceContactType(34),
  ucPresenceDescription(35),
  ucPresenceWorkAddress(36),
  ucPresenceFirstName(37),
  ucPresenceLastName(38),
  ucPresenceVoiceMemo(39),
  ucPresenceWorkPhoneNumber(40),
  ucPresenceHomePhoneNumber(41),
  ucPresenceCellPhoneNumber(42),
  ucPresenceOtherPhoneNumber(43),
  ucContactInformationTypeMax_W14(44),
  ucPresenceCapabilityDetails(45),
  ucPresenceDefaultNotePublishedTime(46),
  ucPresenceCurrentCalendarState(47),
  ucPresenceNextCalendarState(48),
  ucPresenceAttributionString(49),
  ucPresenceInstantMessageAddresses(50),
  ucPresenceIsOutOfOffice(51),
  ucPresencePersonId(52),
  ucPresenceDisableAggregation(53),
  ucPresencePhotoFromPresence(54),
  ucPresencePhotoFromActiveDirectory(55),
  ucPresenceHiResolutionPhoto(56),
  ucContactInformationTypeMax(57);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucPresenceAvailability;
    case 1: return ucPresenceActivityId;
    case 2: return ucPresenceLocationName;
    case 3: return ucPresenceTimeZone;
    case 4: return ucPresenceTimeZoneBias;
    case 5: return ucPresenceMeetingSubject;
    case 6: return ucPresenceMeetingLocation;
    case 7: return ucPresenceActivity;
    case 8: return ucPresenceCustomActivity;
    case 9: return ucPresenceIdleStartTime;
    case 10: return ucPresenceDisplayName;
    case 11: return ucPresenceLegacyInstantMessageAddresses;
    case 12: return ucPresencePrimaryEmailAddress;
    case 13: return ucPresenceEmailAddresses;
    case 14: return ucPresenceTitle;
    case 15: return ucPresenceCompany;
    case 16: return ucPresenceDepartment;
    case 17: return ucPresenceOffice;
    case 18: return ucPresenceHomePageUrl;
    case 19: return ucPresencePhoto;
    case 20: return ucPresenceDefaultNote;
    case 21: return ucPresenceDefaultNoteType;
    case 22: return ucPresencePersonalNote;
    case 23: return ucPresenceOutOfficeNote;
    case 24: return ucPresenceSourceNetwork;
    case 25: return ucPresenceIconUrl;
    case 26: return ucPresenceIconStream;
    case 27: return ucPresenceContactEndpoints;
    case 28: return ucPresenceCurrentLegacyCalendarState;
    case 29: return ucPresenceNextLegacyCalendarState;
    case 30: return ucPresenceNextCalendarStateStartTime;
    case 31: return ucPresenceWorkingHours;
    case 32: return ucPresenceCapabilityString;
    case 33: return ucPresenceCapabilities;
    case 34: return ucPresenceContactType;
    case 35: return ucPresenceDescription;
    case 36: return ucPresenceWorkAddress;
    case 37: return ucPresenceFirstName;
    case 38: return ucPresenceLastName;
    case 39: return ucPresenceVoiceMemo;
    case 40: return ucPresenceWorkPhoneNumber;
    case 41: return ucPresenceHomePhoneNumber;
    case 42: return ucPresenceCellPhoneNumber;
    case 43: return ucPresenceOtherPhoneNumber;
    case 44: return ucContactInformationTypeMax_W14;
    case 45: return ucPresenceCapabilityDetails;
    case 46: return ucPresenceDefaultNotePublishedTime;
    case 47: return ucPresenceCurrentCalendarState;
    case 48: return ucPresenceNextCalendarState;
    case 49: return ucPresenceAttributionString;
    case 50: return ucPresenceInstantMessageAddresses;
    case 51: return ucPresenceIsOutOfOffice;
    case 52: return ucPresencePersonId;
    case 53: return ucPresenceDisableAggregation;
    case 54: return ucPresencePhotoFromPresence;
    case 55: return ucPresencePhotoFromActiveDirectory;
    case 56: return ucPresenceHiResolutionPhoto;
    case 57: return ucContactInformationTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0004.class);
    }
  }
}
