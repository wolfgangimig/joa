/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0015.
 * Enumerates the transfer options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0015 {
  ucTransferOptionsNone(0),
  ucTransferOptionsDisallowRedirection(1),
  ucTransferOptionsIncludeActiveContext(2),
  ucTransferOptionsIncludeAllContexts(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0015(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0015 valueOf(int value) {
    switch(value) {
    case 0: return ucTransferOptionsNone;
    case 1: return ucTransferOptionsDisallowRedirection;
    case 2: return ucTransferOptionsIncludeActiveContext;
    case 4: return ucTransferOptionsIncludeAllContexts;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0015.class);
    }
  }
}
