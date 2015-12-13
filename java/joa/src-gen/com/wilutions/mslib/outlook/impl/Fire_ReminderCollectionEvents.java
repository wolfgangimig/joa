/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;
import com.wilutions.mslib.outlook.ReminderCollectionEvents;

@SuppressWarnings("all")
public class Fire_ReminderCollectionEvents {
  public final static void onBeforeReminderShow(final IDispatch __joa__disp, final ByRef<Boolean> Cancel) throws ComException {
    assert(__joa__disp != null);
    assert(Cancel != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onBeforeReminderShow(Cancel));
  }
  public final static void onReminderAdd(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    assert(__joa__disp != null);
    assert(ReminderObject != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onReminderAdd(ReminderObject));
  }
  public final static void onReminderChange(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    assert(__joa__disp != null);
    assert(ReminderObject != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onReminderChange(ReminderObject));
  }
  public final static void onReminderFire(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    assert(__joa__disp != null);
    assert(ReminderObject != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onReminderFire(ReminderObject));
  }
  public final static void onReminderRemove(final IDispatch __joa__disp) throws ComException {
    assert(__joa__disp != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onReminderRemove());
  }
  public final static void onSnooze(final IDispatch __joa__disp, final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    assert(__joa__disp != null);
    assert(ReminderObject != null);
    __joa__disp._fireEvent(ReminderCollectionEvents.class, (l)->l.onSnooze(ReminderObject));
  }
}
