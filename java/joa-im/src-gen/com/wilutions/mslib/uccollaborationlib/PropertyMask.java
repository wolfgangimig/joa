/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PropertyMask.
 * Enumerates the property ID masks. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PropertyMask {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static PropertyMask ucPropertyMaskType = new PropertyMask(-268435456);
  public final static PropertyMask ucPropertyMaskClass = new PropertyMask(268369920);
  public final static PropertyMask ucPropertyMaskId = new PropertyMask(65535);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyMaskType = -268435456;
  public final static int _ucPropertyMaskClass = 268369920;
  public final static int _ucPropertyMaskId = 65535;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PropertyMask(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PropertyMask valueOf(int value) {
    switch(value) {
    case -268435456: return ucPropertyMaskType;
    case 268369920: return ucPropertyMaskClass;
    case 65535: return ucPropertyMaskId;
    default: return new PropertyMask(value);
    }
  }
}
