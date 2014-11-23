/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0003.
 * Enumerates the room message filter action. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0003 {
  ucRoomMessageFilterCanceled(0),
  ucRoomMessageFilterReplaced(1),
  ucRoomMessageFilterPassed(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageFilterCanceled;
    case 1: return ucRoomMessageFilterReplaced;
    case 2: return ucRoomMessageFilterPassed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0003.class);
    }
  }
}
