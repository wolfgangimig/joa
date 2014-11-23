/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0007.
 * Enumerates the conversation actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0007 {
  ucConversationActionMerge(0),
  ucConversationActionPark(1),
  ucConversationActionAddParticipant(2),
  ucConversationActionRemoveParticipant(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0007(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationActionMerge;
    case 1: return ucConversationActionPark;
    case 2: return ucConversationActionAddParticipant;
    case 3: return ucConversationActionRemoveParticipant;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0007.class);
    }
  }
}
