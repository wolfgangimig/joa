/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0008.
 * Enumerates the Conversation History related actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0008 {
  ucConversationHistorySaveAllHistory(0),
  ucConversationHistoryRetrievePast(1),
  ucConversationHistoryRetrievePastByEntryId(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0008(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationHistorySaveAllHistory;
    case 1: return ucConversationHistoryRetrievePast;
    case 2: return ucConversationHistoryRetrievePastByEntryId;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0008.class);
    }
  }
}
