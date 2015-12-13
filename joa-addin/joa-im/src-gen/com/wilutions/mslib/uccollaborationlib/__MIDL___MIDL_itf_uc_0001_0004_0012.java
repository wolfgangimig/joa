/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0012.
 * Enumerates the contact types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0012 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0012 ucContactPresentityUnknown = new __MIDL___MIDL_itf_uc_0001_0004_0012(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0012 ucContactPresentityPerson = new __MIDL___MIDL_itf_uc_0001_0004_0012(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0012 ucContactPresentityHuntgroup = new __MIDL___MIDL_itf_uc_0001_0004_0012(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0012 ucContactPresentityAutoAttendant = new __MIDL___MIDL_itf_uc_0001_0004_0012(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0012 ucContactPresentityAutomatedBot = new __MIDL___MIDL_itf_uc_0001_0004_0012(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactPresentityUnknown = 0;
  public final static int _ucContactPresentityPerson = 1;
  public final static int _ucContactPresentityHuntgroup = 2;
  public final static int _ucContactPresentityAutoAttendant = 3;
  public final static int _ucContactPresentityAutomatedBot = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0012(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0012 valueOf(int value) {
    switch(value) {
    case 0: return ucContactPresentityUnknown;
    case 1: return ucContactPresentityPerson;
    case 2: return ucContactPresentityHuntgroup;
    case 3: return ucContactPresentityAutoAttendant;
    case 4: return ucContactPresentityAutomatedBot;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0012(value);
    }
  }
}
