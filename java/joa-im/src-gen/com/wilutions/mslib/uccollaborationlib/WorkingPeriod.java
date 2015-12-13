/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * WorkingPeriod.
 * Represents work days and hours of a contact. 
 */
@CoClass(guid="{B482E1E6-AFB7-4E58-91EE-3E20F6139220}")
public class WorkingPeriod extends Dispatch implements IWorkingPeriod {
  static boolean __typelib__loaded = __TypeLib.load();
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
  @DeclDISPID(1610743810)  public DaysOfWeek getDays() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Days", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return DaysOfWeek.valueOf((Integer)obj);
  }
  public WorkingPeriod() throws ComException {
    super("{B482E1E6-AFB7-4E58-91EE-3E20F6139220}", "{339D28C6-3D1A-45D4-BA14-A56742749A43}");
  }
  protected WorkingPeriod(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WorkingPeriod" + super.toString() + "]";
  }
}
