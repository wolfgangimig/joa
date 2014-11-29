/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DeviceManager.
 * DeviceManager Class 
 */
@CoClass(guid="{FDA610FC-4565-4E70-B088-4B72A16E1967}")
public class DeviceManager extends Dispatch implements IDeviceManager {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IAsynchronousOperation PlayAudioFile(String _audioFileName, AudioPlayBackModes _playbackDevices, Boolean _loop, Object _deviceManagerCallback, Object _state) throws ComException {
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
  @DeclDISPID(1610743810)  public IDeviceCollection getAudioDevices() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AudioDevices", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IDeviceCollectionImpl.class);
  }
  @DeclDISPID(1610743811)  public IDeviceCollection getVideoDevices() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"VideoDevices", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IDeviceCollectionImpl.class);
  }
  @DeclDISPID(1610743812)  public IAudioDevice getActiveAudioDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ActiveAudioDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAudioDeviceImpl.class);
  }
  @DeclDISPID(1610743812)  public void setActiveAudioDevice(IAudioDevice value) throws ComException {
    this._dispatchCall(1610743812,"ActiveAudioDevice", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public IVideoDevice getActiveVideoDevice() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ActiveVideoDevice", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVideoDeviceImpl.class);
  }
  @DeclDISPID(1610743814)  public void setActiveVideoDevice(IVideoDevice value) throws ComException {
    this._dispatchCall(1610743814,"ActiveVideoDevice", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  public DeviceManager() throws ComException {
    super("{FDA610FC-4565-4E70-B088-4B72A16E1967}", "{9274DBDC-43CE-45AA-A817-414A4494AD28}");
  }
  protected DeviceManager(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DeviceManager" + super.toString() + "]";
  }
}
