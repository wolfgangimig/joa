/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoDocInspectorStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoDocInspectorStatus {
  msoDocInspectorStatusDocOk(0),
  msoDocInspectorStatusIssueFound(1),
  msoDocInspectorStatusError(2);

  public final int value;
  private MsoDocInspectorStatus(int value) { this.value = value; }
  public static  MsoDocInspectorStatus valueOf(int value) {
    switch(value) {
    case 0: return msoDocInspectorStatusDocOk;
    case 1: return msoDocInspectorStatusIssueFound;
    case 2: return msoDocInspectorStatusError;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoDocInspectorStatus.class);
    }
  }
}
