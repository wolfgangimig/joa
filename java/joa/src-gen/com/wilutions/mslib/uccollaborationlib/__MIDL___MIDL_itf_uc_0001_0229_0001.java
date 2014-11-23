/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0001.
 * Enumerates supported content actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0229_0001 {
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
  private __MIDL___MIDL_itf_uc_0001_0229_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0229_0001 valueOf(int value) {
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0229_0001.class);
    }
  }
}
