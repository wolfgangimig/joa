/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientState.
 * Enumerates the UC Client State values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ClientState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ClientState ucClientStateUninitialized = new ClientState(0);
  public final static ClientState ucClientStateSignedOut = new ClientState(1);
  public final static ClientState ucClientStateSigningIn = new ClientState(2);
  public final static ClientState ucClientStateSignedIn = new ClientState(3);
  public final static ClientState ucClientStateSigningOut = new ClientState(4);
  public final static ClientState ucClientStateShuttingDown = new ClientState(5);
  public final static ClientState ucClientStateInitializing = new ClientState(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucClientStateUninitialized = 0;
  public final static int _ucClientStateSignedOut = 1;
  public final static int _ucClientStateSigningIn = 2;
  public final static int _ucClientStateSignedIn = 3;
  public final static int _ucClientStateSigningOut = 4;
  public final static int _ucClientStateShuttingDown = 5;
  public final static int _ucClientStateInitializing = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ClientState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ClientState valueOf(int value) {
    switch(value) {
    case 0: return ucClientStateUninitialized;
    case 1: return ucClientStateSignedOut;
    case 2: return ucClientStateSigningIn;
    case 3: return ucClientStateSignedIn;
    case 4: return ucClientStateSigningOut;
    case 5: return ucClientStateShuttingDown;
    case 6: return ucClientStateInitializing;
    default: return new ClientState(value);
    }
  }
}
