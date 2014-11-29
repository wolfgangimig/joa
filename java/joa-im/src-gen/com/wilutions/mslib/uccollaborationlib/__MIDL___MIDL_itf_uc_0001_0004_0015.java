/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0015.
 * Defines days of the week for presence working hours. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0015 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucSunday = new __MIDL___MIDL_itf_uc_0001_0004_0015(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucMonday = new __MIDL___MIDL_itf_uc_0001_0004_0015(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucTuesday = new __MIDL___MIDL_itf_uc_0001_0004_0015(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucWednesday = new __MIDL___MIDL_itf_uc_0001_0004_0015(8);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucThursday = new __MIDL___MIDL_itf_uc_0001_0004_0015(16);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucFriday = new __MIDL___MIDL_itf_uc_0001_0004_0015(32);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0015 ucSaturday = new __MIDL___MIDL_itf_uc_0001_0004_0015(64);

  // Integer constants for bitsets and switch statements
  public final static int _ucSunday = 1;
  public final static int _ucMonday = 2;
  public final static int _ucTuesday = 4;
  public final static int _ucWednesday = 8;
  public final static int _ucThursday = 16;
  public final static int _ucFriday = 32;
  public final static int _ucSaturday = 64;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0015(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0015 valueOf(int value) {
    switch(value) {
    case 1: return ucSunday;
    case 2: return ucMonday;
    case 4: return ucTuesday;
    case 8: return ucWednesday;
    case 16: return ucThursday;
    case 32: return ucFriday;
    case 64: return ucSaturday;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0015(value);
    }
  }
}
