/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileType msoFileTypeAllFiles = new MsoFileType(1);
  public final static MsoFileType msoFileTypeOfficeFiles = new MsoFileType(2);
  public final static MsoFileType msoFileTypeWordDocuments = new MsoFileType(3);
  public final static MsoFileType msoFileTypeExcelWorkbooks = new MsoFileType(4);
  public final static MsoFileType msoFileTypePowerPointPresentations = new MsoFileType(5);
  public final static MsoFileType msoFileTypeBinders = new MsoFileType(6);
  public final static MsoFileType msoFileTypeDatabases = new MsoFileType(7);
  public final static MsoFileType msoFileTypeTemplates = new MsoFileType(8);
  public final static MsoFileType msoFileTypeOutlookItems = new MsoFileType(9);
  public final static MsoFileType msoFileTypeMailItem = new MsoFileType(10);
  public final static MsoFileType msoFileTypeCalendarItem = new MsoFileType(11);
  public final static MsoFileType msoFileTypeContactItem = new MsoFileType(12);
  public final static MsoFileType msoFileTypeNoteItem = new MsoFileType(13);
  public final static MsoFileType msoFileTypeJournalItem = new MsoFileType(14);
  public final static MsoFileType msoFileTypeTaskItem = new MsoFileType(15);
  public final static MsoFileType msoFileTypePhotoDrawFiles = new MsoFileType(16);
  public final static MsoFileType msoFileTypeDataConnectionFiles = new MsoFileType(17);
  public final static MsoFileType msoFileTypePublisherFiles = new MsoFileType(18);
  public final static MsoFileType msoFileTypeProjectFiles = new MsoFileType(19);
  public final static MsoFileType msoFileTypeDocumentImagingFiles = new MsoFileType(20);
  public final static MsoFileType msoFileTypeVisioFiles = new MsoFileType(21);
  public final static MsoFileType msoFileTypeDesignerFiles = new MsoFileType(22);
  public final static MsoFileType msoFileTypeWebPages = new MsoFileType(23);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileTypeAllFiles = 1;
  public final static int _msoFileTypeOfficeFiles = 2;
  public final static int _msoFileTypeWordDocuments = 3;
  public final static int _msoFileTypeExcelWorkbooks = 4;
  public final static int _msoFileTypePowerPointPresentations = 5;
  public final static int _msoFileTypeBinders = 6;
  public final static int _msoFileTypeDatabases = 7;
  public final static int _msoFileTypeTemplates = 8;
  public final static int _msoFileTypeOutlookItems = 9;
  public final static int _msoFileTypeMailItem = 10;
  public final static int _msoFileTypeCalendarItem = 11;
  public final static int _msoFileTypeContactItem = 12;
  public final static int _msoFileTypeNoteItem = 13;
  public final static int _msoFileTypeJournalItem = 14;
  public final static int _msoFileTypeTaskItem = 15;
  public final static int _msoFileTypePhotoDrawFiles = 16;
  public final static int _msoFileTypeDataConnectionFiles = 17;
  public final static int _msoFileTypePublisherFiles = 18;
  public final static int _msoFileTypeProjectFiles = 19;
  public final static int _msoFileTypeDocumentImagingFiles = 20;
  public final static int _msoFileTypeVisioFiles = 21;
  public final static int _msoFileTypeDesignerFiles = 22;
  public final static int _msoFileTypeWebPages = 23;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new MsoFileType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 20: return "msoFileTypeDocumentImagingFiles";
    case 9: return "msoFileTypeOutlookItems";
    case 1: return "msoFileTypeAllFiles";
    case 2: return "msoFileTypeOfficeFiles";
    case 3: return "msoFileTypeWordDocuments";
    case 4: return "msoFileTypeExcelWorkbooks";
    case 5: return "msoFileTypePowerPointPresentations";
    case 6: return "msoFileTypeBinders";
    case 7: return "msoFileTypeDatabases";
    case 18: return "msoFileTypePublisherFiles";
    case 8: return "msoFileTypeTemplates";
    case 10: return "msoFileTypeMailItem";
    case 11: return "msoFileTypeCalendarItem";
    case 12: return "msoFileTypeContactItem";
    case 13: return "msoFileTypeNoteItem";
    case 14: return "msoFileTypeJournalItem";
    case 15: return "msoFileTypeTaskItem";
    case 16: return "msoFileTypePhotoDrawFiles";
    case 17: return "msoFileTypeDataConnectionFiles";
    case 19: return "msoFileTypeProjectFiles";
    case 21: return "msoFileTypeVisioFiles";
    case 22: return "msoFileTypeDesignerFiles";
    case 23: return "msoFileTypeWebPages";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 20) != 0) sbuf.append("|msoFileTypeDocumentImagingFiles");
      if ((value & 9) != 0) sbuf.append("|msoFileTypeOutlookItems");
      if ((value & 1) != 0) sbuf.append("|msoFileTypeAllFiles");
      if ((value & 2) != 0) sbuf.append("|msoFileTypeOfficeFiles");
      if ((value & 3) != 0) sbuf.append("|msoFileTypeWordDocuments");
      if ((value & 4) != 0) sbuf.append("|msoFileTypeExcelWorkbooks");
      if ((value & 5) != 0) sbuf.append("|msoFileTypePowerPointPresentations");
      if ((value & 6) != 0) sbuf.append("|msoFileTypeBinders");
      if ((value & 7) != 0) sbuf.append("|msoFileTypeDatabases");
      if ((value & 18) != 0) sbuf.append("|msoFileTypePublisherFiles");
      if ((value & 8) != 0) sbuf.append("|msoFileTypeTemplates");
      if ((value & 10) != 0) sbuf.append("|msoFileTypeMailItem");
      if ((value & 11) != 0) sbuf.append("|msoFileTypeCalendarItem");
      if ((value & 12) != 0) sbuf.append("|msoFileTypeContactItem");
      if ((value & 13) != 0) sbuf.append("|msoFileTypeNoteItem");
      if ((value & 14) != 0) sbuf.append("|msoFileTypeJournalItem");
      if ((value & 15) != 0) sbuf.append("|msoFileTypeTaskItem");
      if ((value & 16) != 0) sbuf.append("|msoFileTypePhotoDrawFiles");
      if ((value & 17) != 0) sbuf.append("|msoFileTypeDataConnectionFiles");
      if ((value & 19) != 0) sbuf.append("|msoFileTypeProjectFiles");
      if ((value & 21) != 0) sbuf.append("|msoFileTypeVisioFiles");
      if ((value & 22) != 0) sbuf.append("|msoFileTypeDesignerFiles");
      if ((value & 23) != 0) sbuf.append("|msoFileTypeWebPages");
      return sbuf.toString();
      }
    }
  }
}
