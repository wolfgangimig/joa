/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E4A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoErrorBarsImpl extends Dispatch implements com.wilutions.mslib.office.IMsoErrorBars {
  @DeclDISPID(150)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(150,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(110)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(110,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(235)  public Object Select() throws ComException {
    final Object obj = this._dispatchCall(235,"Select", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(128)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(128,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoBorder)obj;
  }
  @DeclDISPID(117)  public Object Delete() throws ComException {
    final Object obj = this._dispatchCall(117,"Delete", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(112)  public Object ClearFormats() throws ComException {
    final Object obj = this._dispatchCall(112,"ClearFormats", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(1124)  public com.wilutions.mslib.office.XlEndStyleCap getEndStyle() throws ComException {
    final Object obj = this._dispatchCall(1124,"EndStyle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.XlEndStyleCap.valueOf((Integer)obj);
  }
  @DeclDISPID(1124)  public void setEndStyle(com.wilutions.mslib.office.XlEndStyleCap RHS) throws ComException {
    assert(RHS != null);
    this._dispatchCall(1124,"EndStyle", DISPATCH_PROPERTYPUT,RHS.value);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.office.IMsoChartFormat)obj;
  }
  @DeclDISPID(148)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(148,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(149)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(149,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public IMsoErrorBarsImpl(String progId) throws ComException {
    super(progId, "{000C1721-0000-0000-C000-000000000046}");
  }
  protected IMsoErrorBarsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoErrorBarsImpl" + super.toString() + "]";
  }
}
