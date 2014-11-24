/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0046.
 * Enumerates the application sharing participation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0046 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0046 ucParticipationStateNone = new __MIDL___MIDL_itf_uc_0001_0046_0046(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0046 ucParticipationStateViewing = new __MIDL___MIDL_itf_uc_0001_0046_0046(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0046 ucParticipationStateRequestingControl = new __MIDL___MIDL_itf_uc_0001_0046_0046(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0046 ucParticipationStateControlling = new __MIDL___MIDL_itf_uc_0001_0046_0046(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0046 ucParticipationStateSharing = new __MIDL___MIDL_itf_uc_0001_0046_0046(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucParticipationStateNone = 0;
  public final static int _ucParticipationStateViewing = 1;
  public final static int _ucParticipationStateRequestingControl = 2;
  public final static int _ucParticipationStateControlling = 3;
  public final static int _ucParticipationStateSharing = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0046(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0046 valueOf(int value) {
    switch(value) {
    case 0: return ucParticipationStateNone;
    case 1: return ucParticipationStateViewing;
    case 2: return ucParticipationStateRequestingControl;
    case 3: return ucParticipationStateControlling;
    case 4: return ucParticipationStateSharing;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0046(value);
    }
  }
}
