/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0029.
 * Enumerates the conversation properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0029 {
  ucConversationId(524288),
  ucConversationSubject(524289),
  ucConversationImportance(805830658),
  ucConversationTransferredBy(524291),
  ucConversationReplaced(524292),
  ucConversationConferencingUri(524293),
  ucConversationRepresentedBy(1074266118),
  ucConversationConferenceInviterRepresentationInfo(1074266119),
  ucConversationFollowUp(268959752),
  ucConversationDirection(805830665),
  ucConversationConferenceAcceptingParticipant(1074266122),
  ucConversationPreviousConversationId(524299),
  ucConversationAcceptanceState(805830668),
  ucConversationIsUsbConversation(268959757),
  ucConversationAutoTerminateOnIdle(268959758),
  ucConversationConferenceEscalationProgress(805830671),
  ucConversationConferenceEscalationResult(537395216),
  ucConversationConferencingInvitedModes(537395217),
  ucConversationInviter(1074266130),
  ucConversationConferencingLocked(268959763),
  ucConversationConferencingFirstInstantMessage(524308),
  ucConversationConferenceAccessInformation(1074266133),
  ucConversationConferencingAccessType(537395222),
  ucConversationCallParkOrbit(1074266136),
  ucConversationConferenceDisclaimer(1074266137),
  ucConversationConferenceDisclaimerAccepted(537395226),
  ucConversationConferenceTerminateOnLeave(268959771),
  ucConversationNumberOfParticipantsRecording(537395228),
  ucConversationConferenceJoinDialogCompleted(268959773),
  ucConversationLastActivityTimeStamp(1342701598),
  ucConversationConferenceDialogId(524319),
  ucConversationConferenceDialogFromTag(524320),
  ucConversationConferenceDialogToTag(524321),
  ucConversationConferenceEndorseEnabled(268959778),
  ucConversationConferenceHardMute(268959779),
  ucConversationConferenceAutoPromoteLevel(537427969),
  ucConversationConferencePermittedAutoPromoteLevels(537427970),
  ucConversationConferencePSTNBypassEnabled(268992515),
  ucConversationConferencePermissionManager(1074298884),
  ucConversationPresentedItem(1074298885),
  ucConversationActivePresenter(1074298886),
  ucConversationConferenceGlobalAnnouncements(268992519),
  ucConversationViewedItem(1074298888),
  ucConversationPresentationState(1074298889),
  ucConversationConferenceIsRosterLimited(268992522);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0029(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0029 valueOf(int value) {
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0029.class);
    }
  }
}
