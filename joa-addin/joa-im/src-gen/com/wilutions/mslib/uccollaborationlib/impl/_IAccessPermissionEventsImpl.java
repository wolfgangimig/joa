/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1CDC5048-CE31-9443-0224-3D9CC59EA91D}")
public class _IAccessPermissionEventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._IAccessPermissionEvents {
  @DeclDISPID(1950)  public void onOnAccessEntryAdded(final com.wilutions.mslib.uccollaborationlib.IAccessPermission _eventSource, final com.wilutions.mslib.uccollaborationlib.IAccessEntryCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(1950,"OnAccessEntryAdded", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  @DeclDISPID(1951)  public void onOnAccessEntryRemoved(final com.wilutions.mslib.uccollaborationlib.IAccessPermission _eventSource, final com.wilutions.mslib.uccollaborationlib.IAccessEntryCollectionChangedEventData _eventData) throws ComException {
    this._dispatchCall(1951,"OnAccessEntryRemoved", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _IAccessPermissionEventsImpl(String progId) throws ComException {
    super(progId, "{DC4BC923-6A52-4F02-9F8A-547B606955E7}");
  }
  protected _IAccessPermissionEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_IAccessPermissionEventsImpl" + super.toString() + "]";
  }
}
