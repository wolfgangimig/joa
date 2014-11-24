/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SoftMuteChangeInitiator.
 * Enumerates the possible reasons for the most recent SoftMute state change. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SoftMuteChangeInitiator {

  // Typed constants
  public final static SoftMuteChangeInitiator ucMuteInitiatorLocal = new SoftMuteChangeInitiator(0);
  public final static SoftMuteChangeInitiator ucMuteInitiatorRemote = new SoftMuteChangeInitiator(1);
  public final static SoftMuteChangeInitiator ucMuteInitiatorJoin = new SoftMuteChangeInitiator(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucMuteInitiatorLocal = 0;
  public final static int _ucMuteInitiatorRemote = 1;
  public final static int _ucMuteInitiatorJoin = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SoftMuteChangeInitiator(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SoftMuteChangeInitiator valueOf(int value) {
    switch(value) {
    case 0: return ucMuteInitiatorLocal;
    case 1: return ucMuteInitiatorRemote;
    case 2: return ucMuteInitiatorJoin;
    default: return new SoftMuteChangeInitiator(value);
    }
  }
}
