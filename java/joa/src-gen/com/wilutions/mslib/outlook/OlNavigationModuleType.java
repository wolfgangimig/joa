/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNavigationModuleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlNavigationModuleType {
  olModuleMail(0),
  olModuleCalendar(1),
  olModuleContacts(2),
  olModuleTasks(3),
  olModuleJournal(4),
  olModuleNotes(5),
  olModuleFolderList(6),
  olModuleShortcuts(7),
  olModuleSolutions(8);

  public final int value;
  private OlNavigationModuleType(int value) { this.value = value; }
  public static  OlNavigationModuleType valueOf(int value) {
    switch(value) {
    case 0: return olModuleMail;
    case 1: return olModuleCalendar;
    case 2: return olModuleContacts;
    case 3: return olModuleTasks;
    case 4: return olModuleJournal;
    case 5: return olModuleNotes;
    case 6: return olModuleFolderList;
    case 7: return olModuleShortcuts;
    case 8: return olModuleSolutions;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlNavigationModuleType.class);
    }
  }
}
