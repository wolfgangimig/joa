/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0005.
 * Enumerates uc Client configuration modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0005 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0005 ucConfigurationModeAuto = new __MIDL___MIDL_itf_uc_0001_0255_0005(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0005 ucConfigurationModeManual = new __MIDL___MIDL_itf_uc_0001_0255_0005(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucConfigurationModeAuto = 0;
  public final static int _ucConfigurationModeManual = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0005(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucConfigurationModeAuto;
    case 1: return ucConfigurationModeManual;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0005(value);
    }
  }
}
