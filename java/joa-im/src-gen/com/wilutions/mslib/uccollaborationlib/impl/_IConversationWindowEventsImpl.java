/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{5E9816A1-7DAA-9C8C-1A5A-3CB3848A0336}")
public class _IConversationWindowEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IConversationWindowEvents {
  @DeclDISPID(4000)  public void onOnNeedsSizeChange(final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowNeedsSizeChangeEventData _eventData) throws ComException {
    this._dispatchCall(4000,"OnNeedsSizeChange", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(4001)  public void onOnNeedsAttention(final com.wilutions.mslib.uccollaborationlib.IConversationWindow _eventSource, final com.wilutions.mslib.uccollaborationlib.IConversationWindowNeedsAttentionEventData _eventData) throws ComException {
    this._dispatchCall(4001,"OnNeedsAttention", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IConversationWindowEventsImpl(String progId) throws ComException {
    super(progId, "{9E0F8FCA-D9C9-47CD-87F4-5554217DFFCC}");
  }
  protected _IConversationWindowEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IConversationWindowEventsImpl" + super.toString() + "]";
  }
}
