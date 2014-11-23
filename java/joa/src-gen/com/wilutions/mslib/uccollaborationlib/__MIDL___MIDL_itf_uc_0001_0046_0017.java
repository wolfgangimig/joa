/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0017.
 * Enumerates the media channel types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0017 {
  ucChannelAudio(0),
  ucChannelVideo(1),
  ucChannelVideoPano(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0017(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0017 valueOf(int value) {
    switch(value) {
    case 0: return ucChannelAudio;
    case 1: return ucChannelVideo;
    case 2: return ucChannelVideoPano;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0017.class);
    }
  }
}
