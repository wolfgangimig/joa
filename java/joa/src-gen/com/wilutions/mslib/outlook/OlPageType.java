/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPageType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{35D15973-23ED-4504-866B-C0B5C937A058}")
public enum OlPageType {
  olPageTypePlanner(0),
  olPageTypeTracker(1);

  public final int value;
  private OlPageType(int value) { this.value = value; }
  public static  OlPageType valueOf(int value) {
    switch(value) {
    case 0: return olPageTypePlanner;
    case 1: return olPageTypeTracker;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlPageType.class);
    }
  }
}
