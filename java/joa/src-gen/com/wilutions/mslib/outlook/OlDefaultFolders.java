/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDefaultFolders.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDefaultFolders {
  olFolderDeletedItems(3),
  olFolderOutbox(4),
  olFolderSentMail(5),
  olFolderInbox(6),
  olFolderCalendar(9),
  olFolderContacts(10),
  olFolderJournal(11),
  olFolderNotes(12),
  olFolderTasks(13),
  olFolderDrafts(16),
  olPublicFoldersAllPublicFolders(18),
  olFolderConflicts(19),
  olFolderSyncIssues(20),
  olFolderLocalFailures(21),
  olFolderServerFailures(22),
  olFolderJunk(23),
  olFolderRssFeeds(25),
  olFolderToDo(28),
  olFolderManagedEmail(29),
  olFolderSuggestedContacts(30);

  public final int value;
  private OlDefaultFolders(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDefaultFolders.class);
    }
  }
}
