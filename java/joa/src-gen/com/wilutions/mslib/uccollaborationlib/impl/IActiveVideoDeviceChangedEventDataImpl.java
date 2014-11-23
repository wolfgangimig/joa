/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E3B885C0-F732-9509-1729-4862E1A88DD7}")
public class IActiveVideoDeviceChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IActiveVideoDeviceChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IVideoDevice getNewActiveVideoDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"NewActiveVideoDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IVideoDeviceImpl.class);
  }
  public IActiveVideoDeviceChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{232F1CAB-5351-4E48-8A87-2185445F712D}");
  }
  protected IActiveVideoDeviceChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IActiveVideoDeviceChangedEventDataImpl" + super.toString() + "]";
  }
}
