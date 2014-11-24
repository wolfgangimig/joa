/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0003.
 * Enumerates the room message filter action. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0003 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0003 ucRoomMessageFilterCanceled = new __MIDL___MIDL_itf_uc_0001_0191_0003(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0003 ucRoomMessageFilterReplaced = new __MIDL___MIDL_itf_uc_0001_0191_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0003 ucRoomMessageFilterPassed = new __MIDL___MIDL_itf_uc_0001_0191_0003(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessageFilterCanceled = 0;
  public final static int _ucRoomMessageFilterReplaced = 1;
  public final static int _ucRoomMessageFilterPassed = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageFilterCanceled;
    case 1: return ucRoomMessageFilterReplaced;
    case 2: return ucRoomMessageFilterPassed;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0003(value);
    }
  }
}
