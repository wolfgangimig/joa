/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A946-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _PropertyAccessorImpl extends Dispatch implements com.wilutions.mslib.outlook._PropertyAccessor {
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
  @DeclDISPID(64251)  public Object GetProperty(String SchemaName) throws ComException {
    assert(SchemaName != null);
    final Object obj = this._dispatchCall(64251,"GetProperty", DISPATCH_METHOD,null,SchemaName);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64252)  public void SetProperty(String SchemaName, Object Value) throws ComException {
    assert(SchemaName != null);
    assert(Value != null);
    this._dispatchCall(64252,"SetProperty", DISPATCH_METHOD,null,SchemaName,Value);
  }
  @DeclDISPID(64254)  public Object GetProperties(Object SchemaNames) throws ComException {
    assert(SchemaNames != null);
    final Object obj = this._dispatchCall(64254,"GetProperties", DISPATCH_METHOD,null,SchemaNames);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64255)  public Object SetProperties(Object SchemaNames, Object Values) throws ComException {
    assert(SchemaNames != null);
    assert(Values != null);
    final Object obj = this._dispatchCall(64255,"SetProperties", DISPATCH_METHOD,null,SchemaNames,Values);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64256)  public java.util.Date UTCToLocalTime(java.util.Date Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64256,"UTCToLocalTime", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64257)  public java.util.Date LocalTimeToUTC(java.util.Date Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64257,"LocalTimeToUTC", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64258)  public Object StringToBinary(String Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64258,"StringToBinary", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64259)  public String BinaryToString(Object Value) throws ComException {
    assert(Value != null);
    final Object obj = this._dispatchCall(64259,"BinaryToString", DISPATCH_METHOD,null,Value);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64401)  public void DeleteProperty(String SchemaName) throws ComException {
    assert(SchemaName != null);
    this._dispatchCall(64401,"DeleteProperty", DISPATCH_METHOD,null,SchemaName);
  }
  @DeclDISPID(64402)  public Object DeleteProperties(Object SchemaNames) throws ComException {
    assert(SchemaNames != null);
    final Object obj = this._dispatchCall(64402,"DeleteProperties", DISPATCH_METHOD,null,SchemaNames);
    if (obj == null) return null;
    return (Object)obj;
  }
  public _PropertyAccessorImpl(String progId) throws ComException {
    super(progId, "{0006302D-0000-0000-C000-000000000046}");
  }
  protected _PropertyAccessorImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_PropertyAccessorImpl" + super.toString() + "]";
  }
}
