/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0035.
 * Enumerates the speaker modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0035 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0035 ucSpeakerOff = new __MIDL___MIDL_itf_uc_0001_0046_0035(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0035 ucSpeakerOn = new __MIDL___MIDL_itf_uc_0001_0046_0035(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucSpeakerOff = 0;
  public final static int _ucSpeakerOn = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0035(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0035 valueOf(int value) {
    switch(value) {
    case 0: return ucSpeakerOff;
    case 1: return ucSpeakerOn;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0035(value);
    }
  }
}
