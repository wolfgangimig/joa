/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{715175A8-BAC4-921C-0E99-6B19EA40DF0A}")
public class _IContactEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IContactEvents {
  @DeclDISPID(400)  public void onOnContactInformationChanged(final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IContactInformationChangedEventData _eventData) throws ComException {
    this._dispatchCall(400,"OnContactInformationChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(401)  public void onOnSettingChanged(final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IContactSettingChangedEventData _eventData) throws ComException {
    this._dispatchCall(401,"OnSettingChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(402)  public void onOnUriChanged(final com.wilutions.mslib.uccollaborationlib.IContact _eventSource, final com.wilutions.mslib.uccollaborationlib.IUriChangedEventData _eventData) throws ComException {
    this._dispatchCall(402,"OnUriChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IContactEventsImpl(String progId) throws ComException {
    super(progId, "{B1C6ECC3-1EA7-495D-9337-02FE4FB723F0}");
  }
  protected _IContactEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IContactEventsImpl" + super.toString() + "]";
  }
}
