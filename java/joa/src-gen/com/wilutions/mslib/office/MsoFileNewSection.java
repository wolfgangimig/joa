/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileNewSection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileNewSection {
  msoOpenDocument(0),
  msoNew(1),
  msoNewfromExistingFile(2),
  msoNewfromTemplate(3),
  msoBottomSection(4);

  public final int value;
  private MsoFileNewSection(int value) { this.value = value; }
  public static  MsoFileNewSection valueOf(int value) {
    switch(value) {
    case 0: return msoOpenDocument;
    case 1: return msoNew;
    case 2: return msoNewfromExistingFile;
    case 3: return msoNewfromTemplate;
    case 4: return msoBottomSection;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileNewSection.class);
    }
  }
}
