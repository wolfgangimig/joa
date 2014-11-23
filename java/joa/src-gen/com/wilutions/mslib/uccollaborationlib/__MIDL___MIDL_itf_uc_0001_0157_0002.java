/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0157_0002.
 * Enumerates Device type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0157_0002 {
  ucAudioDeviceUnknown(0),
  ucAudioDeviceHumanInterfaceDevice(1),
  ucAudioDeviceHeadSet(2),
  ucAudioDeviceCustom(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0157_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0157_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucAudioDeviceUnknown;
    case 1: return ucAudioDeviceHumanInterfaceDevice;
    case 2: return ucAudioDeviceHeadSet;
    case 3: return ucAudioDeviceCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0157_0002.class);
    }
  }
}
