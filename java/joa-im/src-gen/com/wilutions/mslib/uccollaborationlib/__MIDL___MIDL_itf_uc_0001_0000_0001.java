/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0001.
 * Enumerates the property ID masks. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0000_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0000_0001 ucPropertyMaskType = new __MIDL___MIDL_itf_uc_0001_0000_0001(-268435456);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0001 ucPropertyMaskClass = new __MIDL___MIDL_itf_uc_0001_0000_0001(268369920);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0001 ucPropertyMaskId = new __MIDL___MIDL_itf_uc_0001_0000_0001(65535);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyMaskType = -268435456;
  public final static int _ucPropertyMaskClass = 268369920;
  public final static int _ucPropertyMaskId = 65535;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0000_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0000_0001 valueOf(int value) {
    switch(value) {
    case -268435456: return ucPropertyMaskType;
    case 268369920: return ucPropertyMaskClass;
    case 65535: return ucPropertyMaskId;
    default: return new __MIDL___MIDL_itf_uc_0001_0000_0001(value);
    }
  }
}
