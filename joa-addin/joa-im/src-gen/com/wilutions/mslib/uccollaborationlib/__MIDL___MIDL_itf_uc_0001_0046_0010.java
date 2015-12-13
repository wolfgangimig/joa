/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0010.
 * Enumerates the Conversation direction values range. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0010 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0010 ucConversationDirectionNone = new __MIDL___MIDL_itf_uc_0001_0046_0010(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0010 ucConversationDirectionIncoming = new __MIDL___MIDL_itf_uc_0001_0046_0010(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0010 ucConversationDirectionOutgoing = new __MIDL___MIDL_itf_uc_0001_0046_0010(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationDirectionNone = 0;
  public final static int _ucConversationDirectionIncoming = 1;
  public final static int _ucConversationDirectionOutgoing = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0010(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0010 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationDirectionNone;
    case 1: return ucConversationDirectionIncoming;
    case 2: return ucConversationDirectionOutgoing;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0010(value);
    }
  }
}
