/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Reminder.
 * 
 */
@CoInterface(guid="{000630B0-0000-0000-C000-000000000046}")
public interface _Reminder extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64154)  public void Dismiss() throws ComException;
  @DeclDISPID(64155)  public void Snooze(final Object SnoozeTime) throws ComException;
  @DeclDISPID(0)  public String getCaption() throws ComException;
  @DeclDISPID(64157)  public Boolean getIsVisible() throws ComException;
  @DeclDISPID(64158)  public IDispatch getItem() throws ComException;
  @DeclDISPID(64159)  public java.util.Date getNextReminderDate() throws ComException;
  @DeclDISPID(64160)  public java.util.Date getOriginalReminderDate() throws ComException;
}
