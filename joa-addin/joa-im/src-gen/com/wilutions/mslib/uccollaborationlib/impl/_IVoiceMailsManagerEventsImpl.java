/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{705696FF-6ED5-9360-0BED-BE662DADBA55}")
public class _IVoiceMailsManagerEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IVoiceMailsManagerEvents {
  @DeclDISPID(2150)  public void onOnConnectionStateChanged(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerConnectionStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(2150,"OnConnectionStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2151)  public void onOnNewVoiceMailCountSinceLastResetChanged(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerNewItemCountChangedEventData _eventData) throws ComException {
    this._dispatchCall(2151,"OnNewVoiceMailCountSinceLastResetChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2153)  public void onOnVoiceMailsAdded(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    this._dispatchCall(2153,"OnVoiceMailsAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2154)  public void onOnVoiceMailsRemoved(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    this._dispatchCall(2154,"OnVoiceMailsRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(2155)  public void onOnVoiceMailsModified(final com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager _eventSource, final com.wilutions.mslib.uccollaborationlib.IVoiceMailBatchEventData _eventData) throws ComException {
    this._dispatchCall(2155,"OnVoiceMailsModified", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IVoiceMailsManagerEventsImpl(String progId) throws ComException {
    super(progId, "{B0C10F94-CAB6-4821-9643-D781885A46AF}");
  }
  protected _IVoiceMailsManagerEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IVoiceMailsManagerEventsImpl" + super.toString() + "]";
  }
}
