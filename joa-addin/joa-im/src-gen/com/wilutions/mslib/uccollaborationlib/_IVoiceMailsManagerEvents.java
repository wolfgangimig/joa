/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * _IVoiceMailsManagerEvents.
 * _IVoiceMailsManagerEvents Interface 
 */
@CoInterface(guid="{B0C10F94-CAB6-4821-9643-D781885A46AF}")
public interface _IVoiceMailsManagerEvents extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2150)  public void onOnConnectionStateChanged(final IVoiceMailsManager _eventSource, final IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException;
  @DeclDISPID(2151)  public void onOnNewVoiceMailCountSinceLastResetChanged(final IVoiceMailsManager _eventSource, final IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException;
  @DeclDISPID(2153)  public void onOnVoiceMailsAdded(final IVoiceMailsManager _eventSource, final IVoiceMailBatchEventData _eventData) throws ComException;
  @DeclDISPID(2154)  public void onOnVoiceMailsRemoved(final IVoiceMailsManager _eventSource, final IVoiceMailBatchEventData _eventData) throws ComException;
  @DeclDISPID(2155)  public void onOnVoiceMailsModified(final IVoiceMailsManager _eventSource, final IVoiceMailBatchEventData _eventData) throws ComException;
}
