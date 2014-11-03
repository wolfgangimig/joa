/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSelectionLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSelectionLocation {
  olViewList(0),
  olToDoBarTaskList(1),
  olToDoBarAppointmentList(2),
  olDailyTaskList(3),
  olAttachmentWell(4);

  public final int value;
  private OlSelectionLocation(int value) { this.value = value; }
  public static  OlSelectionLocation valueOf(int value) {
    switch(value) {
    case 0: return olViewList;
    case 1: return olToDoBarTaskList;
    case 2: return olToDoBarAppointmentList;
    case 3: return olDailyTaskList;
    case 4: return olAttachmentWell;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSelectionLocation.class);
    }
  }
}
