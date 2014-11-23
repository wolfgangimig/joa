/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSubscriptionRefreshRate.
 * Enumerates contact subscription freshness. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactSubscriptionRefreshRate {
  ucSubscriptionFreshnessNone(0),
  ucSubscriptionFreshnessLow(1),
  ucSubscriptionFreshnessHigh(2);

  public final int value;
  private ContactSubscriptionRefreshRate(int value) { this.value = value; }
  public static  ContactSubscriptionRefreshRate valueOf(int value) {
    switch(value) {
    case 0: return ucSubscriptionFreshnessNone;
    case 1: return ucSubscriptionFreshnessLow;
    case 2: return ucSubscriptionFreshnessHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactSubscriptionRefreshRate.class);
    }
  }
}
