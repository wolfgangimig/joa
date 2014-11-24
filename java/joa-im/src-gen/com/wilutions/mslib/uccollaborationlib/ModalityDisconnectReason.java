/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityDisconnectReason.
 * Enumerates the modality disconnect reasons. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityDisconnectReason {

  // Typed constants
  public final static ModalityDisconnectReason ucDisconnectReasonNone = new ModalityDisconnectReason(0);
  public final static ModalityDisconnectReason ucDisconnectReasonTimeout = new ModalityDisconnectReason(1);
  public final static ModalityDisconnectReason ucDisconnectReasonBusy = new ModalityDisconnectReason(2);
  public final static ModalityDisconnectReason ucDisconnectReasonNotAcceptableHere = new ModalityDisconnectReason(3);
  public final static ModalityDisconnectReason ucDisconnectReasonDecline = new ModalityDisconnectReason(4);
  public final static ModalityDisconnectReason ucDisconnectReasonDeclineEverywhere = new ModalityDisconnectReason(5);
  public final static ModalityDisconnectReason ucDisconnectReasonReplyOther = new ModalityDisconnectReason(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucDisconnectReasonNone = 0;
  public final static int _ucDisconnectReasonTimeout = 1;
  public final static int _ucDisconnectReasonBusy = 2;
  public final static int _ucDisconnectReasonNotAcceptableHere = 3;
  public final static int _ucDisconnectReasonDecline = 4;
  public final static int _ucDisconnectReasonDeclineEverywhere = 5;
  public final static int _ucDisconnectReasonReplyOther = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityDisconnectReason(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ModalityDisconnectReason valueOf(int value) {
    switch(value) {
    case 0: return ucDisconnectReasonNone;
    case 1: return ucDisconnectReasonTimeout;
    case 2: return ucDisconnectReasonBusy;
    case 3: return ucDisconnectReasonNotAcceptableHere;
    case 4: return ucDisconnectReasonDecline;
    case 5: return ucDisconnectReasonDeclineEverywhere;
    case 6: return ucDisconnectReasonReplyOther;
    default: return new ModalityDisconnectReason(value);
    }
  }
}
