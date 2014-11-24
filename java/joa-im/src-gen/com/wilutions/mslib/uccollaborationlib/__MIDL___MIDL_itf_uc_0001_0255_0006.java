/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0006.
 * Enumerates the supported transport modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0006 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0006 ucTcpTransport = new __MIDL___MIDL_itf_uc_0001_0255_0006(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0006 ucTlsTransport = new __MIDL___MIDL_itf_uc_0001_0255_0006(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucTcpTransport = 0;
  public final static int _ucTlsTransport = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucTcpTransport;
    case 1: return ucTlsTransport;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0006(value);
    }
  }
}
