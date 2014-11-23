/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{100FD584-4740-9E35-2DD5-3570A96B521A}")
public class ICustomAvailabilityStateImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ICustomAvailabilityState {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ContactAvailability getAvailability() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Availability", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactAvailability.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Integer getId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743810)  public String getActivity() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Activity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ICustomAvailabilityStateImpl(String progId) throws ComException {
    super(progId, "{D0984CEF-E323-4574-B07B-5C970C9CAEE0}");
  }
  protected ICustomAvailabilityStateImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ICustomAvailabilityStateImpl" + super.toString() + "]";
  }
}
