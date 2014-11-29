/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IDeviceManager.
 * IDeviceManager Interface 
 */
@CoInterface(guid="{9274DBDC-43CE-45AA-A817-414A4494AD28}")
public interface IDeviceManager extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IAsynchronousOperation PlayAudioFile(final String _audioFileName, final AudioPlayBackModes _playbackDevices, final Boolean _loop, final Object _deviceManagerCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743809)  public void StopPlayingAllAudioFiles() throws ComException;
  @DeclDISPID(1610743810)  public IDeviceCollection getAudioDevices() throws ComException;
  @DeclDISPID(1610743811)  public IDeviceCollection getVideoDevices() throws ComException;
  @DeclDISPID(1610743812)  public IAudioDevice getActiveAudioDevice() throws ComException;
  @DeclDISPID(1610743812)  public void setActiveAudioDevice(final IAudioDevice value) throws ComException;
  @DeclDISPID(1610743814)  public IVideoDevice getActiveVideoDevice() throws ComException;
  @DeclDISPID(1610743814)  public void setActiveVideoDevice(final IVideoDevice value) throws ComException;
}
