/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0015.
 * Enumerates the transfer options. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0015 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0015 ucTransferOptionsNone = new __MIDL___MIDL_itf_uc_0001_0046_0015(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0015 ucTransferOptionsDisallowRedirection = new __MIDL___MIDL_itf_uc_0001_0046_0015(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0015 ucTransferOptionsIncludeActiveContext = new __MIDL___MIDL_itf_uc_0001_0046_0015(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0015 ucTransferOptionsIncludeAllContexts = new __MIDL___MIDL_itf_uc_0001_0046_0015(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucTransferOptionsNone = 0;
  public final static int _ucTransferOptionsDisallowRedirection = 1;
  public final static int _ucTransferOptionsIncludeActiveContext = 2;
  public final static int _ucTransferOptionsIncludeAllContexts = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0015(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0015 valueOf(int value) {
    switch(value) {
    case 0: return ucTransferOptionsNone;
    case 1: return ucTransferOptionsDisallowRedirection;
    case 2: return ucTransferOptionsIncludeActiveContext;
    case 4: return ucTransferOptionsIncludeAllContexts;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0015(value);
    }
  }
}
