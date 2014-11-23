/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientState.
 * Enumerates the UC Client State values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ClientState {
  ucClientStateUninitialized(0),
  ucClientStateSignedOut(1),
  ucClientStateSigningIn(2),
  ucClientStateSignedIn(3),
  ucClientStateSigningOut(4),
  ucClientStateShuttingDown(5),
  ucClientStateInitializing(6);

  public final int value;
  private ClientState(int value) { this.value = value; }
  public static  ClientState valueOf(int value) {
    switch(value) {
    case 0: return ucClientStateUninitialized;
    case 1: return ucClientStateSignedOut;
    case 2: return ucClientStateSigningIn;
    case 3: return ucClientStateSignedIn;
    case 4: return ucClientStateSigningOut;
    case 5: return ucClientStateShuttingDown;
    case 6: return ucClientStateInitializing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ClientState.class);
    }
  }
}
