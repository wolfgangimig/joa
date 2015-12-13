/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * GroupType.
 * Enumerates the group types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class GroupType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static GroupType ucCustomGroup = new GroupType(1);
  public final static GroupType ucRecentContacts = new GroupType(2);
  public final static GroupType ucDistributionGroup = new GroupType(3);
  public final static GroupType ucFrequentContacts = new GroupType(4);
  public final static GroupType ucFavoriteContacts = new GroupType(5);
  public final static GroupType ucDelegateGroup = new GroupType(6);
  public final static GroupType ucResponseServiceGroup = new GroupType(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucCustomGroup = 1;
  public final static int _ucRecentContacts = 2;
  public final static int _ucDistributionGroup = 3;
  public final static int _ucFrequentContacts = 4;
  public final static int _ucFavoriteContacts = 5;
  public final static int _ucDelegateGroup = 6;
  public final static int _ucResponseServiceGroup = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private GroupType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  GroupType valueOf(int value) {
    switch(value) {
    case 1: return ucCustomGroup;
    case 2: return ucRecentContacts;
    case 3: return ucDistributionGroup;
    case 4: return ucFrequentContacts;
    case 5: return ucFavoriteContacts;
    case 6: return ucDelegateGroup;
    case 7: return ucResponseServiceGroup;
    default: return new GroupType(value);
    }
  }
}
