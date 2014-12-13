/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleConditionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRuleConditionType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlRuleConditionType olConditionUnknown = new OlRuleConditionType(0);
  public final static OlRuleConditionType olConditionFrom = new OlRuleConditionType(1);
  public final static OlRuleConditionType olConditionSubject = new OlRuleConditionType(2);
  public final static OlRuleConditionType olConditionAccount = new OlRuleConditionType(3);
  public final static OlRuleConditionType olConditionOnlyToMe = new OlRuleConditionType(4);
  public final static OlRuleConditionType olConditionTo = new OlRuleConditionType(5);
  public final static OlRuleConditionType olConditionImportance = new OlRuleConditionType(6);
  public final static OlRuleConditionType olConditionSensitivity = new OlRuleConditionType(7);
  public final static OlRuleConditionType olConditionFlaggedForAction = new OlRuleConditionType(8);
  public final static OlRuleConditionType olConditionCc = new OlRuleConditionType(9);
  public final static OlRuleConditionType olConditionToOrCc = new OlRuleConditionType(10);
  public final static OlRuleConditionType olConditionNotTo = new OlRuleConditionType(11);
  public final static OlRuleConditionType olConditionSentTo = new OlRuleConditionType(12);
  public final static OlRuleConditionType olConditionBody = new OlRuleConditionType(13);
  public final static OlRuleConditionType olConditionBodyOrSubject = new OlRuleConditionType(14);
  public final static OlRuleConditionType olConditionMessageHeader = new OlRuleConditionType(15);
  public final static OlRuleConditionType olConditionRecipientAddress = new OlRuleConditionType(16);
  public final static OlRuleConditionType olConditionSenderAddress = new OlRuleConditionType(17);
  public final static OlRuleConditionType olConditionCategory = new OlRuleConditionType(18);
  public final static OlRuleConditionType olConditionOOF = new OlRuleConditionType(19);
  public final static OlRuleConditionType olConditionHasAttachment = new OlRuleConditionType(20);
  public final static OlRuleConditionType olConditionSizeRange = new OlRuleConditionType(21);
  public final static OlRuleConditionType olConditionDateRange = new OlRuleConditionType(22);
  public final static OlRuleConditionType olConditionFormName = new OlRuleConditionType(23);
  public final static OlRuleConditionType olConditionProperty = new OlRuleConditionType(24);
  public final static OlRuleConditionType olConditionSenderInAddressBook = new OlRuleConditionType(25);
  public final static OlRuleConditionType olConditionMeetingInviteOrUpdate = new OlRuleConditionType(26);
  public final static OlRuleConditionType olConditionLocalMachineOnly = new OlRuleConditionType(27);
  public final static OlRuleConditionType olConditionOtherMachine = new OlRuleConditionType(28);
  public final static OlRuleConditionType olConditionAnyCategory = new OlRuleConditionType(29);
  public final static OlRuleConditionType olConditionFromRssFeed = new OlRuleConditionType(30);
  public final static OlRuleConditionType olConditionFromAnyRssFeed = new OlRuleConditionType(31);

  // Integer constants for bitsets and switch statements
  public final static int _olConditionUnknown = 0;
  public final static int _olConditionFrom = 1;
  public final static int _olConditionSubject = 2;
  public final static int _olConditionAccount = 3;
  public final static int _olConditionOnlyToMe = 4;
  public final static int _olConditionTo = 5;
  public final static int _olConditionImportance = 6;
  public final static int _olConditionSensitivity = 7;
  public final static int _olConditionFlaggedForAction = 8;
  public final static int _olConditionCc = 9;
  public final static int _olConditionToOrCc = 10;
  public final static int _olConditionNotTo = 11;
  public final static int _olConditionSentTo = 12;
  public final static int _olConditionBody = 13;
  public final static int _olConditionBodyOrSubject = 14;
  public final static int _olConditionMessageHeader = 15;
  public final static int _olConditionRecipientAddress = 16;
  public final static int _olConditionSenderAddress = 17;
  public final static int _olConditionCategory = 18;
  public final static int _olConditionOOF = 19;
  public final static int _olConditionHasAttachment = 20;
  public final static int _olConditionSizeRange = 21;
  public final static int _olConditionDateRange = 22;
  public final static int _olConditionFormName = 23;
  public final static int _olConditionProperty = 24;
  public final static int _olConditionSenderInAddressBook = 25;
  public final static int _olConditionMeetingInviteOrUpdate = 26;
  public final static int _olConditionLocalMachineOnly = 27;
  public final static int _olConditionOtherMachine = 28;
  public final static int _olConditionAnyCategory = 29;
  public final static int _olConditionFromRssFeed = 30;
  public final static int _olConditionFromAnyRssFeed = 31;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRuleConditionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRuleConditionType valueOf(int value) {
    switch(value) {
    case 0: return olConditionUnknown;
    case 1: return olConditionFrom;
    case 2: return olConditionSubject;
    case 3: return olConditionAccount;
    case 4: return olConditionOnlyToMe;
    case 5: return olConditionTo;
    case 6: return olConditionImportance;
    case 7: return olConditionSensitivity;
    case 8: return olConditionFlaggedForAction;
    case 9: return olConditionCc;
    case 10: return olConditionToOrCc;
    case 11: return olConditionNotTo;
    case 12: return olConditionSentTo;
    case 13: return olConditionBody;
    case 14: return olConditionBodyOrSubject;
    case 15: return olConditionMessageHeader;
    case 16: return olConditionRecipientAddress;
    case 17: return olConditionSenderAddress;
    case 18: return olConditionCategory;
    case 19: return olConditionOOF;
    case 20: return olConditionHasAttachment;
    case 21: return olConditionSizeRange;
    case 22: return olConditionDateRange;
    case 23: return olConditionFormName;
    case 24: return olConditionProperty;
    case 25: return olConditionSenderInAddressBook;
    case 26: return olConditionMeetingInviteOrUpdate;
    case 27: return olConditionLocalMachineOnly;
    case 28: return olConditionOtherMachine;
    case 29: return olConditionAnyCategory;
    case 30: return olConditionFromRssFeed;
    case 31: return olConditionFromAnyRssFeed;
    default: return new OlRuleConditionType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 18: return "olConditionCategory";
    case 8: return "olConditionFlaggedForAction";
    case 10: return "olConditionToOrCc";
    case 0: return "olConditionUnknown";
    case 28: return "olConditionOtherMachine";
    case 1: return "olConditionFrom";
    case 2: return "olConditionSubject";
    case 3: return "olConditionAccount";
    case 4: return "olConditionOnlyToMe";
    case 5: return "olConditionTo";
    case 6: return "olConditionImportance";
    case 7: return "olConditionSensitivity";
    case 20: return "olConditionHasAttachment";
    case 9: return "olConditionCc";
    case 11: return "olConditionNotTo";
    case 12: return "olConditionSentTo";
    case 13: return "olConditionBody";
    case 14: return "olConditionBodyOrSubject";
    case 15: return "olConditionMessageHeader";
    case 16: return "olConditionRecipientAddress";
    case 17: return "olConditionSenderAddress";
    case 19: return "olConditionOOF";
    case 21: return "olConditionSizeRange";
    case 22: return "olConditionDateRange";
    case 23: return "olConditionFormName";
    case 24: return "olConditionProperty";
    case 25: return "olConditionSenderInAddressBook";
    case 26: return "olConditionMeetingInviteOrUpdate";
    case 27: return "olConditionLocalMachineOnly";
    case 29: return "olConditionAnyCategory";
    case 30: return "olConditionFromRssFeed";
    case 31: return "olConditionFromAnyRssFeed";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 18) != 0) sbuf.append("|olConditionCategory");
      if ((value & 8) != 0) sbuf.append("|olConditionFlaggedForAction");
      if ((value & 10) != 0) sbuf.append("|olConditionToOrCc");
      if ((value & 0) != 0) sbuf.append("|olConditionUnknown");
      if ((value & 28) != 0) sbuf.append("|olConditionOtherMachine");
      if ((value & 1) != 0) sbuf.append("|olConditionFrom");
      if ((value & 2) != 0) sbuf.append("|olConditionSubject");
      if ((value & 3) != 0) sbuf.append("|olConditionAccount");
      if ((value & 4) != 0) sbuf.append("|olConditionOnlyToMe");
      if ((value & 5) != 0) sbuf.append("|olConditionTo");
      if ((value & 6) != 0) sbuf.append("|olConditionImportance");
      if ((value & 7) != 0) sbuf.append("|olConditionSensitivity");
      if ((value & 20) != 0) sbuf.append("|olConditionHasAttachment");
      if ((value & 9) != 0) sbuf.append("|olConditionCc");
      if ((value & 11) != 0) sbuf.append("|olConditionNotTo");
      if ((value & 12) != 0) sbuf.append("|olConditionSentTo");
      if ((value & 13) != 0) sbuf.append("|olConditionBody");
      if ((value & 14) != 0) sbuf.append("|olConditionBodyOrSubject");
      if ((value & 15) != 0) sbuf.append("|olConditionMessageHeader");
      if ((value & 16) != 0) sbuf.append("|olConditionRecipientAddress");
      if ((value & 17) != 0) sbuf.append("|olConditionSenderAddress");
      if ((value & 19) != 0) sbuf.append("|olConditionOOF");
      if ((value & 21) != 0) sbuf.append("|olConditionSizeRange");
      if ((value & 22) != 0) sbuf.append("|olConditionDateRange");
      if ((value & 23) != 0) sbuf.append("|olConditionFormName");
      if ((value & 24) != 0) sbuf.append("|olConditionProperty");
      if ((value & 25) != 0) sbuf.append("|olConditionSenderInAddressBook");
      if ((value & 26) != 0) sbuf.append("|olConditionMeetingInviteOrUpdate");
      if ((value & 27) != 0) sbuf.append("|olConditionLocalMachineOnly");
      if ((value & 29) != 0) sbuf.append("|olConditionAnyCategory");
      if ((value & 30) != 0) sbuf.append("|olConditionFromRssFeed");
      if ((value & 31) != 0) sbuf.append("|olConditionFromAnyRssFeed");
      return sbuf.toString();
      }
    }
  }
}
