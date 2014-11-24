/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileDialogView.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileDialogView {

  // Typed constants
  public final static MsoFileDialogView msoFileDialogViewList = new MsoFileDialogView(1);
  public final static MsoFileDialogView msoFileDialogViewDetails = new MsoFileDialogView(2);
  public final static MsoFileDialogView msoFileDialogViewProperties = new MsoFileDialogView(3);
  public final static MsoFileDialogView msoFileDialogViewPreview = new MsoFileDialogView(4);
  public final static MsoFileDialogView msoFileDialogViewThumbnail = new MsoFileDialogView(5);
  public final static MsoFileDialogView msoFileDialogViewLargeIcons = new MsoFileDialogView(6);
  public final static MsoFileDialogView msoFileDialogViewSmallIcons = new MsoFileDialogView(7);
  public final static MsoFileDialogView msoFileDialogViewWebView = new MsoFileDialogView(8);
  public final static MsoFileDialogView msoFileDialogViewTiles = new MsoFileDialogView(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileDialogViewList = 1;
  public final static int _msoFileDialogViewDetails = 2;
  public final static int _msoFileDialogViewProperties = 3;
  public final static int _msoFileDialogViewPreview = 4;
  public final static int _msoFileDialogViewThumbnail = 5;
  public final static int _msoFileDialogViewLargeIcons = 6;
  public final static int _msoFileDialogViewSmallIcons = 7;
  public final static int _msoFileDialogViewWebView = 8;
  public final static int _msoFileDialogViewTiles = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileDialogView(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoFileDialogView(value);
    }
  }
}
