/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PropertyMask.
 * Enumerates the property ID masks. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PropertyMask {
  ucPropertyMaskType(-268435456),
  ucPropertyMaskClass(268369920),
  ucPropertyMaskId(65535);

  public final int value;
  private PropertyMask(int value) { this.value = value; }
  public static  PropertyMask valueOf(int value) {
    switch(value) {
    case -268435456: return ucPropertyMaskType;
    case 268369920: return ucPropertyMaskClass;
    case 65535: return ucPropertyMaskId;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PropertyMask.class);
    }
  }
}
