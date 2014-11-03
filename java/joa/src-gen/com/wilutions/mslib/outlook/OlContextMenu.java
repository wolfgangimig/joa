/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlContextMenu.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlContextMenu {
  olItemContextMenu(0),
  olViewContextMenu(1),
  olFolderContextMenu(2),
  olAttachmentContextMenu(3),
  olStoreContextMenu(4),
  olShortcutContextMenu(5);

  public final int value;
  private OlContextMenu(int value) { this.value = value; }
  public static  OlContextMenu valueOf(int value) {
    switch(value) {
    case 0: return olItemContextMenu;
    case 1: return olViewContextMenu;
    case 2: return olFolderContextMenu;
    case 3: return olAttachmentContextMenu;
    case 4: return olStoreContextMenu;
    case 5: return olShortcutContextMenu;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlContextMenu.class);
    }
  }
}
