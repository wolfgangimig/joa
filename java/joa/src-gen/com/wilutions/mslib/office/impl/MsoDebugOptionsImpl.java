/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A31-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MsoDebugOptionsImpl extends Dispatch implements com.wilutions.mslib.office.MsoDebugOptions {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(5)  public Boolean getOutputToDebugger() throws ComException {
    final Object obj = this._dispatchCall(5,"OutputToDebugger", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(5)  public void setOutputToDebugger(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"OutputToDebugger", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public Boolean getOutputToFile() throws ComException {
    final Object obj = this._dispatchCall(6,"OutputToFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(6)  public void setOutputToFile(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"OutputToFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(7)  public Boolean getOutputToMessageBox() throws ComException {
    final Object obj = this._dispatchCall(7,"OutputToMessageBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(7)  public void setOutputToMessageBox(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"OutputToMessageBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public Object getUnitTestManager() throws ComException {
    final Object obj = this._dispatchCall(8,"UnitTestManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(9)  public void AddIgnoredAssertTag(String bstrTagToIgnore) throws ComException {
    assert(bstrTagToIgnore != null);
    this._dispatchCall(9,"AddIgnoredAssertTag", DISPATCH_METHOD,null,bstrTagToIgnore);
  }
  @DeclDISPID(10)  public void RemoveIgnoredAssertTag(String bstrTagToIgnore) throws ComException {
    assert(bstrTagToIgnore != null);
    this._dispatchCall(10,"RemoveIgnoredAssertTag", DISPATCH_METHOD,null,bstrTagToIgnore);
  }
  public MsoDebugOptionsImpl(String progId) throws ComException {
    super(progId);
  }
  protected MsoDebugOptionsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoDebugOptionsImpl" + super.toString() + "]";
  }
}
