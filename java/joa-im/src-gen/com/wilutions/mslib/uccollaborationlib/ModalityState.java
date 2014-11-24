/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ModalityState.
 * Enumerates the modality states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ModalityState {

  // Typed constants
  public final static ModalityState ucModalityDisconnected = new ModalityState(0);
  public final static ModalityState ucModalityConnecting = new ModalityState(1);
  public final static ModalityState ucModalityNotified = new ModalityState(2);
  public final static ModalityState ucModalityJoining = new ModalityState(3);
  public final static ModalityState ucModalityConnectingToCaller = new ModalityState(4);
  public final static ModalityState ucModalityConnected = new ModalityState(5);
  public final static ModalityState ucModalitySuspended = new ModalityState(6);
  public final static ModalityState ucModalityOnHold = new ModalityState(7);
  public final static ModalityState ucModalityForwarding = new ModalityState(8);
  public final static ModalityState ucModalityTransferring = new ModalityState(9);
  public final static ModalityState ucModalityDisconnecting = new ModalityState(10);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityDisconnected = 0;
  public final static int _ucModalityConnecting = 1;
  public final static int _ucModalityNotified = 2;
  public final static int _ucModalityJoining = 3;
  public final static int _ucModalityConnectingToCaller = 4;
  public final static int _ucModalityConnected = 5;
  public final static int _ucModalitySuspended = 6;
  public final static int _ucModalityOnHold = 7;
  public final static int _ucModalityForwarding = 8;
  public final static int _ucModalityTransferring = 9;
  public final static int _ucModalityDisconnecting = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ModalityState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ModalityState(value);
    }
  }
}
