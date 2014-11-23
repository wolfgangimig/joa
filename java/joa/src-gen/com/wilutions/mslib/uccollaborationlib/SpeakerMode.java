/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SpeakerMode.
 * Enumerates the speaker modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SpeakerMode {
  ucSpeakerOff(0),
  ucSpeakerOn(1);

  public final int value;
  private SpeakerMode(int value) { this.value = value; }
  public static  SpeakerMode valueOf(int value) {
    switch(value) {
    case 0: return ucSpeakerOff;
    case 1: return ucSpeakerOn;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SpeakerMode.class);
    }
  }
}
