/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0213_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeInstantMessage = new __MIDL___MIDL_itf_uc_0001_0213_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeAudio = new __MIDL___MIDL_itf_uc_0001_0213_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeVideo = new __MIDL___MIDL_itf_uc_0001_0213_0001(4);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeFileTransfer = new __MIDL___MIDL_itf_uc_0001_0213_0001(8);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeApplicationSharing = new __MIDL___MIDL_itf_uc_0001_0213_0001(16);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0001 uiaConversationModeNone = new __MIDL___MIDL_itf_uc_0001_0213_0001(0);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationModeInstantMessage = 1;
  public final static int _uiaConversationModeAudio = 2;
  public final static int _uiaConversationModeVideo = 4;
  public final static int _uiaConversationModeFileTransfer = 8;
  public final static int _uiaConversationModeApplicationSharing = 16;
  public final static int _uiaConversationModeNone = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0213_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0213_0001 valueOf(int value) {
    switch(value) {
    case 1: return uiaConversationModeInstantMessage;
    case 2: return uiaConversationModeAudio;
    case 4: return uiaConversationModeVideo;
    case 8: return uiaConversationModeFileTransfer;
    case 16: return uiaConversationModeApplicationSharing;
    case 0: return uiaConversationModeNone;
    default: return new __MIDL___MIDL_itf_uc_0001_0213_0001(value);
    }
  }
}
