/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * WorkingHours.
 * Represents working hours of a contact. 
 */
@CoClass(guid="{FF235FFE-EDEF-4D1B-9205-519888A7AD8D}")
public class WorkingHours extends Dispatch implements IWorkingHours {
  @DeclDISPID(1610743808)  public String getEmailAddress() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"EmailAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public IWorkingPeriod[] getWorkingPeriods() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"WorkingPeriods", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IWorkingPeriod[])obj;
  }
  public WorkingHours() throws ComException {
    super("{FF235FFE-EDEF-4D1B-9205-519888A7AD8D}", "{53D014C1-54DB-42B3-9DFD-8E231EF2C356}");
  }
  protected WorkingHours(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[WorkingHours" + super.toString() + "]";
  }
}
