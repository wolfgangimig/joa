/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAccessType.
 * Enumerates the various access levels of a conference. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceAccessType {

  // Typed constants
  public final static ConferenceAccessType ucConferenceAccessTypeUnknown = new ConferenceAccessType(0);
  public final static ConferenceAccessType ucConferenceAccessTypeOpen = new ConferenceAccessType(1);
  public final static ConferenceAccessType ucConferenceAccessTypeClosed = new ConferenceAccessType(16);
  public final static ConferenceAccessType ucConferenceAccessTypeAnonymous = new ConferenceAccessType(256);
  public final static ConferenceAccessType ucConferenceAccessTypeLocked = new ConferenceAccessType(4096);

  // Integer constants for bitsets and switch statements
  public final static int _ucConferenceAccessTypeUnknown = 0;
  public final static int _ucConferenceAccessTypeOpen = 1;
  public final static int _ucConferenceAccessTypeClosed = 16;
  public final static int _ucConferenceAccessTypeAnonymous = 256;
  public final static int _ucConferenceAccessTypeLocked = 4096;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceAccessType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceAccessType valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceAccessTypeUnknown;
    case 1: return ucConferenceAccessTypeOpen;
    case 16: return ucConferenceAccessTypeClosed;
    case 256: return ucConferenceAccessTypeAnonymous;
    case 4096: return ucConferenceAccessTypeLocked;
    default: return new ConferenceAccessType(value);
    }
  }
}
