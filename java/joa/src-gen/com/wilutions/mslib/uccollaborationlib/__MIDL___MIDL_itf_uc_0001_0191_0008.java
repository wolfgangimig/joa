/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0008.
 * Enumerates the room manager state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0008 {
  ucRoomManagerDisabled(0),
  ucRoomManagerEnabled(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0008(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomManagerDisabled;
    case 1: return ucRoomManagerEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0008.class);
    }
  }
}
