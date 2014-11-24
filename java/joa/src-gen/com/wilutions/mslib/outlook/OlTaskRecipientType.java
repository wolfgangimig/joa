/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTaskRecipientType {

  // Typed constants
  public final static OlTaskRecipientType olUpdate = new OlTaskRecipientType(2);
  public final static OlTaskRecipientType olFinalStatus = new OlTaskRecipientType(3);

  // Integer constants for bitsets and switch statements
  public final static int _olUpdate = 2;
  public final static int _olFinalStatus = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTaskRecipientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTaskRecipientType valueOf(int value) {
    switch(value) {
    case 2: return olUpdate;
    case 3: return olFinalStatus;
    default: return new OlTaskRecipientType(value);
    }
  }
}
