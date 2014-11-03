/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoWizardActType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoWizardActType {
  msoWizardActInactive(0),
  msoWizardActActive(1),
  msoWizardActSuspend(2),
  msoWizardActResume(3);

  public final int value;
  private MsoWizardActType(int value) { this.value = value; }
  public static  MsoWizardActType valueOf(int value) {
    switch(value) {
    case 0: return msoWizardActInactive;
    case 1: return msoWizardActActive;
    case 2: return msoWizardActSuspend;
    case 3: return msoWizardActResume;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoWizardActType.class);
    }
  }
}
