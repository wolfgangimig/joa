/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MPHONE_TYPE.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MPHONE_TYPE {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MPHONE_TYPE MPHONE_TYPE_ALL = new MPHONE_TYPE(-1);
  public final static MPHONE_TYPE MPHONE_TYPE_HOME = new MPHONE_TYPE(0);
  public final static MPHONE_TYPE MPHONE_TYPE_WORK = new MPHONE_TYPE(1);
  public final static MPHONE_TYPE MPHONE_TYPE_MOBILE = new MPHONE_TYPE(2);
  public final static MPHONE_TYPE MPHONE_TYPE_CUSTOM = new MPHONE_TYPE(3);

  // Integer constants for bitsets and switch statements
  public final static int _MPHONE_TYPE_ALL = -1;
  public final static int _MPHONE_TYPE_HOME = 0;
  public final static int _MPHONE_TYPE_WORK = 1;
  public final static int _MPHONE_TYPE_MOBILE = 2;
  public final static int _MPHONE_TYPE_CUSTOM = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MPHONE_TYPE(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MPHONE_TYPE valueOf(int value) {
    switch(value) {
    case -1: return MPHONE_TYPE_ALL;
    case 0: return MPHONE_TYPE_HOME;
    case 1: return MPHONE_TYPE_WORK;
    case 2: return MPHONE_TYPE_MOBILE;
    case 3: return MPHONE_TYPE_CUSTOM;
    default: return new MPHONE_TYPE(value);
    }
  }
}
