/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0001.
 * Enumerates the room message type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0001 ucRoomMessageAlert = new __MIDL___MIDL_itf_uc_0001_0191_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0001 ucRoomMessageRegular = new __MIDL___MIDL_itf_uc_0001_0191_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0001 ucRoomMessageStory = new __MIDL___MIDL_itf_uc_0001_0191_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0001 ucRoomMessageTypeMAX = new __MIDL___MIDL_itf_uc_0001_0191_0001(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessageAlert = 0;
  public final static int _ucRoomMessageRegular = 1;
  public final static int _ucRoomMessageStory = 2;
  public final static int _ucRoomMessageTypeMAX = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageAlert;
    case 1: return ucRoomMessageRegular;
    case 2: return ucRoomMessageStory;
    case 3: return ucRoomMessageTypeMAX;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0001(value);
    }
  }
}
