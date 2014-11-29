/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0022.
 * Enumerates the representation type of the representation info. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0022 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0022 ucRepresentationTypeDelegate = new __MIDL___MIDL_itf_uc_0001_0046_0022(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0022 ucRepresentationTypeTeam = new __MIDL___MIDL_itf_uc_0001_0046_0022(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0022 ucRepresentationTypeAutomaticCallDistributor = new __MIDL___MIDL_itf_uc_0001_0046_0022(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRepresentationTypeDelegate = 0;
  public final static int _ucRepresentationTypeTeam = 1;
  public final static int _ucRepresentationTypeAutomaticCallDistributor = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0022(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0022 valueOf(int value) {
    switch(value) {
    case 0: return ucRepresentationTypeDelegate;
    case 1: return ucRepresentationTypeTeam;
    case 2: return ucRepresentationTypeAutomaticCallDistributor;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0022(value);
    }
  }
}
