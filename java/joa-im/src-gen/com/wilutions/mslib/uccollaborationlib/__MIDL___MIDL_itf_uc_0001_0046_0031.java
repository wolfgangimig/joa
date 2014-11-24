/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0031.
 * Enumerates the conversation state change properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0031 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0031 ucConversationStateChangeUnparkReason = new __MIDL___MIDL_itf_uc_0001_0046_0031(805896192);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0031 ucConversationStateChangeUnparkTarget = new __MIDL___MIDL_itf_uc_0001_0046_0031(589825);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationStateChangeUnparkReason = 805896192;
  public final static int _ucConversationStateChangeUnparkTarget = 589825;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0031(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0031 valueOf(int value) {
    switch(value) {
    case 805896192: return ucConversationStateChangeUnparkReason;
    case 589825: return ucConversationStateChangeUnparkTarget;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0031(value);
    }
  }
}
