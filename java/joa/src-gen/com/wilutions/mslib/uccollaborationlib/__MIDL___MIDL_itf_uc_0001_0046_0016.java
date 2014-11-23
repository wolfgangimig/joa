/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0016.
 * Enumerates the modality connect options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0016 {
  ucConnectOptionsNone(0),
  ucConnectOptionsIncludeActiveContext(1),
  ucConnectOptionsIncludeAllContexts(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0016(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0016 valueOf(int value) {
    switch(value) {
    case 0: return ucConnectOptionsNone;
    case 1: return ucConnectOptionsIncludeActiveContext;
    case 2: return ucConnectOptionsIncludeAllContexts;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0016.class);
    }
  }
}
