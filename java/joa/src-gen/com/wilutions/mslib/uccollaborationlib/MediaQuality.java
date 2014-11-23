/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * MediaQuality.
 * Enumerates the quality levels of modality's media session. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MediaQuality {
  ucMediaQualityNotSet(0),
  ucMediaQualityUnknown(1),
  ucMediaQualityGood(2),
  ucMediaQualityFair(3),
  ucMediaQualityBad(4);

  public final int value;
  private MediaQuality(int value) { this.value = value; }
  public static  MediaQuality valueOf(int value) {
    switch(value) {
    case 0: return ucMediaQualityNotSet;
    case 1: return ucMediaQualityUnknown;
    case 2: return ucMediaQualityGood;
    case 3: return ucMediaQualityFair;
    case 4: return ucMediaQualityBad;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MediaQuality.class);
    }
  }
}
