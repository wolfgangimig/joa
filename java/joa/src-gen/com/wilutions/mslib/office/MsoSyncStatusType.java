/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncStatusType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncStatusType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSyncStatusType msoSyncStatusNoSharedWorkspace = new MsoSyncStatusType(0);
  public final static MsoSyncStatusType msoSyncStatusNotRoaming = new MsoSyncStatusType(0);
  public final static MsoSyncStatusType msoSyncStatusLatest = new MsoSyncStatusType(1);
  public final static MsoSyncStatusType msoSyncStatusNewerAvailable = new MsoSyncStatusType(2);
  public final static MsoSyncStatusType msoSyncStatusLocalChanges = new MsoSyncStatusType(3);
  public final static MsoSyncStatusType msoSyncStatusConflict = new MsoSyncStatusType(4);
  public final static MsoSyncStatusType msoSyncStatusSuspended = new MsoSyncStatusType(5);
  public final static MsoSyncStatusType msoSyncStatusError = new MsoSyncStatusType(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncStatusNoSharedWorkspace = 0;
  public final static int _msoSyncStatusNotRoaming = 0;
  public final static int _msoSyncStatusLatest = 1;
  public final static int _msoSyncStatusNewerAvailable = 2;
  public final static int _msoSyncStatusLocalChanges = 3;
  public final static int _msoSyncStatusConflict = 4;
  public final static int _msoSyncStatusSuspended = 5;
  public final static int _msoSyncStatusError = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncStatusType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncStatusType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncStatusNoSharedWorkspace;
    //se 0: return msoSyncStatusNotRoaming; // same as msoSyncStatusNoSharedWorkspace
    case 1: return msoSyncStatusLatest;
    case 2: return msoSyncStatusNewerAvailable;
    case 3: return msoSyncStatusLocalChanges;
    case 4: return msoSyncStatusConflict;
    case 5: return msoSyncStatusSuspended;
    case 6: return msoSyncStatusError;
    default: return new MsoSyncStatusType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoSyncStatusNoSharedWorkspace";
    case 1: return "msoSyncStatusLatest";
    case 2: return "msoSyncStatusNewerAvailable";
    case 3: return "msoSyncStatusLocalChanges";
    case 4: return "msoSyncStatusConflict";
    case 5: return "msoSyncStatusSuspended";
    case 6: return "msoSyncStatusError";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoSyncStatusNoSharedWorkspace");
      if ((value & 1) != 0) sbuf.append("|msoSyncStatusLatest");
      if ((value & 2) != 0) sbuf.append("|msoSyncStatusNewerAvailable");
      if ((value & 3) != 0) sbuf.append("|msoSyncStatusLocalChanges");
      if ((value & 4) != 0) sbuf.append("|msoSyncStatusConflict");
      if ((value & 5) != 0) sbuf.append("|msoSyncStatusSuspended");
      if ((value & 6) != 0) sbuf.append("|msoSyncStatusError");
      return sbuf.toString();
      }
    }
  }
}
