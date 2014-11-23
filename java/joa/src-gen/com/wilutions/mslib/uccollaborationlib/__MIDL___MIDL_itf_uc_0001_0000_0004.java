/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0000_0004.
 * Enumerates the property class encoded in various property IDs. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0000_0004 {
  ucPropertyClassContact(0),
  ucPropertyClassGroup(65536),
  ucPropertyClassOperation(131072),
  ucPropertyClassUCClientAddtionalInfo(196608),
  ucPropertyClassSearchProvider(262144),
  ucPropertyClassOption(327680),
  ucPropertyClassConferenceInfo(393216),
  ucPropertyClassConferenceSetting(458752),
  ucPropertyClassConversation(524288),
  ucPropertyClassConversationStateChange(589824),
  ucPropertyClassParticipant(655360),
  ucPropertyClassModality(720896),
  ucPropertyClassModalityStateChange(786432),
  ucPropertyClassModalityAction(851968),
  ucPropertyClassConversationWindow(917504),
  ucPropertyClassRoom(983040),
  ucPropertyClassContent(1048576),
  ucPropertyClassVideoView(1114112),
  ucPropertyClassClientSettings(1179648),
  ucPropertyClassReserved1(327680000),
  ucPropertyClassReserved2(327745536),
  ucPropertyClassReserved3(327811072),
  ucPropertyClassReserved4(327876608);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0000_0004(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0000_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucPropertyClassContact;
    case 65536: return ucPropertyClassGroup;
    case 131072: return ucPropertyClassOperation;
    case 196608: return ucPropertyClassUCClientAddtionalInfo;
    case 262144: return ucPropertyClassSearchProvider;
    case 327680: return ucPropertyClassOption;
    case 393216: return ucPropertyClassConferenceInfo;
    case 458752: return ucPropertyClassConferenceSetting;
    case 524288: return ucPropertyClassConversation;
    case 589824: return ucPropertyClassConversationStateChange;
    case 655360: return ucPropertyClassParticipant;
    case 720896: return ucPropertyClassModality;
    case 786432: return ucPropertyClassModalityStateChange;
    case 851968: return ucPropertyClassModalityAction;
    case 917504: return ucPropertyClassConversationWindow;
    case 983040: return ucPropertyClassRoom;
    case 1048576: return ucPropertyClassContent;
    case 1114112: return ucPropertyClassVideoView;
    case 1179648: return ucPropertyClassClientSettings;
    case 327680000: return ucPropertyClassReserved1;
    case 327745536: return ucPropertyClassReserved2;
    case 327811072: return ucPropertyClassReserved3;
    case 327876608: return ucPropertyClassReserved4;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0000_0004.class);
    }
  }
}
