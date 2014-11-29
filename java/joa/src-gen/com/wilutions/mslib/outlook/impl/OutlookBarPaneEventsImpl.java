/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A911-A463-DB41-5DAE-69E7A5F7FCBC}")
public class OutlookBarPaneEventsImpl extends Dispatch implements com.wilutions.mslib.outlook.OutlookBarPaneEvents {
  @DeclDISPID(61441)  public void onBeforeNavigate(com.wilutions.mslib.outlook.OutlookBarShortcut Shortcut, ByRef<Boolean> Cancel) throws ComException {
    assert(Cancel != null);
    this._dispatchCall(61441,"BeforeNavigate", DISPATCH_METHOD,null,(Shortcut!=null?Shortcut:Dispatch.NULL),Cancel);
  }
  public OutlookBarPaneEventsImpl(String progId) throws ComException {
    super(progId, "{0006307A-0000-0000-C000-000000000046}");
  }
  protected OutlookBarPaneEventsImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[OutlookBarPaneEventsImpl" + super.toString() + "]";
  }
}
