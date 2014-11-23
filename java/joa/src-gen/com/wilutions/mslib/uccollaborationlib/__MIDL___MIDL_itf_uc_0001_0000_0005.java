/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0005.
 * Enumerates the size of extensibility window that hosts the application. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0005 {
  ucExtensibilityWindowSmall(0),
  ucExtensibilityWindowMedium(1),
  ucExtensibilityWindowLarge(2),
  ucConversationWindowExtensionSizeMax(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0005(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucExtensibilityWindowSmall;
    case 1: return ucExtensibilityWindowMedium;
    case 2: return ucExtensibilityWindowLarge;
    case 3: return ucConversationWindowExtensionSizeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0005.class);
    }
  }
}
