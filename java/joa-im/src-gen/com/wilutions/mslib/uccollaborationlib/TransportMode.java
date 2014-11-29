/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * TransportMode.
 * Enumerates the supported transport modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class TransportMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static TransportMode ucTcpTransport = new TransportMode(0);
  public final static TransportMode ucTlsTransport = new TransportMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucTcpTransport = 0;
  public final static int _ucTlsTransport = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private TransportMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  TransportMode valueOf(int value) {
    switch(value) {
    case 0: return ucTcpTransport;
    case 1: return ucTlsTransport;
    default: return new TransportMode(value);
    }
  }
}
