/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0157_0001.
 * Enumerates AudioFeedback Devices. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0157_0001 {
  ucAudioFeedbackNone(0),
  ucAudioFeedbackAlert(1),
  ucAudioFeedbackCommunication(2),
  ucAudioFeedbackHandset(4),
  ucAudioFeedbackRinging(8),
  ucAudioFeedbackAlertAndCommunication(3),
  ucAudioFeedbackSuppressOnDeskphones(-2147483648);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0157_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0157_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAudioFeedbackNone;
    case 1: return ucAudioFeedbackAlert;
    case 2: return ucAudioFeedbackCommunication;
    case 4: return ucAudioFeedbackHandset;
    case 8: return ucAudioFeedbackRinging;
    case 3: return ucAudioFeedbackAlertAndCommunication;
    case -2147483648: return ucAudioFeedbackSuppressOnDeskphones;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0157_0001.class);
    }
  }
}
