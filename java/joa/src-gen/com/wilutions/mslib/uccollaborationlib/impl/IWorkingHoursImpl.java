/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{93478DAA-F0B8-99F2-0053-E7C4BB053FAC}")
public class IWorkingHoursImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IWorkingHours {
  @DeclDISPID(1610743808)  public String getEmailAddress() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"EmailAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IWorkingPeriod[] getWorkingPeriods() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"WorkingPeriods", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IWorkingPeriod[])obj;
  }
  public IWorkingHoursImpl(String progId) throws ComException {
    super(progId, "{53D014C1-54DB-42B3-9DFD-8E231EF2C356}");
  }
  protected IWorkingHoursImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IWorkingHoursImpl" + super.toString() + "]";
  }
}
