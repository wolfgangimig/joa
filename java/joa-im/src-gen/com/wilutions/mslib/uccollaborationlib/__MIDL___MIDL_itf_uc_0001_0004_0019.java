/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0019.
 * Enumerates organization info types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0019 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0019 ucOrganizationInfoManagers = new __MIDL___MIDL_itf_uc_0001_0004_0019(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0019 ucOrganizationInfoPeers = new __MIDL___MIDL_itf_uc_0001_0004_0019(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0019 ucOrganizationInfoDirectReports = new __MIDL___MIDL_itf_uc_0001_0004_0019(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucOrganizationInfoManagers = 1;
  public final static int _ucOrganizationInfoPeers = 2;
  public final static int _ucOrganizationInfoDirectReports = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0019(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0019 valueOf(int value) {
    switch(value) {
    case 1: return ucOrganizationInfoManagers;
    case 2: return ucOrganizationInfoPeers;
    case 4: return ucOrganizationInfoDirectReports;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0019(value);
    }
  }
}
