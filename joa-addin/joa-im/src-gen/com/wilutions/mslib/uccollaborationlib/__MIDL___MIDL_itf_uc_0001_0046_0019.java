/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0019.
 * Enumerates the channel actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0019 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_Start = new __MIDL___MIDL_itf_uc_0001_0046_0019(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_Stop = new __MIDL___MIDL_itf_uc_0001_0046_0019(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_SendDtmf = new __MIDL___MIDL_itf_uc_0001_0046_0019(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_PauseSend = new __MIDL___MIDL_itf_uc_0001_0046_0019(5001);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_PauseReceive = new __MIDL___MIDL_itf_uc_0001_0046_0019(5002);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_PlaySend = new __MIDL___MIDL_itf_uc_0001_0046_0019(5003);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_PlayReceive = new __MIDL___MIDL_itf_uc_0001_0046_0019(5004);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_Pause = new __MIDL___MIDL_itf_uc_0001_0046_0019(5005);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0019 ucChannelAction_Resume = new __MIDL___MIDL_itf_uc_0001_0046_0019(5006);

  // Integer constants for bitsets and switch statements
  public final static int _ucChannelAction_Start = 0;
  public final static int _ucChannelAction_Stop = 1;
  public final static int _ucChannelAction_SendDtmf = 2;
  public final static int _ucChannelAction_PauseSend = 5001;
  public final static int _ucChannelAction_PauseReceive = 5002;
  public final static int _ucChannelAction_PlaySend = 5003;
  public final static int _ucChannelAction_PlayReceive = 5004;
  public final static int _ucChannelAction_Pause = 5005;
  public final static int _ucChannelAction_Resume = 5006;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0019(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0019 valueOf(int value) {
    switch(value) {
    case 0: return ucChannelAction_Start;
    case 1: return ucChannelAction_Stop;
    case 2: return ucChannelAction_SendDtmf;
    case 5001: return ucChannelAction_PauseSend;
    case 5002: return ucChannelAction_PauseReceive;
    case 5003: return ucChannelAction_PlaySend;
    case 5004: return ucChannelAction_PlayReceive;
    case 5005: return ucChannelAction_Pause;
    case 5006: return ucChannelAction_Resume;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0019(value);
    }
  }
}
