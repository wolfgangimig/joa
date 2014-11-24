/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSubscriptionRefreshRate.
 * Enumerates contact subscription freshness. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactSubscriptionRefreshRate {

  // Typed constants
  public final static ContactSubscriptionRefreshRate ucSubscriptionFreshnessNone = new ContactSubscriptionRefreshRate(0);
  public final static ContactSubscriptionRefreshRate ucSubscriptionFreshnessLow = new ContactSubscriptionRefreshRate(1);
  public final static ContactSubscriptionRefreshRate ucSubscriptionFreshnessHigh = new ContactSubscriptionRefreshRate(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucSubscriptionFreshnessNone = 0;
  public final static int _ucSubscriptionFreshnessLow = 1;
  public final static int _ucSubscriptionFreshnessHigh = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactSubscriptionRefreshRate(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactSubscriptionRefreshRate valueOf(int value) {
    switch(value) {
    case 0: return ucSubscriptionFreshnessNone;
    case 1: return ucSubscriptionFreshnessLow;
    case 2: return ucSubscriptionFreshnessHigh;
    default: return new ContactSubscriptionRefreshRate(value);
    }
  }
}
