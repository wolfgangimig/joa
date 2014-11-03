/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSearchScope.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSearchScope {
  olSearchScopeCurrentFolder(0),
  olSearchScopeAllFolders(1),
  olSearchScopeAllOutlookItems(2),
  olSearchScopeSubfolders(3),
  olSearchScopeCurrentStore(4);

  public final int value;
  private OlSearchScope(int value) { this.value = value; }
  public static  OlSearchScope valueOf(int value) {
    switch(value) {
    case 0: return olSearchScopeCurrentFolder;
    case 1: return olSearchScopeAllFolders;
    case 2: return olSearchScopeAllOutlookItems;
    case 3: return olSearchScopeSubfolders;
    case 4: return olSearchScopeCurrentStore;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSearchScope.class);
    }
  }
}
