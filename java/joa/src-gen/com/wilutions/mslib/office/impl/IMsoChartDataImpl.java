/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B8E44-A463-DB41-5DAE-69E7A5F7FCBC}")
public class IMsoChartDataImpl extends Dispatch implements com.wilutions.mslib.office.IMsoChartData {
  @DeclDISPID(1610743808)  public Dispatch getWorkbook() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Workbook", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public void Activate() throws ComException {
    this._dispatchCall(1610743809,"Activate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public Boolean getIsLinked() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"IsLinked", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public void BreakLink() throws ComException {
    this._dispatchCall(1610743811,"BreakLink", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743812)  public void ActivateChartDataWindow() throws ComException {
    this._dispatchCall(1610743812,"ActivateChartDataWindow", DISPATCH_METHOD,null);
  }
  public IMsoChartDataImpl(String progId) throws ComException {
    super(progId, "{000C172F-0000-0000-C000-000000000046}");
  }
  protected IMsoChartDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IMsoChartDataImpl" + super.toString() + "]";
  }
}
