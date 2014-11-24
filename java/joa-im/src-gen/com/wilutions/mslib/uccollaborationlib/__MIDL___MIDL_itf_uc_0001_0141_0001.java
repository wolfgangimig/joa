/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0001.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0141_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelDefault = new __MIDL___MIDL_itf_uc_0001_0141_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelExternal = new __MIDL___MIDL_itf_uc_0001_0141_0001(100);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelColleague = new __MIDL___MIDL_itf_uc_0001_0141_0001(200);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelWorkgroup = new __MIDL___MIDL_itf_uc_0001_0141_0001(300);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelFriends = new __MIDL___MIDL_itf_uc_0001_0141_0001(400);
  public final static __MIDL___MIDL_itf_uc_0001_0141_0001 ucAccessLevelBlocked = new __MIDL___MIDL_itf_uc_0001_0141_0001(32000);

  // Integer constants for bitsets and switch statements
  public final static int _ucAccessLevelDefault = 0;
  public final static int _ucAccessLevelExternal = 100;
  public final static int _ucAccessLevelColleague = 200;
  public final static int _ucAccessLevelWorkgroup = 300;
  public final static int _ucAccessLevelFriends = 400;
  public final static int _ucAccessLevelBlocked = 32000;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0141_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0141_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAccessLevelDefault;
    case 100: return ucAccessLevelExternal;
    case 200: return ucAccessLevelColleague;
    case 300: return ucAccessLevelWorkgroup;
    case 400: return ucAccessLevelFriends;
    case 32000: return ucAccessLevelBlocked;
    default: return new __MIDL___MIDL_itf_uc_0001_0141_0001(value);
    }
  }
}
