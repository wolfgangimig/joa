/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoAutomationSecurity.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoAutomationSecurity implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoAutomationSecurity msoAutomationSecurityLow = new MsoAutomationSecurity(1);
  public final static MsoAutomationSecurity msoAutomationSecurityByUI = new MsoAutomationSecurity(2);
  public final static MsoAutomationSecurity msoAutomationSecurityForceDisable = new MsoAutomationSecurity(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoAutomationSecurityLow = 1;
  public final static int _msoAutomationSecurityByUI = 2;
  public final static int _msoAutomationSecurityForceDisable = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoAutomationSecurity(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoAutomationSecurity valueOf(int value) {
    switch(value) {
    case 1: return msoAutomationSecurityLow;
    case 2: return msoAutomationSecurityByUI;
    case 3: return msoAutomationSecurityForceDisable;
    default: return new MsoAutomationSecurity(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoAutomationSecurityLow";
    case 2: return "msoAutomationSecurityByUI";
    case 3: return "msoAutomationSecurityForceDisable";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoAutomationSecurityLow");
      if ((value & 2) != 0) sbuf.append("|msoAutomationSecurityByUI");
      if ((value & 3) != 0) sbuf.append("|msoAutomationSecurityForceDisable");
      return sbuf.toString();
      }
    }
  }
}
