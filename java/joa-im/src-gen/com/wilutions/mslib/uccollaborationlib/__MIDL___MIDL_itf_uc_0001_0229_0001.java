/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0001.
 * Enumerates supported content actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0229_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionRemove = new __MIDL___MIDL_itf_uc_0001_0229_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionPresent = new __MIDL___MIDL_itf_uc_0001_0229_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionStopPresenting = new __MIDL___MIDL_itf_uc_0001_0229_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionSyncWithPresenter = new __MIDL___MIDL_itf_uc_0001_0229_0001(3);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionDownloadFile = new __MIDL___MIDL_itf_uc_0001_0229_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionTakeOverAsPresenter = new __MIDL___MIDL_itf_uc_0001_0229_0001(5);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionSaveAnnotation = new __MIDL___MIDL_itf_uc_0001_0229_0001(6);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionClearAllAnnotations = new __MIDL___MIDL_itf_uc_0001_0229_0001(7);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0001 ucShareableContentActionUpload = new __MIDL___MIDL_itf_uc_0001_0229_0001(8);

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
  private __MIDL___MIDL_itf_uc_0001_0229_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0229_0001(value);
    }
  }
}
