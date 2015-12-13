/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0191_0008.
 * Enumerates the room manager state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0191_0008 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0191_0008 ucRoomManagerDisabled = new __MIDL___MIDL_itf_uc_0001_0191_0008(0);
  public final static __MIDL___MIDL_itf_uc_0001_0191_0008 ucRoomManagerEnabled = new __MIDL___MIDL_itf_uc_0001_0191_0008(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomManagerDisabled = 0;
  public final static int _ucRoomManagerEnabled = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0191_0008(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0191_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucRoomManagerDisabled;
    case 1: return ucRoomManagerEnabled;
    default: return new __MIDL___MIDL_itf_uc_0001_0191_0008(value);
    }
  }
}
