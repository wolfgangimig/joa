/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultExpandCollapseSetting.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDefaultExpandCollapseSetting {
  olAllExpanded(0),
  olAllCollapsed(1),
  olLastViewed(2);

  public final int value;
  private OlDefaultExpandCollapseSetting(int value) { this.value = value; }
  public static  OlDefaultExpandCollapseSetting valueOf(int value) {
    switch(value) {
    case 0: return olAllExpanded;
    case 1: return olAllCollapsed;
    case 2: return olLastViewed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDefaultExpandCollapseSetting.class);
    }
  }
}
