/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBroadcastState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBroadcastState {
  NoBroadcast(0),
  BroadcastStarted(1),
  BroadcastPaused(2);

  public final int value;
  private MsoBroadcastState(int value) { this.value = value; }
  public static  MsoBroadcastState valueOf(int value) {
    switch(value) {
    case 0: return NoBroadcast;
    case 1: return BroadcastStarted;
    case 2: return BroadcastPaused;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBroadcastState.class);
    }
  }
}
