/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlEnterFieldBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7E29FD73-540B-4F03-A890-53C6B0AE7DD1}")
public class OlEnterFieldBehavior {

  // Typed constants
  public final static OlEnterFieldBehavior olEnterFieldBehaviorSelectAll = new OlEnterFieldBehavior(0);
  public final static OlEnterFieldBehavior olEnterFieldBehaviorRecallSelection = new OlEnterFieldBehavior(1);

  // Integer constants for bitsets and switch statements
  public final static int _olEnterFieldBehaviorSelectAll = 0;
  public final static int _olEnterFieldBehaviorRecallSelection = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlEnterFieldBehavior(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlEnterFieldBehavior valueOf(int value) {
    switch(value) {
    case 0: return olEnterFieldBehaviorSelectAll;
    case 1: return olEnterFieldBehaviorRecallSelection;
    default: return new OlEnterFieldBehavior(value);
    }
  }
}
