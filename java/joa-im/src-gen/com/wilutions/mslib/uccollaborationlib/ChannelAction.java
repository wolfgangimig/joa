/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ChannelAction.
 * Enumerates the channel actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ChannelAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ChannelAction ucChannelAction_Start = new ChannelAction(0);
  public final static ChannelAction ucChannelAction_Stop = new ChannelAction(1);
  public final static ChannelAction ucChannelAction_SendDtmf = new ChannelAction(2);
  public final static ChannelAction ucChannelAction_PauseSend = new ChannelAction(5001);
  public final static ChannelAction ucChannelAction_PauseReceive = new ChannelAction(5002);
  public final static ChannelAction ucChannelAction_PlaySend = new ChannelAction(5003);
  public final static ChannelAction ucChannelAction_PlayReceive = new ChannelAction(5004);
  public final static ChannelAction ucChannelAction_Pause = new ChannelAction(5005);
  public final static ChannelAction ucChannelAction_Resume = new ChannelAction(5006);

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
  private ChannelAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ChannelAction(value);
    }
  }
}
