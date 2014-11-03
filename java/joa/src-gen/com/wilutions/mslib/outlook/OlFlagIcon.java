/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFlagIcon.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFlagIcon {
  olNoFlagIcon(0),
  olPurpleFlagIcon(1),
  olOrangeFlagIcon(2),
  olGreenFlagIcon(3),
  olYellowFlagIcon(4),
  olBlueFlagIcon(5),
  olRedFlagIcon(6);

  public final int value;
  private OlFlagIcon(int value) { this.value = value; }
  public static  OlFlagIcon valueOf(int value) {
    switch(value) {
    case 0: return olNoFlagIcon;
    case 1: return olPurpleFlagIcon;
    case 2: return olOrangeFlagIcon;
    case 3: return olGreenFlagIcon;
    case 4: return olYellowFlagIcon;
    case 5: return olBlueFlagIcon;
    case 6: return olRedFlagIcon;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFlagIcon.class);
    }
  }
}
