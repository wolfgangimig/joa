/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{FCD43BD5-1E29-9AA9-123D-C03BFAFEE468}")
public class _ISelf2EventsImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib._ISelf2Events {
  @DeclDISPID(5020)  public void onOnAlertLevelChanged(com.wilutions.mslib.uccollaborationlib.ISelf _eventSource, com.wilutions.mslib.uccollaborationlib.IAlertLevelChangedEventData _eventData) throws ComException {
    this._dispatchCall(5020,"OnAlertLevelChanged", DISPATCH_METHOD,null,(_eventSource!=null?_eventSource:Dispatch.NULL),(_eventData!=null?_eventData:Dispatch.NULL));
  }
  public _ISelf2EventsImpl(String progId) throws ComException {
    super(progId, "{3C43A2BE-BA4A-41E8-8F93-A9DC5F091892}");
  }
  protected _ISelf2EventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ISelf2EventsImpl" + super.toString() + "]";
  }
}
