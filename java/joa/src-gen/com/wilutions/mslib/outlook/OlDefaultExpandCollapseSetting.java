/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultExpandCollapseSetting.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDefaultExpandCollapseSetting {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlDefaultExpandCollapseSetting olAllExpanded = new OlDefaultExpandCollapseSetting(0);
  public final static OlDefaultExpandCollapseSetting olAllCollapsed = new OlDefaultExpandCollapseSetting(1);
  public final static OlDefaultExpandCollapseSetting olLastViewed = new OlDefaultExpandCollapseSetting(2);

  // Integer constants for bitsets and switch statements
  public final static int _olAllExpanded = 0;
  public final static int _olAllCollapsed = 1;
  public final static int _olLastViewed = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDefaultExpandCollapseSetting(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDefaultExpandCollapseSetting valueOf(int value) {
    switch(value) {
    case 0: return olAllExpanded;
    case 1: return olAllCollapsed;
    case 2: return olLastViewed;
    default: return new OlDefaultExpandCollapseSetting(value);
    }
  }
}
