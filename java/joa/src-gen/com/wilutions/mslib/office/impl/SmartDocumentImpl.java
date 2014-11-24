/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A1C-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SmartDocumentImpl extends Dispatch implements com.wilutions.mslib.office.SmartDocument {
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
  @DeclDISPID(1)  public String getSolutionID() throws ComException {
    final Object obj = this._dispatchCall(1,"SolutionID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public void setSolutionID(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"SolutionID", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public String getSolutionURL() throws ComException {
    final Object obj = this._dispatchCall(2,"SolutionURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public void setSolutionURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"SolutionURL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public void PickSolution(Boolean ConsiderAllSchemas) throws ComException {
    assert(ConsiderAllSchemas != null);
    this._dispatchCall(3,"PickSolution", DISPATCH_METHOD,null,ConsiderAllSchemas);
  }
  @DeclDISPID(4)  public void RefreshPane() throws ComException {
    this._dispatchCall(4,"RefreshPane", DISPATCH_METHOD,null);
  }
  public SmartDocumentImpl(String progId) throws ComException {
    super(progId, "{000C0377-0000-0000-C000-000000000046}");
  }
  protected SmartDocumentImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SmartDocumentImpl" + super.toString() + "]";
  }
}
