/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _TimelineView.
 * 
 */
@CoInterface(guid="{0006309C-0000-0000-C000-000000000046}")
public interface _TimelineView extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
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
  @DeclDISPID(64344)  public OrderFields getGroupByFields() throws ComException;
  @DeclDISPID(64384)  public OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting() throws ComException;
  @DeclDISPID(64384)  public void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting value) throws ComException;
  @DeclDISPID(64373)  public Boolean getShowWeekNumbers() throws ComException;
  @DeclDISPID(64373)  public void setShowWeekNumbers(Boolean value) throws ComException;
  @DeclDISPID(64043)  public Integer getMaxLabelWidth() throws ComException;
  @DeclDISPID(64043)  public void setMaxLabelWidth(Integer value) throws ComException;
  @DeclDISPID(64372)  public Boolean getShowLabelWhenViewingByMonth() throws ComException;
  @DeclDISPID(64372)  public void setShowLabelWhenViewingByMonth(Boolean value) throws ComException;
  @DeclDISPID(64040)  public ViewFont getUpperScaleFont() throws ComException;
  @DeclDISPID(64044)  public ViewFont getLowerScaleFont() throws ComException;
  @DeclDISPID(64045)  public ViewFont getItemFont() throws ComException;
  @DeclDISPID(64392)  public OlTimelineViewMode getTimelineViewMode() throws ComException;
  @DeclDISPID(64392)  public void setTimelineViewMode(OlTimelineViewMode value) throws ComException;
}
