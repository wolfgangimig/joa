/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0003.
 * Enumerates the conference admission types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0167_0003 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0167_0003 ucOpenAuthenticated = new __MIDL___MIDL_itf_uc_0001_0167_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0003 ucClosedAuthenticated = new __MIDL___MIDL_itf_uc_0001_0167_0003(2);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0003 ucAnonymous = new __MIDL___MIDL_itf_uc_0001_0167_0003(3);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0003 ucLocked = new __MIDL___MIDL_itf_uc_0001_0167_0003(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucOpenAuthenticated = 1;
  public final static int _ucClosedAuthenticated = 2;
  public final static int _ucAnonymous = 3;
  public final static int _ucLocked = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0167_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0167_0003 valueOf(int value) {
    switch(value) {
    case 1: return ucOpenAuthenticated;
    case 2: return ucClosedAuthenticated;
    case 3: return ucAnonymous;
    case 4: return ucLocked;
    default: return new __MIDL___MIDL_itf_uc_0001_0167_0003(value);
    }
  }
}
