/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDocInspectorStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoDocInspectorStatus implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoDocInspectorStatus msoDocInspectorStatusDocOk = new MsoDocInspectorStatus(0);
  public final static MsoDocInspectorStatus msoDocInspectorStatusIssueFound = new MsoDocInspectorStatus(1);
  public final static MsoDocInspectorStatus msoDocInspectorStatusError = new MsoDocInspectorStatus(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoDocInspectorStatusDocOk = 0;
  public final static int _msoDocInspectorStatusIssueFound = 1;
  public final static int _msoDocInspectorStatusError = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoDocInspectorStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoDocInspectorStatus valueOf(int value) {
    switch(value) {
    case 0: return msoDocInspectorStatusDocOk;
    case 1: return msoDocInspectorStatusIssueFound;
    case 2: return msoDocInspectorStatusError;
    default: return new MsoDocInspectorStatus(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoDocInspectorStatusDocOk";
    case 1: return "msoDocInspectorStatusIssueFound";
    case 2: return "msoDocInspectorStatusError";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoDocInspectorStatusDocOk");
      if ((value & 1) != 0) sbuf.append("|msoDocInspectorStatusIssueFound");
      if ((value & 2) != 0) sbuf.append("|msoDocInspectorStatusError");
      return sbuf.toString();
      }
    }
  }
}
