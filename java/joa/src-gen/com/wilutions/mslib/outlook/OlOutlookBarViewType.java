/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlOutlookBarViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlOutlookBarViewType {
  olLargeIcon(0),
  olSmallIcon(1);

  public final int value;
  private OlOutlookBarViewType(int value) { this.value = value; }
  public static  OlOutlookBarViewType valueOf(int value) {
    switch(value) {
    case 0: return olLargeIcon;
    case 1: return olSmallIcon;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlOutlookBarViewType.class);
    }
  }
}
