/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F30AB1AD-9979-9E95-27BA-CC80E78366B9}")
public class IWorkingPeriodImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IWorkingPeriod {
  @DeclDISPID(1610743808)  public java.util.Date getStartTime() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"StartTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743809)  public java.util.Date getEndTime() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"EndTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.DaysOfWeek getDays() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Days", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.DaysOfWeek.valueOf((Integer)obj);
  }
  public IWorkingPeriodImpl(String progId) throws ComException {
    super(progId, "{339D28C6-3D1A-45D4-BA14-A56742749A43}");
  }
  protected IWorkingPeriodImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWorkingPeriodImpl" + super.toString() + "]";
  }
}
