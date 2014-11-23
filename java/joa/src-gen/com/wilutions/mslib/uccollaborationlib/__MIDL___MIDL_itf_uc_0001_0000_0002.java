/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0002.
 * Enumerates the indexes where property ID fields reside. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0002 {
  ucPropertyMaskIndexType(28),
  ucPropertyMaskIndexClass(16),
  ucPropertyMaskIndexId(0);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0002 valueOf(int value) {
    switch(value) {
    case 28: return ucPropertyMaskIndexType;
    case 16: return ucPropertyMaskIndexClass;
    case 0: return ucPropertyMaskIndexId;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0002.class);
    }
  }
}
