/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0001.
 * Enumerates the UC Client State values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateUninitialized = new __MIDL___MIDL_itf_uc_0001_0255_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateSignedOut = new __MIDL___MIDL_itf_uc_0001_0255_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateSigningIn = new __MIDL___MIDL_itf_uc_0001_0255_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateSignedIn = new __MIDL___MIDL_itf_uc_0001_0255_0001(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateSigningOut = new __MIDL___MIDL_itf_uc_0001_0255_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateShuttingDown = new __MIDL___MIDL_itf_uc_0001_0255_0001(5);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0001 ucClientStateInitializing = new __MIDL___MIDL_itf_uc_0001_0255_0001(6);

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
  private __MIDL___MIDL_itf_uc_0001_0255_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucClientStateUninitialized;
    case 1: return ucClientStateSignedOut;
    case 2: return ucClientStateSigningIn;
    case 3: return ucClientStateSignedIn;
    case 4: return ucClientStateSigningOut;
    case 5: return ucClientStateShuttingDown;
    case 6: return ucClientStateInitializing;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0001(value);
    }
  }
}
