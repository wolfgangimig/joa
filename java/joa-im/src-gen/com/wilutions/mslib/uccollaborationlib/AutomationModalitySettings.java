/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AutomationModalitySettings.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AutomationModalitySettings {

  // Typed constants
  public final static AutomationModalitySettings uiaConversationContextSubject = new AutomationModalitySettings(1);
  public final static AutomationModalitySettings uiaConversationContextPreviousConversation = new AutomationModalitySettings(2);
  public final static AutomationModalitySettings uiaConversationContextOutlookEntryId = new AutomationModalitySettings(3);
  public final static AutomationModalitySettings uiaConversationContextFilePathToTransfer = new AutomationModalitySettings(4);
  public final static AutomationModalitySettings uiaConversationContextFileIsShared = new AutomationModalitySettings(5);
  public final static AutomationModalitySettings uiaConversationContextFirstInstantMessage = new AutomationModalitySettings(6);
  public final static AutomationModalitySettings uiaConversationContextSendFirstInstantMessageImmediately = new AutomationModalitySettings(7);
  public final static AutomationModalitySettings uiaConversationContextFileHistoryLink = new AutomationModalitySettings(8);
  public final static AutomationModalitySettings uiaConversationContextStartConferenceByCallingMeAt = new AutomationModalitySettings(9);
  public final static AutomationModalitySettings uiaConversationContextSharedProcess = new AutomationModalitySettings(10);
  public final static AutomationModalitySettings uiaConversationContextSharedWindow = new AutomationModalitySettings(11);
  public final static AutomationModalitySettings uiaConversationContextSharedDesktop = new AutomationModalitySettings(12);
  public final static AutomationModalitySettings uiaConversationContextSharedMonitor = new AutomationModalitySettings(13);
  public final static AutomationModalitySettings uiaConversationContextDataObjectForFileTransfer = new AutomationModalitySettings(14);
  public final static AutomationModalitySettings uiaConversationContextApplicationId = new AutomationModalitySettings(15);
  public final static AutomationModalitySettings uiaConversationContextApplicationData = new AutomationModalitySettings(16);
  public final static AutomationModalitySettings uiaConversationContextHyperLink = new AutomationModalitySettings(17);
  public final static AutomationModalitySettings uiaConversationContextParentWindow = new AutomationModalitySettings(18);
  public final static AutomationModalitySettings uiaConversationContextMeetNow = new AutomationModalitySettings(19);
  public final static AutomationModalitySettings uiaConversationContextRemoteEndpointUri = new AutomationModalitySettings(20);
  public final static AutomationModalitySettings uiaConversationContextMax = new AutomationModalitySettings(21);

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
  private AutomationModalitySettings(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AutomationModalitySettings valueOf(int value) {
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
    default: return new AutomationModalitySettings(value);
    }
  }
}
