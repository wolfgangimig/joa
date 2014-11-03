/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPane.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlPane {
  olOutlookBar(1),
  olFolderList(2),
  olPreview(3),
  olNavigationPane(4),
  olToDoBar(5);

  public final int value;
  private OlPane(int value) { this.value = value; }
  public static  OlPane valueOf(int value) {
    switch(value) {
    case 1: return olOutlookBar;
    case 2: return olFolderList;
    case 3: return olPreview;
    case 4: return olNavigationPane;
    case 5: return olToDoBar;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlPane.class);
    }
  }
}
