/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0007.
 * Enumerates configuration can edit types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0007 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0007 ucCanSetMode = new __MIDL___MIDL_itf_uc_0001_0255_0007(0);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0007 ucCanSetTransport = new __MIDL___MIDL_itf_uc_0001_0255_0007(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0007 ucCanSetInternalServer = new __MIDL___MIDL_itf_uc_0001_0255_0007(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0007 ucCanSetExternalServer = new __MIDL___MIDL_itf_uc_0001_0255_0007(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0007 ucCanSetSavePassword = new __MIDL___MIDL_itf_uc_0001_0255_0007(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucCanSetMode = 0;
  public final static int _ucCanSetTransport = 1;
  public final static int _ucCanSetInternalServer = 2;
  public final static int _ucCanSetExternalServer = 3;
  public final static int _ucCanSetSavePassword = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0007(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucCanSetMode;
    case 1: return ucCanSetTransport;
    case 2: return ucCanSetInternalServer;
    case 3: return ucCanSetExternalServer;
    case 4: return ucCanSetSavePassword;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0007(value);
    }
  }
}
