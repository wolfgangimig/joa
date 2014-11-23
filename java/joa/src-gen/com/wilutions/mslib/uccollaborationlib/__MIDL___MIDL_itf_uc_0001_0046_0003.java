/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0003.
 * Enumerates the conversation acceptance states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0003 {
  ucConversationAcceptanceNone(0),
  ucConversationAcceptanceAccepted(1),
  ucConversationAcceptanceRejected(2),
  ucConversationAcceptanceMissed(3),
  ucConversationAcceptanceDeflected(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationAcceptanceNone;
    case 1: return ucConversationAcceptanceAccepted;
    case 2: return ucConversationAcceptanceRejected;
    case 3: return ucConversationAcceptanceMissed;
    case 4: return ucConversationAcceptanceDeflected;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0003.class);
    }
  }
}
