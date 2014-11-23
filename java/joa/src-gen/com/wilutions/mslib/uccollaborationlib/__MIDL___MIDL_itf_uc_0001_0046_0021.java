/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0021.
 * Enumerates the conversation context types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0021 {
  ucConversationContextSimple(0),
  ucConversationContextMultiple(1),
  ucConversationContextAlternate(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0021(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0021 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextSimple;
    case 1: return ucConversationContextMultiple;
    case 2: return ucConversationContextAlternate;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0021.class);
    }
  }
}
