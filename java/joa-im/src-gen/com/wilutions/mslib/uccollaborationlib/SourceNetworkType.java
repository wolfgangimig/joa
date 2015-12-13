/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SourceNetworkType.
 * Enumerates source network (network of origin) types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SourceNetworkType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SourceNetworkType ucSourceNetworkUnknown = new SourceNetworkType(0);
  public final static SourceNetworkType ucSourceNetworkEnterprise = new SourceNetworkType(1);
  public final static SourceNetworkType ucSourceNetworkFederatedEnterprise = new SourceNetworkType(2);
  public final static SourceNetworkType ucSourceNetworkFederatedPublic = new SourceNetworkType(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucSourceNetworkUnknown = 0;
  public final static int _ucSourceNetworkEnterprise = 1;
  public final static int _ucSourceNetworkFederatedEnterprise = 2;
  public final static int _ucSourceNetworkFederatedPublic = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SourceNetworkType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SourceNetworkType valueOf(int value) {
    switch(value) {
    case 0: return ucSourceNetworkUnknown;
    case 1: return ucSourceNetworkEnterprise;
    case 2: return ucSourceNetworkFederatedEnterprise;
    case 3: return ucSourceNetworkFederatedPublic;
    default: return new SourceNetworkType(value);
    }
  }
}
