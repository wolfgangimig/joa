/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoWizardMsgType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoWizardMsgType {
  msoWizardMsgLocalStateOn(1),
  msoWizardMsgLocalStateOff(2),
  msoWizardMsgShowHelp(3),
  msoWizardMsgSuspending(4),
  msoWizardMsgResuming(5);

  public final int value;
  private MsoWizardMsgType(int value) { this.value = value; }
  public static  MsoWizardMsgType valueOf(int value) {
    switch(value) {
    case 1: return msoWizardMsgLocalStateOn;
    case 2: return msoWizardMsgLocalStateOff;
    case 3: return msoWizardMsgShowHelp;
    case 4: return msoWizardMsgSuspending;
    case 5: return msoWizardMsgResuming;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoWizardMsgType.class);
    }
  }
}
