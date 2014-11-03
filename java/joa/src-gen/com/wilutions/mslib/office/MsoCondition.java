/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoCondition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoCondition {
  msoConditionFileTypeAllFiles(1),
  msoConditionFileTypeOfficeFiles(2),
  msoConditionFileTypeWordDocuments(3),
  msoConditionFileTypeExcelWorkbooks(4),
  msoConditionFileTypePowerPointPresentations(5),
  msoConditionFileTypeBinders(6),
  msoConditionFileTypeDatabases(7),
  msoConditionFileTypeTemplates(8),
  msoConditionIncludes(9),
  msoConditionIncludesPhrase(10),
  msoConditionBeginsWith(11),
  msoConditionEndsWith(12),
  msoConditionIncludesNearEachOther(13),
  msoConditionIsExactly(14),
  msoConditionIsNot(15),
  msoConditionYesterday(16),
  msoConditionToday(17),
  msoConditionTomorrow(18),
  msoConditionLastWeek(19),
  msoConditionThisWeek(20),
  msoConditionNextWeek(21),
  msoConditionLastMonth(22),
  msoConditionThisMonth(23),
  msoConditionNextMonth(24),
  msoConditionAnytime(25),
  msoConditionAnytimeBetween(26),
  msoConditionOn(27),
  msoConditionOnOrAfter(28),
  msoConditionOnOrBefore(29),
  msoConditionInTheNext(30),
  msoConditionInTheLast(31),
  msoConditionEquals(32),
  msoConditionDoesNotEqual(33),
  msoConditionAnyNumberBetween(34),
  msoConditionAtMost(35),
  msoConditionAtLeast(36),
  msoConditionMoreThan(37),
  msoConditionLessThan(38),
  msoConditionIsYes(39),
  msoConditionIsNo(40),
  msoConditionIncludesFormsOf(41),
  msoConditionFreeText(42),
  msoConditionFileTypeOutlookItems(43),
  msoConditionFileTypeMailItem(44),
  msoConditionFileTypeCalendarItem(45),
  msoConditionFileTypeContactItem(46),
  msoConditionFileTypeNoteItem(47),
  msoConditionFileTypeJournalItem(48),
  msoConditionFileTypeTaskItem(49),
  msoConditionFileTypePhotoDrawFiles(50),
  msoConditionFileTypeDataConnectionFiles(51),
  msoConditionFileTypePublisherFiles(52),
  msoConditionFileTypeProjectFiles(53),
  msoConditionFileTypeDocumentImagingFiles(54),
  msoConditionFileTypeVisioFiles(55),
  msoConditionFileTypeDesignerFiles(56),
  msoConditionFileTypeWebPages(57),
  msoConditionEqualsLow(58),
  msoConditionEqualsNormal(59),
  msoConditionEqualsHigh(60),
  msoConditionNotEqualToLow(61),
  msoConditionNotEqualToNormal(62),
  msoConditionNotEqualToHigh(63),
  msoConditionEqualsNotStarted(64),
  msoConditionEqualsInProgress(65),
  msoConditionEqualsCompleted(66),
  msoConditionEqualsWaitingForSomeoneElse(67),
  msoConditionEqualsDeferred(68),
  msoConditionNotEqualToNotStarted(69),
  msoConditionNotEqualToInProgress(70),
  msoConditionNotEqualToCompleted(71),
  msoConditionNotEqualToWaitingForSomeoneElse(72),
  msoConditionNotEqualToDeferred(73);

  public final int value;
  private MsoCondition(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoCondition.class);
    }
  }
}
