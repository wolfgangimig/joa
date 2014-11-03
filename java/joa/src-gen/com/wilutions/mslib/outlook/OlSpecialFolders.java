/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSpecialFolders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSpecialFolders {
  olSpecialFolderAllTasks(0),
  olSpecialFolderReminders(1);

  public final int value;
  private OlSpecialFolders(int value) { this.value = value; }
  public static  OlSpecialFolders valueOf(int value) {
    switch(value) {
    case 0: return olSpecialFolderAllTasks;
    case 1: return olSpecialFolderReminders;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSpecialFolders.class);
    }
  }
}
