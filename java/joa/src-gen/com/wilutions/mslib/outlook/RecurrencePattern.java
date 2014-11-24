/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * RecurrencePattern.
 * 
 */
@CoInterface(guid="{00063044-0000-0000-C000-000000000046}")
public interface RecurrencePattern extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4096)  public Integer getDayOfMonth() throws ComException;
  @DeclDISPID(4096)  public void setDayOfMonth(Integer value) throws ComException;
  @DeclDISPID(4097)  public OlDaysOfWeek getDayOfWeekMask() throws ComException;
  @DeclDISPID(4097)  public void setDayOfWeekMask(OlDaysOfWeek value) throws ComException;
  @DeclDISPID(4109)  public Integer getDuration() throws ComException;
  @DeclDISPID(4109)  public void setDuration(Integer value) throws ComException;
  @DeclDISPID(4108)  public java.util.Date getEndTime() throws ComException;
  @DeclDISPID(4108)  public void setEndTime(java.util.Date value) throws ComException;
  @DeclDISPID(4110)  public Exceptions getExceptions() throws ComException;
  @DeclDISPID(4099)  public Integer getInstance() throws ComException;
  @DeclDISPID(4099)  public void setInstance(Integer value) throws ComException;
  @DeclDISPID(4100)  public Integer getInterval() throws ComException;
  @DeclDISPID(4100)  public void setInterval(Integer value) throws ComException;
  @DeclDISPID(4102)  public Integer getMonthOfYear() throws ComException;
  @DeclDISPID(4102)  public void setMonthOfYear(Integer value) throws ComException;
  @DeclDISPID(4107)  public Boolean getNoEndDate() throws ComException;
  @DeclDISPID(4107)  public void setNoEndDate(Boolean value) throws ComException;
  @DeclDISPID(4101)  public Integer getOccurrences() throws ComException;
  @DeclDISPID(4101)  public void setOccurrences(Integer value) throws ComException;
  @DeclDISPID(4098)  public java.util.Date getPatternEndDate() throws ComException;
  @DeclDISPID(4098)  public void setPatternEndDate(java.util.Date value) throws ComException;
  @DeclDISPID(4104)  public java.util.Date getPatternStartDate() throws ComException;
  @DeclDISPID(4104)  public void setPatternStartDate(java.util.Date value) throws ComException;
  @DeclDISPID(4103)  public OlRecurrenceType getRecurrenceType() throws ComException;
  @DeclDISPID(4103)  public void setRecurrenceType(OlRecurrenceType value) throws ComException;
  @DeclDISPID(4106)  public Boolean getRegenerate() throws ComException;
  @DeclDISPID(4106)  public void setRegenerate(Boolean value) throws ComException;
  @DeclDISPID(4105)  public java.util.Date getStartTime() throws ComException;
  @DeclDISPID(4105)  public void setStartTime(java.util.Date value) throws ComException;
  @DeclDISPID(4111)  public AppointmentItem GetOccurrence(java.util.Date StartDate) throws ComException;
}
