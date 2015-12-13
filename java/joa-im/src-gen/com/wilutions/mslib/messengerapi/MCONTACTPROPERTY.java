/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MCONTACTPROPERTY.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MCONTACTPROPERTY {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MCONTACTPROPERTY MCONTACTPROP_INVALID_PROPERTY = new MCONTACTPROPERTY(-1);
  public final static MCONTACTPROPERTY MCONTACTPROP_GROUPS_PROPERTY = new MCONTACTPROPERTY(0);
  public final static MCONTACTPROPERTY MCONTACTPROP_EMAIL = new MCONTACTPROPERTY(1);
  public final static MCONTACTPROPERTY MCONTACTPROP_USERTILE_PATH = new MCONTACTPROPERTY(2);
  public final static MCONTACTPROPERTY MCONTACTPROP_CUSTOMER_ID = new MCONTACTPROPERTY(3);

  // Integer constants for bitsets and switch statements
  public final static int _MCONTACTPROP_INVALID_PROPERTY = -1;
  public final static int _MCONTACTPROP_GROUPS_PROPERTY = 0;
  public final static int _MCONTACTPROP_EMAIL = 1;
  public final static int _MCONTACTPROP_USERTILE_PATH = 2;
  public final static int _MCONTACTPROP_CUSTOMER_ID = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MCONTACTPROPERTY(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MCONTACTPROPERTY valueOf(int value) {
    switch(value) {
    case -1: return MCONTACTPROP_INVALID_PROPERTY;
    case 0: return MCONTACTPROP_GROUPS_PROPERTY;
    case 1: return MCONTACTPROP_EMAIL;
    case 2: return MCONTACTPROP_USERTILE_PATH;
    case 3: return MCONTACTPROP_CUSTOMER_ID;
    default: return new MCONTACTPROPERTY(value);
    }
  }
}
