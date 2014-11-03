/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _CardView.
 * 
 */
@CoInterface(guid="{00063098-0000-0000-C000-000000000046}")
public interface _CardView extends IDispatch {
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
  @DeclDISPID(64346)  public OrderFields getSortFields() throws ComException;
  @DeclDISPID(64351)  public Boolean getAllowInCellEditing() throws ComException;
  @DeclDISPID(64351)  public void setAllowInCellEditing(Boolean value) throws ComException;
  @DeclDISPID(64374)  public Boolean getShowEmptyFields() throws ComException;
  @DeclDISPID(64374)  public void setShowEmptyFields(Boolean value) throws ComException;
  @DeclDISPID(8471)  public Integer getWidth() throws ComException;
  @DeclDISPID(8471)  public void setWidth(Integer value) throws ComException;
  @DeclDISPID(64364)  public Integer getMultiLineFieldHeight() throws ComException;
  @DeclDISPID(64364)  public void setMultiLineFieldHeight(Integer value) throws ComException;
  @DeclDISPID(64341)  public ViewFields getViewFields() throws ComException;
  @DeclDISPID(64377)  public ViewFont getHeadingsFont() throws ComException;
  @DeclDISPID(64378)  public ViewFont getBodyFont() throws ComException;
  @DeclDISPID(64059)  public AutoFormatRules getAutoFormatRules() throws ComException;
}
