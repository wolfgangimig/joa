/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IChannelEvents.
 * _IChannelEvents Interface 
 */
@CoInterface(guid="{0CA9BAE8-DD28-4929-A821-4D00F11203CC}")
public interface _IChannelEvents extends IDispatch {
  @DeclDISPID(1300)  public void onOnStateChanged(IChannel _eventSource, IChannelStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(1301)  public void onOnActionAvailabilityChanged(IChannel _eventSource, IChannelActionAvailabilityEventData _eventData) throws ComException;
}
