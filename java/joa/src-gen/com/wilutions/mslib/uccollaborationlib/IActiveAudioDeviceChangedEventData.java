/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IActiveAudioDeviceChangedEventData.
 * IActiveAudioDeviceChangedEventData Interface 
 */
@CoInterface(guid="{3959E5C6-75CC-448E-9A18-9F163FF47646}")
public interface IActiveAudioDeviceChangedEventData extends IDispatch {
  @DeclDISPID(1610743808)  public IAudioDevice getOldActiveAudioDevice() throws ComException;
  @DeclDISPID(1610743809)  public IAudioDevice getNewActiveAudioDevice() throws ComException;
}
