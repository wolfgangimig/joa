/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMeetingRecipientType {
  olOrganizer(0),
  olRequired(1),
  olOptional(2),
  olResource(3);

  public final int value;
  private OlMeetingRecipientType(int value) { this.value = value; }
  public static  OlMeetingRecipientType valueOf(int value) {
    switch(value) {
    case 0: return olOrganizer;
    case 1: return olRequired;
    case 2: return olOptional;
    case 3: return olResource;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMeetingRecipientType.class);
    }
  }
}
