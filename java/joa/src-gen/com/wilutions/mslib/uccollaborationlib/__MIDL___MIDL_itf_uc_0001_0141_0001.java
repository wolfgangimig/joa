/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0001.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0141_0001 {
  ucAccessLevelDefault(0),
  ucAccessLevelExternal(100),
  ucAccessLevelColleague(200),
  ucAccessLevelWorkgroup(300),
  ucAccessLevelFriends(400),
  ucAccessLevelBlocked(32000);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0141_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0141_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAccessLevelDefault;
    case 100: return ucAccessLevelExternal;
    case 200: return ucAccessLevelColleague;
    case 300: return ucAccessLevelWorkgroup;
    case 400: return ucAccessLevelFriends;
    case 32000: return ucAccessLevelBlocked;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0141_0001.class);
    }
  }
}
