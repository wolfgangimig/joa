/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PropertyClass.
 * Enumerates the property class encoded in various property IDs. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PropertyClass {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static PropertyClass ucPropertyClassContact = new PropertyClass(0);
  public final static PropertyClass ucPropertyClassGroup = new PropertyClass(65536);
  public final static PropertyClass ucPropertyClassOperation = new PropertyClass(131072);
  public final static PropertyClass ucPropertyClassUCClientAddtionalInfo = new PropertyClass(196608);
  public final static PropertyClass ucPropertyClassSearchProvider = new PropertyClass(262144);
  public final static PropertyClass ucPropertyClassOption = new PropertyClass(327680);
  public final static PropertyClass ucPropertyClassConferenceInfo = new PropertyClass(393216);
  public final static PropertyClass ucPropertyClassConferenceSetting = new PropertyClass(458752);
  public final static PropertyClass ucPropertyClassConversation = new PropertyClass(524288);
  public final static PropertyClass ucPropertyClassConversationStateChange = new PropertyClass(589824);
  public final static PropertyClass ucPropertyClassParticipant = new PropertyClass(655360);
  public final static PropertyClass ucPropertyClassModality = new PropertyClass(720896);
  public final static PropertyClass ucPropertyClassModalityStateChange = new PropertyClass(786432);
  public final static PropertyClass ucPropertyClassModalityAction = new PropertyClass(851968);
  public final static PropertyClass ucPropertyClassConversationWindow = new PropertyClass(917504);
  public final static PropertyClass ucPropertyClassRoom = new PropertyClass(983040);
  public final static PropertyClass ucPropertyClassContent = new PropertyClass(1048576);
  public final static PropertyClass ucPropertyClassVideoView = new PropertyClass(1114112);
  public final static PropertyClass ucPropertyClassClientSettings = new PropertyClass(1179648);
  public final static PropertyClass ucPropertyClassReserved1 = new PropertyClass(327680000);
  public final static PropertyClass ucPropertyClassReserved2 = new PropertyClass(327745536);
  public final static PropertyClass ucPropertyClassReserved3 = new PropertyClass(327811072);
  public final static PropertyClass ucPropertyClassReserved4 = new PropertyClass(327876608);

  // Integer constants for bitsets and switch statements
  public final static int _ucPropertyClassContact = 0;
  public final static int _ucPropertyClassGroup = 65536;
  public final static int _ucPropertyClassOperation = 131072;
  public final static int _ucPropertyClassUCClientAddtionalInfo = 196608;
  public final static int _ucPropertyClassSearchProvider = 262144;
  public final static int _ucPropertyClassOption = 327680;
  public final static int _ucPropertyClassConferenceInfo = 393216;
  public final static int _ucPropertyClassConferenceSetting = 458752;
  public final static int _ucPropertyClassConversation = 524288;
  public final static int _ucPropertyClassConversationStateChange = 589824;
  public final static int _ucPropertyClassParticipant = 655360;
  public final static int _ucPropertyClassModality = 720896;
  public final static int _ucPropertyClassModalityStateChange = 786432;
  public final static int _ucPropertyClassModalityAction = 851968;
  public final static int _ucPropertyClassConversationWindow = 917504;
  public final static int _ucPropertyClassRoom = 983040;
  public final static int _ucPropertyClassContent = 1048576;
  public final static int _ucPropertyClassVideoView = 1114112;
  public final static int _ucPropertyClassClientSettings = 1179648;
  public final static int _ucPropertyClassReserved1 = 327680000;
  public final static int _ucPropertyClassReserved2 = 327745536;
  public final static int _ucPropertyClassReserved3 = 327811072;
  public final static int _ucPropertyClassReserved4 = 327876608;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PropertyClass(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PropertyClass valueOf(int value) {
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
    default: return new PropertyClass(value);
    }
  }
}
