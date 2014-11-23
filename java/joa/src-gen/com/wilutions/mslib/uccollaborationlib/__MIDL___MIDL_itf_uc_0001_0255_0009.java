/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0009.
 * Enumerates the client type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0009 {
  ucClientTypeUC(1),
  ucClientTypeDelegator(2),
  ucClientTypeResponseGroup(3),
  ucClientTypeAnonymous(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0009(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0009 valueOf(int value) {
    switch(value) {
    case 1: return ucClientTypeUC;
    case 2: return ucClientTypeDelegator;
    case 3: return ucClientTypeResponseGroup;
    case 4: return ucClientTypeAnonymous;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0009.class);
    }
  }
}
