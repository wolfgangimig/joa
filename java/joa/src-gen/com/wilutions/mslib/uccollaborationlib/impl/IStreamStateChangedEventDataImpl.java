/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{0AE97211-D9A0-94BF-3CDA-4A3CFFF7C0FE}")
public class IStreamStateChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IStreamStateChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IChannel getChannel() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Channel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IChannelImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.MediaStreamDirection getDirection() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Direction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.MediaStreamDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Boolean getIsActive() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"IsActive", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IStreamStateChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{CA7EEB7A-7DC3-4FFE-A174-23DB5A003C04}");
  }
  protected IStreamStateChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IStreamStateChangedEventDataImpl" + super.toString() + "]";
  }
}
