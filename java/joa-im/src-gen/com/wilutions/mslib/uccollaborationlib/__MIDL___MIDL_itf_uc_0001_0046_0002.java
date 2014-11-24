/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0002.
 * Enumerates the conversation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0002 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0002 ucConversationInactive = new __MIDL___MIDL_itf_uc_0001_0046_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0002 ucConversationActive = new __MIDL___MIDL_itf_uc_0001_0046_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0002 ucConversationParked = new __MIDL___MIDL_itf_uc_0001_0046_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0002 ucConversationTerminated = new __MIDL___MIDL_itf_uc_0001_0046_0002(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationInactive = 0;
  public final static int _ucConversationActive = 1;
  public final static int _ucConversationParked = 2;
  public final static int _ucConversationTerminated = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucConversationInactive;
    case 1: return ucConversationActive;
    case 2: return ucConversationParked;
    case 3: return ucConversationTerminated;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0002(value);
    }
  }
}
