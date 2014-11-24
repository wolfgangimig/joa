/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AudioPlayBackModes.
 * Enumerates AudioFeedback Devices. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AudioPlayBackModes {

  // Typed constants
  public final static AudioPlayBackModes ucAudioFeedbackNone = new AudioPlayBackModes(0);
  public final static AudioPlayBackModes ucAudioFeedbackAlert = new AudioPlayBackModes(1);
  public final static AudioPlayBackModes ucAudioFeedbackCommunication = new AudioPlayBackModes(2);
  public final static AudioPlayBackModes ucAudioFeedbackHandset = new AudioPlayBackModes(4);
  public final static AudioPlayBackModes ucAudioFeedbackRinging = new AudioPlayBackModes(8);
  public final static AudioPlayBackModes ucAudioFeedbackAlertAndCommunication = new AudioPlayBackModes(3);
  public final static AudioPlayBackModes ucAudioFeedbackSuppressOnDeskphones = new AudioPlayBackModes(-2147483648);

  // Integer constants for bitsets and switch statements
  public final static int _ucAudioFeedbackNone = 0;
  public final static int _ucAudioFeedbackAlert = 1;
  public final static int _ucAudioFeedbackCommunication = 2;
  public final static int _ucAudioFeedbackHandset = 4;
  public final static int _ucAudioFeedbackRinging = 8;
  public final static int _ucAudioFeedbackAlertAndCommunication = 3;
  public final static int _ucAudioFeedbackSuppressOnDeskphones = -2147483648;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AudioPlayBackModes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AudioPlayBackModes valueOf(int value) {
    switch(value) {
    case 0: return ucAudioFeedbackNone;
    case 1: return ucAudioFeedbackAlert;
    case 2: return ucAudioFeedbackCommunication;
    case 4: return ucAudioFeedbackHandset;
    case 8: return ucAudioFeedbackRinging;
    case 3: return ucAudioFeedbackAlertAndCommunication;
    case -2147483648: return ucAudioFeedbackSuppressOnDeskphones;
    default: return new AudioPlayBackModes(value);
    }
  }
}
