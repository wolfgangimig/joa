/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindView.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileFindView {

  // Typed constants
  public final static MsoFileFindView msoViewFileInfo = new MsoFileFindView(1);
  public final static MsoFileFindView msoViewPreview = new MsoFileFindView(2);
  public final static MsoFileFindView msoViewSummaryInfo = new MsoFileFindView(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoViewFileInfo = 1;
  public final static int _msoViewPreview = 2;
  public final static int _msoViewSummaryInfo = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileFindView(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileFindView valueOf(int value) {
    switch(value) {
    case 1: return msoViewFileInfo;
    case 2: return msoViewPreview;
    case 3: return msoViewSummaryInfo;
    default: return new MsoFileFindView(value);
    }
  }
}
