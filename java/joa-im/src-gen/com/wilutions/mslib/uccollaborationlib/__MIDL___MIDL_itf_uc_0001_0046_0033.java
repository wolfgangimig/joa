/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0033.
 * Enumerates the various types of redirection. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0033 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0033 ucRedirectionTypesNone = new __MIDL___MIDL_itf_uc_0001_0046_0033(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0033 ucRedirectionTypesReplyWithInstantMessage = new __MIDL___MIDL_itf_uc_0001_0046_0033(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0033 ucRedirectionTypesReplyWithAudioVideo = new __MIDL___MIDL_itf_uc_0001_0046_0033(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0033 ucRedirectionTypesForwardToVoiceMail = new __MIDL___MIDL_itf_uc_0001_0046_0033(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0033 ucRedirectionTypesForwardToContact = new __MIDL___MIDL_itf_uc_0001_0046_0033(8);

  // Integer constants for bitsets and switch statements
  public final static int _ucRedirectionTypesNone = 0;
  public final static int _ucRedirectionTypesReplyWithInstantMessage = 1;
  public final static int _ucRedirectionTypesReplyWithAudioVideo = 2;
  public final static int _ucRedirectionTypesForwardToVoiceMail = 4;
  public final static int _ucRedirectionTypesForwardToContact = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0033(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0033 valueOf(int value) {
    switch(value) {
    case 0: return ucRedirectionTypesNone;
    case 1: return ucRedirectionTypesReplyWithInstantMessage;
    case 2: return ucRedirectionTypesReplyWithAudioVideo;
    case 4: return ucRedirectionTypesForwardToVoiceMail;
    case 8: return ucRedirectionTypesForwardToContact;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0033(value);
    }
  }
}
