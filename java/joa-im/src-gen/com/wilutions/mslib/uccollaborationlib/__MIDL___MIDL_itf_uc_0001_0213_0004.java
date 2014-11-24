/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0004.
 * Enumerates the conversation window properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0213_0004 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowWidthMin = new __MIDL___MIDL_itf_uc_0001_0213_0004(537788416);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowHeightMin = new __MIDL___MIDL_itf_uc_0001_0213_0004(537788417);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowIsDocked = new __MIDL___MIDL_itf_uc_0001_0213_0004(269352962);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowHasVideo = new __MIDL___MIDL_itf_uc_0001_0213_0004(269352963);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowHasContentStage = new __MIDL___MIDL_itf_uc_0001_0213_0004(269352964);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowHasExtensionPane = new __MIDL___MIDL_itf_uc_0001_0213_0004(269352965);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0004 uiaConversationWindowIsFullScreen = new __MIDL___MIDL_itf_uc_0001_0213_0004(269352966);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationWindowWidthMin = 537788416;
  public final static int _uiaConversationWindowHeightMin = 537788417;
  public final static int _uiaConversationWindowIsDocked = 269352962;
  public final static int _uiaConversationWindowHasVideo = 269352963;
  public final static int _uiaConversationWindowHasContentStage = 269352964;
  public final static int _uiaConversationWindowHasExtensionPane = 269352965;
  public final static int _uiaConversationWindowIsFullScreen = 269352966;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0213_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0213_0004 valueOf(int value) {
    switch(value) {
    case 537788416: return uiaConversationWindowWidthMin;
    case 537788417: return uiaConversationWindowHeightMin;
    case 269352962: return uiaConversationWindowIsDocked;
    case 269352963: return uiaConversationWindowHasVideo;
    case 269352964: return uiaConversationWindowHasContentStage;
    case 269352965: return uiaConversationWindowHasExtensionPane;
    case 269352966: return uiaConversationWindowIsFullScreen;
    default: return new __MIDL___MIDL_itf_uc_0001_0213_0004(value);
    }
  }
}
