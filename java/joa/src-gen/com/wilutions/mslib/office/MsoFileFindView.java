/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindView.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileFindView {
  msoViewFileInfo(1),
  msoViewPreview(2),
  msoViewSummaryInfo(3);

  public final int value;
  private MsoFileFindView(int value) { this.value = value; }
  public static  MsoFileFindView valueOf(int value) {
    switch(value) {
    case 1: return msoViewFileInfo;
    case 2: return msoViewPreview;
    case 3: return msoViewSummaryInfo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileFindView.class);
    }
  }
}
