/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSearchScope.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSearchScope {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSearchScope olSearchScopeCurrentFolder = new OlSearchScope(0);
  public final static OlSearchScope olSearchScopeAllFolders = new OlSearchScope(1);
  public final static OlSearchScope olSearchScopeAllOutlookItems = new OlSearchScope(2);
  public final static OlSearchScope olSearchScopeSubfolders = new OlSearchScope(3);
  public final static OlSearchScope olSearchScopeCurrentStore = new OlSearchScope(4);

  // Integer constants for bitsets and switch statements
  public final static int _olSearchScopeCurrentFolder = 0;
  public final static int _olSearchScopeAllFolders = 1;
  public final static int _olSearchScopeAllOutlookItems = 2;
  public final static int _olSearchScopeSubfolders = 3;
  public final static int _olSearchScopeCurrentStore = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSearchScope(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSearchScope valueOf(int value) {
    switch(value) {
    case 0: return olSearchScopeCurrentFolder;
    case 1: return olSearchScopeAllFolders;
    case 2: return olSearchScopeAllOutlookItems;
    case 3: return olSearchScopeSubfolders;
    case 4: return olSearchScopeCurrentStore;
    default: return new OlSearchScope(value);
    }
  }
}
