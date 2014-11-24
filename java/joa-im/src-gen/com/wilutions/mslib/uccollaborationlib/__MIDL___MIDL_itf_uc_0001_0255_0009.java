/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0009.
 * Enumerates the client type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0255_0009 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0255_0009 ucClientTypeUC = new __MIDL___MIDL_itf_uc_0001_0255_0009(1);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0009 ucClientTypeDelegator = new __MIDL___MIDL_itf_uc_0001_0255_0009(2);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0009 ucClientTypeResponseGroup = new __MIDL___MIDL_itf_uc_0001_0255_0009(3);
  public final static __MIDL___MIDL_itf_uc_0001_0255_0009 ucClientTypeAnonymous = new __MIDL___MIDL_itf_uc_0001_0255_0009(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucClientTypeUC = 1;
  public final static int _ucClientTypeDelegator = 2;
  public final static int _ucClientTypeResponseGroup = 3;
  public final static int _ucClientTypeAnonymous = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0255_0009(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0255_0009 valueOf(int value) {
    switch(value) {
    case 1: return ucClientTypeUC;
    case 2: return ucClientTypeDelegator;
    case 3: return ucClientTypeResponseGroup;
    case 4: return ucClientTypeAnonymous;
    default: return new __MIDL___MIDL_itf_uc_0001_0255_0009(value);
    }
  }
}
