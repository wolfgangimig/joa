/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0020.
 * Enumerates the media stream directions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0020 {
  MediaStreamDirection_None(0),
  MediaStreamDirection_Send(1),
  MediaStreamDirection_Receive(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0020(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0020 valueOf(int value) {
    switch(value) {
    case 0: return MediaStreamDirection_None;
    case 1: return MediaStreamDirection_Send;
    case 2: return MediaStreamDirection_Receive;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0020.class);
    }
  }
}
