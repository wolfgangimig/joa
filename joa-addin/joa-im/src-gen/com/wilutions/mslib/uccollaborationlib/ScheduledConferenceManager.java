/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ScheduledConferenceManager.
 * ScheduledConferenceManager Class 
 */
@CoClass(guid="{75927B32-8F46-40EB-A6C9-7598F0DB38C0}")
public class ScheduledConferenceManager extends Dispatch implements IScheduledConferenceManager {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IAsynchronousOperation GetScheduledConferenceItems(final Object _scheduledConferenceManagerCallback, final Object _state) throws ComException {
    assert(_scheduledConferenceManagerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743808,"GetScheduledConferenceItems", DISPATCH_METHOD,null,_scheduledConferenceManagerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public ScheduledConferenceManager() throws ComException {
    super("{75927B32-8F46-40EB-A6C9-7598F0DB38C0}", "{26F15083-86DB-4663-89ED-A0ABC896B9A1}");
  }
  protected ScheduledConferenceManager(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScheduledConferenceManager" + super.toString() + "]";
  }
}
