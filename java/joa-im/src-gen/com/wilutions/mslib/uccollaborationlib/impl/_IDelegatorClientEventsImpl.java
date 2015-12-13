/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{523E72F0-218D-9F0F-3EAC-69246CB2465E}")
public class _IDelegatorClientEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IDelegatorClientEvents {
  @DeclDISPID(100)  public void onOnStateChanged(final com.wilutions.mslib.uccollaborationlib.IClient _eventSource, final com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData _eventData) throws ComException {
    this._dispatchCall(100,"OnStateChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IDelegatorClientEventsImpl(String progId) throws ComException {
    super(progId, "{92A9EB9B-85EE-444E-A302-00C3C945BAA4}");
  }
  protected _IDelegatorClientEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IDelegatorClientEventsImpl" + super.toString() + "]";
  }
}
