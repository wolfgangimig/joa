/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AccessEntryScope.
 * Enumerates the access entry scopes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum AccessEntryScope {
  ucAccessEntryScopeUser(0),
  ucAccessEntryScopeDomain(1),
  ucAccessEntryScopeEnterprise(2),
  ucAccessEntryScopeFederated(3),
  ucAccessEntryScopePublic(4),
  ucAccessEntryScopeEveryone(5);

  public final int value;
  private AccessEntryScope(int value) { this.value = value; }
  public static  AccessEntryScope valueOf(int value) {
    switch(value) {
    case 0: return ucAccessEntryScopeUser;
    case 1: return ucAccessEntryScopeDomain;
    case 2: return ucAccessEntryScopeEnterprise;
    case 3: return ucAccessEntryScopeFederated;
    case 4: return ucAccessEntryScopePublic;
    case 5: return ucAccessEntryScopeEveryone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + AccessEntryScope.class);
    }
  }
}
