/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E4022027-9CCC-98DA-260E-63342862601E}")
public class IChannelStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IChannelStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ChannelState getOldState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ChannelState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ChannelState getNewState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ChannelState.valueOf((Integer)obj);
  }
  public IChannelStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{2495B94C-38AF-439B-BBA0-0AD38D959CE4}");
  }
  protected IChannelStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IChannelStateChangedEventDataImpl" + super.toString() + "]";
  }
}
