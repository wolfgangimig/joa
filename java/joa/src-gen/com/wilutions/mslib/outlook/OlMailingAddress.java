/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMailingAddress.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMailingAddress {

  // Typed constants
  public final static OlMailingAddress olNone = new OlMailingAddress(0);
  public final static OlMailingAddress olHome = new OlMailingAddress(1);
  public final static OlMailingAddress olBusiness = new OlMailingAddress(2);
  public final static OlMailingAddress olOther = new OlMailingAddress(3);

  // Integer constants for bitsets and switch statements
  public final static int _olNone = 0;
  public final static int _olHome = 1;
  public final static int _olBusiness = 2;
  public final static int _olOther = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMailingAddress(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMailingAddress valueOf(int value) {
    switch(value) {
    case 0: return olNone;
    case 1: return olHome;
    case 2: return olBusiness;
    case 3: return olOther;
    default: return new OlMailingAddress(value);
    }
  }
}
