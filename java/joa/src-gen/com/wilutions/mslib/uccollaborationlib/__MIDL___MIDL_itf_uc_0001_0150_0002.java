/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0150_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0150_0002 {
  ucNotificationUrgencyLow(20),
  ucNotificationUrgencyNeutral(50),
  ucNotificationUrgencyHigh(80);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0150_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0150_0002 valueOf(int value) {
    switch(value) {
    case 20: return ucNotificationUrgencyLow;
    case 50: return ucNotificationUrgencyNeutral;
    case 80: return ucNotificationUrgencyHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0150_0002.class);
    }
  }
}
