/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlStoreType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlStoreType {

  // Typed constants
  public final static OlStoreType olStoreDefault = new OlStoreType(1);
  public final static OlStoreType olStoreUnicode = new OlStoreType(2);
  public final static OlStoreType olStoreANSI = new OlStoreType(3);

  // Integer constants for bitsets and switch statements
  public final static int _olStoreDefault = 1;
  public final static int _olStoreUnicode = 2;
  public final static int _olStoreANSI = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlStoreType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlStoreType valueOf(int value) {
    switch(value) {
    case 1: return olStoreDefault;
    case 2: return olStoreUnicode;
    case 3: return olStoreANSI;
    default: return new OlStoreType(value);
    }
  }
}
