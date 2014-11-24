/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPermission.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlPermission {

  // Typed constants
  public final static OlPermission olUnrestricted = new OlPermission(0);
  public final static OlPermission olDoNotForward = new OlPermission(1);
  public final static OlPermission olPermissionTemplate = new OlPermission(2);

  // Integer constants for bitsets and switch statements
  public final static int _olUnrestricted = 0;
  public final static int _olDoNotForward = 1;
  public final static int _olPermissionTemplate = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPermission(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPermission valueOf(int value) {
    switch(value) {
    case 0: return olUnrestricted;
    case 1: return olDoNotForward;
    case 2: return olPermissionTemplate;
    default: return new OlPermission(value);
    }
  }
}
