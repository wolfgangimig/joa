/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0003.
 * Enumerates the property type encoded in various property IDs. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0000_0003 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyString = new __MIDL___MIDL_itf_uc_0001_0000_0003(0);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyBoolean = new __MIDL___MIDL_itf_uc_0001_0000_0003(268435456);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyNumeric = new __MIDL___MIDL_itf_uc_0001_0000_0003(536870912);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyEnumeration = new __MIDL___MIDL_itf_uc_0001_0000_0003(805306368);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyObject = new __MIDL___MIDL_itf_uc_0001_0000_0003(1073741824);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertyDate = new __MIDL___MIDL_itf_uc_0001_0000_0003(1342177280);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0003 ucPropertySafeArray = new __MIDL___MIDL_itf_uc_0001_0000_0003(1610612736);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyString = 0;
  public final static int _ucPropertyBoolean = 268435456;
  public final static int _ucPropertyNumeric = 536870912;
  public final static int _ucPropertyEnumeration = 805306368;
  public final static int _ucPropertyObject = 1073741824;
  public final static int _ucPropertyDate = 1342177280;
  public final static int _ucPropertySafeArray = 1610612736;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0000_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0000_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucPropertyString;
    case 268435456: return ucPropertyBoolean;
    case 536870912: return ucPropertyNumeric;
    case 805306368: return ucPropertyEnumeration;
    case 1073741824: return ucPropertyObject;
    case 1342177280: return ucPropertyDate;
    case 1610612736: return ucPropertySafeArray;
    default: return new __MIDL___MIDL_itf_uc_0001_0000_0003(value);
    }
  }
}
