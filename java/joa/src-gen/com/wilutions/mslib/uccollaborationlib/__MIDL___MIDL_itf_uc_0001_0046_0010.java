/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0010.
 * Enumerates the Conversation direction values range. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0010 {
  ucConversationDirectionNone(0),
  ucConversationDirectionIncoming(1),
  ucConversationDirectionOutgoing(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0010(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0010 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationDirectionNone;
    case 1: return ucConversationDirectionIncoming;
    case 2: return ucConversationDirectionOutgoing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0010.class);
    }
  }
}
