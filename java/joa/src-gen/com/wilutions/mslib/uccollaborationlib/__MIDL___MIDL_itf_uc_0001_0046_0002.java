/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0002.
 * Enumerates the conversation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0002 {
  ucConversationInactive(0),
  ucConversationActive(1),
  ucConversationParked(2),
  ucConversationTerminated(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationInactive;
    case 1: return ucConversationActive;
    case 2: return ucConversationParked;
    case 3: return ucConversationTerminated;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0002.class);
    }
  }
}
