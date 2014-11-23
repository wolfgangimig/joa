/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RedirectionTypes.
 * Enumerates the various types of redirection. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RedirectionTypes {
  ucRedirectionTypesNone(0),
  ucRedirectionTypesReplyWithInstantMessage(1),
  ucRedirectionTypesReplyWithAudioVideo(2),
  ucRedirectionTypesForwardToVoiceMail(4),
  ucRedirectionTypesForwardToContact(8);

  public final int value;
  private RedirectionTypes(int value) { this.value = value; }
  public static  RedirectionTypes valueOf(int value) {
    switch(value) {
    case 0: return ucRedirectionTypesNone;
    case 1: return ucRedirectionTypesReplyWithInstantMessage;
    case 2: return ucRedirectionTypesReplyWithAudioVideo;
    case 4: return ucRedirectionTypesForwardToVoiceMail;
    case 8: return ucRedirectionTypesForwardToContact;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RedirectionTypes.class);
    }
  }
}
