/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0016.
 * Enumerates the modality connect options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0016 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0016 ucConnectOptionsNone = new __MIDL___MIDL_itf_uc_0001_0046_0016(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0016 ucConnectOptionsIncludeActiveContext = new __MIDL___MIDL_itf_uc_0001_0046_0016(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0016 ucConnectOptionsIncludeAllContexts = new __MIDL___MIDL_itf_uc_0001_0046_0016(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConnectOptionsNone = 0;
  public final static int _ucConnectOptionsIncludeActiveContext = 1;
  public final static int _ucConnectOptionsIncludeAllContexts = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0016(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0016 valueOf(int value) {
    switch(value) {
    case 0: return ucConnectOptionsNone;
    case 1: return ucConnectOptionsIncludeActiveContext;
    case 2: return ucConnectOptionsIncludeAllContexts;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0016(value);
    }
  }
}
