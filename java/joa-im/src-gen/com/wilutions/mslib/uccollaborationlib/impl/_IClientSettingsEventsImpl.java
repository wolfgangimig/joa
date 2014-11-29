/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{96099D99-76E5-9242-0BEC-2D3FF5C6F5AC}")
public class _IClientSettingsEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IClientSettingsEvents {
  @DeclDISPID(5150)  public void onOnSettingChanged(final com.wilutions.mslib.uccollaborationlib.IClientSettings _eventSource, final com.wilutions.mslib.uccollaborationlib.IClientSettingsChangedEventData _eventData) throws ComException {
    this._dispatchCall(5150,"OnSettingChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IClientSettingsEventsImpl(String progId) throws ComException {
    super(progId, "{569E04F2-D286-4903-9642-44D850310956}");
  }
  protected _IClientSettingsEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IClientSettingsEventsImpl" + super.toString() + "]";
  }
}
