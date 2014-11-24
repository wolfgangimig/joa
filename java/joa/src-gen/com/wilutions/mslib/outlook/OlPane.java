/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPane.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlPane {

  // Typed constants
  public final static OlPane olOutlookBar = new OlPane(1);
  public final static OlPane olFolderList = new OlPane(2);
  public final static OlPane olPreview = new OlPane(3);
  public final static OlPane olNavigationPane = new OlPane(4);
  public final static OlPane olToDoBar = new OlPane(5);

  // Integer constants for bitsets and switch statements
  public final static int _olOutlookBar = 1;
  public final static int _olFolderList = 2;
  public final static int _olPreview = 3;
  public final static int _olNavigationPane = 4;
  public final static int _olToDoBar = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlPane(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlPane valueOf(int value) {
    switch(value) {
    case 1: return olOutlookBar;
    case 2: return olFolderList;
    case 3: return olPreview;
    case 4: return olNavigationPane;
    case 5: return olToDoBar;
    default: return new OlPane(value);
    }
  }
}
