/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAutoPromoteType.
 * Enumerates the conference AutoPromote. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConferenceAutoPromoteType {
  ucAutoPromoteUnknown(0),
  ucAutoPromoteNone(1),
  ucAutoPromoteAuthenticated(2),
  ucAutoPromoteAll(4);

  public final int value;
  private ConferenceAutoPromoteType(int value) { this.value = value; }
  public static  ConferenceAutoPromoteType valueOf(int value) {
    switch(value) {
    case 0: return ucAutoPromoteUnknown;
    case 1: return ucAutoPromoteNone;
    case 2: return ucAutoPromoteAuthenticated;
    case 4: return ucAutoPromoteAll;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConferenceAutoPromoteType.class);
    }
  }
}
