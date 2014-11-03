/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindSortBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileFindSortBy {
  msoFileFindSortbyAuthor(1),
  msoFileFindSortbyDateCreated(2),
  msoFileFindSortbyLastSavedBy(3),
  msoFileFindSortbyDateSaved(4),
  msoFileFindSortbyFileName(5),
  msoFileFindSortbySize(6),
  msoFileFindSortbyTitle(7);

  public final int value;
  private MsoFileFindSortBy(int value) { this.value = value; }
  public static  MsoFileFindSortBy valueOf(int value) {
    switch(value) {
    case 1: return msoFileFindSortbyAuthor;
    case 2: return msoFileFindSortbyDateCreated;
    case 3: return msoFileFindSortbyLastSavedBy;
    case 4: return msoFileFindSortbyDateSaved;
    case 5: return msoFileFindSortbyFileName;
    case 6: return msoFileFindSortbySize;
    case 7: return msoFileFindSortbyTitle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileFindSortBy.class);
    }
  }
}
