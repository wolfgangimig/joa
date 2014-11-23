/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0038.
 * Enumerates the past conversations types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0038 {
  ucPreviousConversationsMissedConversations(0),
  ucPreviousConversationsConversationHistory(1),
  ucPreviousConversationsAudioCallLogs(2),
  ucPreviousConversationsFollowUpConversations(3),
  ucPreviousConversationsMissedAudioCalls(4),
  ucPreviousConversationsTypeMax(5);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0038(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0038 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsMissedConversations;
    case 1: return ucPreviousConversationsConversationHistory;
    case 2: return ucPreviousConversationsAudioCallLogs;
    case 3: return ucPreviousConversationsFollowUpConversations;
    case 4: return ucPreviousConversationsMissedAudioCalls;
    case 5: return ucPreviousConversationsTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0038.class);
    }
  }
}
