/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * MediaQuality.
 * Enumerates the quality levels of modality's media session. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MediaQuality {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MediaQuality ucMediaQualityNotSet = new MediaQuality(0);
  public final static MediaQuality ucMediaQualityUnknown = new MediaQuality(1);
  public final static MediaQuality ucMediaQualityGood = new MediaQuality(2);
  public final static MediaQuality ucMediaQualityFair = new MediaQuality(3);
  public final static MediaQuality ucMediaQualityBad = new MediaQuality(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucMediaQualityNotSet = 0;
  public final static int _ucMediaQualityUnknown = 1;
  public final static int _ucMediaQualityGood = 2;
  public final static int _ucMediaQualityFair = 3;
  public final static int _ucMediaQualityBad = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MediaQuality(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MediaQuality valueOf(int value) {
    switch(value) {
    case 0: return ucMediaQualityNotSet;
    case 1: return ucMediaQualityUnknown;
    case 2: return ucMediaQualityGood;
    case 3: return ucMediaQualityFair;
    case 4: return ucMediaQualityBad;
    default: return new MediaQuality(value);
    }
  }
}
