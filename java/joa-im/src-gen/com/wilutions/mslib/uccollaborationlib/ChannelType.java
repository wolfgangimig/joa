/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ChannelType.
 * Enumerates the media channel types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ChannelType {

  // Typed constants
  public final static ChannelType ucChannelAudio = new ChannelType(0);
  public final static ChannelType ucChannelVideo = new ChannelType(1);
  public final static ChannelType ucChannelVideoPano = new ChannelType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucChannelAudio = 0;
  public final static int _ucChannelVideo = 1;
  public final static int _ucChannelVideoPano = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ChannelType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ChannelType valueOf(int value) {
    switch(value) {
    case 0: return ucChannelAudio;
    case 1: return ucChannelVideo;
    case 2: return ucChannelVideoPano;
    default: return new ChannelType(value);
    }
  }
}
