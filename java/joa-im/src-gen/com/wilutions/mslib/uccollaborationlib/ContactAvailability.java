/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactAvailability.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactAvailability {

  // Typed constants
  public final static ContactAvailability ucAvailabilityNone = new ContactAvailability(0);
  public final static ContactAvailability ucAvailabilityFree = new ContactAvailability(3500);
  public final static ContactAvailability ucAvailabilityFreeIdle = new ContactAvailability(5000);
  public final static ContactAvailability ucAvailabilityBusy = new ContactAvailability(6500);
  public final static ContactAvailability ucAvailabilityBusyIdle = new ContactAvailability(7500);
  public final static ContactAvailability ucAvailabilityDoNotDisturb = new ContactAvailability(9500);
  public final static ContactAvailability ucAvailabilityTemporarilyAway = new ContactAvailability(12500);
  public final static ContactAvailability ucAvailabilityAway = new ContactAvailability(15500);
  public final static ContactAvailability ucAvailabilityOffline = new ContactAvailability(18500);

  // Integer constants for bitsets and switch statements
  public final static int _ucAvailabilityNone = 0;
  public final static int _ucAvailabilityFree = 3500;
  public final static int _ucAvailabilityFreeIdle = 5000;
  public final static int _ucAvailabilityBusy = 6500;
  public final static int _ucAvailabilityBusyIdle = 7500;
  public final static int _ucAvailabilityDoNotDisturb = 9500;
  public final static int _ucAvailabilityTemporarilyAway = 12500;
  public final static int _ucAvailabilityAway = 15500;
  public final static int _ucAvailabilityOffline = 18500;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactAvailability(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactAvailability valueOf(int value) {
    switch(value) {
    case 0: return ucAvailabilityNone;
    case 3500: return ucAvailabilityFree;
    case 5000: return ucAvailabilityFreeIdle;
    case 6500: return ucAvailabilityBusy;
    case 7500: return ucAvailabilityBusyIdle;
    case 9500: return ucAvailabilityDoNotDisturb;
    case 12500: return ucAvailabilityTemporarilyAway;
    case 15500: return ucAvailabilityAway;
    case 18500: return ucAvailabilityOffline;
    default: return new ContactAvailability(value);
    }
  }
}
