/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0002.
 * Enumerates the content properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0229_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentId = new __MIDL___MIDL_itf_uc_0001_0229_0002(1048576);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentType = new __MIDL___MIDL_itf_uc_0001_0229_0002(806354945);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentTitle = new __MIDL___MIDL_itf_uc_0001_0229_0002(1048578);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentOwner = new __MIDL___MIDL_itf_uc_0001_0229_0002(1074790403);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentCreationTime = new __MIDL___MIDL_itf_uc_0001_0229_0002(1343225860);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentLastUsedTime = new __MIDL___MIDL_itf_uc_0001_0229_0002(1343225861);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentPresenter = new __MIDL___MIDL_itf_uc_0001_0229_0002(1074790420);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentIsInSyncWithPresenter = new __MIDL___MIDL_itf_uc_0001_0229_0002(269484062);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentOriginalFileUrl = new __MIDL___MIDL_itf_uc_0001_0229_0002(1048607);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentPresentationViewingURL = new __MIDL___MIDL_itf_uc_0001_0229_0002(1048608);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentVisibility = new __MIDL___MIDL_itf_uc_0001_0229_0002(806354977);
  public final static __MIDL___MIDL_itf_uc_0001_0229_0002 ucShareableContentNotesPageTitle = new __MIDL___MIDL_itf_uc_0001_0229_0002(1048610);

  // Integer constants for bitsets and switch statements
  public final static int _ucShareableContentId = 1048576;
  public final static int _ucShareableContentType = 806354945;
  public final static int _ucShareableContentTitle = 1048578;
  public final static int _ucShareableContentOwner = 1074790403;
  public final static int _ucShareableContentCreationTime = 1343225860;
  public final static int _ucShareableContentLastUsedTime = 1343225861;
  public final static int _ucShareableContentPresenter = 1074790420;
  public final static int _ucShareableContentIsInSyncWithPresenter = 269484062;
  public final static int _ucShareableContentOriginalFileUrl = 1048607;
  public final static int _ucShareableContentPresentationViewingURL = 1048608;
  public final static int _ucShareableContentVisibility = 806354977;
  public final static int _ucShareableContentNotesPageTitle = 1048610;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0229_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0229_0002 valueOf(int value) {
    switch(value) {
    case 1048576: return ucShareableContentId;
    case 806354945: return ucShareableContentType;
    case 1048578: return ucShareableContentTitle;
    case 1074790403: return ucShareableContentOwner;
    case 1343225860: return ucShareableContentCreationTime;
    case 1343225861: return ucShareableContentLastUsedTime;
    case 1074790420: return ucShareableContentPresenter;
    case 269484062: return ucShareableContentIsInSyncWithPresenter;
    case 1048607: return ucShareableContentOriginalFileUrl;
    case 1048608: return ucShareableContentPresentationViewingURL;
    case 806354977: return ucShareableContentVisibility;
    case 1048610: return ucShareableContentNotesPageTitle;
    default: return new __MIDL___MIDL_itf_uc_0001_0229_0002(value);
    }
  }
}
