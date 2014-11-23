/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0032.
 * Enumerates the modality state change properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0032 {
  ucModalityStateChangeForwardHistoryInfo(1074528256),
  ucModalityStateChangeAcceptingParticipant(1074528257),
  ucModalityStateChangeAcceptingEndpoint(1074528258),
  ucModalityStateChangeTransferTargetParticipant(1074528259),
  ucModalityStateChangeTransferTargetEndpoint(1074528260),
  ucModalityStateChangeAlsoRingingOthers(806092805),
  ucModalityStateChangeIsAutoAccepted(269221894),
  ucModalityStateChangeAllowedRedirection(537657351),
  ucModalityStateChangeInvitingDevice(1074528264),
  ucModalityStateChangeInvitingParticipant(1074561025),
  ucModalityStateChangeInvitedParticipant(1074561027),
  ucModalityStateChangeInvitedDevice(1074561028),
  ucModalityStateChangeTransferFromParticipant(1074561029),
  ucModalityStateChangeTransferFromDevice(1074561030),
  ucModalityStateChangeTransferToParticipant(1074561031),
  ucModalityStateChangeTransferedParticipant(1074561032),
  ucModalityStateChangeTransferedDevice(1074561033),
  ucModalityStateChangeForwardFromParticipant(1074561034),
  ucModalityStateChangeForwardFromDevice(1074561035),
  ucModalityStateChangeForwardToParticipant(1074561036),
  ucModalityStateChangeForwardToDevice(1074561037),
  ucModalityStateChangeRemoteParticipantInP2PSession(1074561038),
  ucModalityStateChangeRemoteDeviceInP2PSession(1074561039),
  ucModalityStateChangeInviteMessage(819216),
  ucModalityStateChangeInviteMessageMode(537690129),
  ucModalityStateChangeAllModes(537690130),
  ucModalityStateChangeInitiator(269254675),
  ucModalityStateChangeMovedToNewConversation(269254676),
  ucModalityStateChangeSessionReplaced(269254677),
  ucModalityStateChangeCallInitiatedFromDevice(269254678),
  ucModalityStateChangeFailedToConnectToFocus(269254679),
  ucModalityStateChangePrevState(537690136),
  ucModalityStateChangePersonalTransfer(269254681),
  ucModalityStateChangeReplacesSession(537690138),
  ucModalityStateChangeTransferContext(1074561051),
  ucModalityStateChangeTransferSession(537690140),
  ucModalityStateChangeTransferToDeviceExact(1074561053),
  ucModalityStateChangeTransferToConvParticipant(1074561054),
  ucModalityStateChangeDevice(1074561055);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0032(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0032 valueOf(int value) {
    switch(value) {
    case 1074528256: return ucModalityStateChangeForwardHistoryInfo;
    case 1074528257: return ucModalityStateChangeAcceptingParticipant;
    case 1074528258: return ucModalityStateChangeAcceptingEndpoint;
    case 1074528259: return ucModalityStateChangeTransferTargetParticipant;
    case 1074528260: return ucModalityStateChangeTransferTargetEndpoint;
    case 806092805: return ucModalityStateChangeAlsoRingingOthers;
    case 269221894: return ucModalityStateChangeIsAutoAccepted;
    case 537657351: return ucModalityStateChangeAllowedRedirection;
    case 1074528264: return ucModalityStateChangeInvitingDevice;
    case 1074561025: return ucModalityStateChangeInvitingParticipant;
    case 1074561027: return ucModalityStateChangeInvitedParticipant;
    case 1074561028: return ucModalityStateChangeInvitedDevice;
    case 1074561029: return ucModalityStateChangeTransferFromParticipant;
    case 1074561030: return ucModalityStateChangeTransferFromDevice;
    case 1074561031: return ucModalityStateChangeTransferToParticipant;
    case 1074561032: return ucModalityStateChangeTransferedParticipant;
    case 1074561033: return ucModalityStateChangeTransferedDevice;
    case 1074561034: return ucModalityStateChangeForwardFromParticipant;
    case 1074561035: return ucModalityStateChangeForwardFromDevice;
    case 1074561036: return ucModalityStateChangeForwardToParticipant;
    case 1074561037: return ucModalityStateChangeForwardToDevice;
    case 1074561038: return ucModalityStateChangeRemoteParticipantInP2PSession;
    case 1074561039: return ucModalityStateChangeRemoteDeviceInP2PSession;
    case 819216: return ucModalityStateChangeInviteMessage;
    case 537690129: return ucModalityStateChangeInviteMessageMode;
    case 537690130: return ucModalityStateChangeAllModes;
    case 269254675: return ucModalityStateChangeInitiator;
    case 269254676: return ucModalityStateChangeMovedToNewConversation;
    case 269254677: return ucModalityStateChangeSessionReplaced;
    case 269254678: return ucModalityStateChangeCallInitiatedFromDevice;
    case 269254679: return ucModalityStateChangeFailedToConnectToFocus;
    case 537690136: return ucModalityStateChangePrevState;
    case 269254681: return ucModalityStateChangePersonalTransfer;
    case 537690138: return ucModalityStateChangeReplacesSession;
    case 1074561051: return ucModalityStateChangeTransferContext;
    case 537690140: return ucModalityStateChangeTransferSession;
    case 1074561053: return ucModalityStateChangeTransferToDeviceExact;
    case 1074561054: return ucModalityStateChangeTransferToConvParticipant;
    case 1074561055: return ucModalityStateChangeDevice;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0032.class);
    }
  }
}
