/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{80B49C45-47D4-93E2-211D-A3C5912E4614}")
public class IShareableContentActionAvailabilityChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IShareableContentActionAvailabilityChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ShareableContentAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ShareableContentAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IShareableContentActionAvailabilityChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{4023052E-E3B7-48A3-BCB3-CA2234D9BAEE}");
  }
  protected IShareableContentActionAvailabilityChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IShareableContentActionAvailabilityChangedEventDataImpl" + super.toString() + "]";
  }
}
