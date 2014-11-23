/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0001.
 * Enumerates the room message type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0191_0001 {
  ucRoomMessageAlert(0),
  ucRoomMessageRegular(1),
  ucRoomMessageStory(2),
  ucRoomMessageTypeMAX(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0191_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0191_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageAlert;
    case 1: return ucRoomMessageRegular;
    case 2: return ucRoomMessageStory;
    case 3: return ucRoomMessageTypeMAX;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0191_0001.class);
    }
  }
}
