/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlContextMenu.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlContextMenu implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlContextMenu olItemContextMenu = new OlContextMenu(0);
  public final static OlContextMenu olViewContextMenu = new OlContextMenu(1);
  public final static OlContextMenu olFolderContextMenu = new OlContextMenu(2);
  public final static OlContextMenu olAttachmentContextMenu = new OlContextMenu(3);
  public final static OlContextMenu olStoreContextMenu = new OlContextMenu(4);
  public final static OlContextMenu olShortcutContextMenu = new OlContextMenu(5);

  // Integer constants for bitsets and switch statements
  public final static int _olItemContextMenu = 0;
  public final static int _olViewContextMenu = 1;
  public final static int _olFolderContextMenu = 2;
  public final static int _olAttachmentContextMenu = 3;
  public final static int _olStoreContextMenu = 4;
  public final static int _olShortcutContextMenu = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlContextMenu(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlContextMenu valueOf(int value) {
    switch(value) {
    case 0: return olItemContextMenu;
    case 1: return olViewContextMenu;
    case 2: return olFolderContextMenu;
    case 3: return olAttachmentContextMenu;
    case 4: return olStoreContextMenu;
    case 5: return olShortcutContextMenu;
    default: return new OlContextMenu(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olItemContextMenu";
    case 1: return "olViewContextMenu";
    case 2: return "olFolderContextMenu";
    case 3: return "olAttachmentContextMenu";
    case 4: return "olStoreContextMenu";
    case 5: return "olShortcutContextMenu";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olItemContextMenu");
      if ((value & 1) != 0) sbuf.append("|olViewContextMenu");
      if ((value & 2) != 0) sbuf.append("|olFolderContextMenu");
      if ((value & 3) != 0) sbuf.append("|olAttachmentContextMenu");
      if ((value & 4) != 0) sbuf.append("|olStoreContextMenu");
      if ((value & 5) != 0) sbuf.append("|olShortcutContextMenu");
      return sbuf.toString();
      }
    }
  }
}
