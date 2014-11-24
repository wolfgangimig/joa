/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContentSavingFileType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContentSavingFileType {

  // Typed constants
  public final static ContentSavingFileType ucContentSavingFileTypeXPS = new ContentSavingFileType(806354944);
  public final static ContentSavingFileType ucContentSavingFileTypePNG = new ContentSavingFileType(806354945);

  // Integer constants for bitsets and switch statements
  public final static int _ucContentSavingFileTypeXPS = 806354944;
  public final static int _ucContentSavingFileTypePNG = 806354945;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContentSavingFileType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContentSavingFileType valueOf(int value) {
    switch(value) {
    case 806354944: return ucContentSavingFileTypeXPS;
    case 806354945: return ucContentSavingFileTypePNG;
    default: return new ContentSavingFileType(value);
    }
  }
}
