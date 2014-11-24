/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoWizardActType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoWizardActType {

  // Typed constants
  public final static MsoWizardActType msoWizardActInactive = new MsoWizardActType(0);
  public final static MsoWizardActType msoWizardActActive = new MsoWizardActType(1);
  public final static MsoWizardActType msoWizardActSuspend = new MsoWizardActType(2);
  public final static MsoWizardActType msoWizardActResume = new MsoWizardActType(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoWizardActInactive = 0;
  public final static int _msoWizardActActive = 1;
  public final static int _msoWizardActSuspend = 2;
  public final static int _msoWizardActResume = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoWizardActType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoWizardActType valueOf(int value) {
    switch(value) {
    case 0: return msoWizardActInactive;
    case 1: return msoWizardActActive;
    case 2: return msoWizardActSuspend;
    case 3: return msoWizardActResume;
    default: return new MsoWizardActType(value);
    }
  }
}
