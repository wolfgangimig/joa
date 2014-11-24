/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormRegionMode {

  // Typed constants
  public final static OlFormRegionMode olFormRegionRead = new OlFormRegionMode(0);
  public final static OlFormRegionMode olFormRegionCompose = new OlFormRegionMode(1);
  public final static OlFormRegionMode olFormRegionPreview = new OlFormRegionMode(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFormRegionRead = 0;
  public final static int _olFormRegionCompose = 1;
  public final static int _olFormRegionPreview = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormRegionMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormRegionMode valueOf(int value) {
    switch(value) {
    case 0: return olFormRegionRead;
    case 1: return olFormRegionCompose;
    case 2: return olFormRegionPreview;
    default: return new OlFormRegionMode(value);
    }
  }
}
