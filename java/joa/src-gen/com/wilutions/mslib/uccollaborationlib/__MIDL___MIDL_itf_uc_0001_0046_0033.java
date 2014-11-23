/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0033.
 * Enumerates the various types of redirection. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0033 {
  ucRedirectionTypesNone(0),
  ucRedirectionTypesReplyWithInstantMessage(1),
  ucRedirectionTypesReplyWithAudioVideo(2),
  ucRedirectionTypesForwardToVoiceMail(4),
  ucRedirectionTypesForwardToContact(8);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0033(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0033 valueOf(int value) {
    switch(value) {
    case 0: return ucRedirectionTypesNone;
    case 1: return ucRedirectionTypesReplyWithInstantMessage;
    case 2: return ucRedirectionTypesReplyWithAudioVideo;
    case 4: return ucRedirectionTypesForwardToVoiceMail;
    case 8: return ucRedirectionTypesForwardToContact;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0033.class);
    }
  }
}
