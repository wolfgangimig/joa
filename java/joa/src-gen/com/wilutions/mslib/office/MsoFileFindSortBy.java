/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindSortBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileFindSortBy implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileFindSortBy msoFileFindSortbyAuthor = new MsoFileFindSortBy(1);
  public final static MsoFileFindSortBy msoFileFindSortbyDateCreated = new MsoFileFindSortBy(2);
  public final static MsoFileFindSortBy msoFileFindSortbyLastSavedBy = new MsoFileFindSortBy(3);
  public final static MsoFileFindSortBy msoFileFindSortbyDateSaved = new MsoFileFindSortBy(4);
  public final static MsoFileFindSortBy msoFileFindSortbyFileName = new MsoFileFindSortBy(5);
  public final static MsoFileFindSortBy msoFileFindSortbySize = new MsoFileFindSortBy(6);
  public final static MsoFileFindSortBy msoFileFindSortbyTitle = new MsoFileFindSortBy(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileFindSortbyAuthor = 1;
  public final static int _msoFileFindSortbyDateCreated = 2;
  public final static int _msoFileFindSortbyLastSavedBy = 3;
  public final static int _msoFileFindSortbyDateSaved = 4;
  public final static int _msoFileFindSortbyFileName = 5;
  public final static int _msoFileFindSortbySize = 6;
  public final static int _msoFileFindSortbyTitle = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileFindSortBy(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileFindSortBy valueOf(int value) {
    switch(value) {
    case 1: return msoFileFindSortbyAuthor;
    case 2: return msoFileFindSortbyDateCreated;
    case 3: return msoFileFindSortbyLastSavedBy;
    case 4: return msoFileFindSortbyDateSaved;
    case 5: return msoFileFindSortbyFileName;
    case 6: return msoFileFindSortbySize;
    case 7: return msoFileFindSortbyTitle;
    default: return new MsoFileFindSortBy(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoFileFindSortbyAuthor";
    case 2: return "msoFileFindSortbyDateCreated";
    case 3: return "msoFileFindSortbyLastSavedBy";
    case 4: return "msoFileFindSortbyDateSaved";
    case 5: return "msoFileFindSortbyFileName";
    case 6: return "msoFileFindSortbySize";
    case 7: return "msoFileFindSortbyTitle";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoFileFindSortbyAuthor");
      if ((value & 2) != 0) sbuf.append("|msoFileFindSortbyDateCreated");
      if ((value & 3) != 0) sbuf.append("|msoFileFindSortbyLastSavedBy");
      if ((value & 4) != 0) sbuf.append("|msoFileFindSortbyDateSaved");
      if ((value & 5) != 0) sbuf.append("|msoFileFindSortbyFileName");
      if ((value & 6) != 0) sbuf.append("|msoFileFindSortbySize");
      if ((value & 7) != 0) sbuf.append("|msoFileFindSortbyTitle");
      return sbuf.toString();
      }
    }
  }
}
