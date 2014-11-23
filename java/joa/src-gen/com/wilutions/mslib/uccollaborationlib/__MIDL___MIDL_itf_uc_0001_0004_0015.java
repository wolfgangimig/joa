/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0015.
 * Defines days of the week for presence working hours. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0015 {
  ucSunday(1),
  ucMonday(2),
  ucTuesday(4),
  ucWednesday(8),
  ucThursday(16),
  ucFriday(32),
  ucSaturday(64);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0015(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0015 valueOf(int value) {
    switch(value) {
    case 1: return ucSunday;
    case 2: return ucMonday;
    case 4: return ucTuesday;
    case 8: return ucWednesday;
    case 16: return ucThursday;
    case 32: return ucFriday;
    case 64: return ucSaturday;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0015.class);
    }
  }
}
