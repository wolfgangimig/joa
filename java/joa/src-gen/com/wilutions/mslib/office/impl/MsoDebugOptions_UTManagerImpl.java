/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AE2-A463-DB41-5DAE-69E7A5F7FCBC}")
public class MsoDebugOptions_UTManagerImpl extends Dispatch implements com.wilutions.mslib.office.MsoDebugOptions_UTManager {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoDebugOptions_UTs getUnitTests() throws ComException {
    final Object obj = this._dispatchCall(0,"UnitTests", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.MsoDebugOptions_UTsImpl.class);
  }
  @DeclDISPID(1)  public void NotifyStartOfTestSuiteRun() throws ComException {
    this._dispatchCall(1,"NotifyStartOfTestSuiteRun", DISPATCH_METHOD,null);
  }
  @DeclDISPID(2)  public void NotifyEndOfTestSuiteRun() throws ComException {
    this._dispatchCall(2,"NotifyEndOfTestSuiteRun", DISPATCH_METHOD,null);
  }
  @DeclDISPID(3)  public Boolean getReportErrors() throws ComException {
    final Object obj = this._dispatchCall(3,"ReportErrors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3)  public void setReportErrors(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"ReportErrors", DISPATCH_PROPERTYPUT,value);
  }
  public MsoDebugOptions_UTManagerImpl(String progId) throws ComException {
    super(progId, "{000C0389-0000-0000-C000-000000000046}");
  }
  protected MsoDebugOptions_UTManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[MsoDebugOptions_UTManagerImpl" + super.toString() + "]";
  }
}
