/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentAction.
 * Enumerates supported content actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ShareableContentAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ShareableContentAction ucShareableContentActionRemove = new ShareableContentAction(0);
  public final static ShareableContentAction ucShareableContentActionPresent = new ShareableContentAction(1);
  public final static ShareableContentAction ucShareableContentActionStopPresenting = new ShareableContentAction(2);
  public final static ShareableContentAction ucShareableContentActionSyncWithPresenter = new ShareableContentAction(3);
  public final static ShareableContentAction ucShareableContentActionDownloadFile = new ShareableContentAction(4);
  public final static ShareableContentAction ucShareableContentActionTakeOverAsPresenter = new ShareableContentAction(5);
  public final static ShareableContentAction ucShareableContentActionSaveAnnotation = new ShareableContentAction(6);
  public final static ShareableContentAction ucShareableContentActionClearAllAnnotations = new ShareableContentAction(7);
  public final static ShareableContentAction ucShareableContentActionUpload = new ShareableContentAction(8);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentActionRemove = 0;
  public final static int _ucShareableContentActionPresent = 1;
  public final static int _ucShareableContentActionStopPresenting = 2;
  public final static int _ucShareableContentActionSyncWithPresenter = 3;
  public final static int _ucShareableContentActionDownloadFile = 4;
  public final static int _ucShareableContentActionTakeOverAsPresenter = 5;
  public final static int _ucShareableContentActionSaveAnnotation = 6;
  public final static int _ucShareableContentActionClearAllAnnotations = 7;
  public final static int _ucShareableContentActionUpload = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ShareableContentAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ShareableContentAction valueOf(int value) {
    switch(value) {
    case 0: return ucShareableContentActionRemove;
    case 1: return ucShareableContentActionPresent;
    case 2: return ucShareableContentActionStopPresenting;
    case 3: return ucShareableContentActionSyncWithPresenter;
    case 4: return ucShareableContentActionDownloadFile;
    case 5: return ucShareableContentActionTakeOverAsPresenter;
    case 6: return ucShareableContentActionSaveAnnotation;
    case 7: return ucShareableContentActionClearAllAnnotations;
    case 8: return ucShareableContentActionUpload;
    default: return new ShareableContentAction(value);
    }
  }
}
