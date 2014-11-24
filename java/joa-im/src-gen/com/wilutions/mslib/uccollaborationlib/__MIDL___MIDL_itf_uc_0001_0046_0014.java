/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0014.
 * Enumerates the modality disconnect reasons. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0014 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonNone = new __MIDL___MIDL_itf_uc_0001_0046_0014(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonTimeout = new __MIDL___MIDL_itf_uc_0001_0046_0014(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonBusy = new __MIDL___MIDL_itf_uc_0001_0046_0014(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonNotAcceptableHere = new __MIDL___MIDL_itf_uc_0001_0046_0014(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonDecline = new __MIDL___MIDL_itf_uc_0001_0046_0014(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonDeclineEverywhere = new __MIDL___MIDL_itf_uc_0001_0046_0014(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0014 ucDisconnectReasonReplyOther = new __MIDL___MIDL_itf_uc_0001_0046_0014(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucDisconnectReasonNone = 0;
  public final static int _ucDisconnectReasonTimeout = 1;
  public final static int _ucDisconnectReasonBusy = 2;
  public final static int _ucDisconnectReasonNotAcceptableHere = 3;
  public final static int _ucDisconnectReasonDecline = 4;
  public final static int _ucDisconnectReasonDeclineEverywhere = 5;
  public final static int _ucDisconnectReasonReplyOther = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0014(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0014 valueOf(int value) {
    switch(value) {
    case 0: return ucDisconnectReasonNone;
    case 1: return ucDisconnectReasonTimeout;
    case 2: return ucDisconnectReasonBusy;
    case 3: return ucDisconnectReasonNotAcceptableHere;
    case 4: return ucDisconnectReasonDecline;
    case 5: return ucDisconnectReasonDeclineEverywhere;
    case 6: return ucDisconnectReasonReplyOther;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0014(value);
    }
  }
}
