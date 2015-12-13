/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientType.
 * Enumerates the client type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ClientType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ClientType ucClientTypeUC = new ClientType(1);
  public final static ClientType ucClientTypeDelegator = new ClientType(2);
  public final static ClientType ucClientTypeResponseGroup = new ClientType(3);
  public final static ClientType ucClientTypeAnonymous = new ClientType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucClientTypeUC = 1;
  public final static int _ucClientTypeDelegator = 2;
  public final static int _ucClientTypeResponseGroup = 3;
  public final static int _ucClientTypeAnonymous = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ClientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ClientType valueOf(int value) {
    switch(value) {
    case 1: return ucClientTypeUC;
    case 2: return ucClientTypeDelegator;
    case 3: return ucClientTypeResponseGroup;
    case 4: return ucClientTypeAnonymous;
    default: return new ClientType(value);
    }
  }
}
