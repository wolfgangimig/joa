/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoMixedType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoMixedType {

  // Typed constants
  public final static MsoMixedType msoIntegerMixed = new MsoMixedType(32768);
  public final static MsoMixedType msoSingleMixed = new MsoMixedType(-2147483648);

  // Integer constants for bitsets and switch statements
  public final static int _msoIntegerMixed = 32768;
  public final static int _msoSingleMixed = -2147483648;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoMixedType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoMixedType valueOf(int value) {
    switch(value) {
    case 32768: return msoIntegerMixed;
    case -2147483648: return msoSingleMixed;
    default: return new MsoMixedType(value);
    }
  }
}
