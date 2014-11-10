/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E45-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoHiLoLinesImpl extends Dispatch implements com.wilutions.mslib.office.IMsoHiLoLines {
  @DeclDISPID(1610743808)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public void Select() throws ComException {
    this._dispatchCall(1610743810,"Select", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.office.IMsoBorder getBorder() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Border", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoBorderImpl.class);
  }
  @DeclDISPID(1610743812)  public void Delete() throws ComException {
    this._dispatchCall(1610743812,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.office.IMsoChartFormat getFormat() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Format", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.IMsoChartFormatImpl.class);
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
  public IMsoHiLoLinesImpl(String progId) throws ComException {
    super(progId);
  }
  protected IMsoHiLoLinesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoHiLoLinesImpl" + super.toString() + "]";
  }
}
