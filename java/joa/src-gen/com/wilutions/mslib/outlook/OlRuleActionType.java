/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleActionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRuleActionType {
  olRuleActionUnknown(0),
  olRuleActionMoveToFolder(1),
  olRuleActionAssignToCategory(2),
  olRuleActionDelete(3),
  olRuleActionDeletePermanently(4),
  olRuleActionCopyToFolder(5),
  olRuleActionForward(6),
  olRuleActionForwardAsAttachment(7),
  olRuleActionRedirect(8),
  olRuleActionServerReply(9),
  olRuleActionTemplate(10),
  olRuleActionFlagForActionInDays(11),
  olRuleActionFlagColor(12),
  olRuleActionFlagClear(13),
  olRuleActionImportance(14),
  olRuleActionSensitivity(15),
  olRuleActionPrint(16),
  olRuleActionPlaySound(17),
  olRuleActionStartApplication(18),
  olRuleActionMarkRead(19),
  olRuleActionRunScript(20),
  olRuleActionStop(21),
  olRuleActionCustomAction(22),
  olRuleActionNewItemAlert(23),
  olRuleActionDesktopAlert(24),
  olRuleActionNotifyRead(25),
  olRuleActionNotifyDelivery(26),
  olRuleActionCcMessage(27),
  olRuleActionDefer(28),
  olRuleActionMarkAsTask(29),
  olRuleActionClearCategories(30);

  public final int value;
  private OlRuleActionType(int value) { this.value = value; }
  public static  OlRuleActionType valueOf(int value) {
    switch(value) {
    case 0: return olRuleActionUnknown;
    case 1: return olRuleActionMoveToFolder;
    case 2: return olRuleActionAssignToCategory;
    case 3: return olRuleActionDelete;
    case 4: return olRuleActionDeletePermanently;
    case 5: return olRuleActionCopyToFolder;
    case 6: return olRuleActionForward;
    case 7: return olRuleActionForwardAsAttachment;
    case 8: return olRuleActionRedirect;
    case 9: return olRuleActionServerReply;
    case 10: return olRuleActionTemplate;
    case 11: return olRuleActionFlagForActionInDays;
    case 12: return olRuleActionFlagColor;
    case 13: return olRuleActionFlagClear;
    case 14: return olRuleActionImportance;
    case 15: return olRuleActionSensitivity;
    case 16: return olRuleActionPrint;
    case 17: return olRuleActionPlaySound;
    case 18: return olRuleActionStartApplication;
    case 19: return olRuleActionMarkRead;
    case 20: return olRuleActionRunScript;
    case 21: return olRuleActionStop;
    case 22: return olRuleActionCustomAction;
    case 23: return olRuleActionNewItemAlert;
    case 24: return olRuleActionDesktopAlert;
    case 25: return olRuleActionNotifyRead;
    case 26: return olRuleActionNotifyDelivery;
    case 27: return olRuleActionCcMessage;
    case 28: return olRuleActionDefer;
    case 29: return olRuleActionMarkAsTask;
    case 30: return olRuleActionClearCategories;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRuleActionType.class);
    }
  }
}
