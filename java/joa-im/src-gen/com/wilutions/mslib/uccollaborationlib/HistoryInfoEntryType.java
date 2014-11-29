/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * HistoryInfoEntryType.
 * Enumerates the history info entry type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class HistoryInfoEntryType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static HistoryInfoEntryType ucHistoryInfoTypeNone = new HistoryInfoEntryType(0);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRedirectStatic = new HistoryInfoEntryType(1);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRedirectHuntgroup = new HistoryInfoEntryType(2);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRetargetDelegate = new HistoryInfoEntryType(3);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRetargetTeam = new HistoryInfoEntryType(4);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRetargetTransferer = new HistoryInfoEntryType(5);
  public final static HistoryInfoEntryType ucHistoryInfoTypeRetargetTransferee = new HistoryInfoEntryType(6);
  public final static HistoryInfoEntryType ucHistoryInfoTypeUnknown = new HistoryInfoEntryType(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucHistoryInfoTypeNone = 0;
  public final static int _ucHistoryInfoTypeRedirectStatic = 1;
  public final static int _ucHistoryInfoTypeRedirectHuntgroup = 2;
  public final static int _ucHistoryInfoTypeRetargetDelegate = 3;
  public final static int _ucHistoryInfoTypeRetargetTeam = 4;
  public final static int _ucHistoryInfoTypeRetargetTransferer = 5;
  public final static int _ucHistoryInfoTypeRetargetTransferee = 6;
  public final static int _ucHistoryInfoTypeUnknown = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private HistoryInfoEntryType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  HistoryInfoEntryType valueOf(int value) {
    switch(value) {
    case 0: return ucHistoryInfoTypeNone;
    case 1: return ucHistoryInfoTypeRedirectStatic;
    case 2: return ucHistoryInfoTypeRedirectHuntgroup;
    case 3: return ucHistoryInfoTypeRetargetDelegate;
    case 4: return ucHistoryInfoTypeRetargetTeam;
    case 5: return ucHistoryInfoTypeRetargetTransferer;
    case 6: return ucHistoryInfoTypeRetargetTransferee;
    case 7: return ucHistoryInfoTypeUnknown;
    default: return new HistoryInfoEntryType(value);
    }
  }
}
