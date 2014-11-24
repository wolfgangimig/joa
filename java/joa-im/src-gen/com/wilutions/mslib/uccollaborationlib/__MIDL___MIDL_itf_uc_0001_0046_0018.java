/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0018.
 * Enumerates the media channel states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0018 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateNone = new __MIDL___MIDL_itf_uc_0001_0046_0018(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateConnecting = new __MIDL___MIDL_itf_uc_0001_0046_0018(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateNotified = new __MIDL___MIDL_itf_uc_0001_0046_0018(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateSend = new __MIDL___MIDL_itf_uc_0001_0046_0018(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateReceive = new __MIDL___MIDL_itf_uc_0001_0046_0018(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateSendReceive = new __MIDL___MIDL_itf_uc_0001_0046_0018(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0018 ucChannelStateInactive = new __MIDL___MIDL_itf_uc_0001_0046_0018(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucChannelStateNone = 0;
  public final static int _ucChannelStateConnecting = 1;
  public final static int _ucChannelStateNotified = 2;
  public final static int _ucChannelStateSend = 3;
  public final static int _ucChannelStateReceive = 4;
  public final static int _ucChannelStateSendReceive = 5;
  public final static int _ucChannelStateInactive = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0018(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0018 valueOf(int value) {
    switch(value) {
    case 0: return ucChannelStateNone;
    case 1: return ucChannelStateConnecting;
    case 2: return ucChannelStateNotified;
    case 3: return ucChannelStateSend;
    case 4: return ucChannelStateReceive;
    case 5: return ucChannelStateSendReceive;
    case 6: return ucChannelStateInactive;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0018(value);
    }
  }
}
