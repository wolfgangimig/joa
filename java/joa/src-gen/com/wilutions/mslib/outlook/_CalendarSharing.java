/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _CalendarSharing.
 * 
 */
@CoInterface(guid="{000630E2-0000-0000-C000-000000000046}")
public interface _CalendarSharing extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64408)  public void SaveAsICal(String Path) throws ComException;
  @DeclDISPID(64409)  public MailItem ForwardAsICal(OlCalendarMailFormat MailFormat) throws ComException;
  @DeclDISPID(64410)  public OlCalendarDetail getCalendarDetail() throws ComException;
  @DeclDISPID(64410)  public void setCalendarDetail(OlCalendarDetail value) throws ComException;
  @DeclDISPID(64411)  public java.util.Date getEndDate() throws ComException;
  @DeclDISPID(64411)  public void setEndDate(java.util.Date value) throws ComException;
  @DeclDISPID(64412)  public MAPIFolder getFolder() throws ComException;
  @DeclDISPID(64413)  public Boolean getIncludeAttachments() throws ComException;
  @DeclDISPID(64413)  public void setIncludeAttachments(Boolean value) throws ComException;
  @DeclDISPID(64414)  public Boolean getIncludePrivateDetails() throws ComException;
  @DeclDISPID(64414)  public void setIncludePrivateDetails(Boolean value) throws ComException;
  @DeclDISPID(64415)  public Boolean getRestrictToWorkingHours() throws ComException;
  @DeclDISPID(64415)  public void setRestrictToWorkingHours(Boolean value) throws ComException;
  @DeclDISPID(64416)  public java.util.Date getStartDate() throws ComException;
  @DeclDISPID(64416)  public void setStartDate(java.util.Date value) throws ComException;
  @DeclDISPID(64417)  public Boolean getIncludeWholeCalendar() throws ComException;
  @DeclDISPID(64417)  public void setIncludeWholeCalendar(Boolean value) throws ComException;
}
