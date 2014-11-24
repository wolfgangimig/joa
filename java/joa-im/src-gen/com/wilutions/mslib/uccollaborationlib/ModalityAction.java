/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityAction.
 * Enumerates the modality actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityAction {

  // Typed constants
  public final static ModalityAction ucModalityActionConnect = new ModalityAction(0);
  public final static ModalityAction ucModalityActionDisconnect = new ModalityAction(1);
  public final static ModalityAction ucModalityActionSetProperty = new ModalityAction(2);
  public final static ModalityAction ucModalityActionHold = new ModalityAction(3);
  public final static ModalityAction ucModalityActionRetrieve = new ModalityAction(4);
  public final static ModalityAction ucModalityActionForward = new ModalityAction(5);
  public final static ModalityAction ucModalityActionRemoteTransfer = new ModalityAction(6);
  public final static ModalityAction ucModalityActionConsultAndTransfer = new ModalityAction(7);
  public final static ModalityAction ucModalityActionSendInstantMessage = new ModalityAction(8);
  public final static ModalityAction ucModalityActionSetIsTyping = new ModalityAction(9);
  public final static ModalityAction ucModalityActionSetAudioEndpoint = new ModalityAction(10);
  public final static ModalityAction ucModalityActionAccept = new ModalityAction(11);
  public final static ModalityAction ucModalityActionReject = new ModalityAction(12);
  public final static ModalityAction ucModalityActionLocalTransfer = new ModalityAction(13);
  public final static ModalityAction ucModalityActionRequestSharingControl = new ModalityAction(14);
  public final static ModalityAction ucModalityActionReleaseSharingControl = new ModalityAction(15);
  public final static ModalityAction ucModalityActionGrantSharingControl = new ModalityAction(16);
  public final static ModalityAction ucModalityActionRevokeSharingControl = new ModalityAction(17);
  public final static ModalityAction ucModalityActionAcceptSharingControlRequest = new ModalityAction(18);
  public final static ModalityAction ucModalityActionDeclineSharingControlRequest = new ModalityAction(19);
  public final static ModalityAction ucModalityActionCreateShareablePowerPointContent = new ModalityAction(20);
  public final static ModalityAction ucModalityActionCreateShareableWhiteboardContent = new ModalityAction(21);
  public final static ModalityAction ucModalityActionCreateShareableNativeFileOnlyContent = new ModalityAction(22);
  public final static ModalityAction ucModalityActionCreateShareablePollContent = new ModalityAction(23);
  public final static ModalityAction ucModalityActionCreateShareableNotesContent = new ModalityAction(24);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityActionConnect = 0;
  public final static int _ucModalityActionDisconnect = 1;
  public final static int _ucModalityActionSetProperty = 2;
  public final static int _ucModalityActionHold = 3;
  public final static int _ucModalityActionRetrieve = 4;
  public final static int _ucModalityActionForward = 5;
  public final static int _ucModalityActionRemoteTransfer = 6;
  public final static int _ucModalityActionConsultAndTransfer = 7;
  public final static int _ucModalityActionSendInstantMessage = 8;
  public final static int _ucModalityActionSetIsTyping = 9;
  public final static int _ucModalityActionSetAudioEndpoint = 10;
  public final static int _ucModalityActionAccept = 11;
  public final static int _ucModalityActionReject = 12;
  public final static int _ucModalityActionLocalTransfer = 13;
  public final static int _ucModalityActionRequestSharingControl = 14;
  public final static int _ucModalityActionReleaseSharingControl = 15;
  public final static int _ucModalityActionGrantSharingControl = 16;
  public final static int _ucModalityActionRevokeSharingControl = 17;
  public final static int _ucModalityActionAcceptSharingControlRequest = 18;
  public final static int _ucModalityActionDeclineSharingControlRequest = 19;
  public final static int _ucModalityActionCreateShareablePowerPointContent = 20;
  public final static int _ucModalityActionCreateShareableWhiteboardContent = 21;
  public final static int _ucModalityActionCreateShareableNativeFileOnlyContent = 22;
  public final static int _ucModalityActionCreateShareablePollContent = 23;
  public final static int _ucModalityActionCreateShareableNotesContent = 24;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ModalityAction(value);
    }
  }
}
