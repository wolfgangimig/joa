/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMailRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMailRecipientType {

  // Typed constants
  public final static OlMailRecipientType olOriginator = new OlMailRecipientType(0);
  public final static OlMailRecipientType olTo = new OlMailRecipientType(1);
  public final static OlMailRecipientType olCC = new OlMailRecipientType(2);
  public final static OlMailRecipientType olBCC = new OlMailRecipientType(3);

  // Integer constants for bitsets and switch statements
  public final static int _olOriginator = 0;
  public final static int _olTo = 1;
  public final static int _olCC = 2;
  public final static int _olBCC = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMailRecipientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMailRecipientType valueOf(int value) {
    switch(value) {
    case 0: return olOriginator;
    case 1: return olTo;
    case 2: return olCC;
    case 3: return olBCC;
    default: return new OlMailRecipientType(value);
    }
  }
}
