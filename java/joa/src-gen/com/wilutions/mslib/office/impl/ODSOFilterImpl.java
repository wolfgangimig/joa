/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8C58-A463-DB41-5DAE-69E7A5F7FCBC}")
public class ODSOFilterImpl extends Dispatch implements com.wilutions.mslib.office.ODSOFilter {
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
  @DeclDISPID(1)  public Integer getIndex() throws ComException {
    final Object obj = this._dispatchCall(1,"Index", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(2,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(3)  public String getColumn() throws ComException {
    final Object obj = this._dispatchCall(3,"Column", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3)  public void setColumn(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3,"Column", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoFilterComparison getComparison() throws ComException {
    final Object obj = this._dispatchCall(4,"Comparison", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFilterComparison.valueOf((Integer)obj);
  }
  @DeclDISPID(4)  public void setComparison(com.wilutions.mslib.office.MsoFilterComparison value) throws ComException {
    assert(value != null);
    this._dispatchCall(4,"Comparison", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(5)  public String getCompareTo() throws ComException {
    final Object obj = this._dispatchCall(5,"CompareTo", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(5)  public void setCompareTo(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"CompareTo", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(6)  public com.wilutions.mslib.office.MsoFilterConjunction getConjunction() throws ComException {
    final Object obj = this._dispatchCall(6,"Conjunction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoFilterConjunction.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public void setConjunction(com.wilutions.mslib.office.MsoFilterConjunction value) throws ComException {
    assert(value != null);
    this._dispatchCall(6,"Conjunction", DISPATCH_PROPERTYPUT,value.value);
  }
  public ODSOFilterImpl(String progId) throws ComException {
    super(progId, "{000C1533-0000-0000-C000-000000000046}");
  }
  protected ODSOFilterImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ODSOFilterImpl" + super.toString() + "]";
  }
}
