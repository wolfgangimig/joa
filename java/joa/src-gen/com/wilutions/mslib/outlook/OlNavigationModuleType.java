/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNavigationModuleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlNavigationModuleType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlNavigationModuleType olModuleMail = new OlNavigationModuleType(0);
  public final static OlNavigationModuleType olModuleCalendar = new OlNavigationModuleType(1);
  public final static OlNavigationModuleType olModuleContacts = new OlNavigationModuleType(2);
  public final static OlNavigationModuleType olModuleTasks = new OlNavigationModuleType(3);
  public final static OlNavigationModuleType olModuleJournal = new OlNavigationModuleType(4);
  public final static OlNavigationModuleType olModuleNotes = new OlNavigationModuleType(5);
  public final static OlNavigationModuleType olModuleFolderList = new OlNavigationModuleType(6);
  public final static OlNavigationModuleType olModuleShortcuts = new OlNavigationModuleType(7);
  public final static OlNavigationModuleType olModuleSolutions = new OlNavigationModuleType(8);

  // Integer constants for bitsets and switch statements
  public final static int _olModuleMail = 0;
  public final static int _olModuleCalendar = 1;
  public final static int _olModuleContacts = 2;
  public final static int _olModuleTasks = 3;
  public final static int _olModuleJournal = 4;
  public final static int _olModuleNotes = 5;
  public final static int _olModuleFolderList = 6;
  public final static int _olModuleShortcuts = 7;
  public final static int _olModuleSolutions = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlNavigationModuleType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlNavigationModuleType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "olModuleSolutions";
    case 0: return "olModuleMail";
    case 1: return "olModuleCalendar";
    case 2: return "olModuleContacts";
    case 3: return "olModuleTasks";
    case 4: return "olModuleJournal";
    case 5: return "olModuleNotes";
    case 6: return "olModuleFolderList";
    case 7: return "olModuleShortcuts";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|olModuleSolutions");
      if ((value & 0) != 0) sbuf.append("|olModuleMail");
      if ((value & 1) != 0) sbuf.append("|olModuleCalendar");
      if ((value & 2) != 0) sbuf.append("|olModuleContacts");
      if ((value & 3) != 0) sbuf.append("|olModuleTasks");
      if ((value & 4) != 0) sbuf.append("|olModuleJournal");
      if ((value & 5) != 0) sbuf.append("|olModuleNotes");
      if ((value & 6) != 0) sbuf.append("|olModuleFolderList");
      if ((value & 7) != 0) sbuf.append("|olModuleShortcuts");
      return sbuf.toString();
      }
    }
  }
}
