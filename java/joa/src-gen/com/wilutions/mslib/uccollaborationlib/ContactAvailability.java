/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactAvailability.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactAvailability {
  ucAvailabilityNone(0),
  ucAvailabilityFree(3500),
  ucAvailabilityFreeIdle(5000),
  ucAvailabilityBusy(6500),
  ucAvailabilityBusyIdle(7500),
  ucAvailabilityDoNotDisturb(9500),
  ucAvailabilityTemporarilyAway(12500),
  ucAvailabilityAway(15500),
  ucAvailabilityOffline(18500);

  public final int value;
  private ContactAvailability(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactAvailability.class);
    }
  }
}
