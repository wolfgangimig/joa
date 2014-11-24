/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0012.
 * Enumerates the interfaces that can be returned in IUCOfficeIntegration.GetInterface. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0012 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0012 oiInterfaceILyncClient = new __MIDL___MIDL_itf_uc_0001_0255_0012(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0012 oiInterfaceIAutomation = new __MIDL___MIDL_itf_uc_0001_0255_0012(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0012 oiInterfaceIInteropHelper = new __MIDL___MIDL_itf_uc_0001_0255_0012(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0012 oiInterfaceILyncClientRaw = new __MIDL___MIDL_itf_uc_0001_0255_0012(256);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0012 oiInterfaceIAutomationRaw = new __MIDL___MIDL_itf_uc_0001_0255_0012(257);

  // Integer constants for bitsets and switch statements
  public final static int _oiInterfaceILyncClient = 1;
  public final static int _oiInterfaceIAutomation = 2;
  public final static int _oiInterfaceIInteropHelper = 3;
  public final static int _oiInterfaceILyncClientRaw = 256;
  public final static int _oiInterfaceIAutomationRaw = 257;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0012(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0012 valueOf(int value) {
    switch(value) {
    case 1: return oiInterfaceILyncClient;
    case 2: return oiInterfaceIAutomation;
    case 3: return oiInterfaceIInteropHelper;
    case 256: return oiInterfaceILyncClientRaw;
    case 257: return oiInterfaceIAutomationRaw;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0012(value);
    }
  }
}
