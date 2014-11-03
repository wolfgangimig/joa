/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFileType {
  msoFileTypeAllFiles(1),
  msoFileTypeOfficeFiles(2),
  msoFileTypeWordDocuments(3),
  msoFileTypeExcelWorkbooks(4),
  msoFileTypePowerPointPresentations(5),
  msoFileTypeBinders(6),
  msoFileTypeDatabases(7),
  msoFileTypeTemplates(8),
  msoFileTypeOutlookItems(9),
  msoFileTypeMailItem(10),
  msoFileTypeCalendarItem(11),
  msoFileTypeContactItem(12),
  msoFileTypeNoteItem(13),
  msoFileTypeJournalItem(14),
  msoFileTypeTaskItem(15),
  msoFileTypePhotoDrawFiles(16),
  msoFileTypeDataConnectionFiles(17),
  msoFileTypePublisherFiles(18),
  msoFileTypeProjectFiles(19),
  msoFileTypeDocumentImagingFiles(20),
  msoFileTypeVisioFiles(21),
  msoFileTypeDesignerFiles(22),
  msoFileTypeWebPages(23);

  public final int value;
  private MsoFileType(int value) { this.value = value; }
  public static  MsoFileType valueOf(int value) {
    switch(value) {
    case 1: return msoFileTypeAllFiles;
    case 2: return msoFileTypeOfficeFiles;
    case 3: return msoFileTypeWordDocuments;
    case 4: return msoFileTypeExcelWorkbooks;
    case 5: return msoFileTypePowerPointPresentations;
    case 6: return msoFileTypeBinders;
    case 7: return msoFileTypeDatabases;
    case 8: return msoFileTypeTemplates;
    case 9: return msoFileTypeOutlookItems;
    case 10: return msoFileTypeMailItem;
    case 11: return msoFileTypeCalendarItem;
    case 12: return msoFileTypeContactItem;
    case 13: return msoFileTypeNoteItem;
    case 14: return msoFileTypeJournalItem;
    case 15: return msoFileTypeTaskItem;
    case 16: return msoFileTypePhotoDrawFiles;
    case 17: return msoFileTypeDataConnectionFiles;
    case 18: return msoFileTypePublisherFiles;
    case 19: return msoFileTypeProjectFiles;
    case 20: return msoFileTypeDocumentImagingFiles;
    case 21: return msoFileTypeVisioFiles;
    case 22: return msoFileTypeDesignerFiles;
    case 23: return msoFileTypeWebPages;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFileType.class);
    }
  }
}
