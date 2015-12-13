/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1E4A4ED6-E300-9A93-0704-DB26E6B2805E}")
public class IModalityActionAvailabilityChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModalityActionAvailabilityChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ModalityAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IModalityActionAvailabilityChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{DEDDD7BD-4763-41D2-9AAA-B2C143457CA4}");
  }
  protected IModalityActionAvailabilityChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityActionAvailabilityChangedEventDataImpl" + super.toString() + "]";
  }
}
