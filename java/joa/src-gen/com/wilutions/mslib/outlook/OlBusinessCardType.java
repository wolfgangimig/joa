/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBusinessCardType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlBusinessCardType {

  // Typed constants
  public final static OlBusinessCardType olBusinessCardTypeOutlook = new OlBusinessCardType(0);
  public final static OlBusinessCardType olBusinessCardTypeInterConnect = new OlBusinessCardType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olBusinessCardTypeOutlook = 0;
  public final static int _olBusinessCardTypeInterConnect = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlBusinessCardType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlBusinessCardType valueOf(int value) {
    switch(value) {
    case 0: return olBusinessCardTypeOutlook;
    case 1: return olBusinessCardTypeInterConnect;
    default: return new OlBusinessCardType(value);
    }
  }
}
