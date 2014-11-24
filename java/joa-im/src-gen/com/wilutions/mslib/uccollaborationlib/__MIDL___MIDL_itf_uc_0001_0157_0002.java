/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0157_0002.
 * Enumerates Device type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0157_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0157_0002 ucAudioDeviceUnknown = new __MIDL___MIDL_itf_uc_0001_0157_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0002 ucAudioDeviceHumanInterfaceDevice = new __MIDL___MIDL_itf_uc_0001_0157_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0002 ucAudioDeviceHeadSet = new __MIDL___MIDL_itf_uc_0001_0157_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0002 ucAudioDeviceCustom = new __MIDL___MIDL_itf_uc_0001_0157_0002(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucAudioDeviceUnknown = 0;
  public final static int _ucAudioDeviceHumanInterfaceDevice = 1;
  public final static int _ucAudioDeviceHeadSet = 2;
  public final static int _ucAudioDeviceCustom = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0157_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0157_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucAudioDeviceUnknown;
    case 1: return ucAudioDeviceHumanInterfaceDevice;
    case 2: return ucAudioDeviceHeadSet;
    case 3: return ucAudioDeviceCustom;
    default: return new __MIDL___MIDL_itf_uc_0001_0157_0002(value);
    }
  }
}
