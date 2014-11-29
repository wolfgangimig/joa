/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultFolders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDefaultFolders {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlDefaultFolders olFolderDeletedItems = new OlDefaultFolders(3);
  public final static OlDefaultFolders olFolderOutbox = new OlDefaultFolders(4);
  public final static OlDefaultFolders olFolderSentMail = new OlDefaultFolders(5);
  public final static OlDefaultFolders olFolderInbox = new OlDefaultFolders(6);
  public final static OlDefaultFolders olFolderCalendar = new OlDefaultFolders(9);
  public final static OlDefaultFolders olFolderContacts = new OlDefaultFolders(10);
  public final static OlDefaultFolders olFolderJournal = new OlDefaultFolders(11);
  public final static OlDefaultFolders olFolderNotes = new OlDefaultFolders(12);
  public final static OlDefaultFolders olFolderTasks = new OlDefaultFolders(13);
  public final static OlDefaultFolders olFolderDrafts = new OlDefaultFolders(16);
  public final static OlDefaultFolders olPublicFoldersAllPublicFolders = new OlDefaultFolders(18);
  public final static OlDefaultFolders olFolderConflicts = new OlDefaultFolders(19);
  public final static OlDefaultFolders olFolderSyncIssues = new OlDefaultFolders(20);
  public final static OlDefaultFolders olFolderLocalFailures = new OlDefaultFolders(21);
  public final static OlDefaultFolders olFolderServerFailures = new OlDefaultFolders(22);
  public final static OlDefaultFolders olFolderJunk = new OlDefaultFolders(23);
  public final static OlDefaultFolders olFolderRssFeeds = new OlDefaultFolders(25);
  public final static OlDefaultFolders olFolderToDo = new OlDefaultFolders(28);
  public final static OlDefaultFolders olFolderManagedEmail = new OlDefaultFolders(29);
  public final static OlDefaultFolders olFolderSuggestedContacts = new OlDefaultFolders(30);

  // Integer constants for bitsets and switch statements
  public final static int _olFolderDeletedItems = 3;
  public final static int _olFolderOutbox = 4;
  public final static int _olFolderSentMail = 5;
  public final static int _olFolderInbox = 6;
  public final static int _olFolderCalendar = 9;
  public final static int _olFolderContacts = 10;
  public final static int _olFolderJournal = 11;
  public final static int _olFolderNotes = 12;
  public final static int _olFolderTasks = 13;
  public final static int _olFolderDrafts = 16;
  public final static int _olPublicFoldersAllPublicFolders = 18;
  public final static int _olFolderConflicts = 19;
  public final static int _olFolderSyncIssues = 20;
  public final static int _olFolderLocalFailures = 21;
  public final static int _olFolderServerFailures = 22;
  public final static int _olFolderJunk = 23;
  public final static int _olFolderRssFeeds = 25;
  public final static int _olFolderToDo = 28;
  public final static int _olFolderManagedEmail = 29;
  public final static int _olFolderSuggestedContacts = 30;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDefaultFolders(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDefaultFolders valueOf(int value) {
    switch(value) {
    case 3: return olFolderDeletedItems;
    case 4: return olFolderOutbox;
    case 5: return olFolderSentMail;
    case 6: return olFolderInbox;
    case 9: return olFolderCalendar;
    case 10: return olFolderContacts;
    case 11: return olFolderJournal;
    case 12: return olFolderNotes;
    case 13: return olFolderTasks;
    case 16: return olFolderDrafts;
    case 18: return olPublicFoldersAllPublicFolders;
    case 19: return olFolderConflicts;
    case 20: return olFolderSyncIssues;
    case 21: return olFolderLocalFailures;
    case 22: return olFolderServerFailures;
    case 23: return olFolderJunk;
    case 25: return olFolderRssFeeds;
    case 28: return olFolderToDo;
    case 29: return olFolderManagedEmail;
    case 30: return olFolderSuggestedContacts;
    default: return new OlDefaultFolders(value);
    }
  }
}
