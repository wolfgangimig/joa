/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ShareableContentProperty.
 * Enumerates the content properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ShareableContentProperty {

  // Typed constants
  public final static ShareableContentProperty ucShareableContentId = new ShareableContentProperty(1048576);
  public final static ShareableContentProperty ucShareableContentType = new ShareableContentProperty(806354945);
  public final static ShareableContentProperty ucShareableContentTitle = new ShareableContentProperty(1048578);
  public final static ShareableContentProperty ucShareableContentOwner = new ShareableContentProperty(1074790403);
  public final static ShareableContentProperty ucShareableContentCreationTime = new ShareableContentProperty(1343225860);
  public final static ShareableContentProperty ucShareableContentLastUsedTime = new ShareableContentProperty(1343225861);
  public final static ShareableContentProperty ucShareableContentPresenter = new ShareableContentProperty(1074790420);
  public final static ShareableContentProperty ucShareableContentIsInSyncWithPresenter = new ShareableContentProperty(269484062);
  public final static ShareableContentProperty ucShareableContentOriginalFileUrl = new ShareableContentProperty(1048607);
  public final static ShareableContentProperty ucShareableContentPresentationViewingURL = new ShareableContentProperty(1048608);
  public final static ShareableContentProperty ucShareableContentVisibility = new ShareableContentProperty(806354977);
  public final static ShareableContentProperty ucShareableContentNotesPageTitle = new ShareableContentProperty(1048610);

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
  private ShareableContentProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ShareableContentProperty valueOf(int value) {
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
    default: return new ShareableContentProperty(value);
    }
  }
}
