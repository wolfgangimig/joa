/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ChannelAction.
 * Enumerates the channel actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ChannelAction {
  ucChannelAction_Start(0),
  ucChannelAction_Stop(1),
  ucChannelAction_SendDtmf(2),
  ucChannelAction_PauseSend(5001),
  ucChannelAction_PauseReceive(5002),
  ucChannelAction_PlaySend(5003),
  ucChannelAction_PlayReceive(5004),
  ucChannelAction_Pause(5005),
  ucChannelAction_Resume(5006);

  public final int value;
  private ChannelAction(int value) { this.value = value; }
  public static  ChannelAction valueOf(int value) {
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ChannelAction.class);
    }
  }
}
