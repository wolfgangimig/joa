/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9D9-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ReminderCollectionEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.ReminderCollectionEvents {
  @DeclDISPID(64147)  public void onBeforeReminderShow(final ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(64147,"BeforeReminderShow", DISPATCH_METHOD,null,Cancel);
  }
  @DeclDISPID(64148)  public void onReminderAdd(final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    this._dispatchCall(64148,"ReminderAdd", DISPATCH_METHOD,null,(ReminderObject!=null?ReminderObject:Dispatch.NULL));
  }
  @DeclDISPID(64149)  public void onReminderChange(final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    this._dispatchCall(64149,"ReminderChange", DISPATCH_METHOD,null,(ReminderObject!=null?ReminderObject:Dispatch.NULL));
  }
  @DeclDISPID(64150)  public void onReminderFire(final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    this._dispatchCall(64150,"ReminderFire", DISPATCH_METHOD,null,(ReminderObject!=null?ReminderObject:Dispatch.NULL));
  }
  @DeclDISPID(64151)  public void onReminderRemove() throws ComException {
    this._dispatchCall(64151,"ReminderRemove", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64152)  public void onSnooze(final com.wilutions.mslib.outlook._Reminder ReminderObject) throws ComException {
    this._dispatchCall(64152,"Snooze", DISPATCH_METHOD,null,(ReminderObject!=null?ReminderObject:Dispatch.NULL));
  }
  public ReminderCollectionEventsImpl(String progId) throws ComException {
    super(progId, "{000630B2-0000-0000-C000-000000000046}");
  }
  protected ReminderCollectionEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ReminderCollectionEventsImpl" + super.toString() + "]";
  }
}
