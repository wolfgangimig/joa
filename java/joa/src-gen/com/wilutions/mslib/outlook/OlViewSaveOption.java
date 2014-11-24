/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlViewSaveOption.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlViewSaveOption {

  // Typed constants
  public final static OlViewSaveOption olViewSaveOptionThisFolderEveryone = new OlViewSaveOption(0);
  public final static OlViewSaveOption olViewSaveOptionThisFolderOnlyMe = new OlViewSaveOption(1);
  public final static OlViewSaveOption olViewSaveOptionAllFoldersOfType = new OlViewSaveOption(2);

  // Integer constants for bitsets and switch statements
  public final static int _olViewSaveOptionThisFolderEveryone = 0;
  public final static int _olViewSaveOptionThisFolderOnlyMe = 1;
  public final static int _olViewSaveOptionAllFoldersOfType = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlViewSaveOption(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlViewSaveOption valueOf(int value) {
    switch(value) {
    case 0: return olViewSaveOptionThisFolderEveryone;
    case 1: return olViewSaveOptionThisFolderOnlyMe;
    case 2: return olViewSaveOptionAllFoldersOfType;
    default: return new OlViewSaveOption(value);
    }
  }
}
