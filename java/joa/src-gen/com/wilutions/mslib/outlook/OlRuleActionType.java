/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRuleActionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRuleActionType {

  // Typed constants
  public final static OlRuleActionType olRuleActionUnknown = new OlRuleActionType(0);
  public final static OlRuleActionType olRuleActionMoveToFolder = new OlRuleActionType(1);
  public final static OlRuleActionType olRuleActionAssignToCategory = new OlRuleActionType(2);
  public final static OlRuleActionType olRuleActionDelete = new OlRuleActionType(3);
  public final static OlRuleActionType olRuleActionDeletePermanently = new OlRuleActionType(4);
  public final static OlRuleActionType olRuleActionCopyToFolder = new OlRuleActionType(5);
  public final static OlRuleActionType olRuleActionForward = new OlRuleActionType(6);
  public final static OlRuleActionType olRuleActionForwardAsAttachment = new OlRuleActionType(7);
  public final static OlRuleActionType olRuleActionRedirect = new OlRuleActionType(8);
  public final static OlRuleActionType olRuleActionServerReply = new OlRuleActionType(9);
  public final static OlRuleActionType olRuleActionTemplate = new OlRuleActionType(10);
  public final static OlRuleActionType olRuleActionFlagForActionInDays = new OlRuleActionType(11);
  public final static OlRuleActionType olRuleActionFlagColor = new OlRuleActionType(12);
  public final static OlRuleActionType olRuleActionFlagClear = new OlRuleActionType(13);
  public final static OlRuleActionType olRuleActionImportance = new OlRuleActionType(14);
  public final static OlRuleActionType olRuleActionSensitivity = new OlRuleActionType(15);
  public final static OlRuleActionType olRuleActionPrint = new OlRuleActionType(16);
  public final static OlRuleActionType olRuleActionPlaySound = new OlRuleActionType(17);
  public final static OlRuleActionType olRuleActionStartApplication = new OlRuleActionType(18);
  public final static OlRuleActionType olRuleActionMarkRead = new OlRuleActionType(19);
  public final static OlRuleActionType olRuleActionRunScript = new OlRuleActionType(20);
  public final static OlRuleActionType olRuleActionStop = new OlRuleActionType(21);
  public final static OlRuleActionType olRuleActionCustomAction = new OlRuleActionType(22);
  public final static OlRuleActionType olRuleActionNewItemAlert = new OlRuleActionType(23);
  public final static OlRuleActionType olRuleActionDesktopAlert = new OlRuleActionType(24);
  public final static OlRuleActionType olRuleActionNotifyRead = new OlRuleActionType(25);
  public final static OlRuleActionType olRuleActionNotifyDelivery = new OlRuleActionType(26);
  public final static OlRuleActionType olRuleActionCcMessage = new OlRuleActionType(27);
  public final static OlRuleActionType olRuleActionDefer = new OlRuleActionType(28);
  public final static OlRuleActionType olRuleActionMarkAsTask = new OlRuleActionType(29);
  public final static OlRuleActionType olRuleActionClearCategories = new OlRuleActionType(30);

  // Integer constants for bitsets and switch statements
  public final static int _olRuleActionUnknown = 0;
  public final static int _olRuleActionMoveToFolder = 1;
  public final static int _olRuleActionAssignToCategory = 2;
  public final static int _olRuleActionDelete = 3;
  public final static int _olRuleActionDeletePermanently = 4;
  public final static int _olRuleActionCopyToFolder = 5;
  public final static int _olRuleActionForward = 6;
  public final static int _olRuleActionForwardAsAttachment = 7;
  public final static int _olRuleActionRedirect = 8;
  public final static int _olRuleActionServerReply = 9;
  public final static int _olRuleActionTemplate = 10;
  public final static int _olRuleActionFlagForActionInDays = 11;
  public final static int _olRuleActionFlagColor = 12;
  public final static int _olRuleActionFlagClear = 13;
  public final static int _olRuleActionImportance = 14;
  public final static int _olRuleActionSensitivity = 15;
  public final static int _olRuleActionPrint = 16;
  public final static int _olRuleActionPlaySound = 17;
  public final static int _olRuleActionStartApplication = 18;
  public final static int _olRuleActionMarkRead = 19;
  public final static int _olRuleActionRunScript = 20;
  public final static int _olRuleActionStop = 21;
  public final static int _olRuleActionCustomAction = 22;
  public final static int _olRuleActionNewItemAlert = 23;
  public final static int _olRuleActionDesktopAlert = 24;
  public final static int _olRuleActionNotifyRead = 25;
  public final static int _olRuleActionNotifyDelivery = 26;
  public final static int _olRuleActionCcMessage = 27;
  public final static int _olRuleActionDefer = 28;
  public final static int _olRuleActionMarkAsTask = 29;
  public final static int _olRuleActionClearCategories = 30;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRuleActionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlRuleActionType(value);
    }
  }
}
