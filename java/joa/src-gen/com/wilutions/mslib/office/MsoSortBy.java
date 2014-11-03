/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSortBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSortBy {
  msoSortByFileName(1),
  msoSortBySize(2),
  msoSortByFileType(3),
  msoSortByLastModified(4),
  msoSortByNone(5);

  public final int value;
  private MsoSortBy(int value) { this.value = value; }
  public static  MsoSortBy valueOf(int value) {
    switch(value) {
    case 1: return msoSortByFileName;
    case 2: return msoSortBySize;
    case 3: return msoSortByFileType;
    case 4: return msoSortByLastModified;
    case 5: return msoSortByNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSortBy.class);
    }
  }
}
