/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AlertPrivacyType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AlertPrivacyType {

  // Typed constants
  public final static AlertPrivacyType ucAlertPrivacyLow = new AlertPrivacyType(20);
  public final static AlertPrivacyType ucAlertPrivacyNeutral = new AlertPrivacyType(50);
  public final static AlertPrivacyType ucAlertPrivacyHigh = new AlertPrivacyType(80);

  // Integer constants for bitsets and switch statements
  public final static int _ucAlertPrivacyLow = 20;
  public final static int _ucAlertPrivacyNeutral = 50;
  public final static int _ucAlertPrivacyHigh = 80;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AlertPrivacyType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AlertPrivacyType valueOf(int value) {
    switch(value) {
    case 20: return ucAlertPrivacyLow;
    case 50: return ucAlertPrivacyNeutral;
    case 80: return ucAlertPrivacyHigh;
    default: return new AlertPrivacyType(value);
    }
  }
}
