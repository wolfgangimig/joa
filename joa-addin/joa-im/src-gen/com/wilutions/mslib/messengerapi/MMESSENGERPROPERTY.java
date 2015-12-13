/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MMESSENGERPROPERTY.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MMESSENGERPROPERTY {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MMESSENGERPROPERTY MMESSENGERPROP_VERSION = new MMESSENGERPROPERTY(0);
  public final static MMESSENGERPROPERTY MMESSENGERPROP_PLCID = new MMESSENGERPROPERTY(1);

  // Integer constants for bitsets and switch statements
  public final static int _MMESSENGERPROP_VERSION = 0;
  public final static int _MMESSENGERPROP_PLCID = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MMESSENGERPROPERTY(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MMESSENGERPROPERTY valueOf(int value) {
    switch(value) {
    case 0: return MMESSENGERPROP_VERSION;
    case 1: return MMESSENGERPROP_PLCID;
    default: return new MMESSENGERPROPERTY(value);
    }
  }
}
