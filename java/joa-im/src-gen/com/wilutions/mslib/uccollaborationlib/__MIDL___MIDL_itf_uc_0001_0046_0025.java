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
public class __MIDL___MIDL_itf_uc_0001_0046_0025 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0025 ucPreviousConversationHistoryRetrievalNotStarted = new __MIDL___MIDL_itf_uc_0001_0046_0025(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0025 ucPreviousConversationHistoryRetrievalInProgress = new __MIDL___MIDL_itf_uc_0001_0046_0025(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0025 ucPreviousConversationHistoryRetrievalComplete = new __MIDL___MIDL_itf_uc_0001_0046_0025(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationHistoryRetrievalNotStarted = 0;
  public final static int _ucPreviousConversationHistoryRetrievalInProgress = 1;
  public final static int _ucPreviousConversationHistoryRetrievalComplete = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0025(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0025 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationHistoryRetrievalNotStarted;
    case 1: return ucPreviousConversationHistoryRetrievalInProgress;
    case 2: return ucPreviousConversationHistoryRetrievalComplete;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0025(value);
    }
  }
}
