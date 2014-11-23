/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityDisconnectReason.
 * Enumerates the modality disconnect reasons. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityDisconnectReason {
  ucDisconnectReasonNone(0),
  ucDisconnectReasonTimeout(1),
  ucDisconnectReasonBusy(2),
  ucDisconnectReasonNotAcceptableHere(3),
  ucDisconnectReasonDecline(4),
  ucDisconnectReasonDeclineEverywhere(5),
  ucDisconnectReasonReplyOther(6);

  public final int value;
  private ModalityDisconnectReason(int value) { this.value = value; }
  public static  ModalityDisconnectReason valueOf(int value) {
    switch(value) {
    case 0: return ucDisconnectReasonNone;
    case 1: return ucDisconnectReasonTimeout;
    case 2: return ucDisconnectReasonBusy;
    case 3: return ucDisconnectReasonNotAcceptableHere;
    case 4: return ucDisconnectReasonDecline;
    case 5: return ucDisconnectReasonDeclineEverywhere;
    case 6: return ucDisconnectReasonReplyOther;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityDisconnectReason.class);
    }
  }
}
