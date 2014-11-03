/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAutomationSecurity.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoAutomationSecurity {
  msoAutomationSecurityLow(1),
  msoAutomationSecurityByUI(2),
  msoAutomationSecurityForceDisable(3);

  public final int value;
  private MsoAutomationSecurity(int value) { this.value = value; }
  public static  MsoAutomationSecurity valueOf(int value) {
    switch(value) {
    case 1: return msoAutomationSecurityLow;
    case 2: return msoAutomationSecurityByUI;
    case 3: return msoAutomationSecurityForceDisable;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoAutomationSecurity.class);
    }
  }
}
