/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0001.
 * Enumerates the UC Client State values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0001 {
  ucClientStateUninitialized(0),
  ucClientStateSignedOut(1),
  ucClientStateSigningIn(2),
  ucClientStateSignedIn(3),
  ucClientStateSigningOut(4),
  ucClientStateShuttingDown(5),
  ucClientStateInitializing(6);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucClientStateUninitialized;
    case 1: return ucClientStateSignedOut;
    case 2: return ucClientStateSigningIn;
    case 3: return ucClientStateSignedIn;
    case 4: return ucClientStateSigningOut;
    case 5: return ucClientStateShuttingDown;
    case 6: return ucClientStateInitializing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0001.class);
    }
  }
}
