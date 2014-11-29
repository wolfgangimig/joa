/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0003.
 * Enumerates the conversation acceptance states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0003 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0003 ucConversationAcceptanceNone = new __MIDL___MIDL_itf_uc_0001_0046_0003(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0003 ucConversationAcceptanceAccepted = new __MIDL___MIDL_itf_uc_0001_0046_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0003 ucConversationAcceptanceRejected = new __MIDL___MIDL_itf_uc_0001_0046_0003(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0003 ucConversationAcceptanceMissed = new __MIDL___MIDL_itf_uc_0001_0046_0003(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0003 ucConversationAcceptanceDeflected = new __MIDL___MIDL_itf_uc_0001_0046_0003(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationAcceptanceNone = 0;
  public final static int _ucConversationAcceptanceAccepted = 1;
  public final static int _ucConversationAcceptanceRejected = 2;
  public final static int _ucConversationAcceptanceMissed = 3;
  public final static int _ucConversationAcceptanceDeflected = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationAcceptanceNone;
    case 1: return ucConversationAcceptanceAccepted;
    case 2: return ucConversationAcceptanceRejected;
    case 3: return ucConversationAcceptanceMissed;
    case 4: return ucConversationAcceptanceDeflected;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0003(value);
    }
  }
}
