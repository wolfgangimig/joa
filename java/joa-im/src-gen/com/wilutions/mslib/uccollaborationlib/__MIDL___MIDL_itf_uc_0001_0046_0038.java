/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0038.
 * Enumerates the past conversations types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0038 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsMissedConversations = new __MIDL___MIDL_itf_uc_0001_0046_0038(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsConversationHistory = new __MIDL___MIDL_itf_uc_0001_0046_0038(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsAudioCallLogs = new __MIDL___MIDL_itf_uc_0001_0046_0038(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsFollowUpConversations = new __MIDL___MIDL_itf_uc_0001_0046_0038(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsMissedAudioCalls = new __MIDL___MIDL_itf_uc_0001_0046_0038(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0038 ucPreviousConversationsTypeMax = new __MIDL___MIDL_itf_uc_0001_0046_0038(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationsMissedConversations = 0;
  public final static int _ucPreviousConversationsConversationHistory = 1;
  public final static int _ucPreviousConversationsAudioCallLogs = 2;
  public final static int _ucPreviousConversationsFollowUpConversations = 3;
  public final static int _ucPreviousConversationsMissedAudioCalls = 4;
  public final static int _ucPreviousConversationsTypeMax = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0038(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0038 valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsMissedConversations;
    case 1: return ucPreviousConversationsConversationHistory;
    case 2: return ucPreviousConversationsAudioCallLogs;
    case 3: return ucPreviousConversationsFollowUpConversations;
    case 4: return ucPreviousConversationsMissedAudioCalls;
    case 5: return ucPreviousConversationsTypeMax;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0038(value);
    }
  }
}
