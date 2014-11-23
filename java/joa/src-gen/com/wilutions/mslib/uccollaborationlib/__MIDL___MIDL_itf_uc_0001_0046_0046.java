/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0046.
 * Enumerates the application sharing participation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0046 {
  ucParticipationStateNone(0),
  ucParticipationStateViewing(1),
  ucParticipationStateRequestingControl(2),
  ucParticipationStateControlling(3),
  ucParticipationStateSharing(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0046(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0046 valueOf(int value) {
    switch(value) {
    case 0: return ucParticipationStateNone;
    case 1: return ucParticipationStateViewing;
    case 2: return ucParticipationStateRequestingControl;
    case 3: return ucParticipationStateControlling;
    case 4: return ucParticipationStateSharing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0046.class);
    }
  }
}
