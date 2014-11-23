/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0024.
 * Enumerates the conversation context update option flags. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0024 {
  ucConversationContextUpdateNone(0),
  ucConversationContextUpdateAssociatedInfo(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0024(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0024 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextUpdateNone;
    case 1: return ucConversationContextUpdateAssociatedInfo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0024.class);
    }
  }
}
