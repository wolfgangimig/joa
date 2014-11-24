/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SpeakerMode.
 * Enumerates the speaker modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SpeakerMode {

  // Typed constants
  public final static SpeakerMode ucSpeakerOff = new SpeakerMode(0);
  public final static SpeakerMode ucSpeakerOn = new SpeakerMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucSpeakerOff = 0;
  public final static int _ucSpeakerOn = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SpeakerMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SpeakerMode valueOf(int value) {
    switch(value) {
    case 0: return ucSpeakerOff;
    case 1: return ucSpeakerOn;
    default: return new SpeakerMode(value);
    }
  }
}
