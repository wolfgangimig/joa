/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0213_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0213_0002 {
  uiaConversationContextSubject(1),
  uiaConversationContextPreviousConversation(2),
  uiaConversationContextOutlookEntryId(3),
  uiaConversationContextFilePathToTransfer(4),
  uiaConversationContextFileIsShared(5),
  uiaConversationContextFirstInstantMessage(6),
  uiaConversationContextSendFirstInstantMessageImmediately(7),
  uiaConversationContextFileHistoryLink(8),
  uiaConversationContextStartConferenceByCallingMeAt(9),
  uiaConversationContextSharedProcess(10),
  uiaConversationContextSharedWindow(11),
  uiaConversationContextSharedDesktop(12),
  uiaConversationContextSharedMonitor(13),
  uiaConversationContextDataObjectForFileTransfer(14),
  uiaConversationContextApplicationId(15),
  uiaConversationContextApplicationData(16),
  uiaConversationContextHyperLink(17),
  uiaConversationContextParentWindow(18),
  uiaConversationContextMeetNow(19),
  uiaConversationContextRemoteEndpointUri(20),
  uiaConversationContextMax(21);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0213_0002(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0213_0002.class);
    }
  }
}
