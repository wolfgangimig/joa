/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0003.
 * Enumerates the group types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0003 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucCustomGroup = new __MIDL___MIDL_itf_uc_0001_0004_0003(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucRecentContacts = new __MIDL___MIDL_itf_uc_0001_0004_0003(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucDistributionGroup = new __MIDL___MIDL_itf_uc_0001_0004_0003(3);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucFrequentContacts = new __MIDL___MIDL_itf_uc_0001_0004_0003(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucFavoriteContacts = new __MIDL___MIDL_itf_uc_0001_0004_0003(5);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucDelegateGroup = new __MIDL___MIDL_itf_uc_0001_0004_0003(6);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0003 ucResponseServiceGroup = new __MIDL___MIDL_itf_uc_0001_0004_0003(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucCustomGroup = 1;
  public final static int _ucRecentContacts = 2;
  public final static int _ucDistributionGroup = 3;
  public final static int _ucFrequentContacts = 4;
  public final static int _ucFavoriteContacts = 5;
  public final static int _ucDelegateGroup = 6;
  public final static int _ucResponseServiceGroup = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0003 valueOf(int value) {
    switch(value) {
    case 1: return ucCustomGroup;
    case 2: return ucRecentContacts;
    case 3: return ucDistributionGroup;
    case 4: return ucFrequentContacts;
    case 5: return ucFavoriteContacts;
    case 6: return ucDelegateGroup;
    case 7: return ucResponseServiceGroup;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0003(value);
    }
  }
}
