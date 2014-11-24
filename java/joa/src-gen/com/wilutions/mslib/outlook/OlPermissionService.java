/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPermissionService.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlPermissionService {

  // Typed constants
  public final static OlPermissionService olUnknown = new OlPermissionService(0);
  public final static OlPermissionService olWindows = new OlPermissionService(1);
  public final static OlPermissionService olPassport = new OlPermissionService(2);

  // Integer constants for bitsets and switch statements
  public final static int _olUnknown = 0;
  public final static int _olWindows = 1;
  public final static int _olPassport = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPermissionService(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPermissionService valueOf(int value) {
    switch(value) {
    case 0: return olUnknown;
    case 1: return olWindows;
    case 2: return olPassport;
    default: return new OlPermissionService(value);
    }
  }
}
