/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationProperty.
 * Enumerates the conversation properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationProperty {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationProperty ucConversationId = new ConversationProperty(524288);
  public final static ConversationProperty ucConversationSubject = new ConversationProperty(524289);
  public final static ConversationProperty ucConversationImportance = new ConversationProperty(805830658);
  public final static ConversationProperty ucConversationTransferredBy = new ConversationProperty(524291);
  public final static ConversationProperty ucConversationReplaced = new ConversationProperty(524292);
  public final static ConversationProperty ucConversationConferencingUri = new ConversationProperty(524293);
  public final static ConversationProperty ucConversationRepresentedBy = new ConversationProperty(1074266118);
  public final static ConversationProperty ucConversationConferenceInviterRepresentationInfo = new ConversationProperty(1074266119);
  public final static ConversationProperty ucConversationFollowUp = new ConversationProperty(268959752);
  public final static ConversationProperty ucConversationDirection = new ConversationProperty(805830665);
  public final static ConversationProperty ucConversationConferenceAcceptingParticipant = new ConversationProperty(1074266122);
  public final static ConversationProperty ucConversationPreviousConversationId = new ConversationProperty(524299);
  public final static ConversationProperty ucConversationAcceptanceState = new ConversationProperty(805830668);
  public final static ConversationProperty ucConversationIsUsbConversation = new ConversationProperty(268959757);
  public final static ConversationProperty ucConversationAutoTerminateOnIdle = new ConversationProperty(268959758);
  public final static ConversationProperty ucConversationConferenceEscalationProgress = new ConversationProperty(805830671);
  public final static ConversationProperty ucConversationConferenceEscalationResult = new ConversationProperty(537395216);
  public final static ConversationProperty ucConversationConferencingInvitedModes = new ConversationProperty(537395217);
  public final static ConversationProperty ucConversationInviter = new ConversationProperty(1074266130);
  public final static ConversationProperty ucConversationConferencingLocked = new ConversationProperty(268959763);
  public final static ConversationProperty ucConversationConferencingFirstInstantMessage = new ConversationProperty(524308);
  public final static ConversationProperty ucConversationConferenceAccessInformation = new ConversationProperty(1074266133);
  public final static ConversationProperty ucConversationConferencingAccessType = new ConversationProperty(537395222);
  public final static ConversationProperty ucConversationCallParkOrbit = new ConversationProperty(1074266136);
  public final static ConversationProperty ucConversationConferenceDisclaimer = new ConversationProperty(1074266137);
  public final static ConversationProperty ucConversationConferenceDisclaimerAccepted = new ConversationProperty(537395226);
  public final static ConversationProperty ucConversationConferenceTerminateOnLeave = new ConversationProperty(268959771);
  public final static ConversationProperty ucConversationNumberOfParticipantsRecording = new ConversationProperty(537395228);
  public final static ConversationProperty ucConversationConferenceJoinDialogCompleted = new ConversationProperty(268959773);
  public final static ConversationProperty ucConversationLastActivityTimeStamp = new ConversationProperty(1342701598);
  public final static ConversationProperty ucConversationConferenceDialogId = new ConversationProperty(524319);
  public final static ConversationProperty ucConversationConferenceDialogFromTag = new ConversationProperty(524320);
  public final static ConversationProperty ucConversationConferenceDialogToTag = new ConversationProperty(524321);
  public final static ConversationProperty ucConversationConferenceEndorseEnabled = new ConversationProperty(268959778);
  public final static ConversationProperty ucConversationConferenceHardMute = new ConversationProperty(268959779);
  public final static ConversationProperty ucConversationConferenceAutoPromoteLevel = new ConversationProperty(537427969);
  public final static ConversationProperty ucConversationConferencePermittedAutoPromoteLevels = new ConversationProperty(537427970);
  public final static ConversationProperty ucConversationConferencePSTNBypassEnabled = new ConversationProperty(268992515);
  public final static ConversationProperty ucConversationConferencePermissionManager = new ConversationProperty(1074298884);
  public final static ConversationProperty ucConversationPresentedItem = new ConversationProperty(1074298885);
  public final static ConversationProperty ucConversationActivePresenter = new ConversationProperty(1074298886);
  public final static ConversationProperty ucConversationConferenceGlobalAnnouncements = new ConversationProperty(268992519);
  public final static ConversationProperty ucConversationViewedItem = new ConversationProperty(1074298888);
  public final static ConversationProperty ucConversationPresentationState = new ConversationProperty(1074298889);
  public final static ConversationProperty ucConversationConferenceIsRosterLimited = new ConversationProperty(268992522);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationId = 524288;
  public final static int _ucConversationSubject = 524289;
  public final static int _ucConversationImportance = 805830658;
  public final static int _ucConversationTransferredBy = 524291;
  public final static int _ucConversationReplaced = 524292;
  public final static int _ucConversationConferencingUri = 524293;
  public final static int _ucConversationRepresentedBy = 1074266118;
  public final static int _ucConversationConferenceInviterRepresentationInfo = 1074266119;
  public final static int _ucConversationFollowUp = 268959752;
  public final static int _ucConversationDirection = 805830665;
  public final static int _ucConversationConferenceAcceptingParticipant = 1074266122;
  public final static int _ucConversationPreviousConversationId = 524299;
  public final static int _ucConversationAcceptanceState = 805830668;
  public final static int _ucConversationIsUsbConversation = 268959757;
  public final static int _ucConversationAutoTerminateOnIdle = 268959758;
  public final static int _ucConversationConferenceEscalationProgress = 805830671;
  public final static int _ucConversationConferenceEscalationResult = 537395216;
  public final static int _ucConversationConferencingInvitedModes = 537395217;
  public final static int _ucConversationInviter = 1074266130;
  public final static int _ucConversationConferencingLocked = 268959763;
  public final static int _ucConversationConferencingFirstInstantMessage = 524308;
  public final static int _ucConversationConferenceAccessInformation = 1074266133;
  public final static int _ucConversationConferencingAccessType = 537395222;
  public final static int _ucConversationCallParkOrbit = 1074266136;
  public final static int _ucConversationConferenceDisclaimer = 1074266137;
  public final static int _ucConversationConferenceDisclaimerAccepted = 537395226;
  public final static int _ucConversationConferenceTerminateOnLeave = 268959771;
  public final static int _ucConversationNumberOfParticipantsRecording = 537395228;
  public final static int _ucConversationConferenceJoinDialogCompleted = 268959773;
  public final static int _ucConversationLastActivityTimeStamp = 1342701598;
  public final static int _ucConversationConferenceDialogId = 524319;
  public final static int _ucConversationConferenceDialogFromTag = 524320;
  public final static int _ucConversationConferenceDialogToTag = 524321;
  public final static int _ucConversationConferenceEndorseEnabled = 268959778;
  public final static int _ucConversationConferenceHardMute = 268959779;
  public final static int _ucConversationConferenceAutoPromoteLevel = 537427969;
  public final static int _ucConversationConferencePermittedAutoPromoteLevels = 537427970;
  public final static int _ucConversationConferencePSTNBypassEnabled = 268992515;
  public final static int _ucConversationConferencePermissionManager = 1074298884;
  public final static int _ucConversationPresentedItem = 1074298885;
  public final static int _ucConversationActivePresenter = 1074298886;
  public final static int _ucConversationConferenceGlobalAnnouncements = 268992519;
  public final static int _ucConversationViewedItem = 1074298888;
  public final static int _ucConversationPresentationState = 1074298889;
  public final static int _ucConversationConferenceIsRosterLimited = 268992522;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationProperty valueOf(int value) {
    switch(value) {
    case 524288: return ucConversationId;
    case 524289: return ucConversationSubject;
    case 805830658: return ucConversationImportance;
    case 524291: return ucConversationTransferredBy;
    case 524292: return ucConversationReplaced;
    case 524293: return ucConversationConferencingUri;
    case 1074266118: return ucConversationRepresentedBy;
    case 1074266119: return ucConversationConferenceInviterRepresentationInfo;
    case 268959752: return ucConversationFollowUp;
    case 805830665: return ucConversationDirection;
    case 1074266122: return ucConversationConferenceAcceptingParticipant;
    case 524299: return ucConversationPreviousConversationId;
    case 805830668: return ucConversationAcceptanceState;
    case 268959757: return ucConversationIsUsbConversation;
    case 268959758: return ucConversationAutoTerminateOnIdle;
    case 805830671: return ucConversationConferenceEscalationProgress;
    case 537395216: return ucConversationConferenceEscalationResult;
    case 537395217: return ucConversationConferencingInvitedModes;
    case 1074266130: return ucConversationInviter;
    case 268959763: return ucConversationConferencingLocked;
    case 524308: return ucConversationConferencingFirstInstantMessage;
    case 1074266133: return ucConversationConferenceAccessInformation;
    case 537395222: return ucConversationConferencingAccessType;
    case 1074266136: return ucConversationCallParkOrbit;
    case 1074266137: return ucConversationConferenceDisclaimer;
    case 537395226: return ucConversationConferenceDisclaimerAccepted;
    case 268959771: return ucConversationConferenceTerminateOnLeave;
    case 537395228: return ucConversationNumberOfParticipantsRecording;
    case 268959773: return ucConversationConferenceJoinDialogCompleted;
    case 1342701598: return ucConversationLastActivityTimeStamp;
    case 524319: return ucConversationConferenceDialogId;
    case 524320: return ucConversationConferenceDialogFromTag;
    case 524321: return ucConversationConferenceDialogToTag;
    case 268959778: return ucConversationConferenceEndorseEnabled;
    case 268959779: return ucConversationConferenceHardMute;
    case 537427969: return ucConversationConferenceAutoPromoteLevel;
    case 537427970: return ucConversationConferencePermittedAutoPromoteLevels;
    case 268992515: return ucConversationConferencePSTNBypassEnabled;
    case 1074298884: return ucConversationConferencePermissionManager;
    case 1074298885: return ucConversationPresentedItem;
    case 1074298886: return ucConversationActivePresenter;
    case 268992519: return ucConversationConferenceGlobalAnnouncements;
    case 1074298888: return ucConversationViewedItem;
    case 1074298889: return ucConversationPresentationState;
    case 268992522: return ucConversationConferenceIsRosterLimited;
    default: return new ConversationProperty(value);
    }
  }
}
