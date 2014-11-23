/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0039.
 * Enumerates errors that could have happened in the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0039 {
  ucPreviousConversationsErrorCritical(0),
  ucPreviousConversationsErrorTransient(1),
  ucPreviousConversationsErrorNotConfigured(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0039(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0039 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsErrorCritical;
    case 1: return ucPreviousConversationsErrorTransient;
    case 2: return ucPreviousConversationsErrorNotConfigured;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0039.class);
    }
  }
}
