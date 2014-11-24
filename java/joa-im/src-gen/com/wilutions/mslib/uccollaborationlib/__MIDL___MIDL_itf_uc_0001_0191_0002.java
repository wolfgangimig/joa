/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0002.
 * Enumerates the room message format. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0002 ucRoomMessagePlainText = new __MIDL___MIDL_itf_uc_0001_0191_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0002 ucRoomMessageRtf = new __MIDL___MIDL_itf_uc_0001_0191_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0002 ucRoomMessageMAX = new __MIDL___MIDL_itf_uc_0001_0191_0002(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessagePlainText = 0;
  public final static int _ucRoomMessageRtf = 1;
  public final static int _ucRoomMessageMAX = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessagePlainText;
    case 1: return ucRoomMessageRtf;
    case 2: return ucRoomMessageMAX;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0002(value);
    }
  }
}
