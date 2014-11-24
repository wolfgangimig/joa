/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A2A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ScriptImpl extends Dispatch implements com.wilutions.mslib.office.Script {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610809344)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610809344,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610809345)  public String getExtended() throws ComException {
    final Object obj = this._dispatchCall(1610809345,"Extended", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809345)  public void setExtended(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809345,"Extended", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809347)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610809347)  public void setId(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809347,"Id", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.office.MsoScriptLanguage getLanguage() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"Language", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoScriptLanguage.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809349)  public void setLanguage(com.wilutions.mslib.office.MsoScriptLanguage value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610809349,"Language", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610809351)  public com.wilutions.mslib.office.MsoScriptLocation getLocation() throws ComException {
    final Object obj = this._dispatchCall(1610809351,"Location", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoScriptLocation.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809352)  public void Delete() throws ComException {
    this._dispatchCall(1610809352,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610809353)  public IDispatch getShape() throws ComException {
    final Object obj = this._dispatchCall(1610809353,"Shape", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(0)  public String getScriptText() throws ComException {
    final Object obj = this._dispatchCall(0,"ScriptText", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(0)  public void setScriptText(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(0,"ScriptText", DISPATCH_PROPERTYPUT,value);
  }
  public ScriptImpl(String progId) throws ComException {
    super(progId, "{000C0341-0000-0000-C000-000000000046}");
  }
  protected ScriptImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScriptImpl" + super.toString() + "]";
  }
}
