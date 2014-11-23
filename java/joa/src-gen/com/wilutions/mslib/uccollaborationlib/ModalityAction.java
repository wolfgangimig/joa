/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityAction.
 * Enumerates the modality actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityAction {
  ucModalityActionConnect(0),
  ucModalityActionDisconnect(1),
  ucModalityActionSetProperty(2),
  ucModalityActionHold(3),
  ucModalityActionRetrieve(4),
  ucModalityActionForward(5),
  ucModalityActionRemoteTransfer(6),
  ucModalityActionConsultAndTransfer(7),
  ucModalityActionSendInstantMessage(8),
  ucModalityActionSetIsTyping(9),
  ucModalityActionSetAudioEndpoint(10),
  ucModalityActionAccept(11),
  ucModalityActionReject(12),
  ucModalityActionLocalTransfer(13),
  ucModalityActionRequestSharingControl(14),
  ucModalityActionReleaseSharingControl(15),
  ucModalityActionGrantSharingControl(16),
  ucModalityActionRevokeSharingControl(17),
  ucModalityActionAcceptSharingControlRequest(18),
  ucModalityActionDeclineSharingControlRequest(19),
  ucModalityActionCreateShareablePowerPointContent(20),
  ucModalityActionCreateShareableWhiteboardContent(21),
  ucModalityActionCreateShareableNativeFileOnlyContent(22),
  ucModalityActionCreateShareablePollContent(23),
  ucModalityActionCreateShareableNotesContent(24);

  public final int value;
  private ModalityAction(int value) { this.value = value; }
  public static  ModalityAction valueOf(int value) {
    switch(value) {
    case 0: return ucModalityActionConnect;
    case 1: return ucModalityActionDisconnect;
    case 2: return ucModalityActionSetProperty;
    case 3: return ucModalityActionHold;
    case 4: return ucModalityActionRetrieve;
    case 5: return ucModalityActionForward;
    case 6: return ucModalityActionRemoteTransfer;
    case 7: return ucModalityActionConsultAndTransfer;
    case 8: return ucModalityActionSendInstantMessage;
    case 9: return ucModalityActionSetIsTyping;
    case 10: return ucModalityActionSetAudioEndpoint;
    case 11: return ucModalityActionAccept;
    case 12: return ucModalityActionReject;
    case 13: return ucModalityActionLocalTransfer;
    case 14: return ucModalityActionRequestSharingControl;
    case 15: return ucModalityActionReleaseSharingControl;
    case 16: return ucModalityActionGrantSharingControl;
    case 17: return ucModalityActionRevokeSharingControl;
    case 18: return ucModalityActionAcceptSharingControlRequest;
    case 19: return ucModalityActionDeclineSharingControlRequest;
    case 20: return ucModalityActionCreateShareablePowerPointContent;
    case 21: return ucModalityActionCreateShareableWhiteboardContent;
    case 22: return ucModalityActionCreateShareableNativeFileOnlyContent;
    case 23: return ucModalityActionCreateShareablePollContent;
    case 24: return ucModalityActionCreateShareableNotesContent;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityAction.class);
    }
  }
}
