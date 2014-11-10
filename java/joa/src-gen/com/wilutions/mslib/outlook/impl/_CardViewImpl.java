/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9F3-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _CardViewImpl extends Dispatch implements com.wilutions.mslib.outlook._CardView {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
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
  @DeclDISPID(407)  public void Apply() throws ComException {
    this._dispatchCall(407,"Apply", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61490)  public com.wilutions.mslib.outlook.View Copy(String Name, com.wilutions.mslib.outlook.OlViewSaveOption SaveOption) throws ComException {
    assert(Name != null);
    assert(SaveOption != null);
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null,Name,SaveOption.value);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ViewImpl.class);
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64068)  public void Reset() throws ComException {
    this._dispatchCall(64068,"Reset", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64065)  public String getLanguage() throws ComException {
    final Object obj = this._dispatchCall(64065,"Language", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64065)  public void setLanguage(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64065,"Language", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64064)  public Boolean getLockUserChanges() throws ComException {
    final Object obj = this._dispatchCall(64064,"LockUserChanges", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64064)  public void setLockUserChanges(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64064,"LockUserChanges", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(0,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64063)  public com.wilutions.mslib.outlook.OlViewSaveOption getSaveOption() throws ComException {
    final Object obj = this._dispatchCall(64063,"SaveOption", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlViewSaveOption.valueOf((Integer)obj);
  }
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException {
    final Object obj = this._dispatchCall(64062,"Standard", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(404)  public com.wilutions.mslib.outlook.OlViewType getViewType() throws ComException {
    final Object obj = this._dispatchCall(404,"ViewType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlViewType.valueOf((Integer)obj);
  }
  @DeclDISPID(64060)  public String getXML() throws ComException {
    final Object obj = this._dispatchCall(64060,"XML", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64060)  public void setXML(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64060,"XML", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64054)  public void GoToDate(java.util.Date Date) throws ComException {
    assert(Date != null);
    this._dispatchCall(64054,"GoToDate", DISPATCH_METHOD,null,Date);
  }
  @DeclDISPID(409)  public String getFilter() throws ComException {
    final Object obj = this._dispatchCall(409,"Filter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(409)  public void setFilter(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(409,"Filter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64346)  public com.wilutions.mslib.outlook.OrderFields getSortFields() throws ComException {
    final Object obj = this._dispatchCall(64346,"SortFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.OrderFields.class);
  }
  @DeclDISPID(64351)  public Boolean getAllowInCellEditing() throws ComException {
    final Object obj = this._dispatchCall(64351,"AllowInCellEditing", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64351)  public void setAllowInCellEditing(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64351,"AllowInCellEditing", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64374)  public Boolean getShowEmptyFields() throws ComException {
    final Object obj = this._dispatchCall(64374,"ShowEmptyFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64374)  public void setShowEmptyFields(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64374,"ShowEmptyFields", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8471)  public Integer getWidth() throws ComException {
    final Object obj = this._dispatchCall(8471,"Width", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(8471)  public void setWidth(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(8471,"Width", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64364)  public Integer getMultiLineFieldHeight() throws ComException {
    final Object obj = this._dispatchCall(64364,"MultiLineFieldHeight", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64364)  public void setMultiLineFieldHeight(Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64364,"MultiLineFieldHeight", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64341)  public com.wilutions.mslib.outlook.ViewFields getViewFields() throws ComException {
    final Object obj = this._dispatchCall(64341,"ViewFields", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.ViewFields.class);
  }
  @DeclDISPID(64377)  public com.wilutions.mslib.outlook.ViewFont getHeadingsFont() throws ComException {
    final Object obj = this._dispatchCall(64377,"HeadingsFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.ViewFont.class);
  }
  @DeclDISPID(64378)  public com.wilutions.mslib.outlook.ViewFont getBodyFont() throws ComException {
    final Object obj = this._dispatchCall(64378,"BodyFont", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.ViewFont.class);
  }
  @DeclDISPID(64059)  public com.wilutions.mslib.outlook.AutoFormatRules getAutoFormatRules() throws ComException {
    final Object obj = this._dispatchCall(64059,"AutoFormatRules", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.AutoFormatRules.class);
  }
  public _CardViewImpl(String progId) throws ComException {
    super(progId);
  }
  protected _CardViewImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_CardViewImpl" + super.toString() + "]";
  }
}
