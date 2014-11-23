/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0025.
 * Enumerates the possible task state of retrieving the archived history of previous 
 * conversation. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0025 {
  ucPreviousConversationHistoryRetrievalNotStarted(0),
  ucPreviousConversationHistoryRetrievalInProgress(1),
  ucPreviousConversationHistoryRetrievalComplete(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0025(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0025 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationHistoryRetrievalNotStarted;
    case 1: return ucPreviousConversationHistoryRetrievalInProgress;
    case 2: return ucPreviousConversationHistoryRetrievalComplete;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0025.class);
    }
  }
}
