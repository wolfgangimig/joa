/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlOutlookBarViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlOutlookBarViewType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlOutlookBarViewType olLargeIcon = new OlOutlookBarViewType(0);
  public final static OlOutlookBarViewType olSmallIcon = new OlOutlookBarViewType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olLargeIcon = 0;
  public final static int _olSmallIcon = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlOutlookBarViewType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlOutlookBarViewType valueOf(int value) {
    switch(value) {
    case 0: return olLargeIcon;
    case 1: return olSmallIcon;
    default: return new OlOutlookBarViewType(value);
    }
  }
}
