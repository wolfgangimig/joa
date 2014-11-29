/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCondition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoCondition {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoCondition msoConditionFileTypeAllFiles = new MsoCondition(1);
  public final static MsoCondition msoConditionFileTypeOfficeFiles = new MsoCondition(2);
  public final static MsoCondition msoConditionFileTypeWordDocuments = new MsoCondition(3);
  public final static MsoCondition msoConditionFileTypeExcelWorkbooks = new MsoCondition(4);
  public final static MsoCondition msoConditionFileTypePowerPointPresentations = new MsoCondition(5);
  public final static MsoCondition msoConditionFileTypeBinders = new MsoCondition(6);
  public final static MsoCondition msoConditionFileTypeDatabases = new MsoCondition(7);
  public final static MsoCondition msoConditionFileTypeTemplates = new MsoCondition(8);
  public final static MsoCondition msoConditionIncludes = new MsoCondition(9);
  public final static MsoCondition msoConditionIncludesPhrase = new MsoCondition(10);
  public final static MsoCondition msoConditionBeginsWith = new MsoCondition(11);
  public final static MsoCondition msoConditionEndsWith = new MsoCondition(12);
  public final static MsoCondition msoConditionIncludesNearEachOther = new MsoCondition(13);
  public final static MsoCondition msoConditionIsExactly = new MsoCondition(14);
  public final static MsoCondition msoConditionIsNot = new MsoCondition(15);
  public final static MsoCondition msoConditionYesterday = new MsoCondition(16);
  public final static MsoCondition msoConditionToday = new MsoCondition(17);
  public final static MsoCondition msoConditionTomorrow = new MsoCondition(18);
  public final static MsoCondition msoConditionLastWeek = new MsoCondition(19);
  public final static MsoCondition msoConditionThisWeek = new MsoCondition(20);
  public final static MsoCondition msoConditionNextWeek = new MsoCondition(21);
  public final static MsoCondition msoConditionLastMonth = new MsoCondition(22);
  public final static MsoCondition msoConditionThisMonth = new MsoCondition(23);
  public final static MsoCondition msoConditionNextMonth = new MsoCondition(24);
  public final static MsoCondition msoConditionAnytime = new MsoCondition(25);
  public final static MsoCondition msoConditionAnytimeBetween = new MsoCondition(26);
  public final static MsoCondition msoConditionOn = new MsoCondition(27);
  public final static MsoCondition msoConditionOnOrAfter = new MsoCondition(28);
  public final static MsoCondition msoConditionOnOrBefore = new MsoCondition(29);
  public final static MsoCondition msoConditionInTheNext = new MsoCondition(30);
  public final static MsoCondition msoConditionInTheLast = new MsoCondition(31);
  public final static MsoCondition msoConditionEquals = new MsoCondition(32);
  public final static MsoCondition msoConditionDoesNotEqual = new MsoCondition(33);
  public final static MsoCondition msoConditionAnyNumberBetween = new MsoCondition(34);
  public final static MsoCondition msoConditionAtMost = new MsoCondition(35);
  public final static MsoCondition msoConditionAtLeast = new MsoCondition(36);
  public final static MsoCondition msoConditionMoreThan = new MsoCondition(37);
  public final static MsoCondition msoConditionLessThan = new MsoCondition(38);
  public final static MsoCondition msoConditionIsYes = new MsoCondition(39);
  public final static MsoCondition msoConditionIsNo = new MsoCondition(40);
  public final static MsoCondition msoConditionIncludesFormsOf = new MsoCondition(41);
  public final static MsoCondition msoConditionFreeText = new MsoCondition(42);
  public final static MsoCondition msoConditionFileTypeOutlookItems = new MsoCondition(43);
  public final static MsoCondition msoConditionFileTypeMailItem = new MsoCondition(44);
  public final static MsoCondition msoConditionFileTypeCalendarItem = new MsoCondition(45);
  public final static MsoCondition msoConditionFileTypeContactItem = new MsoCondition(46);
  public final static MsoCondition msoConditionFileTypeNoteItem = new MsoCondition(47);
  public final static MsoCondition msoConditionFileTypeJournalItem = new MsoCondition(48);
  public final static MsoCondition msoConditionFileTypeTaskItem = new MsoCondition(49);
  public final static MsoCondition msoConditionFileTypePhotoDrawFiles = new MsoCondition(50);
  public final static MsoCondition msoConditionFileTypeDataConnectionFiles = new MsoCondition(51);
  public final static MsoCondition msoConditionFileTypePublisherFiles = new MsoCondition(52);
  public final static MsoCondition msoConditionFileTypeProjectFiles = new MsoCondition(53);
  public final static MsoCondition msoConditionFileTypeDocumentImagingFiles = new MsoCondition(54);
  public final static MsoCondition msoConditionFileTypeVisioFiles = new MsoCondition(55);
  public final static MsoCondition msoConditionFileTypeDesignerFiles = new MsoCondition(56);
  public final static MsoCondition msoConditionFileTypeWebPages = new MsoCondition(57);
  public final static MsoCondition msoConditionEqualsLow = new MsoCondition(58);
  public final static MsoCondition msoConditionEqualsNormal = new MsoCondition(59);
  public final static MsoCondition msoConditionEqualsHigh = new MsoCondition(60);
  public final static MsoCondition msoConditionNotEqualToLow = new MsoCondition(61);
  public final static MsoCondition msoConditionNotEqualToNormal = new MsoCondition(62);
  public final static MsoCondition msoConditionNotEqualToHigh = new MsoCondition(63);
  public final static MsoCondition msoConditionEqualsNotStarted = new MsoCondition(64);
  public final static MsoCondition msoConditionEqualsInProgress = new MsoCondition(65);
  public final static MsoCondition msoConditionEqualsCompleted = new MsoCondition(66);
  public final static MsoCondition msoConditionEqualsWaitingForSomeoneElse = new MsoCondition(67);
  public final static MsoCondition msoConditionEqualsDeferred = new MsoCondition(68);
  public final static MsoCondition msoConditionNotEqualToNotStarted = new MsoCondition(69);
  public final static MsoCondition msoConditionNotEqualToInProgress = new MsoCondition(70);
  public final static MsoCondition msoConditionNotEqualToCompleted = new MsoCondition(71);
  public final static MsoCondition msoConditionNotEqualToWaitingForSomeoneElse = new MsoCondition(72);
  public final static MsoCondition msoConditionNotEqualToDeferred = new MsoCondition(73);

  // Integer constants for bitsets and switch statements
  public final static int _msoConditionFileTypeAllFiles = 1;
  public final static int _msoConditionFileTypeOfficeFiles = 2;
  public final static int _msoConditionFileTypeWordDocuments = 3;
  public final static int _msoConditionFileTypeExcelWorkbooks = 4;
  public final static int _msoConditionFileTypePowerPointPresentations = 5;
  public final static int _msoConditionFileTypeBinders = 6;
  public final static int _msoConditionFileTypeDatabases = 7;
  public final static int _msoConditionFileTypeTemplates = 8;
  public final static int _msoConditionIncludes = 9;
  public final static int _msoConditionIncludesPhrase = 10;
  public final static int _msoConditionBeginsWith = 11;
  public final static int _msoConditionEndsWith = 12;
  public final static int _msoConditionIncludesNearEachOther = 13;
  public final static int _msoConditionIsExactly = 14;
  public final static int _msoConditionIsNot = 15;
  public final static int _msoConditionYesterday = 16;
  public final static int _msoConditionToday = 17;
  public final static int _msoConditionTomorrow = 18;
  public final static int _msoConditionLastWeek = 19;
  public final static int _msoConditionThisWeek = 20;
  public final static int _msoConditionNextWeek = 21;
  public final static int _msoConditionLastMonth = 22;
  public final static int _msoConditionThisMonth = 23;
  public final static int _msoConditionNextMonth = 24;
  public final static int _msoConditionAnytime = 25;
  public final static int _msoConditionAnytimeBetween = 26;
  public final static int _msoConditionOn = 27;
  public final static int _msoConditionOnOrAfter = 28;
  public final static int _msoConditionOnOrBefore = 29;
  public final static int _msoConditionInTheNext = 30;
  public final static int _msoConditionInTheLast = 31;
  public final static int _msoConditionEquals = 32;
  public final static int _msoConditionDoesNotEqual = 33;
  public final static int _msoConditionAnyNumberBetween = 34;
  public final static int _msoConditionAtMost = 35;
  public final static int _msoConditionAtLeast = 36;
  public final static int _msoConditionMoreThan = 37;
  public final static int _msoConditionLessThan = 38;
  public final static int _msoConditionIsYes = 39;
  public final static int _msoConditionIsNo = 40;
  public final static int _msoConditionIncludesFormsOf = 41;
  public final static int _msoConditionFreeText = 42;
  public final static int _msoConditionFileTypeOutlookItems = 43;
  public final static int _msoConditionFileTypeMailItem = 44;
  public final static int _msoConditionFileTypeCalendarItem = 45;
  public final static int _msoConditionFileTypeContactItem = 46;
  public final static int _msoConditionFileTypeNoteItem = 47;
  public final static int _msoConditionFileTypeJournalItem = 48;
  public final static int _msoConditionFileTypeTaskItem = 49;
  public final static int _msoConditionFileTypePhotoDrawFiles = 50;
  public final static int _msoConditionFileTypeDataConnectionFiles = 51;
  public final static int _msoConditionFileTypePublisherFiles = 52;
  public final static int _msoConditionFileTypeProjectFiles = 53;
  public final static int _msoConditionFileTypeDocumentImagingFiles = 54;
  public final static int _msoConditionFileTypeVisioFiles = 55;
  public final static int _msoConditionFileTypeDesignerFiles = 56;
  public final static int _msoConditionFileTypeWebPages = 57;
  public final static int _msoConditionEqualsLow = 58;
  public final static int _msoConditionEqualsNormal = 59;
  public final static int _msoConditionEqualsHigh = 60;
  public final static int _msoConditionNotEqualToLow = 61;
  public final static int _msoConditionNotEqualToNormal = 62;
  public final static int _msoConditionNotEqualToHigh = 63;
  public final static int _msoConditionEqualsNotStarted = 64;
  public final static int _msoConditionEqualsInProgress = 65;
  public final static int _msoConditionEqualsCompleted = 66;
  public final static int _msoConditionEqualsWaitingForSomeoneElse = 67;
  public final static int _msoConditionEqualsDeferred = 68;
  public final static int _msoConditionNotEqualToNotStarted = 69;
  public final static int _msoConditionNotEqualToInProgress = 70;
  public final static int _msoConditionNotEqualToCompleted = 71;
  public final static int _msoConditionNotEqualToWaitingForSomeoneElse = 72;
  public final static int _msoConditionNotEqualToDeferred = 73;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoCondition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoCondition valueOf(int value) {
    switch(value) {
    case 1: return msoConditionFileTypeAllFiles;
    case 2: return msoConditionFileTypeOfficeFiles;
    case 3: return msoConditionFileTypeWordDocuments;
    case 4: return msoConditionFileTypeExcelWorkbooks;
    case 5: return msoConditionFileTypePowerPointPresentations;
    case 6: return msoConditionFileTypeBinders;
    case 7: return msoConditionFileTypeDatabases;
    case 8: return msoConditionFileTypeTemplates;
    case 9: return msoConditionIncludes;
    case 10: return msoConditionIncludesPhrase;
    case 11: return msoConditionBeginsWith;
    case 12: return msoConditionEndsWith;
    case 13: return msoConditionIncludesNearEachOther;
    case 14: return msoConditionIsExactly;
    case 15: return msoConditionIsNot;
    case 16: return msoConditionYesterday;
    case 17: return msoConditionToday;
    case 18: return msoConditionTomorrow;
    case 19: return msoConditionLastWeek;
    case 20: return msoConditionThisWeek;
    case 21: return msoConditionNextWeek;
    case 22: return msoConditionLastMonth;
    case 23: return msoConditionThisMonth;
    case 24: return msoConditionNextMonth;
    case 25: return msoConditionAnytime;
    case 26: return msoConditionAnytimeBetween;
    case 27: return msoConditionOn;
    case 28: return msoConditionOnOrAfter;
    case 29: return msoConditionOnOrBefore;
    case 30: return msoConditionInTheNext;
    case 31: return msoConditionInTheLast;
    case 32: return msoConditionEquals;
    case 33: return msoConditionDoesNotEqual;
    case 34: return msoConditionAnyNumberBetween;
    case 35: return msoConditionAtMost;
    case 36: return msoConditionAtLeast;
    case 37: return msoConditionMoreThan;
    case 38: return msoConditionLessThan;
    case 39: return msoConditionIsYes;
    case 40: return msoConditionIsNo;
    case 41: return msoConditionIncludesFormsOf;
    case 42: return msoConditionFreeText;
    case 43: return msoConditionFileTypeOutlookItems;
    case 44: return msoConditionFileTypeMailItem;
    case 45: return msoConditionFileTypeCalendarItem;
    case 46: return msoConditionFileTypeContactItem;
    case 47: return msoConditionFileTypeNoteItem;
    case 48: return msoConditionFileTypeJournalItem;
    case 49: return msoConditionFileTypeTaskItem;
    case 50: return msoConditionFileTypePhotoDrawFiles;
    case 51: return msoConditionFileTypeDataConnectionFiles;
    case 52: return msoConditionFileTypePublisherFiles;
    case 53: return msoConditionFileTypeProjectFiles;
    case 54: return msoConditionFileTypeDocumentImagingFiles;
    case 55: return msoConditionFileTypeVisioFiles;
    case 56: return msoConditionFileTypeDesignerFiles;
    case 57: return msoConditionFileTypeWebPages;
    case 58: return msoConditionEqualsLow;
    case 59: return msoConditionEqualsNormal;
    case 60: return msoConditionEqualsHigh;
    case 61: return msoConditionNotEqualToLow;
    case 62: return msoConditionNotEqualToNormal;
    case 63: return msoConditionNotEqualToHigh;
    case 64: return msoConditionEqualsNotStarted;
    case 65: return msoConditionEqualsInProgress;
    case 66: return msoConditionEqualsCompleted;
    case 67: return msoConditionEqualsWaitingForSomeoneElse;
    case 68: return msoConditionEqualsDeferred;
    case 69: return msoConditionNotEqualToNotStarted;
    case 70: return msoConditionNotEqualToInProgress;
    case 71: return msoConditionNotEqualToCompleted;
    case 72: return msoConditionNotEqualToWaitingForSomeoneElse;
    case 73: return msoConditionNotEqualToDeferred;
    default: return new MsoCondition(value);
    }
  }
}
