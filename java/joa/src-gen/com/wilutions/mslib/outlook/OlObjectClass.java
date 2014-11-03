/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlObjectClass.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlObjectClass {
  olApplication(0),
  olNamespace(1),
  olFolder(2),
  olRecipient(4),
  olAttachment(5),
  olAddressList(7),
  olAddressEntry(8),
  olFolders(15),
  olItems(16),
  olRecipients(17),
  olAttachments(18),
  olAddressLists(20),
  olAddressEntries(21),
  olAppointment(26),
  olMeetingRequest(53),
  olMeetingCancellation(54),
  olMeetingResponseNegative(55),
  olMeetingResponsePositive(56),
  olMeetingResponseTentative(57),
  olRecurrencePattern(28),
  olExceptions(29),
  olException(30),
  olAction(32),
  olActions(33),
  olExplorer(34),
  olInspector(35),
  olPages(36),
  olFormDescription(37),
  olUserProperties(38),
  olUserProperty(39),
  olContact(40),
  olDocument(41),
  olJournal(42),
  olMail(43),
  olNote(44),
  olPost(45),
  olReport(46),
  olRemote(47),
  olTask(48),
  olTaskRequest(49),
  olTaskRequestUpdate(50),
  olTaskRequestAccept(51),
  olTaskRequestDecline(52),
  olExplorers(60),
  olInspectors(61),
  olPanes(62),
  olOutlookBarPane(63),
  olOutlookBarStorage(64),
  olOutlookBarGroups(65),
  olOutlookBarGroup(66),
  olOutlookBarShortcuts(67),
  olOutlookBarShortcut(68),
  olDistributionList(69),
  olPropertyPageSite(70),
  olPropertyPages(71),
  olSyncObject(72),
  olSyncObjects(73),
  olSelection(74),
  olLink(75),
  olLinks(76),
  olSearch(77),
  olResults(78),
  olViews(79),
  olView(80),
  olItemProperties(98),
  olItemProperty(99),
  olReminders(100),
  olReminder(101),
  olConflict(102),
  olConflicts(103),
  olSharing(104),
  olAccount(105),
  olAccounts(106),
  olStore(107),
  olStores(108),
  olSelectNamesDialog(109),
  olExchangeUser(110),
  olExchangeDistributionList(111),
  olPropertyAccessor(112),
  olStorageItem(113),
  olRules(114),
  olRule(115),
  olRuleActions(116),
  olRuleAction(117),
  olMoveOrCopyRuleAction(118),
  olSendRuleAction(119),
  olTable(120),
  olRow(121),
  olAssignToCategoryRuleAction(122),
  olPlaySoundRuleAction(123),
  olMarkAsTaskRuleAction(124),
  olNewItemAlertRuleAction(125),
  olRuleConditions(126),
  olRuleCondition(127),
  olImportanceRuleCondition(128),
  olFormRegion(129),
  olCategoryRuleCondition(130),
  olFormNameRuleCondition(131),
  olFromRuleCondition(132),
  olSenderInAddressListRuleCondition(133),
  olTextRuleCondition(134),
  olAccountRuleCondition(135),
  olClassTableView(136),
  olClassIconView(137),
  olClassCardView(138),
  olClassCalendarView(139),
  olClassTimeLineView(140),
  olViewFields(141),
  olViewField(142),
  olOrderField(144),
  olOrderFields(145),
  olViewFont(146),
  olAutoFormatRule(147),
  olAutoFormatRules(148),
  olColumnFormat(149),
  olColumns(150),
  olCalendarSharing(151),
  olCategory(152),
  olCategories(153),
  olColumn(154),
  olClassNavigationPane(155),
  olNavigationModules(156),
  olNavigationModule(157),
  olMailModule(158),
  olCalendarModule(159),
  olContactsModule(160),
  olTasksModule(161),
  olJournalModule(162),
  olNotesModule(163),
  olNavigationGroups(164),
  olNavigationGroup(165),
  olNavigationFolders(166),
  olNavigationFolder(167),
  olClassBusinessCardView(168),
  olAttachmentSelection(169),
  olAddressRuleCondition(170),
  olUserDefinedProperty(171),
  olUserDefinedProperties(172),
  olFromRssFeedRuleCondition(173),
  olClassTimeZone(174),
  olClassTimeZones(175),
  olMobile(176),
  olSolutionsModule(177),
  olConversation(178),
  olSimpleItems(179),
  olOutspace(180),
  olMeetingForwardNotification(181),
  olConversationHeader(182),
  olClassPeopleView(183);

  public final int value;
  private OlObjectClass(int value) { this.value = value; }
  public static  OlObjectClass valueOf(int value) {
    switch(value) {
    case 0: return olApplication;
    case 1: return olNamespace;
    case 2: return olFolder;
    case 4: return olRecipient;
    case 5: return olAttachment;
    case 7: return olAddressList;
    case 8: return olAddressEntry;
    case 15: return olFolders;
    case 16: return olItems;
    case 17: return olRecipients;
    case 18: return olAttachments;
    case 20: return olAddressLists;
    case 21: return olAddressEntries;
    case 26: return olAppointment;
    case 53: return olMeetingRequest;
    case 54: return olMeetingCancellation;
    case 55: return olMeetingResponseNegative;
    case 56: return olMeetingResponsePositive;
    case 57: return olMeetingResponseTentative;
    case 28: return olRecurrencePattern;
    case 29: return olExceptions;
    case 30: return olException;
    case 32: return olAction;
    case 33: return olActions;
    case 34: return olExplorer;
    case 35: return olInspector;
    case 36: return olPages;
    case 37: return olFormDescription;
    case 38: return olUserProperties;
    case 39: return olUserProperty;
    case 40: return olContact;
    case 41: return olDocument;
    case 42: return olJournal;
    case 43: return olMail;
    case 44: return olNote;
    case 45: return olPost;
    case 46: return olReport;
    case 47: return olRemote;
    case 48: return olTask;
    case 49: return olTaskRequest;
    case 50: return olTaskRequestUpdate;
    case 51: return olTaskRequestAccept;
    case 52: return olTaskRequestDecline;
    case 60: return olExplorers;
    case 61: return olInspectors;
    case 62: return olPanes;
    case 63: return olOutlookBarPane;
    case 64: return olOutlookBarStorage;
    case 65: return olOutlookBarGroups;
    case 66: return olOutlookBarGroup;
    case 67: return olOutlookBarShortcuts;
    case 68: return olOutlookBarShortcut;
    case 69: return olDistributionList;
    case 70: return olPropertyPageSite;
    case 71: return olPropertyPages;
    case 72: return olSyncObject;
    case 73: return olSyncObjects;
    case 74: return olSelection;
    case 75: return olLink;
    case 76: return olLinks;
    case 77: return olSearch;
    case 78: return olResults;
    case 79: return olViews;
    case 80: return olView;
    case 98: return olItemProperties;
    case 99: return olItemProperty;
    case 100: return olReminders;
    case 101: return olReminder;
    case 102: return olConflict;
    case 103: return olConflicts;
    case 104: return olSharing;
    case 105: return olAccount;
    case 106: return olAccounts;
    case 107: return olStore;
    case 108: return olStores;
    case 109: return olSelectNamesDialog;
    case 110: return olExchangeUser;
    case 111: return olExchangeDistributionList;
    case 112: return olPropertyAccessor;
    case 113: return olStorageItem;
    case 114: return olRules;
    case 115: return olRule;
    case 116: return olRuleActions;
    case 117: return olRuleAction;
    case 118: return olMoveOrCopyRuleAction;
    case 119: return olSendRuleAction;
    case 120: return olTable;
    case 121: return olRow;
    case 122: return olAssignToCategoryRuleAction;
    case 123: return olPlaySoundRuleAction;
    case 124: return olMarkAsTaskRuleAction;
    case 125: return olNewItemAlertRuleAction;
    case 126: return olRuleConditions;
    case 127: return olRuleCondition;
    case 128: return olImportanceRuleCondition;
    case 129: return olFormRegion;
    case 130: return olCategoryRuleCondition;
    case 131: return olFormNameRuleCondition;
    case 132: return olFromRuleCondition;
    case 133: return olSenderInAddressListRuleCondition;
    case 134: return olTextRuleCondition;
    case 135: return olAccountRuleCondition;
    case 136: return olClassTableView;
    case 137: return olClassIconView;
    case 138: return olClassCardView;
    case 139: return olClassCalendarView;
    case 140: return olClassTimeLineView;
    case 141: return olViewFields;
    case 142: return olViewField;
    case 144: return olOrderField;
    case 145: return olOrderFields;
    case 146: return olViewFont;
    case 147: return olAutoFormatRule;
    case 148: return olAutoFormatRules;
    case 149: return olColumnFormat;
    case 150: return olColumns;
    case 151: return olCalendarSharing;
    case 152: return olCategory;
    case 153: return olCategories;
    case 154: return olColumn;
    case 155: return olClassNavigationPane;
    case 156: return olNavigationModules;
    case 157: return olNavigationModule;
    case 158: return olMailModule;
    case 159: return olCalendarModule;
    case 160: return olContactsModule;
    case 161: return olTasksModule;
    case 162: return olJournalModule;
    case 163: return olNotesModule;
    case 164: return olNavigationGroups;
    case 165: return olNavigationGroup;
    case 166: return olNavigationFolders;
    case 167: return olNavigationFolder;
    case 168: return olClassBusinessCardView;
    case 169: return olAttachmentSelection;
    case 170: return olAddressRuleCondition;
    case 171: return olUserDefinedProperty;
    case 172: return olUserDefinedProperties;
    case 173: return olFromRssFeedRuleCondition;
    case 174: return olClassTimeZone;
    case 175: return olClassTimeZones;
    case 176: return olMobile;
    case 177: return olSolutionsModule;
    case 178: return olConversation;
    case 179: return olSimpleItems;
    case 180: return olOutspace;
    case 181: return olMeetingForwardNotification;
    case 182: return olConversationHeader;
    case 183: return olClassPeopleView;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlObjectClass.class);
    }
  }
}
