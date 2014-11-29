/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A92F-A463-DB41-5DAE-69E7A5F7FCBC}")
public class RecurrencePatternImpl extends Dispatch implements com.wilutions.mslib.outlook.RecurrencePattern {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4096)  public Integer getDayOfMonth() throws ComException {
    final Object obj = this._dispatchCall(4096,"DayOfMonth", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4096)  public void setDayOfMonth(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4096,"DayOfMonth", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4097)  public com.wilutions.mslib.outlook.OlDaysOfWeek getDayOfWeekMask() throws ComException {
    final Object obj = this._dispatchCall(4097,"DayOfWeekMask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDaysOfWeek.valueOf((Integer)obj);
  }
  @DeclDISPID(4097)  public void setDayOfWeekMask(final com.wilutions.mslib.outlook.OlDaysOfWeek value) throws ComException {
    assert(value != null);
    this._dispatchCall(4097,"DayOfWeekMask", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4109)  public Integer getDuration() throws ComException {
    final Object obj = this._dispatchCall(4109,"Duration", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4109)  public void setDuration(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4109,"Duration", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4108)  public java.util.Date getEndTime() throws ComException {
    final Object obj = this._dispatchCall(4108,"EndTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(4108)  public void setEndTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(4108,"EndTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4110)  public com.wilutions.mslib.outlook.Exceptions getExceptions() throws ComException {
    final Object obj = this._dispatchCall(4110,"Exceptions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ExceptionsImpl.class);
  }
  @DeclDISPID(4099)  public Integer getInstance() throws ComException {
    final Object obj = this._dispatchCall(4099,"Instance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4099)  public void setInstance(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4099,"Instance", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4100)  public Integer getInterval() throws ComException {
    final Object obj = this._dispatchCall(4100,"Interval", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4100)  public void setInterval(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4100,"Interval", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4102)  public Integer getMonthOfYear() throws ComException {
    final Object obj = this._dispatchCall(4102,"MonthOfYear", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4102)  public void setMonthOfYear(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4102,"MonthOfYear", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4107)  public Boolean getNoEndDate() throws ComException {
    final Object obj = this._dispatchCall(4107,"NoEndDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(4107)  public void setNoEndDate(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(4107,"NoEndDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4101)  public Integer getOccurrences() throws ComException {
    final Object obj = this._dispatchCall(4101,"Occurrences", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(4101)  public void setOccurrences(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(4101,"Occurrences", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4098)  public java.util.Date getPatternEndDate() throws ComException {
    final Object obj = this._dispatchCall(4098,"PatternEndDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(4098)  public void setPatternEndDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(4098,"PatternEndDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4104)  public java.util.Date getPatternStartDate() throws ComException {
    final Object obj = this._dispatchCall(4104,"PatternStartDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(4104)  public void setPatternStartDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(4104,"PatternStartDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4103)  public com.wilutions.mslib.outlook.OlRecurrenceType getRecurrenceType() throws ComException {
    final Object obj = this._dispatchCall(4103,"RecurrenceType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRecurrenceType.valueOf((Integer)obj);
  }
  @DeclDISPID(4103)  public void setRecurrenceType(final com.wilutions.mslib.outlook.OlRecurrenceType value) throws ComException {
    assert(value != null);
    this._dispatchCall(4103,"RecurrenceType", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(4106)  public Boolean getRegenerate() throws ComException {
    final Object obj = this._dispatchCall(4106,"Regenerate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(4106)  public void setRegenerate(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(4106,"Regenerate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4105)  public java.util.Date getStartTime() throws ComException {
    final Object obj = this._dispatchCall(4105,"StartTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(4105)  public void setStartTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(4105,"StartTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4111)  public com.wilutions.mslib.outlook.AppointmentItem GetOccurrence(final java.util.Date StartDate) throws ComException {
    assert(StartDate != null);
    final Object obj = this._dispatchCall(4111,"GetOccurrence", DISPATCH_METHOD,null,StartDate);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.AppointmentItem.class);
  }
  public RecurrencePatternImpl(String progId) throws ComException {
    super(progId, "{00063044-0000-0000-C000-000000000046}");
  }
  protected RecurrencePatternImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[RecurrencePatternImpl" + super.toString() + "]";
  }
}
