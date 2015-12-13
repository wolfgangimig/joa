/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0009.
 * Enumerates the conversation importance levels. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0009 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0009 ucConversationImportanceLow = new __MIDL___MIDL_itf_uc_0001_0046_0009(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0009 ucConversationImportanceNormal = new __MIDL___MIDL_itf_uc_0001_0046_0009(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0009 ucConversationImportanceHigh = new __MIDL___MIDL_itf_uc_0001_0046_0009(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0009 ucConversationImportanceEmergency = new __MIDL___MIDL_itf_uc_0001_0046_0009(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationImportanceLow = 0;
  public final static int _ucConversationImportanceNormal = 1;
  public final static int _ucConversationImportanceHigh = 2;
  public final static int _ucConversationImportanceEmergency = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0009(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0009 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationImportanceLow;
    case 1: return ucConversationImportanceNormal;
    case 2: return ucConversationImportanceHigh;
    case 3: return ucConversationImportanceEmergency;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0009(value);
    }
  }
}
