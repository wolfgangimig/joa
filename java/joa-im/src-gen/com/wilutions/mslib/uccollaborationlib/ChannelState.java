/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ChannelState.
 * Enumerates the media channel states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ChannelState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ChannelState ucChannelStateNone = new ChannelState(0);
  public final static ChannelState ucChannelStateConnecting = new ChannelState(1);
  public final static ChannelState ucChannelStateNotified = new ChannelState(2);
  public final static ChannelState ucChannelStateSend = new ChannelState(3);
  public final static ChannelState ucChannelStateReceive = new ChannelState(4);
  public final static ChannelState ucChannelStateSendReceive = new ChannelState(5);
  public final static ChannelState ucChannelStateInactive = new ChannelState(6);

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
  private ChannelState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ChannelState valueOf(int value) {
    switch(value) {
    case 0: return ucChannelStateNone;
    case 1: return ucChannelStateConnecting;
    case 2: return ucChannelStateNotified;
    case 3: return ucChannelStateSend;
    case 4: return ucChannelStateReceive;
    case 5: return ucChannelStateSendReceive;
    case 6: return ucChannelStateInactive;
    default: return new ChannelState(value);
    }
  }
}
