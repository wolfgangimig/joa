/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0008.
 * Enumerates the Conversation History related actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0008 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0008 ucConversationHistorySaveAllHistory = new __MIDL___MIDL_itf_uc_0001_0046_0008(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0008 ucConversationHistoryRetrievePast = new __MIDL___MIDL_itf_uc_0001_0046_0008(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0008 ucConversationHistoryRetrievePastByEntryId = new __MIDL___MIDL_itf_uc_0001_0046_0008(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationHistorySaveAllHistory = 0;
  public final static int _ucConversationHistoryRetrievePast = 1;
  public final static int _ucConversationHistoryRetrievePastByEntryId = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0008(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationHistorySaveAllHistory;
    case 1: return ucConversationHistoryRetrievePast;
    case 2: return ucConversationHistoryRetrievePastByEntryId;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0008(value);
    }
  }
}
