/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBusyStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlBusyStatus {
  olFree(0),
  olTentative(1),
  olBusy(2),
  olOutOfOffice(3),
  olWorkingElsewhere(4);

  public final int value;
  private OlBusyStatus(int value) { this.value = value; }
  public static  OlBusyStatus valueOf(int value) {
    switch(value) {
    case 0: return olFree;
    case 1: return olTentative;
    case 2: return olBusy;
    case 3: return olOutOfOffice;
    case 4: return olWorkingElsewhere;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlBusyStatus.class);
    }
  }
}
