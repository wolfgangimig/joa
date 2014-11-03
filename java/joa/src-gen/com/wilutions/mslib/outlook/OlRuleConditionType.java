/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleConditionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRuleConditionType {
  olConditionUnknown(0),
  olConditionFrom(1),
  olConditionSubject(2),
  olConditionAccount(3),
  olConditionOnlyToMe(4),
  olConditionTo(5),
  olConditionImportance(6),
  olConditionSensitivity(7),
  olConditionFlaggedForAction(8),
  olConditionCc(9),
  olConditionToOrCc(10),
  olConditionNotTo(11),
  olConditionSentTo(12),
  olConditionBody(13),
  olConditionBodyOrSubject(14),
  olConditionMessageHeader(15),
  olConditionRecipientAddress(16),
  olConditionSenderAddress(17),
  olConditionCategory(18),
  olConditionOOF(19),
  olConditionHasAttachment(20),
  olConditionSizeRange(21),
  olConditionDateRange(22),
  olConditionFormName(23),
  olConditionProperty(24),
  olConditionSenderInAddressBook(25),
  olConditionMeetingInviteOrUpdate(26),
  olConditionLocalMachineOnly(27),
  olConditionOtherMachine(28),
  olConditionAnyCategory(29),
  olConditionFromRssFeed(30),
  olConditionFromAnyRssFeed(31);

  public final int value;
  private OlRuleConditionType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRuleConditionType.class);
    }
  }
}
