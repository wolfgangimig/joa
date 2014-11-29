/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0007.
 * Room join state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0007 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0007 ucNotJoined = new __MIDL___MIDL_itf_uc_0001_0191_0007(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0007 ucPending = new __MIDL___MIDL_itf_uc_0001_0191_0007(1);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0007 ucSuccess = new __MIDL___MIDL_itf_uc_0001_0191_0007(2);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0007 ucFailed = new __MIDL___MIDL_itf_uc_0001_0191_0007(3);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0007 ucFailedUnauthorized = new __MIDL___MIDL_itf_uc_0001_0191_0007(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotJoined = 0;
  public final static int _ucPending = 1;
  public final static int _ucSuccess = 2;
  public final static int _ucFailed = 3;
  public final static int _ucFailedUnauthorized = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0007(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucNotJoined;
    case 1: return ucPending;
    case 2: return ucSuccess;
    case 3: return ucFailed;
    case 4: return ucFailedUnauthorized;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0007(value);
    }
  }
}
