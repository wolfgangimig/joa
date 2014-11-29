/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A9F8-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _AutoFormatRuleImpl extends Dispatch implements com.wilutions.mslib.outlook._AutoFormatRule {
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
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8450,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64024)  public String getFilter() throws ComException {
    final Object obj = this._dispatchCall(64024,"Filter", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64024)  public void setFilter(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64024,"Filter", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64023)  public com.wilutions.mslib.outlook.ViewFont getFont() throws ComException {
    final Object obj = this._dispatchCall(64023,"Font", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.ViewFont.class);
  }
  @DeclDISPID(64023)  public void setFont(final com.wilutions.mslib.outlook.ViewFont value) throws ComException {
    this._dispatchCall(64023,"Font", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(64062)  public Boolean getStandard() throws ComException {
    final Object obj = this._dispatchCall(64062,"Standard", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public _AutoFormatRuleImpl(String progId) throws ComException {
    super(progId, "{00063093-0000-0000-C000-000000000046}");
  }
  protected _AutoFormatRuleImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_AutoFormatRuleImpl" + super.toString() + "]";
  }
}
