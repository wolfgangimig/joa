/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0007.
 * Enumerates configuration can edit types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0007 {
  ucCanSetMode(0),
  ucCanSetTransport(1),
  ucCanSetInternalServer(2),
  ucCanSetExternalServer(3),
  ucCanSetSavePassword(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0007(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucCanSetMode;
    case 1: return ucCanSetTransport;
    case 2: return ucCanSetInternalServer;
    case 3: return ucCanSetExternalServer;
    case 4: return ucCanSetSavePassword;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0007.class);
    }
  }
}
