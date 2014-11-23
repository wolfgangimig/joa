/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ChannelType.
 * Enumerates the media channel types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ChannelType {
  ucChannelAudio(0),
  ucChannelVideo(1),
  ucChannelVideoPano(2);

  public final int value;
  private ChannelType(int value) { this.value = value; }
  public static  ChannelType valueOf(int value) {
    switch(value) {
    case 0: return ucChannelAudio;
    case 1: return ucChannelVideo;
    case 2: return ucChannelVideoPano;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ChannelType.class);
    }
  }
}
