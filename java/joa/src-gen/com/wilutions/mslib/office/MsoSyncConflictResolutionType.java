/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncConflictResolutionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSyncConflictResolutionType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSyncConflictResolutionType msoSyncConflictClientWins = new MsoSyncConflictResolutionType(0);
  public final static MsoSyncConflictResolutionType msoSyncConflictServerWins = new MsoSyncConflictResolutionType(1);
  public final static MsoSyncConflictResolutionType msoSyncConflictMerge = new MsoSyncConflictResolutionType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoSyncConflictClientWins = 0;
  public final static int _msoSyncConflictServerWins = 1;
  public final static int _msoSyncConflictMerge = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSyncConflictResolutionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSyncConflictResolutionType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncConflictClientWins;
    case 1: return msoSyncConflictServerWins;
    case 2: return msoSyncConflictMerge;
    default: return new MsoSyncConflictResolutionType(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoSyncConflictClientWins";
    case 1: return "msoSyncConflictServerWins";
    case 2: return "msoSyncConflictMerge";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoSyncConflictClientWins");
      if ((value & 1) != 0) sbuf.append("|msoSyncConflictServerWins");
      if ((value & 2) != 0) sbuf.append("|msoSyncConflictMerge");
      return sbuf.toString();
      }
    }
  }
}
