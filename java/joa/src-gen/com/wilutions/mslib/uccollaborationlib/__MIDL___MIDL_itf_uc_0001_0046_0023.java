/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0023.
 * Enumerates the history info entry type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0023 {
  ucHistoryInfoTypeNone(0),
  ucHistoryInfoTypeRedirectStatic(1),
  ucHistoryInfoTypeRedirectHuntgroup(2),
  ucHistoryInfoTypeRetargetDelegate(3),
  ucHistoryInfoTypeRetargetTeam(4),
  ucHistoryInfoTypeRetargetTransferer(5),
  ucHistoryInfoTypeRetargetTransferee(6),
  ucHistoryInfoTypeUnknown(7);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0023(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0023 valueOf(int value) {
    switch(value) {
    case 0: return ucHistoryInfoTypeNone;
    case 1: return ucHistoryInfoTypeRedirectStatic;
    case 2: return ucHistoryInfoTypeRedirectHuntgroup;
    case 3: return ucHistoryInfoTypeRetargetDelegate;
    case 4: return ucHistoryInfoTypeRetargetTeam;
    case 5: return ucHistoryInfoTypeRetargetTransferer;
    case 6: return ucHistoryInfoTypeRetargetTransferee;
    case 7: return ucHistoryInfoTypeUnknown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0023.class);
    }
  }
}
