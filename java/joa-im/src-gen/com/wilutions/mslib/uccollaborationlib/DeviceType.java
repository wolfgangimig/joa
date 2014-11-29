/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DeviceType.
 * Enumerates Device type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class DeviceType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static DeviceType ucAudioDeviceUnknown = new DeviceType(0);
  public final static DeviceType ucAudioDeviceHumanInterfaceDevice = new DeviceType(1);
  public final static DeviceType ucAudioDeviceHeadSet = new DeviceType(2);
  public final static DeviceType ucAudioDeviceCustom = new DeviceType(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucAudioDeviceUnknown = 0;
  public final static int _ucAudioDeviceHumanInterfaceDevice = 1;
  public final static int _ucAudioDeviceHeadSet = 2;
  public final static int _ucAudioDeviceCustom = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private DeviceType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  DeviceType valueOf(int value) {
    switch(value) {
    case 0: return ucAudioDeviceUnknown;
    case 1: return ucAudioDeviceHumanInterfaceDevice;
    case 2: return ucAudioDeviceHeadSet;
    case 3: return ucAudioDeviceCustom;
    default: return new DeviceType(value);
    }
  }
}
