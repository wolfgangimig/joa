/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGroupType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlGroupType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlGroupType olCustomFoldersGroup = new OlGroupType(0);
  public final static OlGroupType olMyFoldersGroup = new OlGroupType(1);
  public final static OlGroupType olPeopleFoldersGroup = new OlGroupType(2);
  public final static OlGroupType olOtherFoldersGroup = new OlGroupType(3);
  public final static OlGroupType olFavoriteFoldersGroup = new OlGroupType(4);
  public final static OlGroupType olRoomsGroup = new OlGroupType(5);
  public final static OlGroupType olReadOnlyGroup = new OlGroupType(6);

  // Integer constants for bitsets and switch statements
  public final static int _olCustomFoldersGroup = 0;
  public final static int _olMyFoldersGroup = 1;
  public final static int _olPeopleFoldersGroup = 2;
  public final static int _olOtherFoldersGroup = 3;
  public final static int _olFavoriteFoldersGroup = 4;
  public final static int _olRoomsGroup = 5;
  public final static int _olReadOnlyGroup = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlGroupType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlGroupType valueOf(int value) {
    switch(value) {
    case 0: return olCustomFoldersGroup;
    case 1: return olMyFoldersGroup;
    case 2: return olPeopleFoldersGroup;
    case 3: return olOtherFoldersGroup;
    case 4: return olFavoriteFoldersGroup;
    case 5: return olRoomsGroup;
    case 6: return olReadOnlyGroup;
    default: return new OlGroupType(value);
    }
  }
}
