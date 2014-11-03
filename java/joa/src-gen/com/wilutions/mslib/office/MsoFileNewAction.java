/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileNewAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileNewAction {
  msoEditFile(0),
  msoCreateNewFile(1),
  msoOpenFile(2);

  public final int value;
  private MsoFileNewAction(int value) { this.value = value; }
  public static  MsoFileNewAction valueOf(int value) {
    switch(value) {
    case 0: return msoEditFile;
    case 1: return msoCreateNewFile;
    case 2: return msoOpenFile;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileNewAction.class);
    }
  }
}
