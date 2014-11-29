/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0157_0001.
 * Enumerates AudioFeedback Devices. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0157_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackNone = new __MIDL___MIDL_itf_uc_0001_0157_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackAlert = new __MIDL___MIDL_itf_uc_0001_0157_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackCommunication = new __MIDL___MIDL_itf_uc_0001_0157_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackHandset = new __MIDL___MIDL_itf_uc_0001_0157_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackRinging = new __MIDL___MIDL_itf_uc_0001_0157_0001(8);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackAlertAndCommunication = new __MIDL___MIDL_itf_uc_0001_0157_0001(3);
  public final static __MIDL___MIDL_itf_uc_0001_0157_0001 ucAudioFeedbackSuppressOnDeskphones = new __MIDL___MIDL_itf_uc_0001_0157_0001(-2147483648);

  // Integer constants for bitsets and switch statements
  public final static int _ucAudioFeedbackNone = 0;
  public final static int _ucAudioFeedbackAlert = 1;
  public final static int _ucAudioFeedbackCommunication = 2;
  public final static int _ucAudioFeedbackHandset = 4;
  public final static int _ucAudioFeedbackRinging = 8;
  public final static int _ucAudioFeedbackAlertAndCommunication = 3;
  public final static int _ucAudioFeedbackSuppressOnDeskphones = -2147483648;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0157_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0157_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAudioFeedbackNone;
    case 1: return ucAudioFeedbackAlert;
    case 2: return ucAudioFeedbackCommunication;
    case 4: return ucAudioFeedbackHandset;
    case 8: return ucAudioFeedbackRinging;
    case 3: return ucAudioFeedbackAlertAndCommunication;
    case -2147483648: return ucAudioFeedbackSuppressOnDeskphones;
    default: return new __MIDL___MIDL_itf_uc_0001_0157_0001(value);
    }
  }
}
