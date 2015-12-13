/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAutoPromoteType.
 * Enumerates the conference AutoPromote. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceAutoPromoteType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConferenceAutoPromoteType ucAutoPromoteUnknown = new ConferenceAutoPromoteType(0);
  public final static ConferenceAutoPromoteType ucAutoPromoteNone = new ConferenceAutoPromoteType(1);
  public final static ConferenceAutoPromoteType ucAutoPromoteAuthenticated = new ConferenceAutoPromoteType(2);
  public final static ConferenceAutoPromoteType ucAutoPromoteAll = new ConferenceAutoPromoteType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucAutoPromoteUnknown = 0;
  public final static int _ucAutoPromoteNone = 1;
  public final static int _ucAutoPromoteAuthenticated = 2;
  public final static int _ucAutoPromoteAll = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceAutoPromoteType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceAutoPromoteType valueOf(int value) {
    switch(value) {
    case 0: return ucAutoPromoteUnknown;
    case 1: return ucAutoPromoteNone;
    case 2: return ucAutoPromoteAuthenticated;
    case 4: return ucAutoPromoteAll;
    default: return new ConferenceAutoPromoteType(value);
    }
  }
}
