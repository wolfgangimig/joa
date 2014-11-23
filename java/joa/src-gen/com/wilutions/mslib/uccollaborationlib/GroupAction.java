/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * GroupAction.
 * Enumerates the group actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum GroupAction {
  ucGroupAddContact(1),
  ucGroupRemoveContact(2),
  ucGroupDeleteGroup(3),
  ucGroupRenameGroup(4);

  public final int value;
  private GroupAction(int value) { this.value = value; }
  public static  GroupAction valueOf(int value) {
    switch(value) {
    case 1: return ucGroupAddContact;
    case 2: return ucGroupRemoveContact;
    case 3: return ucGroupDeleteGroup;
    case 4: return ucGroupRenameGroup;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + GroupAction.class);
    }
  }
}
