/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SoftMuteChangeInitiator.
 * Enumerates the possible reasons for the most recent SoftMute state change. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SoftMuteChangeInitiator {
  ucMuteInitiatorLocal(0),
  ucMuteInitiatorRemote(1),
  ucMuteInitiatorJoin(2);

  public final int value;
  private SoftMuteChangeInitiator(int value) { this.value = value; }
  public static  SoftMuteChangeInitiator valueOf(int value) {
    switch(value) {
    case 0: return ucMuteInitiatorLocal;
    case 1: return ucMuteInitiatorRemote;
    case 2: return ucMuteInitiatorJoin;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SoftMuteChangeInitiator.class);
    }
  }
}
