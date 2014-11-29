/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{F4804F2B-9D15-97F7-212C-3D024716FB7E}")
public class _IUtilities2EventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IUtilities2Events {
  @DeclDISPID(5060)  public void onOnExchangeECPUrlChanged(com.wilutions.mslib.uccollaborationlib.IUtilities _eventSource, com.wilutions.mslib.uccollaborationlib.IExchangeECPUrlChangedEventData _eventData) throws ComException {
    this._dispatchCall(5060,"OnExchangeECPUrlChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IUtilities2EventsImpl(String progId) throws ComException {
    super(progId, "{3417D640-3976-4CB6-BC82-54E5E2E10784}");
  }
  protected _IUtilities2EventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IUtilities2EventsImpl" + super.toString() + "]";
  }
}
