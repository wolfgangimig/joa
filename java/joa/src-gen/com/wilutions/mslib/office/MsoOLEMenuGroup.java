/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOLEMenuGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoOLEMenuGroup {
  msoOLEMenuGroupNone(-1),
  msoOLEMenuGroupFile(0),
  msoOLEMenuGroupEdit(1),
  msoOLEMenuGroupContainer(2),
  msoOLEMenuGroupObject(3),
  msoOLEMenuGroupWindow(4),
  msoOLEMenuGroupHelp(5);

  public final int value;
  private MsoOLEMenuGroup(int value) { this.value = value; }
  public static  MsoOLEMenuGroup valueOf(int value) {
    switch(value) {
    case -1: return msoOLEMenuGroupNone;
    case 0: return msoOLEMenuGroupFile;
    case 1: return msoOLEMenuGroupEdit;
    case 2: return msoOLEMenuGroupContainer;
    case 3: return msoOLEMenuGroupObject;
    case 4: return msoOLEMenuGroupWindow;
    case 5: return msoOLEMenuGroupHelp;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoOLEMenuGroup.class);
    }
  }
}
