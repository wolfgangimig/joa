/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * LyncClientConfigurationMode.
 * Enumerates uc Client configuration modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class LyncClientConfigurationMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static LyncClientConfigurationMode ucConfigurationModeAuto = new LyncClientConfigurationMode(0);
  public final static LyncClientConfigurationMode ucConfigurationModeManual = new LyncClientConfigurationMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucConfigurationModeAuto = 0;
  public final static int _ucConfigurationModeManual = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private LyncClientConfigurationMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  LyncClientConfigurationMode valueOf(int value) {
    switch(value) {
    case 0: return ucConfigurationModeAuto;
    case 1: return ucConfigurationModeManual;
    default: return new LyncClientConfigurationMode(value);
    }
  }
}
