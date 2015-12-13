/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0027.
 * Enumerates the modality control action properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0027 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0027 ucModalityTransferContextFailures = new __MIDL___MIDL_itf_uc_0001_0046_0027(1611464704);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0027 ucModalityConnectContextFailures = new __MIDL___MIDL_itf_uc_0001_0046_0027(1611464705);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityTransferContextFailures = 1611464704;
  public final static int _ucModalityConnectContextFailures = 1611464705;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0027(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0027 valueOf(int value) {
    switch(value) {
    case 1611464704: return ucModalityTransferContextFailures;
    case 1611464705: return ucModalityConnectContextFailures;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0027(value);
    }
  }
}
