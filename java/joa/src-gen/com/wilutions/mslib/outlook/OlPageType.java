/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPageType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{35D15973-23ED-4504-866B-C0B5C937A058}")
public class OlPageType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlPageType olPageTypePlanner = new OlPageType(0);
  public final static OlPageType olPageTypeTracker = new OlPageType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olPageTypePlanner = 0;
  public final static int _olPageTypeTracker = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPageType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPageType valueOf(int value) {
    switch(value) {
    case 0: return olPageTypePlanner;
    case 1: return olPageTypeTracker;
    default: return new OlPageType(value);
    }
  }
}
