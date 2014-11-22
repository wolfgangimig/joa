/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A929-A463-DB41-5DAE-69E7A5F7FCBC}")
public class UserPropertyImpl extends Dispatch implements com.wilutions.mslib.outlook.UserProperty {
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
  @DeclDISPID(103)  public String getFormula() throws ComException {
    final Object obj = this._dispatchCall(103,"Formula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(103)  public void setFormula(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Formula", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(112)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(112,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(109)  public com.wilutions.mslib.outlook.OlUserPropertyType getType() throws ComException {
    final Object obj = this._dispatchCall(109,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlUserPropertyType.valueOf((Integer)obj);
  }
  @DeclDISPID(104)  public String getValidationFormula() throws ComException {
    final Object obj = this._dispatchCall(104,"ValidationFormula", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(104)  public void setValidationFormula(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(104,"ValidationFormula", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(105)  public String getValidationText() throws ComException {
    final Object obj = this._dispatchCall(105,"ValidationText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(105)  public void setValidationText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(105,"ValidationText", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(0)  public Object getValue() throws ComException {
    final Object obj = this._dispatchCall(0,"Value", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(0)  public void setValue(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"Value", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(108)  public void Delete() throws ComException {
    this._dispatchCall(108,"Delete", DISPATCH_METHOD,null);
  }
  public UserPropertyImpl(String progId) throws ComException {
    super(progId, "{00063042-0000-0000-C000-000000000046}");
  }
  protected UserPropertyImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UserPropertyImpl" + super.toString() + "]";
  }
}
