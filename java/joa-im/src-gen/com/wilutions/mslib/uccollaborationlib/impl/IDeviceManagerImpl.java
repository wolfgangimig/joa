/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{52E342B7-E7AD-9EEB-35B9-28ADE16351D2}")
public class IDeviceManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IDeviceManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation PlayAudioFile(String _audioFileName, com.wilutions.mslib.uccollaborationlib.AudioPlayBackModes _playbackDevices, Boolean _loop, Object _deviceManagerCallback, Object _state) throws ComException {
    assert(_audioFileName != null);
    assert(_playbackDevices != null);
    assert(_loop != null);
    assert(_deviceManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743808,"PlayAudioFile", DISPATCH_METHOD,null,_audioFileName,_playbackDevices.value,_loop,_deviceManagerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743809)  public void StopPlayingAllAudioFiles() throws ComException {
    this._dispatchCall(1610743809,"StopPlayingAllAudioFiles", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IDeviceCollection getAudioDevices() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AudioDevices", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IDeviceCollectionImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IDeviceCollection getVideoDevices() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"VideoDevices", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IDeviceCollectionImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IAudioDevice getActiveAudioDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ActiveAudioDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAudioDeviceImpl.class);
  }
  @DeclDISPID(1610743812)  public void setActiveAudioDevice(com.wilutions.mslib.uccollaborationlib.IAudioDevice value) throws ComException {
    this._dispatchCall(1610743812,"ActiveAudioDevice", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IVideoDevice getActiveVideoDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ActiveVideoDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoDeviceImpl.class);
  }
  @DeclDISPID(1610743814)  public void setActiveVideoDevice(com.wilutions.mslib.uccollaborationlib.IVideoDevice value) throws ComException {
    this._dispatchCall(1610743814,"ActiveVideoDevice", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  public IDeviceManagerImpl(String progId) throws ComException {
    super(progId, "{9274DBDC-43CE-45AA-A817-414A4494AD28}");
  }
  protected IDeviceManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IDeviceManagerImpl" + super.toString() + "]";
  }
}
