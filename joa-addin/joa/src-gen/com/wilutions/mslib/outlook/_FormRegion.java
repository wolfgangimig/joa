/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _FormRegion.
 * 
 */
@CoInterface(guid="{0006305A-0000-0000-C000-000000000046}")
public interface _FormRegion extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException;
  @DeclDISPID(64312)  public Boolean getIsExpanded() throws ComException;
  @DeclDISPID(64313)  public IDispatch getForm() throws ComException;
  @DeclDISPID(64309)  public String getDetail() throws ComException;
  @DeclDISPID(64309)  public void setDetail(final String value) throws ComException;
  @DeclDISPID(64096)  public IDispatch getItem() throws ComException;
  @DeclDISPID(61502)  public _Inspector getInspector() throws ComException;
  @DeclDISPID(64308)  public OlFormRegionMode getFormRegionMode() throws ComException;
  @DeclDISPID(64065)  public Integer getLanguage() throws ComException;
  @DeclDISPID(64315)  public void Reflow() throws ComException;
  @DeclDISPID(12289)  public String getDisplayName() throws ComException;
  @DeclDISPID(8450)  public String getInternalName() throws ComException;
  @DeclDISPID(64201)  public void SetControlItemProperty(final IDispatch Control, final String PropertyName) throws ComException;
  @DeclDISPID(64518)  public Boolean getSuppressControlReplacement() throws ComException;
  @DeclDISPID(64518)  public void setSuppressControlReplacement(final Boolean value) throws ComException;
  @DeclDISPID(8457)  public void Select() throws ComException;
  @DeclDISPID(64538)  public Boolean getEnableAutoLayout() throws ComException;
  @DeclDISPID(64538)  public void setEnableAutoLayout(final Boolean value) throws ComException;
  @DeclDISPID(8451)  public Boolean getVisible() throws ComException;
  @DeclDISPID(8451)  public void setVisible(final Boolean value) throws ComException;
}
