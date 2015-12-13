/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0002.
 * Enumerates the access entry scopes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0141_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopeUser = new __MIDL___MIDL_itf_uc_0001_0141_0002(0);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopeDomain = new __MIDL___MIDL_itf_uc_0001_0141_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopeEnterprise = new __MIDL___MIDL_itf_uc_0001_0141_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopeFederated = new __MIDL___MIDL_itf_uc_0001_0141_0002(3);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopePublic = new __MIDL___MIDL_itf_uc_0001_0141_0002(4);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0002 ucAccessEntryScopeEveryone = new __MIDL___MIDL_itf_uc_0001_0141_0002(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucAccessEntryScopeUser = 0;
  public final static int _ucAccessEntryScopeDomain = 1;
  public final static int _ucAccessEntryScopeEnterprise = 2;
  public final static int _ucAccessEntryScopeFederated = 3;
  public final static int _ucAccessEntryScopePublic = 4;
  public final static int _ucAccessEntryScopeEveryone = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0141_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0141_0002 valueOf(int value) {
    switch(value) {
    case 0: return ucAccessEntryScopeUser;
    case 1: return ucAccessEntryScopeDomain;
    case 2: return ucAccessEntryScopeEnterprise;
    case 3: return ucAccessEntryScopeFederated;
    case 4: return ucAccessEntryScopePublic;
    case 5: return ucAccessEntryScopeEveryone;
    default: return new __MIDL___MIDL_itf_uc_0001_0141_0002(value);
    }
  }
}
