/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0012.
 * Enumerates the various access levels of a conference. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0012 {
  ucConferenceAccessTypeUnknown(0),
  ucConferenceAccessTypeOpen(1),
  ucConferenceAccessTypeClosed(16),
  ucConferenceAccessTypeAnonymous(256),
  ucConferenceAccessTypeLocked(4096);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0012(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0012 valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceAccessTypeUnknown;
    case 1: return ucConferenceAccessTypeOpen;
    case 16: return ucConferenceAccessTypeClosed;
    case 256: return ucConferenceAccessTypeAnonymous;
    case 4096: return ucConferenceAccessTypeLocked;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0012.class);
    }
  }
}
