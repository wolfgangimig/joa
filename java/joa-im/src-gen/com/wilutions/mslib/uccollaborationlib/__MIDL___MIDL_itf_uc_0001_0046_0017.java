/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0017.
 * Enumerates the media channel types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0017 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0017 ucChannelAudio = new __MIDL___MIDL_itf_uc_0001_0046_0017(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0017 ucChannelVideo = new __MIDL___MIDL_itf_uc_0001_0046_0017(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0017 ucChannelVideoPano = new __MIDL___MIDL_itf_uc_0001_0046_0017(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucChannelAudio = 0;
  public final static int _ucChannelVideo = 1;
  public final static int _ucChannelVideoPano = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0017(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0017 valueOf(int value) {
    switch(value) {
    case 0: return ucChannelAudio;
    case 1: return ucChannelVideo;
    case 2: return ucChannelVideoPano;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0017(value);
    }
  }
}
