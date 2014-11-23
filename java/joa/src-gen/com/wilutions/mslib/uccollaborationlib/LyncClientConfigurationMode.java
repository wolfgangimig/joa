/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LyncClientConfigurationMode.
 * Enumerates uc Client configuration modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum LyncClientConfigurationMode {
  ucConfigurationModeAuto(0),
  ucConfigurationModeManual(1);

  public final int value;
  private LyncClientConfigurationMode(int value) { this.value = value; }
  public static  LyncClientConfigurationMode valueOf(int value) {
    switch(value) {
    case 0: return ucConfigurationModeAuto;
    case 1: return ucConfigurationModeManual;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + LyncClientConfigurationMode.class);
    }
  }
}
