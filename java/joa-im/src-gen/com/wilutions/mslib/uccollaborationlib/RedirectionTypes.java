/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RedirectionTypes.
 * Enumerates the various types of redirection. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RedirectionTypes {

  // Typed constants
  public final static RedirectionTypes ucRedirectionTypesNone = new RedirectionTypes(0);
  public final static RedirectionTypes ucRedirectionTypesReplyWithInstantMessage = new RedirectionTypes(1);
  public final static RedirectionTypes ucRedirectionTypesReplyWithAudioVideo = new RedirectionTypes(2);
  public final static RedirectionTypes ucRedirectionTypesForwardToVoiceMail = new RedirectionTypes(4);
  public final static RedirectionTypes ucRedirectionTypesForwardToContact = new RedirectionTypes(8);

  // Integer constants for bitsets and switch statements
  public final static int _ucRedirectionTypesNone = 0;
  public final static int _ucRedirectionTypesReplyWithInstantMessage = 1;
  public final static int _ucRedirectionTypesReplyWithAudioVideo = 2;
  public final static int _ucRedirectionTypesForwardToVoiceMail = 4;
  public final static int _ucRedirectionTypesForwardToContact = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RedirectionTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RedirectionTypes valueOf(int value) {
    switch(value) {
    case 0: return ucRedirectionTypesNone;
    case 1: return ucRedirectionTypesReplyWithInstantMessage;
    case 2: return ucRedirectionTypesReplyWithAudioVideo;
    case 4: return ucRedirectionTypesForwardToVoiceMail;
    case 8: return ucRedirectionTypesForwardToContact;
    default: return new RedirectionTypes(value);
    }
  }
}
