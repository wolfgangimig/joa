/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentAction.
 * Enumerates supported content actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ShareableContentAction {
  ucShareableContentActionRemove(0),
  ucShareableContentActionPresent(1),
  ucShareableContentActionStopPresenting(2),
  ucShareableContentActionSyncWithPresenter(3),
  ucShareableContentActionDownloadFile(4),
  ucShareableContentActionTakeOverAsPresenter(5),
  ucShareableContentActionSaveAnnotation(6),
  ucShareableContentActionClearAllAnnotations(7),
  ucShareableContentActionUpload(8);

  public final int value;
  private ShareableContentAction(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ShareableContentAction.class);
    }
  }
}
