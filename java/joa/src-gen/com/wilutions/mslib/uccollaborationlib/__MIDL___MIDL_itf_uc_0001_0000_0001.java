/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0001.
 * Enumerates the property ID masks. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0001 {
  ucPropertyMaskType(-268435456),
  ucPropertyMaskClass(268369920),
  ucPropertyMaskId(65535);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0001 valueOf(int value) {
    switch(value) {
    case -268435456: return ucPropertyMaskType;
    case 268369920: return ucPropertyMaskClass;
    case 65535: return ucPropertyMaskId;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0001.class);
    }
  }
}
