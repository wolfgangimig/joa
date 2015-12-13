/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * RecurrencePattern.
 * 
 */
@CoInterface(guid="{00063044-0000-0000-C000-000000000046}")
public interface RecurrencePattern extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(4096)  public Integer getDayOfMonth() throws ComException;
  @DeclDISPID(4096)  public void setDayOfMonth(final Integer value) throws ComException;
  @DeclDISPID(4097)  public OlDaysOfWeek getDayOfWeekMask() throws ComException;
  @DeclDISPID(4097)  public void setDayOfWeekMask(final OlDaysOfWeek value) throws ComException;
  @DeclDISPID(4109)  public Integer getDuration() throws ComException;
  @DeclDISPID(4109)  public void setDuration(final Integer value) throws ComException;
  @DeclDISPID(4108)  public java.util.Date getEndTime() throws ComException;
  @DeclDISPID(4108)  public void setEndTime(final java.util.Date value) throws ComException;
  @DeclDISPID(4110)  public Exceptions getExceptions() throws ComException;
  @DeclDISPID(4099)  public Integer getInstance() throws ComException;
  @DeclDISPID(4099)  public void setInstance(final Integer value) throws ComException;
  @DeclDISPID(4100)  public Integer getInterval() throws ComException;
  @DeclDISPID(4100)  public void setInterval(final Integer value) throws ComException;
  @DeclDISPID(4102)  public Integer getMonthOfYear() throws ComException;
  @DeclDISPID(4102)  public void setMonthOfYear(final Integer value) throws ComException;
  @DeclDISPID(4107)  public Boolean getNoEndDate() throws ComException;
  @DeclDISPID(4107)  public void setNoEndDate(final Boolean value) throws ComException;
  @DeclDISPID(4101)  public Integer getOccurrences() throws ComException;
  @DeclDISPID(4101)  public void setOccurrences(final Integer value) throws ComException;
  @DeclDISPID(4098)  public java.util.Date getPatternEndDate() throws ComException;
  @DeclDISPID(4098)  public void setPatternEndDate(final java.util.Date value) throws ComException;
  @DeclDISPID(4104)  public java.util.Date getPatternStartDate() throws ComException;
  @DeclDISPID(4104)  public void setPatternStartDate(final java.util.Date value) throws ComException;
  @DeclDISPID(4103)  public OlRecurrenceType getRecurrenceType() throws ComException;
  @DeclDISPID(4103)  public void setRecurrenceType(final OlRecurrenceType value) throws ComException;
  @DeclDISPID(4106)  public Boolean getRegenerate() throws ComException;
  @DeclDISPID(4106)  public void setRegenerate(final Boolean value) throws ComException;
  @DeclDISPID(4105)  public java.util.Date getStartTime() throws ComException;
  @DeclDISPID(4105)  public void setStartTime(final java.util.Date value) throws ComException;
  @DeclDISPID(4111)  public AppointmentItem GetOccurrence(final java.util.Date StartDate) throws ComException;
}
