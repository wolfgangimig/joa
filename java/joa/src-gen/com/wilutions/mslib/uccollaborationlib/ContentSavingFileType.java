/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContentSavingFileType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContentSavingFileType {
  ucContentSavingFileTypeXPS(806354944),
  ucContentSavingFileTypePNG(806354945);

  public final int value;
  private ContentSavingFileType(int value) { this.value = value; }
  public static  ContentSavingFileType valueOf(int value) {
    switch(value) {
    case 806354944: return ucContentSavingFileTypeXPS;
    case 806354945: return ucContentSavingFileTypePNG;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContentSavingFileType.class);
    }
  }
}
