/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileDialogType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileDialogType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileDialogType msoFileDialogOpen = new MsoFileDialogType(1);
  public final static MsoFileDialogType msoFileDialogSaveAs = new MsoFileDialogType(2);
  public final static MsoFileDialogType msoFileDialogFilePicker = new MsoFileDialogType(3);
  public final static MsoFileDialogType msoFileDialogFolderPicker = new MsoFileDialogType(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileDialogOpen = 1;
  public final static int _msoFileDialogSaveAs = 2;
  public final static int _msoFileDialogFilePicker = 3;
  public final static int _msoFileDialogFolderPicker = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileDialogType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileDialogType valueOf(int value) {
    switch(value) {
    case 1: return msoFileDialogOpen;
    case 2: return msoFileDialogSaveAs;
    case 3: return msoFileDialogFilePicker;
    case 4: return msoFileDialogFolderPicker;
    default: return new MsoFileDialogType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoFileDialogOpen";
    case 2: return "msoFileDialogSaveAs";
    case 3: return "msoFileDialogFilePicker";
    case 4: return "msoFileDialogFolderPicker";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoFileDialogOpen");
      if ((value & 2) != 0) sbuf.append("|msoFileDialogSaveAs");
      if ((value & 3) != 0) sbuf.append("|msoFileDialogFilePicker");
      if ((value & 4) != 0) sbuf.append("|msoFileDialogFolderPicker");
      return sbuf.toString();
      }
    }
  }
}
