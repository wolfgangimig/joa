/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0004.
 * Enumerates the room seach mode type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0004 {
  ucRoomSearchModeRegular(0),
  ucRoomSearchModeExtended(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomSearchModeRegular;
    case 1: return ucRoomSearchModeExtended;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0004.class);
    }
  }
}
