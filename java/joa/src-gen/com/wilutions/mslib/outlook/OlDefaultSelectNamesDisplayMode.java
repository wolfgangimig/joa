/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultSelectNamesDisplayMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDefaultSelectNamesDisplayMode {

  // Typed constants
  public final static OlDefaultSelectNamesDisplayMode olDefaultMail = new OlDefaultSelectNamesDisplayMode(1);
  public final static OlDefaultSelectNamesDisplayMode olDefaultMeeting = new OlDefaultSelectNamesDisplayMode(2);
  public final static OlDefaultSelectNamesDisplayMode olDefaultSharingRequest = new OlDefaultSelectNamesDisplayMode(4);
  public final static OlDefaultSelectNamesDisplayMode olDefaultTask = new OlDefaultSelectNamesDisplayMode(3);
  public final static OlDefaultSelectNamesDisplayMode olDefaultMembers = new OlDefaultSelectNamesDisplayMode(5);
  public final static OlDefaultSelectNamesDisplayMode olDefaultDelegates = new OlDefaultSelectNamesDisplayMode(6);
  public final static OlDefaultSelectNamesDisplayMode olDefaultSingleName = new OlDefaultSelectNamesDisplayMode(7);
  public final static OlDefaultSelectNamesDisplayMode olDefaultPickRooms = new OlDefaultSelectNamesDisplayMode(8);

  // Integer constants for bitsets and switch statements
  public final static int _olDefaultMail = 1;
  public final static int _olDefaultMeeting = 2;
  public final static int _olDefaultSharingRequest = 4;
  public final static int _olDefaultTask = 3;
  public final static int _olDefaultMembers = 5;
  public final static int _olDefaultDelegates = 6;
  public final static int _olDefaultSingleName = 7;
  public final static int _olDefaultPickRooms = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDefaultSelectNamesDisplayMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlDefaultSelectNamesDisplayMode(value);
    }
  }
}
