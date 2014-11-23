/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0003.
 * Enumerates the property type encoded in various property IDs. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0003 {
  ucPropertyString(0),
  ucPropertyBoolean(268435456),
  ucPropertyNumeric(536870912),
  ucPropertyEnumeration(805306368),
  ucPropertyObject(1073741824),
  ucPropertyDate(1342177280),
  ucPropertySafeArray(1610612736);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucPropertyString;
    case 268435456: return ucPropertyBoolean;
    case 536870912: return ucPropertyNumeric;
    case 805306368: return ucPropertyEnumeration;
    case 1073741824: return ucPropertyObject;
    case 1342177280: return ucPropertyDate;
    case 1610612736: return ucPropertySafeArray;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0003.class);
    }
  }
}
