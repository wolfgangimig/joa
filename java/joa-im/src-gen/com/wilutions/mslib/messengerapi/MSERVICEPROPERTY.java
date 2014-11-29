/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MSERVICEPROPERTY.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MSERVICEPROPERTY {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MSERVICEPROPERTY MSERVICEPROP_INVALID_PROPERTY = new MSERVICEPROPERTY(-1);

  // Integer constants for bitsets and switch statements
  public final static int _MSERVICEPROP_INVALID_PROPERTY = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MSERVICEPROPERTY(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MSERVICEPROPERTY valueOf(int value) {
    switch(value) {
    case -1: return MSERVICEPROP_INVALID_PROPERTY;
    default: return new MSERVICEPROPERTY(value);
    }
  }
}
