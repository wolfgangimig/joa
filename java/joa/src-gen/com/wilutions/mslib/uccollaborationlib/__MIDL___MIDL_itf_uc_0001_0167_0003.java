/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0167_0003.
 * Enumerates the conference admission types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0167_0003 {
  ucOpenAuthenticated(1),
  ucClosedAuthenticated(2),
  ucAnonymous(3),
  ucLocked(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0167_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0167_0003 valueOf(int value) {
    switch(value) {
    case 1: return ucOpenAuthenticated;
    case 2: return ucClosedAuthenticated;
    case 3: return ucAnonymous;
    case 4: return ucLocked;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0167_0003.class);
    }
  }
}
