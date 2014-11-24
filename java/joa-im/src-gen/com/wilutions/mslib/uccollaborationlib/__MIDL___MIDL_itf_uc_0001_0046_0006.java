/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0006.
 * Enumerates the participant actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0006 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionSetProperty = new __MIDL___MIDL_itf_uc_0001_0046_0006(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionAdmit = new __MIDL___MIDL_itf_uc_0001_0046_0006(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionDeny = new __MIDL___MIDL_itf_uc_0001_0046_0006(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionPin = new __MIDL___MIDL_itf_uc_0001_0046_0006(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionLock = new __MIDL___MIDL_itf_uc_0001_0046_0006(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantActionSetMute = new __MIDL___MIDL_itf_uc_0001_0046_0006(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantEjectAction = new __MIDL___MIDL_itf_uc_0001_0046_0006(5000);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0006 ucParticipantRemoveAction = new __MIDL___MIDL_itf_uc_0001_0046_0006(5001);

  // Integer constants for bitsets and switch statements
  public final static int _ucParticipantActionSetProperty = 0;
  public final static int _ucParticipantActionAdmit = 1;
  public final static int _ucParticipantActionDeny = 2;
  public final static int _ucParticipantActionPin = 3;
  public final static int _ucParticipantActionLock = 4;
  public final static int _ucParticipantActionSetMute = 5;
  public final static int _ucParticipantEjectAction = 5000;
  public final static int _ucParticipantRemoveAction = 5001;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucParticipantActionSetProperty;
    case 1: return ucParticipantActionAdmit;
    case 2: return ucParticipantActionDeny;
    case 3: return ucParticipantActionPin;
    case 4: return ucParticipantActionLock;
    case 5: return ucParticipantActionSetMute;
    case 5000: return ucParticipantEjectAction;
    case 5001: return ucParticipantRemoveAction;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0006(value);
    }
  }
}
