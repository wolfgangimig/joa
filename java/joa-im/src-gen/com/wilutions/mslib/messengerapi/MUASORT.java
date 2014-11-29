/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MUASORT.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MUASORT {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MUASORT MUASORT_GROUPS = new MUASORT(0);
  public final static MUASORT MUASORT_ONOFFLINE = new MUASORT(1);

  // Integer constants for bitsets and switch statements
  public final static int _MUASORT_GROUPS = 0;
  public final static int _MUASORT_ONOFFLINE = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MUASORT(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MUASORT valueOf(int value) {
    switch(value) {
    case 0: return MUASORT_GROUPS;
    case 1: return MUASORT_ONOFFLINE;
    default: return new MUASORT(value);
    }
  }
}
