/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileDialogView.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileDialogView {
  msoFileDialogViewList(1),
  msoFileDialogViewDetails(2),
  msoFileDialogViewProperties(3),
  msoFileDialogViewPreview(4),
  msoFileDialogViewThumbnail(5),
  msoFileDialogViewLargeIcons(6),
  msoFileDialogViewSmallIcons(7),
  msoFileDialogViewWebView(8),
  msoFileDialogViewTiles(9);

  public final int value;
  private MsoFileDialogView(int value) { this.value = value; }
  public static  MsoFileDialogView valueOf(int value) {
    switch(value) {
    case 1: return msoFileDialogViewList;
    case 2: return msoFileDialogViewDetails;
    case 3: return msoFileDialogViewProperties;
    case 4: return msoFileDialogViewPreview;
    case 5: return msoFileDialogViewThumbnail;
    case 6: return msoFileDialogViewLargeIcons;
    case 7: return msoFileDialogViewSmallIcons;
    case 8: return msoFileDialogViewWebView;
    case 9: return msoFileDialogViewTiles;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileDialogView.class);
    }
  }
}
