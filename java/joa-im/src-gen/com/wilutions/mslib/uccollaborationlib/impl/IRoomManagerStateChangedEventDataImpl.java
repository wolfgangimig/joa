/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{495072E5-E6DF-97DE-269A-E12A4DCB37CD}")
public class IRoomManagerStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IRoomManagerStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.RoomManagerState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.RoomManagerState.valueOf((Integer)obj);
  }
  public IRoomManagerStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{89C7EB8E-42BC-4C9F-BB34-88CDE83CCB37}");
  }
  protected IRoomManagerStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IRoomManagerStateChangedEventDataImpl" + super.toString() + "]";
  }
}
