/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5DDAA47B-7ADF-9B87-3157-3B9E233CBE46}")
public class IChannelActionAvailabilityEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IChannelActionAvailabilityEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ChannelAction getAction() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Action", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ChannelAction.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public Boolean getIsAvailable() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsAvailable", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IChannelActionAvailabilityEventDataImpl(String progId) throws ComException {
    super(progId, "{9D4D3D10-DEBC-40C6-ACF9-527986CB42BC}");
  }
  protected IChannelActionAvailabilityEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IChannelActionAvailabilityEventDataImpl" + super.toString() + "]";
  }
}
