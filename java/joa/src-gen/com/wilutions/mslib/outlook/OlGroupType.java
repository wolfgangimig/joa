/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGroupType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlGroupType {
  olCustomFoldersGroup(0),
  olMyFoldersGroup(1),
  olPeopleFoldersGroup(2),
  olOtherFoldersGroup(3),
  olFavoriteFoldersGroup(4),
  olRoomsGroup(5),
  olReadOnlyGroup(6);

  public final int value;
  private OlGroupType(int value) { this.value = value; }
  public static  OlGroupType valueOf(int value) {
    switch(value) {
    case 0: return olCustomFoldersGroup;
    case 1: return olMyFoldersGroup;
    case 2: return olPeopleFoldersGroup;
    case 3: return olOtherFoldersGroup;
    case 4: return olFavoriteFoldersGroup;
    case 5: return olRoomsGroup;
    case 6: return olReadOnlyGroup;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlGroupType.class);
    }
  }
}
