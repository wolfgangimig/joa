/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlViewSaveOption.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlViewSaveOption {
  olViewSaveOptionThisFolderEveryone(0),
  olViewSaveOptionThisFolderOnlyMe(1),
  olViewSaveOptionAllFoldersOfType(2);

  public final int value;
  private OlViewSaveOption(int value) { this.value = value; }
  public static  OlViewSaveOption valueOf(int value) {
    switch(value) {
    case 0: return olViewSaveOptionThisFolderEveryone;
    case 1: return olViewSaveOptionThisFolderOnlyMe;
    case 2: return olViewSaveOptionAllFoldersOfType;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlViewSaveOption.class);
    }
  }
}
