/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSortBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSortBy {

  // Typed constants
  public final static MsoSortBy msoSortByFileName = new MsoSortBy(1);
  public final static MsoSortBy msoSortBySize = new MsoSortBy(2);
  public final static MsoSortBy msoSortByFileType = new MsoSortBy(3);
  public final static MsoSortBy msoSortByLastModified = new MsoSortBy(4);
  public final static MsoSortBy msoSortByNone = new MsoSortBy(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoSortByFileName = 1;
  public final static int _msoSortBySize = 2;
  public final static int _msoSortByFileType = 3;
  public final static int _msoSortByLastModified = 4;
  public final static int _msoSortByNone = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSortBy(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSortBy valueOf(int value) {
    switch(value) {
    case 1: return msoSortByFileName;
    case 2: return msoSortBySize;
    case 3: return msoSortByFileType;
    case 4: return msoSortByLastModified;
    case 5: return msoSortByNone;
    default: return new MsoSortBy(value);
    }
  }
}
