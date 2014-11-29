/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0213_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSubject = new __MIDL___MIDL_itf_uc_0001_0213_0002(1);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextPreviousConversation = new __MIDL___MIDL_itf_uc_0001_0213_0002(2);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextOutlookEntryId = new __MIDL___MIDL_itf_uc_0001_0213_0002(3);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextFilePathToTransfer = new __MIDL___MIDL_itf_uc_0001_0213_0002(4);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextFileIsShared = new __MIDL___MIDL_itf_uc_0001_0213_0002(5);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextFirstInstantMessage = new __MIDL___MIDL_itf_uc_0001_0213_0002(6);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSendFirstInstantMessageImmediately = new __MIDL___MIDL_itf_uc_0001_0213_0002(7);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextFileHistoryLink = new __MIDL___MIDL_itf_uc_0001_0213_0002(8);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextStartConferenceByCallingMeAt = new __MIDL___MIDL_itf_uc_0001_0213_0002(9);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSharedProcess = new __MIDL___MIDL_itf_uc_0001_0213_0002(10);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSharedWindow = new __MIDL___MIDL_itf_uc_0001_0213_0002(11);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSharedDesktop = new __MIDL___MIDL_itf_uc_0001_0213_0002(12);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextSharedMonitor = new __MIDL___MIDL_itf_uc_0001_0213_0002(13);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextDataObjectForFileTransfer = new __MIDL___MIDL_itf_uc_0001_0213_0002(14);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextApplicationId = new __MIDL___MIDL_itf_uc_0001_0213_0002(15);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextApplicationData = new __MIDL___MIDL_itf_uc_0001_0213_0002(16);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextHyperLink = new __MIDL___MIDL_itf_uc_0001_0213_0002(17);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextParentWindow = new __MIDL___MIDL_itf_uc_0001_0213_0002(18);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextMeetNow = new __MIDL___MIDL_itf_uc_0001_0213_0002(19);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextRemoteEndpointUri = new __MIDL___MIDL_itf_uc_0001_0213_0002(20);
  public final static __MIDL___MIDL_itf_uc_0001_0213_0002 uiaConversationContextMax = new __MIDL___MIDL_itf_uc_0001_0213_0002(21);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationContextSubject = 1;
  public final static int _uiaConversationContextPreviousConversation = 2;
  public final static int _uiaConversationContextOutlookEntryId = 3;
  public final static int _uiaConversationContextFilePathToTransfer = 4;
  public final static int _uiaConversationContextFileIsShared = 5;
  public final static int _uiaConversationContextFirstInstantMessage = 6;
  public final static int _uiaConversationContextSendFirstInstantMessageImmediately = 7;
  public final static int _uiaConversationContextFileHistoryLink = 8;
  public final static int _uiaConversationContextStartConferenceByCallingMeAt = 9;
  public final static int _uiaConversationContextSharedProcess = 10;
  public final static int _uiaConversationContextSharedWindow = 11;
  public final static int _uiaConversationContextSharedDesktop = 12;
  public final static int _uiaConversationContextSharedMonitor = 13;
  public final static int _uiaConversationContextDataObjectForFileTransfer = 14;
  public final static int _uiaConversationContextApplicationId = 15;
  public final static int _uiaConversationContextApplicationData = 16;
  public final static int _uiaConversationContextHyperLink = 17;
  public final static int _uiaConversationContextParentWindow = 18;
  public final static int _uiaConversationContextMeetNow = 19;
  public final static int _uiaConversationContextRemoteEndpointUri = 20;
  public final static int _uiaConversationContextMax = 21;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0213_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0213_0002 valueOf(int value) {
    switch(value) {
    case 1: return uiaConversationContextSubject;
    case 2: return uiaConversationContextPreviousConversation;
    case 3: return uiaConversationContextOutlookEntryId;
    case 4: return uiaConversationContextFilePathToTransfer;
    case 5: return uiaConversationContextFileIsShared;
    case 6: return uiaConversationContextFirstInstantMessage;
    case 7: return uiaConversationContextSendFirstInstantMessageImmediately;
    case 8: return uiaConversationContextFileHistoryLink;
    case 9: return uiaConversationContextStartConferenceByCallingMeAt;
    case 10: return uiaConversationContextSharedProcess;
    case 11: return uiaConversationContextSharedWindow;
    case 12: return uiaConversationContextSharedDesktop;
    case 13: return uiaConversationContextSharedMonitor;
    case 14: return uiaConversationContextDataObjectForFileTransfer;
    case 15: return uiaConversationContextApplicationId;
    case 16: return uiaConversationContextApplicationData;
    case 17: return uiaConversationContextHyperLink;
    case 18: return uiaConversationContextParentWindow;
    case 19: return uiaConversationContextMeetNow;
    case 20: return uiaConversationContextRemoteEndpointUri;
    case 21: return uiaConversationContextMax;
    default: return new __MIDL___MIDL_itf_uc_0001_0213_0002(value);
    }
  }
}
