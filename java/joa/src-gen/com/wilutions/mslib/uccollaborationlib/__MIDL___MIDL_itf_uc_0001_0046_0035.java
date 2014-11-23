/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0035.
 * Enumerates the speaker modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0035 {
  ucSpeakerOff(0),
  ucSpeakerOn(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0035(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0035 valueOf(int value) {
    switch(value) {
    case 0: return ucSpeakerOff;
    case 1: return ucSpeakerOn;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0035.class);
    }
  }
}
