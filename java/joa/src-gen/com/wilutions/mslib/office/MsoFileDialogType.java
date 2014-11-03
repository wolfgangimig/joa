/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileDialogType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileDialogType {
  msoFileDialogOpen(1),
  msoFileDialogSaveAs(2),
  msoFileDialogFilePicker(3),
  msoFileDialogFolderPicker(4);

  public final int value;
  private MsoFileDialogType(int value) { this.value = value; }
  public static  MsoFileDialogType valueOf(int value) {
    switch(value) {
    case 1: return msoFileDialogOpen;
    case 2: return msoFileDialogSaveAs;
    case 3: return msoFileDialogFilePicker;
    case 4: return msoFileDialogFolderPicker;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileDialogType.class);
    }
  }
}
