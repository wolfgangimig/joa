/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * MediaStreamDirection.
 * Enumerates the media stream directions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MediaStreamDirection {

  // Typed constants
  public final static MediaStreamDirection MediaStreamDirection_None = new MediaStreamDirection(0);
  public final static MediaStreamDirection MediaStreamDirection_Send = new MediaStreamDirection(1);
  public final static MediaStreamDirection MediaStreamDirection_Receive = new MediaStreamDirection(2);

  // Integer constants for bitsets and switch statements
  public final static int _MediaStreamDirection_None = 0;
  public final static int _MediaStreamDirection_Send = 1;
  public final static int _MediaStreamDirection_Receive = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MediaStreamDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MediaStreamDirection valueOf(int value) {
    switch(value) {
    case 0: return MediaStreamDirection_None;
    case 1: return MediaStreamDirection_Send;
    case 2: return MediaStreamDirection_Receive;
    default: return new MediaStreamDirection(value);
    }
  }
}
