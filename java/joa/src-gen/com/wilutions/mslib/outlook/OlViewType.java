/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlViewType {
  olTableView(0),
  olCardView(1),
  olCalendarView(2),
  olIconView(3),
  olTimelineView(4),
  olBusinessCardView(5),
  olDailyTaskListView(6),
  olPeopleView(7);

  public final int value;
  private OlViewType(int value) { this.value = value; }
  public static  OlViewType valueOf(int value) {
    switch(value) {
    case 0: return olTableView;
    case 1: return olCardView;
    case 2: return olCalendarView;
    case 3: return olIconView;
    case 4: return olTimelineView;
    case 5: return olBusinessCardView;
    case 6: return olDailyTaskListView;
    case 7: return olPeopleView;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlViewType.class);
    }
  }
}
