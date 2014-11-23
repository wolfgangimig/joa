/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0001.
 * Properties describing the conference information used by a conference scheduler. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0167_0001 {
  ucConfInfoSubject(393217),
  ucConfInfoExpiryTime(1342570498),
  ucConfInfoOrganizerRoamingData(393219),
  ucConfInfoNotificationData(393220),
  ucConfInfoAttendees(1074135045),
  ucConfInfoLeaders(1074135046),
  ucConfInfoModalities(537264135),
  ucConfInfoAdmissionKey(393224),
  ucConfInfoPresentationModeEnabled(268828681),
  ucConfInfoCollaborationModeEnabled(268828682),
  ucConfInfoAutoAttendentEnabled(268828683),
  ucConfInfoTelephonyAccessId(393228),
  ucConfInfoAdmissionKeyRequired(268828685),
  ucConfInfoInternalWebLocation(393230),
  ucConfInfoExternalWebLocation(393231),
  ucConfInfoIsStatic(268828688),
  ucConfInfoAutopromote(805699601),
  ucPSTNLobbyBypass(268828690),
  ucACPTollNumber(393235),
  ucACPTollFreeNumber(393236),
  ucACPDomain(393237),
  ucACPLeaderPasscode(393238),
  ucACPParticipantPasscode(393239),
  ucACPShowTollNumber(268828696),
  ucACPShowTollFreeNumber(268828697),
  ucACPEnableCallMe(268828698),
  ucIsACPEnable(268828699),
  ucConfInfoApplicationData(1074135068),
  ucConfInfoVideoPresentationModeEnabled(268828701),
  ucConfInfoGlobalAnnouncements(268861441);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0167_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0167_0001 valueOf(int value) {
    switch(value) {
    case 393217: return ucConfInfoSubject;
    case 1342570498: return ucConfInfoExpiryTime;
    case 393219: return ucConfInfoOrganizerRoamingData;
    case 393220: return ucConfInfoNotificationData;
    case 1074135045: return ucConfInfoAttendees;
    case 1074135046: return ucConfInfoLeaders;
    case 537264135: return ucConfInfoModalities;
    case 393224: return ucConfInfoAdmissionKey;
    case 268828681: return ucConfInfoPresentationModeEnabled;
    case 268828682: return ucConfInfoCollaborationModeEnabled;
    case 268828683: return ucConfInfoAutoAttendentEnabled;
    case 393228: return ucConfInfoTelephonyAccessId;
    case 268828685: return ucConfInfoAdmissionKeyRequired;
    case 393230: return ucConfInfoInternalWebLocation;
    case 393231: return ucConfInfoExternalWebLocation;
    case 268828688: return ucConfInfoIsStatic;
    case 805699601: return ucConfInfoAutopromote;
    case 268828690: return ucPSTNLobbyBypass;
    case 393235: return ucACPTollNumber;
    case 393236: return ucACPTollFreeNumber;
    case 393237: return ucACPDomain;
    case 393238: return ucACPLeaderPasscode;
    case 393239: return ucACPParticipantPasscode;
    case 268828696: return ucACPShowTollNumber;
    case 268828697: return ucACPShowTollFreeNumber;
    case 268828698: return ucACPEnableCallMe;
    case 268828699: return ucIsACPEnable;
    case 1074135068: return ucConfInfoApplicationData;
    case 268828701: return ucConfInfoVideoPresentationModeEnabled;
    case 268861441: return ucConfInfoGlobalAnnouncements;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0167_0001.class);
    }
  }
}
