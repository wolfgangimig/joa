/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileNewSection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileNewSection {

  // Typed constants
  public final static MsoFileNewSection msoOpenDocument = new MsoFileNewSection(0);
  public final static MsoFileNewSection msoNew = new MsoFileNewSection(1);
  public final static MsoFileNewSection msoNewfromExistingFile = new MsoFileNewSection(2);
  public final static MsoFileNewSection msoNewfromTemplate = new MsoFileNewSection(3);
  public final static MsoFileNewSection msoBottomSection = new MsoFileNewSection(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoOpenDocument = 0;
  public final static int _msoNew = 1;
  public final static int _msoNewfromExistingFile = 2;
  public final static int _msoNewfromTemplate = 3;
  public final static int _msoBottomSection = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileNewSection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileNewSection valueOf(int value) {
    switch(value) {
    case 0: return msoOpenDocument;
    case 1: return msoNew;
    case 2: return msoNewfromExistingFile;
    case 3: return msoNewfromTemplate;
    case 4: return msoBottomSection;
    default: return new MsoFileNewSection(value);
    }
  }
}
