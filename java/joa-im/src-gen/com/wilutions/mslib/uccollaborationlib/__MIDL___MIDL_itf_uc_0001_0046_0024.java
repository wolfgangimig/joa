/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0024.
 * Enumerates the conversation context update option flags. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0024 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0024 ucConversationContextUpdateNone = new __MIDL___MIDL_itf_uc_0001_0046_0024(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0024 ucConversationContextUpdateAssociatedInfo = new __MIDL___MIDL_itf_uc_0001_0046_0024(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationContextUpdateNone = 0;
  public final static int _ucConversationContextUpdateAssociatedInfo = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0024(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0024 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextUpdateNone;
    case 1: return ucConversationContextUpdateAssociatedInfo;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0024(value);
    }
  }
}
