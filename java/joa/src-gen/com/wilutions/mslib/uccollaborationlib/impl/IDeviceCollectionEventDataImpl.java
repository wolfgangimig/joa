/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{28B0AED2-16DD-91BC-2BE7-A011C09583DA}")
public class IDeviceCollectionEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDeviceCollectionEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IDevice getDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Device", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IDeviceImpl.class);
  }
  public IDeviceCollectionEventDataImpl(String progId) throws ComException {
    super(progId, "{E82737B9-B2BE-4AFD-B649-C9F665627F20}");
  }
  protected IDeviceCollectionEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDeviceCollectionEventDataImpl" + super.toString() + "]";
  }
}
