/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ReminderCollectionEvents.
 * 
 */
@CoInterface(guid="{000630B2-0000-0000-C000-000000000046}")
public interface ReminderCollectionEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(64147)  public void onBeforeReminderShow(final ByRef<Boolean> Cancel) throws ComException;
  @DeclDISPID(64148)  public void onReminderAdd(final _Reminder ReminderObject) throws ComException;
  @DeclDISPID(64149)  public void onReminderChange(final _Reminder ReminderObject) throws ComException;
  @DeclDISPID(64150)  public void onReminderFire(final _Reminder ReminderObject) throws ComException;
  @DeclDISPID(64151)  public void onReminderRemove() throws ComException;
  @DeclDISPID(64152)  public void onSnooze(final _Reminder ReminderObject) throws ComException;
}
