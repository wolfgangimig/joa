/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0039.
 * Enumerates errors that could have happened in the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0039 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0039 ucPreviousConversationsErrorCritical = new __MIDL___MIDL_itf_uc_0001_0046_0039(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0039 ucPreviousConversationsErrorTransient = new __MIDL___MIDL_itf_uc_0001_0046_0039(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0039 ucPreviousConversationsErrorNotConfigured = new __MIDL___MIDL_itf_uc_0001_0046_0039(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationsErrorCritical = 0;
  public final static int _ucPreviousConversationsErrorTransient = 1;
  public final static int _ucPreviousConversationsErrorNotConfigured = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0039(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0039 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsErrorCritical;
    case 1: return ucPreviousConversationsErrorTransient;
    case 2: return ucPreviousConversationsErrorNotConfigured;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0039(value);
    }
  }
}
