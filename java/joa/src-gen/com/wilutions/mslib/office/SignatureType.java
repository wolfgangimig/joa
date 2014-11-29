/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * SignatureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SignatureType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SignatureType sigtypeUnknown = new SignatureType(0);
  public final static SignatureType sigtypeNonVisible = new SignatureType(1);
  public final static SignatureType sigtypeSignatureLine = new SignatureType(2);
  public final static SignatureType sigtypeMax = new SignatureType(3);

  // Integer constants for bitsets and switch statements
  public final static int _sigtypeUnknown = 0;
  public final static int _sigtypeNonVisible = 1;
  public final static int _sigtypeSignatureLine = 2;
  public final static int _sigtypeMax = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SignatureType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SignatureType valueOf(int value) {
    switch(value) {
    case 0: return sigtypeUnknown;
    case 1: return sigtypeNonVisible;
    case 2: return sigtypeSignatureLine;
    case 3: return sigtypeMax;
    default: return new SignatureType(value);
    }
  }
}
