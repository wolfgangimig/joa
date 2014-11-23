/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0018.
 * Enumerates the media channel states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0018 {
  ucChannelStateNone(0),
  ucChannelStateConnecting(1),
  ucChannelStateNotified(2),
  ucChannelStateSend(3),
  ucChannelStateReceive(4),
  ucChannelStateSendReceive(5),
  ucChannelStateInactive(6);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0018(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0018 valueOf(int value) {
    switch(value) {
    case 0: return ucChannelStateNone;
    case 1: return ucChannelStateConnecting;
    case 2: return ucChannelStateNotified;
    case 3: return ucChannelStateSend;
    case 4: return ucChannelStateReceive;
    case 5: return ucChannelStateSendReceive;
    case 6: return ucChannelStateInactive;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0018.class);
    }
  }
}
