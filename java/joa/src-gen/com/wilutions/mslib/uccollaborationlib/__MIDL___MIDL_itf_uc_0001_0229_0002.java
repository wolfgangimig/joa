/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0229_0002.
 * Enumerates the content properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0229_0002 {
  ucShareableContentId(1048576),
  ucShareableContentType(806354945),
  ucShareableContentTitle(1048578),
  ucShareableContentOwner(1074790403),
  ucShareableContentCreationTime(1343225860),
  ucShareableContentLastUsedTime(1343225861),
  ucShareableContentPresenter(1074790420),
  ucShareableContentIsInSyncWithPresenter(269484062),
  ucShareableContentOriginalFileUrl(1048607),
  ucShareableContentPresentationViewingURL(1048608),
  ucShareableContentVisibility(806354977),
  ucShareableContentNotesPageTitle(1048610);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0229_0002(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0229_0002.class);
    }
  }
}
