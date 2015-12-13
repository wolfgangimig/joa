/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IDeviceManagerEvents.
 * _IDeviceManagerEvents Interface 
 */
@CoInterface(guid="{4AA93AA8-898C-45EE-8E5C-1A86739B3F96}")
public interface _IDeviceManagerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(650)  public void onOnDeviceAdded(final IDeviceManager _eventSource, final IDeviceCollectionEventData _eventData) throws ComException;
  @DeclDISPID(651)  public void onOnDeviceRemoved(final IDeviceManager _eventSource, final IDeviceCollectionEventData _eventData) throws ComException;
  @DeclDISPID(652)  public void onOnActiveAudioDeviceChanged(final IDeviceManager _eventSource, final IActiveAudioDeviceChangedEventData _eventData) throws ComException;
  @DeclDISPID(653)  public void onOnActiveVideoDeviceChanged(final IDeviceManager _eventSource, final IActiveVideoDeviceChangedEventData _eventData) throws ComException;
}
