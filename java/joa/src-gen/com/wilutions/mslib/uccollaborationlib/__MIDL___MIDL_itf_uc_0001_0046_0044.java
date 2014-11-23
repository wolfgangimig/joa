/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0044.
 * Enumerates the conversation context type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0044 {
  ucContextualConversationApplicationId(0),
  ucContextualConversationApplicationData(1),
  ucContextualConversationHyperLink(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0044(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0044 valueOf(int value) {
    switch(value) {
    case 0: return ucContextualConversationApplicationId;
    case 1: return ucContextualConversationApplicationData;
    case 2: return ucContextualConversationHyperLink;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0044.class);
    }
  }
}
