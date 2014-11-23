/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactEndpointType.
 * Enumerates collaboration endpoint types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactEndpointType {
  ucContactEndpointTypeWorkPhone(0),
  ucContactEndpointTypeMobilePhone(1),
  ucContactEndpointTypeHomePhone(2),
  ucContactEndpointTypeOtherPhone(3),
  ucContactEndpointTypeLync(4),
  ucContactEndpointTypeVoiceMail(5),
  ucContactEndpointTypeMax(6);

  public final int value;
  private ContactEndpointType(int value) { this.value = value; }
  public static  ContactEndpointType valueOf(int value) {
    switch(value) {
    case 0: return ucContactEndpointTypeWorkPhone;
    case 1: return ucContactEndpointTypeMobilePhone;
    case 2: return ucContactEndpointTypeHomePhone;
    case 3: return ucContactEndpointTypeOtherPhone;
    case 4: return ucContactEndpointTypeLync;
    case 5: return ucContactEndpointTypeVoiceMail;
    case 6: return ucContactEndpointTypeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactEndpointType.class);
    }
  }
}
