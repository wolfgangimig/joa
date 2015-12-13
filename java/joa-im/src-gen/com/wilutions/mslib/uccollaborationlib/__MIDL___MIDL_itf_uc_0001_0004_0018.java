/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0018.
 * Enumerates collaboration endpoint types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0018 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeWorkPhone = new __MIDL___MIDL_itf_uc_0001_0004_0018(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeMobilePhone = new __MIDL___MIDL_itf_uc_0001_0004_0018(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeHomePhone = new __MIDL___MIDL_itf_uc_0001_0004_0018(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeOtherPhone = new __MIDL___MIDL_itf_uc_0001_0004_0018(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeLync = new __MIDL___MIDL_itf_uc_0001_0004_0018(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeVoiceMail = new __MIDL___MIDL_itf_uc_0001_0004_0018(5);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0018 ucContactEndpointTypeMax = new __MIDL___MIDL_itf_uc_0001_0004_0018(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactEndpointTypeWorkPhone = 0;
  public final static int _ucContactEndpointTypeMobilePhone = 1;
  public final static int _ucContactEndpointTypeHomePhone = 2;
  public final static int _ucContactEndpointTypeOtherPhone = 3;
  public final static int _ucContactEndpointTypeLync = 4;
  public final static int _ucContactEndpointTypeVoiceMail = 5;
  public final static int _ucContactEndpointTypeMax = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0018(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0018 valueOf(int value) {
    switch(value) {
    case 0: return ucContactEndpointTypeWorkPhone;
    case 1: return ucContactEndpointTypeMobilePhone;
    case 2: return ucContactEndpointTypeHomePhone;
    case 3: return ucContactEndpointTypeOtherPhone;
    case 4: return ucContactEndpointTypeLync;
    case 5: return ucContactEndpointTypeVoiceMail;
    case 6: return ucContactEndpointTypeMax;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0018(value);
    }
  }
}
