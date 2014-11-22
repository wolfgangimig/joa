/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * FormRegion.
 * 
 */
@CoClass(guid="{0006315A-0000-0000-C000-000000000046}")
public class FormRegion extends Dispatch implements _FormRegion {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
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
  @DeclDISPID(64312)  public Boolean getIsExpanded() throws ComException {
    final Object obj = this._dispatchCall(64312,"IsExpanded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64313)  public Dispatch getForm() throws ComException {
    final Object obj = this._dispatchCall(64313,"Form", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(64309)  public String getDetail() throws ComException {
    final Object obj = this._dispatchCall(64309,"Detail", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64309)  public void setDetail(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64309,"Detail", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64096)  public Dispatch getItem() throws ComException {
    final Object obj = this._dispatchCall(64096,"Item", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(61502)  public _Inspector getInspector() throws ComException {
    final Object obj = this._dispatchCall(61502,"Inspector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(64308)  public OlFormRegionMode getFormRegionMode() throws ComException {
    final Object obj = this._dispatchCall(64308,"FormRegionMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlFormRegionMode.valueOf((Integer)obj);
  }
  @DeclDISPID(64065)  public Integer getLanguage() throws ComException {
    final Object obj = this._dispatchCall(64065,"Language", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64315)  public void Reflow() throws ComException {
    this._dispatchCall(64315,"Reflow", DISPATCH_METHOD,null);
  }
  @DeclDISPID(12289)  public String getDisplayName() throws ComException {
    final Object obj = this._dispatchCall(12289,"DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public String getInternalName() throws ComException {
    final Object obj = this._dispatchCall(8450,"InternalName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64201)  public void SetControlItemProperty(Dispatch Control, String PropertyName) throws ComException {
    assert(PropertyName != null);
    this._dispatchCall(64201,"SetControlItemProperty", DISPATCH_METHOD,null,(Control!=null?Control:Dispatch.NULL),PropertyName);
  }
  @DeclDISPID(64518)  public Boolean getSuppressControlReplacement() throws ComException {
    final Object obj = this._dispatchCall(64518,"SuppressControlReplacement", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64518)  public void setSuppressControlReplacement(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64518,"SuppressControlReplacement", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8457)  public void Select() throws ComException {
    this._dispatchCall(8457,"Select", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64538)  public Boolean getEnableAutoLayout() throws ComException {
    final Object obj = this._dispatchCall(64538,"EnableAutoLayout", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64538)  public void setEnableAutoLayout(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64538,"EnableAutoLayout", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8451)  public Boolean getVisible() throws ComException {
    final Object obj = this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(8451)  public void setVisible(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(8451,"Visible", DISPATCH_PROPERTYPUT,value);
  }
  public FormRegion() throws ComException {
    super("{0006315A-0000-0000-C000-000000000046}", "{0006305A-0000-0000-C000-000000000046}");
  }
  protected FormRegion(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[FormRegion" + super.toString() + "]";
  }
}
