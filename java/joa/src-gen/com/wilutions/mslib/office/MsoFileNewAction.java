/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileNewAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileNewAction {

  // Typed constants
  public final static MsoFileNewAction msoEditFile = new MsoFileNewAction(0);
  public final static MsoFileNewAction msoCreateNewFile = new MsoFileNewAction(1);
  public final static MsoFileNewAction msoOpenFile = new MsoFileNewAction(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoEditFile = 0;
  public final static int _msoCreateNewFile = 1;
  public final static int _msoOpenFile = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileNewAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileNewAction valueOf(int value) {
    switch(value) {
    case 0: return msoEditFile;
    case 1: return msoCreateNewFile;
    case 2: return msoOpenFile;
    default: return new MsoFileNewAction(value);
    }
  }
}
