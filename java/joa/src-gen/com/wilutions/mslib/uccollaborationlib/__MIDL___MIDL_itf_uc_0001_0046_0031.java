/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0031.
 * Enumerates the conversation state change properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0031 {
  ucConversationStateChangeUnparkReason(805896192),
  ucConversationStateChangeUnparkTarget(589825);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0031(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0031 valueOf(int value) {
    switch(value) {
    case 805896192: return ucConversationStateChangeUnparkReason;
    case 589825: return ucConversationStateChangeUnparkTarget;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0031.class);
    }
  }
}
