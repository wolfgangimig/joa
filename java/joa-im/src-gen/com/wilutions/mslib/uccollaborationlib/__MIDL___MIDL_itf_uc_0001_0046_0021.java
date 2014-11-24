/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0021.
 * Enumerates the conversation context types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0021 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0021 ucConversationContextSimple = new __MIDL___MIDL_itf_uc_0001_0046_0021(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0021 ucConversationContextMultiple = new __MIDL___MIDL_itf_uc_0001_0046_0021(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0021 ucConversationContextAlternate = new __MIDL___MIDL_itf_uc_0001_0046_0021(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationContextSimple = 0;
  public final static int _ucConversationContextMultiple = 1;
  public final static int _ucConversationContextAlternate = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0021(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0021 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextSimple;
    case 1: return ucConversationContextMultiple;
    case 2: return ucConversationContextAlternate;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0021(value);
    }
  }
}
