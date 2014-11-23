/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityState.
 * Enumerates the modality states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ModalityState {
  ucModalityDisconnected(0),
  ucModalityConnecting(1),
  ucModalityNotified(2),
  ucModalityJoining(3),
  ucModalityConnectingToCaller(4),
  ucModalityConnected(5),
  ucModalitySuspended(6),
  ucModalityOnHold(7),
  ucModalityForwarding(8),
  ucModalityTransferring(9),
  ucModalityDisconnecting(10);

  public final int value;
  private ModalityState(int value) { this.value = value; }
  public static  ModalityState valueOf(int value) {
    switch(value) {
    case 0: return ucModalityDisconnected;
    case 1: return ucModalityConnecting;
    case 2: return ucModalityNotified;
    case 3: return ucModalityJoining;
    case 4: return ucModalityConnectingToCaller;
    case 5: return ucModalityConnected;
    case 6: return ucModalitySuspended;
    case 7: return ucModalityOnHold;
    case 8: return ucModalityForwarding;
    case 9: return ucModalityTransferring;
    case 10: return ucModalityDisconnecting;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ModalityState.class);
    }
  }
}
