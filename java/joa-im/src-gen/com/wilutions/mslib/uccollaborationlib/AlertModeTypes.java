/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AlertModeTypes.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AlertModeTypes {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static AlertModeTypes ucAlertModeVisual = new AlertModeTypes(1);
  public final static AlertModeTypes ucAlertModeAudio = new AlertModeTypes(2);
  public final static AlertModeTypes ucAlertModeAny = new AlertModeTypes(-1);

  // Integer constants for bitsets and switch statements
  public final static int _ucAlertModeVisual = 1;
  public final static int _ucAlertModeAudio = 2;
  public final static int _ucAlertModeAny = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AlertModeTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AlertModeTypes valueOf(int value) {
    switch(value) {
    case 1: return ucAlertModeVisual;
    case 2: return ucAlertModeAudio;
    case -1: return ucAlertModeAny;
    default: return new AlertModeTypes(value);
    }
  }
}
