/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionShowOn.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlActionShowOn {
  olDontShow(0),
  olMenu(1),
  olMenuAndToolbar(2);

  public final int value;
  private OlActionShowOn(int value) { this.value = value; }
  public static  OlActionShowOn valueOf(int value) {
    switch(value) {
    case 0: return olDontShow;
    case 1: return olMenu;
    case 2: return olMenuAndToolbar;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlActionShowOn.class);
    }
  }
}
