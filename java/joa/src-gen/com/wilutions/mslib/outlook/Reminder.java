/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Reminder.
 * 
 */
@CoClass(guid="{0006F028-0000-0000-C000-000000000046}")
public class Reminder extends Dispatch implements _Reminder {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64154)  public void Dismiss() throws ComException {
    this._dispatchCall(64154,"Dismiss", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64155)  public void Snooze(Object SnoozeTime) throws ComException {
    assert(SnoozeTime != null);
    this._dispatchCall(64155,"Snooze", DISPATCH_METHOD,null,SnoozeTime);
  }
  @DeclDISPID(0)  public String getCaption() throws ComException {
    final Object obj = this._dispatchCall(0,"Caption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64157)  public Boolean getIsVisible() throws ComException {
    final Object obj = this._dispatchCall(64157,"IsVisible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64158)  public Dispatch getItem() throws ComException {
    final Object obj = this._dispatchCall(64158,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64159)  public java.util.Date getNextReminderDate() throws ComException {
    final Object obj = this._dispatchCall(64159,"NextReminderDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64160)  public java.util.Date getOriginalReminderDate() throws ComException {
    final Object obj = this._dispatchCall(64160,"OriginalReminderDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  public Reminder() throws ComException {
    super("{0006F028-0000-0000-C000-000000000046}");
  }
  protected Reminder(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Reminder" + super.toString() + "]";
  }
}
