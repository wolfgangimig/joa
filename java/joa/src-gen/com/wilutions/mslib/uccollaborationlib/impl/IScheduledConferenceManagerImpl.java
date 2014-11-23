/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{E666C9E8-22B8-9D22-1443-C94C6D61455B}")
public class IScheduledConferenceManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IScheduledConferenceManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetScheduledConferenceItems(Object _scheduledConferenceManagerCallback, Object _state) throws ComException {
    assert(_scheduledConferenceManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743808,"GetScheduledConferenceItems", DISPATCH_METHOD,null,_scheduledConferenceManagerCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IScheduledConferenceManagerImpl(String progId) throws ComException {
    super(progId, "{26F15083-86DB-4663-89ED-A0ABC896B9A1}");
  }
  protected IScheduledConferenceManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IScheduledConferenceManagerImpl" + super.toString() + "]";
  }
}
