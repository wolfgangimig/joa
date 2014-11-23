/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0004.
 * Enumerates the conversation window properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0213_0004 {
  uiaConversationWindowWidthMin(537788416),
  uiaConversationWindowHeightMin(537788417),
  uiaConversationWindowIsDocked(269352962),
  uiaConversationWindowHasVideo(269352963),
  uiaConversationWindowHasContentStage(269352964),
  uiaConversationWindowHasExtensionPane(269352965),
  uiaConversationWindowIsFullScreen(269352966);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0213_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0213_0004 valueOf(int value) {
    switch(value) {
    case 537788416: return uiaConversationWindowWidthMin;
    case 537788417: return uiaConversationWindowHeightMin;
    case 269352962: return uiaConversationWindowIsDocked;
    case 269352963: return uiaConversationWindowHasVideo;
    case 269352964: return uiaConversationWindowHasContentStage;
    case 269352965: return uiaConversationWindowHasExtensionPane;
    case 269352966: return uiaConversationWindowIsFullScreen;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0213_0004.class);
    }
  }
}
