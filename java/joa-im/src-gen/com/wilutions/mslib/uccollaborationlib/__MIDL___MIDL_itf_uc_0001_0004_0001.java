/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0001.
 * Contact settings. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0001 ucContactTagged = new __MIDL___MIDL_itf_uc_0001_0004_0001(268435456);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0001 ucContactAccessLevel = new __MIDL___MIDL_itf_uc_0001_0004_0001(805306369);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0001 ucContactExchangeServiceEntryId = new __MIDL___MIDL_itf_uc_0001_0004_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0001 ucContactSource = new __MIDL___MIDL_itf_uc_0001_0004_0001(805306371);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0001 ucContactDefaultContactEndpoint = new __MIDL___MIDL_itf_uc_0001_0004_0001(1073741828);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactTagged = 268435456;
  public final static int _ucContactAccessLevel = 805306369;
  public final static int _ucContactExchangeServiceEntryId = 2;
  public final static int _ucContactSource = 805306371;
  public final static int _ucContactDefaultContactEndpoint = 1073741828;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0001 valueOf(int value) {
    switch(value) {
    case 268435456: return ucContactTagged;
    case 805306369: return ucContactAccessLevel;
    case 2: return ucContactExchangeServiceEntryId;
    case 805306371: return ucContactSource;
    case 1073741828: return ucContactDefaultContactEndpoint;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0001(value);
    }
  }
}
