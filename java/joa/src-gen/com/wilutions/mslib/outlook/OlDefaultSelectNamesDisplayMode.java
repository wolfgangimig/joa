/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultSelectNamesDisplayMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDefaultSelectNamesDisplayMode {
  olDefaultMail(1),
  olDefaultMeeting(2),
  olDefaultSharingRequest(4),
  olDefaultTask(3),
  olDefaultMembers(5),
  olDefaultDelegates(6),
  olDefaultSingleName(7),
  olDefaultPickRooms(8);

  public final int value;
  private OlDefaultSelectNamesDisplayMode(int value) { this.value = value; }
  public static  OlDefaultSelectNamesDisplayMode valueOf(int value) {
    switch(value) {
    case 1: return olDefaultMail;
    case 2: return olDefaultMeeting;
    case 4: return olDefaultSharingRequest;
    case 3: return olDefaultTask;
    case 5: return olDefaultMembers;
    case 6: return olDefaultDelegates;
    case 7: return olDefaultSingleName;
    case 8: return olDefaultPickRooms;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDefaultSelectNamesDisplayMode.class);
    }
  }
}
