/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0009.
 * Enumerates search filter properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0009 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchFirstName = new __MIDL___MIDL_itf_uc_0001_0004_0009(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchLastName = new __MIDL___MIDL_itf_uc_0001_0004_0009(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchDisplayName = new __MIDL___MIDL_itf_uc_0001_0004_0009(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchCompany = new __MIDL___MIDL_itf_uc_0001_0004_0009(8);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchPrimaryEmailAddress = new __MIDL___MIDL_itf_uc_0001_0004_0009(16);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchEmailAddresses = new __MIDL___MIDL_itf_uc_0001_0004_0009(32);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchAlias = new __MIDL___MIDL_itf_uc_0001_0004_0009(64);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchPhoneNumbers = new __MIDL___MIDL_itf_uc_0001_0004_0009(128);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchPhoneExtention = new __MIDL___MIDL_itf_uc_0001_0004_0009(256);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0009 ucSearchAllFields = new __MIDL___MIDL_itf_uc_0001_0004_0009(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucSearchFirstName = 1;
  public final static int _ucSearchLastName = 2;
  public final static int _ucSearchDisplayName = 4;
  public final static int _ucSearchCompany = 8;
  public final static int _ucSearchPrimaryEmailAddress = 16;
  public final static int _ucSearchEmailAddresses = 32;
  public final static int _ucSearchAlias = 64;
  public final static int _ucSearchPhoneNumbers = 128;
  public final static int _ucSearchPhoneExtention = 256;
  public final static int _ucSearchAllFields = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0009(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0009 valueOf(int value) {
    switch(value) {
    case 1: return ucSearchFirstName;
    case 2: return ucSearchLastName;
    case 4: return ucSearchDisplayName;
    case 8: return ucSearchCompany;
    case 16: return ucSearchPrimaryEmailAddress;
    case 32: return ucSearchEmailAddresses;
    case 64: return ucSearchAlias;
    case 128: return ucSearchPhoneNumbers;
    case 256: return ucSearchPhoneExtention;
    case -1: return ucSearchAllFields;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0009(value);
    }
  }
}
