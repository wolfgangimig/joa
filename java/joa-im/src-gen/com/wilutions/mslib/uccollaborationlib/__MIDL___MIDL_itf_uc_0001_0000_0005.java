/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0005.
 * Enumerates the size of extensibility window that hosts the application. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0000_0005 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0000_0005 ucExtensibilityWindowSmall = new __MIDL___MIDL_itf_uc_0001_0000_0005(0);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0005 ucExtensibilityWindowMedium = new __MIDL___MIDL_itf_uc_0001_0000_0005(1);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0005 ucExtensibilityWindowLarge = new __MIDL___MIDL_itf_uc_0001_0000_0005(2);
  public final static __MIDL___MIDL_itf_uc_0001_0000_0005 ucConversationWindowExtensionSizeMax = new __MIDL___MIDL_itf_uc_0001_0000_0005(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucExtensibilityWindowSmall = 0;
  public final static int _ucExtensibilityWindowMedium = 1;
  public final static int _ucExtensibilityWindowLarge = 2;
  public final static int _ucConversationWindowExtensionSizeMax = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0000_0005(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0000_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucExtensibilityWindowSmall;
    case 1: return ucExtensibilityWindowMedium;
    case 2: return ucExtensibilityWindowLarge;
    case 3: return ucConversationWindowExtensionSizeMax;
    default: return new __MIDL___MIDL_itf_uc_0001_0000_0005(value);
    }
  }
}
