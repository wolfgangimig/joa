/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * TransportMode.
 * Enumerates the supported transport modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum TransportMode {
  ucTcpTransport(0),
  ucTlsTransport(1);

  public final int value;
  private TransportMode(int value) { this.value = value; }
  public static  TransportMode valueOf(int value) {
    switch(value) {
    case 0: return ucTcpTransport;
    case 1: return ucTlsTransport;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + TransportMode.class);
    }
  }
}
