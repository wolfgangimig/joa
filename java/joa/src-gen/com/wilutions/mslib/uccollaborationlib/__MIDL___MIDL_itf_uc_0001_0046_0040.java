/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0040.
 * Enumerates the connection state of the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0040 {
  ucPreviousConversationsDisconnected(0),
  ucPreviousConversationsConnected(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0040(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0040 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsDisconnected;
    case 1: return ucPreviousConversationsConnected;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0040.class);
    }
  }
}
