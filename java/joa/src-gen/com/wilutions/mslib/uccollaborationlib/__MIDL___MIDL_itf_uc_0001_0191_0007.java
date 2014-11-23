/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0007.
 * Room join state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0007 {
  ucNotJoined(0),
  ucPending(1),
  ucSuccess(2),
  ucFailed(3),
  ucFailedUnauthorized(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0007(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucNotJoined;
    case 1: return ucPending;
    case 2: return ucSuccess;
    case 3: return ucFailed;
    case 4: return ucFailedUnauthorized;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0007.class);
    }
  }
}
