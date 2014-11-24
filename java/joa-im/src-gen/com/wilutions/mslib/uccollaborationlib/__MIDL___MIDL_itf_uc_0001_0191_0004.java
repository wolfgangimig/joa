/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0004.
 * Enumerates the room seach mode type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0004 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0004 ucRoomSearchModeRegular = new __MIDL___MIDL_itf_uc_0001_0191_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0004 ucRoomSearchModeExtended = new __MIDL___MIDL_itf_uc_0001_0191_0004(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomSearchModeRegular = 0;
  public final static int _ucRoomSearchModeExtended = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomSearchModeRegular;
    case 1: return ucRoomSearchModeExtended;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0004(value);
    }
  }
}
