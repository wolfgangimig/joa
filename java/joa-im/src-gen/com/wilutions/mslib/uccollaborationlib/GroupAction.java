/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * GroupAction.
 * Enumerates the group actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class GroupAction {

  // Typed constants
  public final static GroupAction ucGroupAddContact = new GroupAction(1);
  public final static GroupAction ucGroupRemoveContact = new GroupAction(2);
  public final static GroupAction ucGroupDeleteGroup = new GroupAction(3);
  public final static GroupAction ucGroupRenameGroup = new GroupAction(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucGroupAddContact = 1;
  public final static int _ucGroupRemoveContact = 2;
  public final static int _ucGroupDeleteGroup = 3;
  public final static int _ucGroupRenameGroup = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private GroupAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  GroupAction valueOf(int value) {
    switch(value) {
    case 1: return ucGroupAddContact;
    case 2: return ucGroupRemoveContact;
    case 3: return ucGroupDeleteGroup;
    case 4: return ucGroupRenameGroup;
    default: return new GroupAction(value);
    }
  }
}
