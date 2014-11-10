/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A92C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _UserDefinedPropertiesImpl extends Dispatch implements com.wilutions.mslib.outlook._UserDefinedProperties {
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
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(81)  public com.wilutions.mslib.outlook._UserDefinedProperty Item(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(81,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._UserDefinedPropertyImpl.class);
  }
  @DeclDISPID(102)  public com.wilutions.mslib.outlook.UserDefinedProperty Add(String Name, com.wilutions.mslib.outlook.OlUserPropertyType Type, Object DisplayFormat, Object Formula) throws ComException {
    assert(Name != null);
    assert(Type != null);
    assert(DisplayFormat != null);
    assert(Formula != null);
    final Object obj = this._dispatchCall(102,"Add", DISPATCH_METHOD,null,Name,Type.value,DisplayFormat,Formula);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.UserDefinedProperty.class);
  }
  @DeclDISPID(103)  public com.wilutions.mslib.outlook.UserDefinedProperty Find(String Name) throws ComException {
    assert(Name != null);
    final Object obj = this._dispatchCall(103,"Find", DISPATCH_METHOD,null,Name);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.UserDefinedProperty.class);
  }
  @DeclDISPID(82)  public void Remove(Integer Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  @DeclDISPID(64069)  public void Refresh() throws ComException {
    this._dispatchCall(64069,"Refresh", DISPATCH_METHOD,null);
  }
  public _UserDefinedPropertiesImpl(String progId) throws ComException {
    super(progId);
  }
  protected _UserDefinedPropertiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_UserDefinedPropertiesImpl" + super.toString() + "]";
  }
}
