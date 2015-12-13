/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AccessLevel.
 * List of various access levels in use. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AccessLevel {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static AccessLevel ucAccessLevelDefault = new AccessLevel(0);
  public final static AccessLevel ucAccessLevelExternal = new AccessLevel(100);
  public final static AccessLevel ucAccessLevelColleague = new AccessLevel(200);
  public final static AccessLevel ucAccessLevelWorkgroup = new AccessLevel(300);
  public final static AccessLevel ucAccessLevelFriends = new AccessLevel(400);
  public final static AccessLevel ucAccessLevelBlocked = new AccessLevel(32000);

  // Integer constants for bitsets and switch statements
  public final static int _ucAccessLevelDefault = 0;
  public final static int _ucAccessLevelExternal = 100;
  public final static int _ucAccessLevelColleague = 200;
  public final static int _ucAccessLevelWorkgroup = 300;
  public final static int _ucAccessLevelFriends = 400;
  public final static int _ucAccessLevelBlocked = 32000;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AccessLevel(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AccessLevel valueOf(int value) {
    switch(value) {
    case 0: return ucAccessLevelDefault;
    case 100: return ucAccessLevelExternal;
    case 200: return ucAccessLevelColleague;
    case 300: return ucAccessLevelWorkgroup;
    case 400: return ucAccessLevelFriends;
    case 32000: return ucAccessLevelBlocked;
    default: return new AccessLevel(value);
    }
  }
}
