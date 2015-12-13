/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceInfoProperty.
 * Properties describing the conference information used by a conference scheduler. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceInfoProperty {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConferenceInfoProperty ucConfInfoSubject = new ConferenceInfoProperty(393217);
  public final static ConferenceInfoProperty ucConfInfoExpiryTime = new ConferenceInfoProperty(1342570498);
  public final static ConferenceInfoProperty ucConfInfoOrganizerRoamingData = new ConferenceInfoProperty(393219);
  public final static ConferenceInfoProperty ucConfInfoNotificationData = new ConferenceInfoProperty(393220);
  public final static ConferenceInfoProperty ucConfInfoAttendees = new ConferenceInfoProperty(1074135045);
  public final static ConferenceInfoProperty ucConfInfoLeaders = new ConferenceInfoProperty(1074135046);
  public final static ConferenceInfoProperty ucConfInfoModalities = new ConferenceInfoProperty(537264135);
  public final static ConferenceInfoProperty ucConfInfoAdmissionKey = new ConferenceInfoProperty(393224);
  public final static ConferenceInfoProperty ucConfInfoPresentationModeEnabled = new ConferenceInfoProperty(268828681);
  public final static ConferenceInfoProperty ucConfInfoCollaborationModeEnabled = new ConferenceInfoProperty(268828682);
  public final static ConferenceInfoProperty ucConfInfoAutoAttendentEnabled = new ConferenceInfoProperty(268828683);
  public final static ConferenceInfoProperty ucConfInfoTelephonyAccessId = new ConferenceInfoProperty(393228);
  public final static ConferenceInfoProperty ucConfInfoAdmissionKeyRequired = new ConferenceInfoProperty(268828685);
  public final static ConferenceInfoProperty ucConfInfoInternalWebLocation = new ConferenceInfoProperty(393230);
  public final static ConferenceInfoProperty ucConfInfoExternalWebLocation = new ConferenceInfoProperty(393231);
  public final static ConferenceInfoProperty ucConfInfoIsStatic = new ConferenceInfoProperty(268828688);
  public final static ConferenceInfoProperty ucConfInfoAutopromote = new ConferenceInfoProperty(805699601);
  public final static ConferenceInfoProperty ucPSTNLobbyBypass = new ConferenceInfoProperty(268828690);
  public final static ConferenceInfoProperty ucACPTollNumber = new ConferenceInfoProperty(393235);
  public final static ConferenceInfoProperty ucACPTollFreeNumber = new ConferenceInfoProperty(393236);
  public final static ConferenceInfoProperty ucACPDomain = new ConferenceInfoProperty(393237);
  public final static ConferenceInfoProperty ucACPLeaderPasscode = new ConferenceInfoProperty(393238);
  public final static ConferenceInfoProperty ucACPParticipantPasscode = new ConferenceInfoProperty(393239);
  public final static ConferenceInfoProperty ucACPShowTollNumber = new ConferenceInfoProperty(268828696);
  public final static ConferenceInfoProperty ucACPShowTollFreeNumber = new ConferenceInfoProperty(268828697);
  public final static ConferenceInfoProperty ucACPEnableCallMe = new ConferenceInfoProperty(268828698);
  public final static ConferenceInfoProperty ucIsACPEnable = new ConferenceInfoProperty(268828699);
  public final static ConferenceInfoProperty ucConfInfoApplicationData = new ConferenceInfoProperty(1074135068);
  public final static ConferenceInfoProperty ucConfInfoVideoPresentationModeEnabled = new ConferenceInfoProperty(268828701);
  public final static ConferenceInfoProperty ucConfInfoGlobalAnnouncements = new ConferenceInfoProperty(268861441);

  // Integer constants for bitsets and switch statements
  public final static int _ucConfInfoSubject = 393217;
  public final static int _ucConfInfoExpiryTime = 1342570498;
  public final static int _ucConfInfoOrganizerRoamingData = 393219;
  public final static int _ucConfInfoNotificationData = 393220;
  public final static int _ucConfInfoAttendees = 1074135045;
  public final static int _ucConfInfoLeaders = 1074135046;
  public final static int _ucConfInfoModalities = 537264135;
  public final static int _ucConfInfoAdmissionKey = 393224;
  public final static int _ucConfInfoPresentationModeEnabled = 268828681;
  public final static int _ucConfInfoCollaborationModeEnabled = 268828682;
  public final static int _ucConfInfoAutoAttendentEnabled = 268828683;
  public final static int _ucConfInfoTelephonyAccessId = 393228;
  public final static int _ucConfInfoAdmissionKeyRequired = 268828685;
  public final static int _ucConfInfoInternalWebLocation = 393230;
  public final static int _ucConfInfoExternalWebLocation = 393231;
  public final static int _ucConfInfoIsStatic = 268828688;
  public final static int _ucConfInfoAutopromote = 805699601;
  public final static int _ucPSTNLobbyBypass = 268828690;
  public final static int _ucACPTollNumber = 393235;
  public final static int _ucACPTollFreeNumber = 393236;
  public final static int _ucACPDomain = 393237;
  public final static int _ucACPLeaderPasscode = 393238;
  public final static int _ucACPParticipantPasscode = 393239;
  public final static int _ucACPShowTollNumber = 268828696;
  public final static int _ucACPShowTollFreeNumber = 268828697;
  public final static int _ucACPEnableCallMe = 268828698;
  public final static int _ucIsACPEnable = 268828699;
  public final static int _ucConfInfoApplicationData = 1074135068;
  public final static int _ucConfInfoVideoPresentationModeEnabled = 268828701;
  public final static int _ucConfInfoGlobalAnnouncements = 268861441;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceInfoProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceInfoProperty valueOf(int value) {
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
    default: return new ConferenceInfoProperty(value);
    }
  }
}
