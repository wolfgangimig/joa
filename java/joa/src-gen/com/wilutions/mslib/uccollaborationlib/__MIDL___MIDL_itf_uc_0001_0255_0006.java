/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0006.
 * Enumerates the supported transport modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0006 {
  ucTcpTransport(0),
  ucTlsTransport(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0006(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucTcpTransport;
    case 1: return ucTlsTransport;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0006.class);
    }
  }
}
