/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F9CE7CAD-D1AF-9FCF-07B6-F6F19A038ABC}")
public class IActiveAudioDeviceChangedEventDataImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IActiveAudioDeviceChangedEventData {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IAudioDevice getOldActiveAudioDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"OldActiveAudioDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAudioDeviceImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IAudioDevice getNewActiveAudioDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"NewActiveAudioDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAudioDeviceImpl.class);
  }
  public IActiveAudioDeviceChangedEventDataImpl(String progId) throws ComException {
    super(progId, "{3959E5C6-75CC-448E-9A18-9F163FF47646}");
  }
  protected IActiveAudioDeviceChangedEventDataImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IActiveAudioDeviceChangedEventDataImpl" + super.toString() + "]";
  }
}
