/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AccessEntryScope.
 * Enumerates the access entry scopes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AccessEntryScope {

  // Typed constants
  public final static AccessEntryScope ucAccessEntryScopeUser = new AccessEntryScope(0);
  public final static AccessEntryScope ucAccessEntryScopeDomain = new AccessEntryScope(1);
  public final static AccessEntryScope ucAccessEntryScopeEnterprise = new AccessEntryScope(2);
  public final static AccessEntryScope ucAccessEntryScopeFederated = new AccessEntryScope(3);
  public final static AccessEntryScope ucAccessEntryScopePublic = new AccessEntryScope(4);
  public final static AccessEntryScope ucAccessEntryScopeEveryone = new AccessEntryScope(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucAccessEntryScopeUser = 0;
  public final static int _ucAccessEntryScopeDomain = 1;
  public final static int _ucAccessEntryScopeEnterprise = 2;
  public final static int _ucAccessEntryScopeFederated = 3;
  public final static int _ucAccessEntryScopePublic = 4;
  public final static int _ucAccessEntryScopeEveryone = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AccessEntryScope(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AccessEntryScope valueOf(int value) {
    switch(value) {
    case 0: return ucAccessEntryScopeUser;
    case 1: return ucAccessEntryScopeDomain;
    case 2: return ucAccessEntryScopeEnterprise;
    case 3: return ucAccessEntryScopeFederated;
    case 4: return ucAccessEntryScopePublic;
    case 5: return ucAccessEntryScopeEveryone;
    default: return new AccessEntryScope(value);
    }
  }
}
