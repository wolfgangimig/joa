/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _CalendarView.
 * 
 */
@CoInterface(guid="{00063099-0000-0000-C000-000000000046}")
public interface _CalendarView extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(407)  public void Apply() throws ComException;
  @DeclDISPID(61490)  public View Copy(String Name, OlViewSaveOption SaveOption) throws ComException;
  @DeclDISPID(61514)  public void Delete() throws ComException;
  @DeclDISPID(64068)  public void Reset() throws ComException;
  @DeclDISPID(61512)  public void Save() throws ComException;
  @DeclDISPID(64065)  public String getLanguage() throws ComException;
  @DeclDISPID(64065)  public void setLanguage(String value) throws ComException;
  @DeclDISPID(64064)  public Boolean getLockUserChanges() throws ComException;
  @DeclDISPID(64064)  public void setLockUserChanges(Boolean value) throws ComException;
  @DeclDISPID(0)  public String getName() throws ComException;
  @DeclDISPID(0)  public void setName(String value) throws ComException;
  @DeclDISPID(64063)  public OlViewSaveOption getSaveOption() throws ComException;
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException;
  @DeclDISPID(404)  public OlViewType getViewType() throws ComException;
  @DeclDISPID(64060)  public String getXML() throws ComException;
  @DeclDISPID(64060)  public void setXML(String value) throws ComException;
  @DeclDISPID(64054)  public void GoToDate(java.util.Date Date) throws ComException;
  @DeclDISPID(409)  public String getFilter() throws ComException;
  @DeclDISPID(409)  public void setFilter(String value) throws ComException;
  @DeclDISPID(8449)  public String getStartField() throws ComException;
  @DeclDISPID(8449)  public void setStartField(String value) throws ComException;
  @DeclDISPID(64379)  public String getEndField() throws ComException;
  @DeclDISPID(64379)  public void setEndField(String value) throws ComException;
  @DeclDISPID(64375)  public OlCalendarViewMode getCalendarViewMode() throws ComException;
  @DeclDISPID(64375)  public void setCalendarViewMode(OlCalendarViewMode value) throws ComException;
  @DeclDISPID(64365)  public OlDayWeekTimeScale getDayWeekTimeScale() throws ComException;
  @DeclDISPID(64365)  public void setDayWeekTimeScale(OlDayWeekTimeScale value) throws ComException;
  @DeclDISPID(64369)  public Boolean getMonthShowEndTime() throws ComException;
  @DeclDISPID(64369)  public void setMonthShowEndTime(Boolean value) throws ComException;
  @DeclDISPID(64371)  public Boolean getBoldDatesWithItems() throws ComException;
  @DeclDISPID(64371)  public void setBoldDatesWithItems(Boolean value) throws ComException;
  @DeclDISPID(64059)  public AutoFormatRules getAutoFormatRules() throws ComException;
  @DeclDISPID(64386)  public Integer getDaysInMultiDayMode() throws ComException;
  @DeclDISPID(64386)  public void setDaysInMultiDayMode(Integer value) throws ComException;
  @DeclDISPID(64519)  public Object getDisplayedDates() throws ComException;
  @DeclDISPID(64529)  public Boolean getBoldSubjects() throws ComException;
  @DeclDISPID(64529)  public void setBoldSubjects(Boolean value) throws ComException;
  @DeclDISPID(64570)  public java.util.Date getSelectedStartTime() throws ComException;
  @DeclDISPID(64571)  public java.util.Date getSelectedEndTime() throws ComException;
}
