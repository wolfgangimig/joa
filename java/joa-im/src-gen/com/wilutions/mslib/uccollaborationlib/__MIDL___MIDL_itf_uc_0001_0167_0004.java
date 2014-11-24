/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0004.
 * Enumerates the conference AutoPromote. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0167_0004 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0167_0004 ucAutoPromoteUnknown = new __MIDL___MIDL_itf_uc_0001_0167_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0004 ucAutoPromoteNone = new __MIDL___MIDL_itf_uc_0001_0167_0004(1);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0004 ucAutoPromoteAuthenticated = new __MIDL___MIDL_itf_uc_0001_0167_0004(2);
  public final static __MIDL___MIDL_itf_uc_0001_0167_0004 ucAutoPromoteAll = new __MIDL___MIDL_itf_uc_0001_0167_0004(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucAutoPromoteUnknown = 0;
  public final static int _ucAutoPromoteNone = 1;
  public final static int _ucAutoPromoteAuthenticated = 2;
  public final static int _ucAutoPromoteAll = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0167_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0167_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucAutoPromoteUnknown;
    case 1: return ucAutoPromoteNone;
    case 2: return ucAutoPromoteAuthenticated;
    case 4: return ucAutoPromoteAll;
    default: return new __MIDL___MIDL_itf_uc_0001_0167_0004(value);
    }
  }
}
