/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSpecialFolders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSpecialFolders {

  // Typed constants
  public final static OlSpecialFolders olSpecialFolderAllTasks = new OlSpecialFolders(0);
  public final static OlSpecialFolders olSpecialFolderReminders = new OlSpecialFolders(1);

  // Integer constants for bitsets and switch statements
  public final static int _olSpecialFolderAllTasks = 0;
  public final static int _olSpecialFolderReminders = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSpecialFolders(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSpecialFolders valueOf(int value) {
    switch(value) {
    case 0: return olSpecialFolderAllTasks;
    case 1: return olSpecialFolderReminders;
    default: return new OlSpecialFolders(value);
    }
  }
}
