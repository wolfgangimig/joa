/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAccountType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAccountType {

  // Typed constants
  public final static OlAccountType olExchange = new OlAccountType(0);
  public final static OlAccountType olImap = new OlAccountType(1);
  public final static OlAccountType olPop3 = new OlAccountType(2);
  public final static OlAccountType olHttp = new OlAccountType(3);
  public final static OlAccountType olEas = new OlAccountType(4);
  public final static OlAccountType olOtherAccount = new OlAccountType(5);

  // Integer constants for bitsets and switch statements
  public final static int _olExchange = 0;
  public final static int _olImap = 1;
  public final static int _olPop3 = 2;
  public final static int _olHttp = 3;
  public final static int _olEas = 4;
  public final static int _olOtherAccount = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAccountType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAccountType valueOf(int value) {
    switch(value) {
    case 0: return olExchange;
    case 1: return olImap;
    case 2: return olPop3;
    case 3: return olHttp;
    case 4: return olEas;
    case 5: return olOtherAccount;
    default: return new OlAccountType(value);
    }
  }
}
