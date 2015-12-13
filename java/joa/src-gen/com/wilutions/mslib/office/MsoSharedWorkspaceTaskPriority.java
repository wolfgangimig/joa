/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSharedWorkspaceTaskPriority.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSharedWorkspaceTaskPriority implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoSharedWorkspaceTaskPriority msoSharedWorkspaceTaskPriorityHigh = new MsoSharedWorkspaceTaskPriority(1);
  public final static MsoSharedWorkspaceTaskPriority msoSharedWorkspaceTaskPriorityNormal = new MsoSharedWorkspaceTaskPriority(2);
  public final static MsoSharedWorkspaceTaskPriority msoSharedWorkspaceTaskPriorityLow = new MsoSharedWorkspaceTaskPriority(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoSharedWorkspaceTaskPriorityHigh = 1;
  public final static int _msoSharedWorkspaceTaskPriorityNormal = 2;
  public final static int _msoSharedWorkspaceTaskPriorityLow = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSharedWorkspaceTaskPriority(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSharedWorkspaceTaskPriority valueOf(int value) {
    switch(value) {
    case 1: return msoSharedWorkspaceTaskPriorityHigh;
    case 2: return msoSharedWorkspaceTaskPriorityNormal;
    case 3: return msoSharedWorkspaceTaskPriorityLow;
    default: return new MsoSharedWorkspaceTaskPriority(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoSharedWorkspaceTaskPriorityHigh";
    case 2: return "msoSharedWorkspaceTaskPriorityNormal";
    case 3: return "msoSharedWorkspaceTaskPriorityLow";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoSharedWorkspaceTaskPriorityHigh");
      if ((value & 2) != 0) sbuf.append("|msoSharedWorkspaceTaskPriorityNormal");
      if ((value & 3) != 0) sbuf.append("|msoSharedWorkspaceTaskPriorityLow");
      return sbuf.toString();
      }
    }
  }
}
