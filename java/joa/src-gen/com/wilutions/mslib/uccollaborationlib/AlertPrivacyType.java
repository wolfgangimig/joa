/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AlertPrivacyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum AlertPrivacyType {
  ucAlertPrivacyLow(20),
  ucAlertPrivacyNeutral(50),
  ucAlertPrivacyHigh(80);

  public final int value;
  private AlertPrivacyType(int value) { this.value = value; }
  public static  AlertPrivacyType valueOf(int value) {
    switch(value) {
    case 20: return ucAlertPrivacyLow;
    case 50: return ucAlertPrivacyNeutral;
    case 80: return ucAlertPrivacyHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + AlertPrivacyType.class);
    }
  }
}
