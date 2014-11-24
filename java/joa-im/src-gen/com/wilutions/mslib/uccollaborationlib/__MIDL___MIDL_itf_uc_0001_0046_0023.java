/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0023.
 * Enumerates the history info entry type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0023 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeNone = new __MIDL___MIDL_itf_uc_0001_0046_0023(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRedirectStatic = new __MIDL___MIDL_itf_uc_0001_0046_0023(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRedirectHuntgroup = new __MIDL___MIDL_itf_uc_0001_0046_0023(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRetargetDelegate = new __MIDL___MIDL_itf_uc_0001_0046_0023(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRetargetTeam = new __MIDL___MIDL_itf_uc_0001_0046_0023(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRetargetTransferer = new __MIDL___MIDL_itf_uc_0001_0046_0023(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeRetargetTransferee = new __MIDL___MIDL_itf_uc_0001_0046_0023(6);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0023 ucHistoryInfoTypeUnknown = new __MIDL___MIDL_itf_uc_0001_0046_0023(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucHistoryInfoTypeNone = 0;
  public final static int _ucHistoryInfoTypeRedirectStatic = 1;
  public final static int _ucHistoryInfoTypeRedirectHuntgroup = 2;
  public final static int _ucHistoryInfoTypeRetargetDelegate = 3;
  public final static int _ucHistoryInfoTypeRetargetTeam = 4;
  public final static int _ucHistoryInfoTypeRetargetTransferer = 5;
  public final static int _ucHistoryInfoTypeRetargetTransferee = 6;
  public final static int _ucHistoryInfoTypeUnknown = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0023(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0023(value);
    }
  }
}
