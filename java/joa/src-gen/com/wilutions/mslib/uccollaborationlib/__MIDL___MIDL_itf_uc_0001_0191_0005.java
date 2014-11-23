/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0005.
 * Enumerates the room type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0005 {
  ucRoomNormal(0),
  ucRoomAuditorium(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0005(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomNormal;
    case 1: return ucRoomAuditorium;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0005.class);
    }
  }
}
