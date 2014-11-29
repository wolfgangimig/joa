/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactEndpointType.
 * Enumerates collaboration endpoint types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactEndpointType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ContactEndpointType ucContactEndpointTypeWorkPhone = new ContactEndpointType(0);
  public final static ContactEndpointType ucContactEndpointTypeMobilePhone = new ContactEndpointType(1);
  public final static ContactEndpointType ucContactEndpointTypeHomePhone = new ContactEndpointType(2);
  public final static ContactEndpointType ucContactEndpointTypeOtherPhone = new ContactEndpointType(3);
  public final static ContactEndpointType ucContactEndpointTypeLync = new ContactEndpointType(4);
  public final static ContactEndpointType ucContactEndpointTypeVoiceMail = new ContactEndpointType(5);
  public final static ContactEndpointType ucContactEndpointTypeMax = new ContactEndpointType(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactEndpointTypeWorkPhone = 0;
  public final static int _ucContactEndpointTypeMobilePhone = 1;
  public final static int _ucContactEndpointTypeHomePhone = 2;
  public final static int _ucContactEndpointTypeOtherPhone = 3;
  public final static int _ucContactEndpointTypeLync = 4;
  public final static int _ucContactEndpointTypeVoiceMail = 5;
  public final static int _ucContactEndpointTypeMax = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactEndpointType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactEndpointType valueOf(int value) {
    switch(value) {
    case 0: return ucContactEndpointTypeWorkPhone;
    case 1: return ucContactEndpointTypeMobilePhone;
    case 2: return ucContactEndpointTypeHomePhone;
    case 3: return ucContactEndpointTypeOtherPhone;
    case 4: return ucContactEndpointTypeLync;
    case 5: return ucContactEndpointTypeVoiceMail;
    case 6: return ucContactEndpointTypeMax;
    default: return new ContactEndpointType(value);
    }
  }
}
