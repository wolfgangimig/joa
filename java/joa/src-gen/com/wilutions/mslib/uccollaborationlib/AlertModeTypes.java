/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AlertModeTypes.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum AlertModeTypes {
  ucAlertModeVisual(1),
  ucAlertModeAudio(2),
  ucAlertModeAny(-1);

  public final int value;
  private AlertModeTypes(int value) { this.value = value; }
  public static  AlertModeTypes valueOf(int value) {
    switch(value) {
    case 1: return ucAlertModeVisual;
    case 2: return ucAlertModeAudio;
    case -1: return ucAlertModeAny;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + AlertModeTypes.class);
    }
  }
}
