/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * CalendarSharing.
 * 
 */
@CoClass(guid="{000610E2-0000-0000-C000-000000000046}")
public class CalendarSharing extends Dispatch implements _CalendarSharing {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64408)  public void SaveAsICal(String Path) throws ComException {
    assert(Path != null);
    this._dispatchCall(64408,"SaveAsICal", DISPATCH_METHOD,null,Path);
  }
  @DeclDISPID(64409)  public MailItem ForwardAsICal(OlCalendarMailFormat MailFormat) throws ComException {
    assert(MailFormat != null);
    final Object obj = this._dispatchCall(64409,"ForwardAsICal", DISPATCH_METHOD,null,MailFormat.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MailItem.class);
  }
  @DeclDISPID(64410)  public OlCalendarDetail getCalendarDetail() throws ComException {
    final Object obj = this._dispatchCall(64410,"CalendarDetail", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlCalendarDetail.valueOf((Integer)obj);
  }
  @DeclDISPID(64410)  public void setCalendarDetail(OlCalendarDetail value) throws ComException {
    assert(value != null);
    this._dispatchCall(64410,"CalendarDetail", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64411)  public java.util.Date getEndDate() throws ComException {
    final Object obj = this._dispatchCall(64411,"EndDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64411)  public void setEndDate(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(64411,"EndDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64412)  public MAPIFolder getFolder() throws ComException {
    final Object obj = this._dispatchCall(64412,"Folder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64413)  public Boolean getIncludeAttachments() throws ComException {
    final Object obj = this._dispatchCall(64413,"IncludeAttachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64413)  public void setIncludeAttachments(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64413,"IncludeAttachments", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64414)  public Boolean getIncludePrivateDetails() throws ComException {
    final Object obj = this._dispatchCall(64414,"IncludePrivateDetails", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64414)  public void setIncludePrivateDetails(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64414,"IncludePrivateDetails", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64415)  public Boolean getRestrictToWorkingHours() throws ComException {
    final Object obj = this._dispatchCall(64415,"RestrictToWorkingHours", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64415)  public void setRestrictToWorkingHours(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64415,"RestrictToWorkingHours", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64416)  public java.util.Date getStartDate() throws ComException {
    final Object obj = this._dispatchCall(64416,"StartDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64416)  public void setStartDate(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(64416,"StartDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64417)  public Boolean getIncludeWholeCalendar() throws ComException {
    final Object obj = this._dispatchCall(64417,"IncludeWholeCalendar", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64417)  public void setIncludeWholeCalendar(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64417,"IncludeWholeCalendar", DISPATCH_PROPERTYPUT,value);
  }
  public CalendarSharing() throws ComException {
    super("{000610E2-0000-0000-C000-000000000046}", "{000630E2-0000-0000-C000-000000000046}");
  }
  protected CalendarSharing(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[CalendarSharing" + super.toString() + "]";
  }
}
