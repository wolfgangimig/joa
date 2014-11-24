/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDragBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{25B06F72-02C5-4AF8-8366-28C2C65CB035}")
public class OlDragBehavior {

  // Typed constants
  public final static OlDragBehavior olDragBehaviorDisabled = new OlDragBehavior(0);
  public final static OlDragBehavior olDragBehaviorEnabled = new OlDragBehavior(1);

  // Integer constants for bitsets and switch statements
  public final static int _olDragBehaviorDisabled = 0;
  public final static int _olDragBehaviorEnabled = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDragBehavior(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDragBehavior valueOf(int value) {
    switch(value) {
    case 0: return olDragBehaviorDisabled;
    case 1: return olDragBehaviorEnabled;
    default: return new OlDragBehavior(value);
    }
  }
}
