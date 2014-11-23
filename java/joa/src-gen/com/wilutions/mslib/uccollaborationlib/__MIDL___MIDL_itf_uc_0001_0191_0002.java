/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0002.
 * Enumerates the room message format. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0002 {
  ucRoomMessagePlainText(0),
  ucRoomMessageRtf(1),
  ucRoomMessageMAX(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessagePlainText;
    case 1: return ucRoomMessageRtf;
    case 2: return ucRoomMessageMAX;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0002.class);
    }
  }
}
